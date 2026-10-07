package org.borninconfiguration.stats;

import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class ConfigurableItem {

    public enum Kind {
        MELEE(ItemStat.ATTACK_DAMAGE, ItemStat.ATTACK_SPEED),
        RANGED,
        ARMOR(ItemStat.ARMOR, ItemStat.ARMOR_TOUGHNESS, ItemStat.KNOCKBACK_RESISTANCE);

        private final List<ItemStat> stats;

        Kind(ItemStat... stats) {
            this.stats = List.of(stats);
        }
    }

    public final String name;
    public final String id;
    public final Kind kind;

    private final Map<ItemStat, ModConfigSpec.DoubleValue> stats = new EnumMap<>(ItemStat.class);
    private ModConfigSpec.IntValue durability;

    ConfigurableItem(String name, String id, Kind kind) {
        this.name = name;
        this.id = id;
        this.kind = kind;
    }

    public void define(ModConfigSpec.Builder builder, BicDefaults defaults) {
        builder.comment("Applies to: " + MobGroups.BIC_NAMESPACE + ":" + id).push(name);
        for (ItemStat stat : kind.stats) {
            stats.put(stat, builder
                    .comment(defaultComment(defaults, stat.name()), "-1 keeps Born in Chaos's value")
                    .defineInRange(stat.name(), -1.0, -1.0, 1_000_000.0));
        }
        durability = builder
                .comment(defaultComment(defaults, "DURABILITY"), "-1 keeps Born in Chaos's value, 0 makes it unbreakable", "Changes need a restart")
                .defineInRange("DURABILITY", -1, -1, Integer.MAX_VALUE);
        builder.pop();
    }

    private String defaultComment(BicDefaults defaults, String key) {
        String bicDefault = defaults.describe(List.of(id), key);
        return "Born in Chaos default: " + (bicDefault == null ? "none" : bicDefault);
    }

    public double stat(ItemStat stat) {
        ModConfigSpec.DoubleValue value = stats.get(stat);
        return value == null ? -1 : value.get();
    }

    public int durability() {
        return durability.get();
    }
}
