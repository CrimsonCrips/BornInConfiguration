"""Usage: python3 scripts/extract_bic_defaults.py <born_in_chaos.jar> <output_dir>"""
import json
import os
import re
import subprocess
import sys
import tempfile
import zipfile

BIC_PKG = 'net/mcreator/borninchaosv/'
ENTITY_PKG = BIC_PKG + 'entity/'
ITEM_PKG = BIC_PKG + 'item/'
ENTITIES_CLASS = BIC_PKG + 'init/BornInChaosV1ModEntities.class'
ITEMS_CLASS = BIC_PKG + 'init/BornInChaosV1ModItems.class'

SRG_ATTRIBUTES = {
    'f_22276_': 'MAX_HEALTH', 'f_22277_': 'FOLLOW_RANGE', 'f_22278_': 'KNOCKBACK_RESISTANCE',
    'f_22279_': 'MOVEMENT_SPEED', 'f_22280_': 'FLYING_SPEED', 'f_22281_': 'ATTACK_DAMAGE',
    'f_22282_': 'ATTACK_KNOCKBACK', 'f_22283_': 'ATTACK_SPEED', 'f_22284_': 'ARMOR',
    'f_22285_': 'ARMOR_TOUGHNESS', 'f_22286_': 'LUCK',
}

TIER_USES = ('m_6609_', 'getUses')
TIER_DAMAGE_BONUS = ('m_6631_', 'getAttackDamageBonus')
DURABILITY_CALLS = ('m_41503_', 'm_41499_', 'durability', 'defaultDurability')
ARMOR_PIECES = {'Boots': 'BOOTS', 'Leggings': 'LEGGINGS', 'Chestplate': 'CHESTPLATE', 'Helmet': 'HELMET'}
ARMOR_SLOT_INDEX = {'BOOTS': 0, 'LEGGINGS': 1, 'CHESTPLATE': 2, 'HELMET': 3}
ARMOR_BASE_DURABILITY = {'BOOTS': 13, 'LEGGINGS': 15, 'CHESTPLATE': 16, 'HELMET': 11}
MATERIAL_DURABILITY = ('m_266425_',)
MATERIAL_DEFENSE = ('m_7366_',)
MATERIAL_TOUGHNESS = ('m_6651_',)
MATERIAL_KNOCKBACK = ('m_6649_',)


def javap(path, verbose=False):
    args = ['javap', '-p', '-c', '-constants'] + (['-v'] if verbose else []) + [path]
    return subprocess.run(args, capture_output=True, text=True, check=True).stdout


def constant(line):
    for pattern in (r'\b[ifd]const_m?([0-5])\b', r'\b[bs]ipush\s+(-?\d+)', r'// (?:int|float|double) (-?[0-9.E]+)[fd]?$'):
        match = re.search(pattern, line)
        if match:
            value = match.group(1)
            return -float(value) if 'const_m' in line else float(value)
    return None


def method_body(disassembly, names):
    for name in names:
        match = re.search(r' ' + name + r'\([^)]*\);\n\s+Code:\n(.*?)\n(?:\n|\})', disassembly, re.S)
        if match:
            return match.group(1)
    return None


def returned_constant(disassembly, names):
    body = method_body(disassembly, names)
    if body is None:
        return None
    for line in body.splitlines():
        value = constant(line)
        if value is not None:
            return value
    return None


def attribute_methods(disassembly):
    pattern = r'static [\w.]*AttributeSupplier\$Builder \w+\(\);\n\s+Code:\n(.*?)\n(?:\n|\})'
    return re.findall(pattern, disassembly, re.S)


def parse_attributes(body):
    attributes, current = {}, None
    for line in body.splitlines():
        name = (re.search(r'Attributes\.(\w+):', line)
                or re.search(r'(?:Forge|NeoForge)Mod\.(\w+):', line))
        if name:
            current = SRG_ATTRIBUTES.get(name.group(1), name.group(1))
            continue
        value = (re.search(r'// (?:double|float) ([-0-9.E]+)[df]', line)
                 or re.search(r'\b[df]const_([0-2])\b', line))
        if value and current:
            attributes[current] = float(value.group(1))
            current = None
    return attributes


def registered_ids(registry):
    static_init = registry[registry.index('static {};'):]
    ids, pending = [], None
    for line in static_init.splitlines():
        literal = re.search(r'// String ([a-z0-9_]+)$', line)
        if literal and literal.group(1) != 'born_in_chaos_v1':
            pending = literal.group(1)
            continue
        dynamic = re.search(r'invokedynamic .*// InvokeDynamic #(\d+):get:', line)
        if dynamic and pending:
            ids.append((pending, int(dynamic.group(1)), None))
            continue
        store = re.search(r'putstatic .*// Field (\w+):', line)
        if store and pending:
            ids.append((pending, None, store.group(1)))
            pending = None
    return ids


def entity_defaults(tmp):
    registry = javap(os.path.join(tmp, ENTITIES_CLASS))
    field_class = dict((f, c) for c, f in re.findall(
        r'EntityType<net\.mcreator\.borninchaosv\.entity\.(\w+)>> (\w+);', registry))
    result = {}
    for entity_id, _, field in registered_ids(registry):
        cls = field_class.get(field)
        path = cls and os.path.join(tmp, ENTITY_PKG, cls + '.class')
        if not path or not os.path.exists(path):
            continue
        bodies = attribute_methods(javap(path))
        if bodies:
            result[entity_id] = parse_attributes(bodies[0])
    return result


def item_classes(tmp):
    path = os.path.join(tmp, ITEMS_CLASS)
    registry = javap(path)
    lambda_class = dict(re.findall(
        r' (lambda\$static\$\d+)\(\);\n\s+Code:\n\s+0: new\s+#\d+\s+// class ' + ITEM_PKG + r'([\w$]+)\n', registry))
    bootstrap = {}
    for index, lambda_name, constructed in re.findall(
            r'\n\s+(\d+): #\d+ REF_invokeStatic java/lang/invoke/LambdaMetafactory\.metafactory.*?\n(?:.*\n)*?'
            r'\s+#\d+ REF_(?:invokeStatic \S+\.(lambda\$\w+\$\d+):|newInvokeSpecial ' + ITEM_PKG + r'([\w$]+)\.)',
            javap(path, verbose=True)):
        cls = constructed or lambda_class.get(lambda_name)
        if cls:
            bootstrap[int(index)] = cls
    return dict((item_id, bootstrap[index]) for item_id, index, _ in registered_ids(registry) if index in bootstrap)


def stored_array(body):
    values, last = [], None
    for line in body.splitlines():
        value = constant(line)
        if value is not None:
            last = value
        elif 'iastore' in line and last is not None:
            values.append(last)
    return values


def armor_stats(tmp, cls):
    outer, _, piece = cls.partition('$')
    slot = ARMOR_PIECES.get(piece)
    outer_path = os.path.join(tmp, ITEM_PKG, outer + '.class')
    if slot is None or not os.path.exists(outer_path):
        return None
    material_path = os.path.join(tmp, ITEM_PKG, outer + '$1.class')
    material = javap(material_path) if os.path.exists(material_path) else ''
    if 'ArmorMaterial' in material and method_body(material, MATERIAL_DEFENSE):
        index = ARMOR_SLOT_INDEX[slot]
        durability_body = method_body(material, MATERIAL_DURABILITY)
        durability = stored_array(durability_body)
        tail = durability_body[durability_body.index('iaload'):]
        multiplier = next(v for v in map(constant, tail.splitlines()) if v is not None)
        return {
            'ARMOR': stored_array(method_body(material, MATERIAL_DEFENSE))[index],
            'ARMOR_TOUGHNESS': returned_constant(material, MATERIAL_TOUGHNESS),
            'KNOCKBACK_RESISTANCE': returned_constant(material, MATERIAL_KNOCKBACK),
            'DURABILITY': int(durability[index] * multiplier),
        }

    outer_code = javap(outer_path)
    defense_body = method_body(outer_code, (r'lambda\$registerArmorMaterial\$0',))
    material_body = method_body(outer_code, (r'lambda\$registerArmorMaterial\$2',))
    piece_path = os.path.join(tmp, ITEM_PKG, cls + '.class')
    if not defense_body or not material_body or not os.path.exists(piece_path):
        return None
    defense, current = {}, None
    for line in defense_body.splitlines():
        type_field = re.search(r'ArmorItem\$Type\.(\w+):', line)
        if type_field:
            current = type_field.group(1)
            continue
        value = constant(line)
        if value is not None and current:
            defense[current] = value
            current = None
    floats = []
    for line in material_body.splitlines():
        if 'ArmorMaterial."<init>"' in line:
            break
        if '// float' in line or re.search(r'\bfconst_', line):
            floats.append(constant(line))
    piece_code = javap(piece_path)
    multiplier = None
    for line in piece_code.splitlines():
        if 'getDurability' in line:
            break
        value = constant(line)
        if value is not None:
            multiplier = value
    if slot not in defense or len(floats) < 2 or multiplier is None:
        return None
    return {
        'ARMOR': defense[slot],
        'ARMOR_TOUGHNESS': floats[-2],
        'KNOCKBACK_RESISTANCE': floats[-1],
        'DURABILITY': int(ARMOR_BASE_DURABILITY[slot] * multiplier),
    }


def item_stats(tmp, cls):
    if '$' in cls:
        return armor_stats(tmp, cls)
    disassembly = javap(os.path.join(tmp, ITEM_PKG, cls + '.class'))
    constructor = re.search(r' ' + re.escape(BIC_PKG.replace('/', '.') + 'item.' + cls) + r'\(\);\n\s+Code:\n(.*?)\n(?:\n|\})', disassembly, re.S)
    if not constructor:
        return None
    body = constructor.group(1).splitlines()
    tier_path = os.path.join(tmp, ITEM_PKG, cls + '$1.class')
    is_weapon = any(re.search(r'(SwordItem|AxeItem)\."<init>"', line) for line in body)

    if is_weapon and os.path.exists(tier_path):
        tier = javap(tier_path)
        numbers = []
        for line in body:
            if 'createAttributes' in line or re.search(r'(SwordItem|AxeItem)\."<init>"', line):
                break
            value = constant(line)
            if value is not None:
                numbers.append(value)
        uses = returned_constant(tier, TIER_USES)
        bonus = returned_constant(tier, TIER_DAMAGE_BONUS)
        if len(numbers) < 2 or uses is None or bonus is None:
            return None
        damage, speed = numbers[-2], numbers[-1]
        return {
            'ATTACK_DAMAGE': round(1 + damage + bonus, 4),
            'ATTACK_SPEED': round(4 + speed, 4),
            'DURABILITY': int(uses),
        }

    previous = None
    for line in body:
        if any('.' + call + ':(I)' in line for call in DURABILITY_CALLS) and previous is not None:
            return {'DURABILITY': int(previous)}
        value = constant(line)
        if value is not None:
            previous = value
    return None


def main(jar, out_dir):
    with tempfile.TemporaryDirectory() as tmp:
        with zipfile.ZipFile(jar) as zf:
            members = [n for n in zf.namelist()
                       if n.startswith(ENTITY_PKG) or n.startswith(ITEM_PKG) or n in (ENTITIES_CLASS, ITEMS_CLASS)]
            zf.extractall(tmp, members)

        entities = entity_defaults(tmp)
        items = {}
        for item_id, cls in sorted(item_classes(tmp).items()):
            stats = item_stats(tmp, cls)
            if stats:
                items[item_id] = stats

    for name, data in (('bic_defaults.json', entities), ('bic_item_defaults.json', items)):
        path = os.path.join(out_dir, name)
        with open(path, 'w') as f:
            json.dump(data, f, indent=2, sort_keys=True)
            f.write('\n')
        print(f'Wrote {len(data)} entries to {path}')


if __name__ == '__main__':
    if len(sys.argv) != 3:
        sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
