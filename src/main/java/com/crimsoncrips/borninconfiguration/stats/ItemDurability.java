package com.crimsoncrips.borninconfiguration.stats;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.lang.reflect.Field;
import java.util.IdentityHashMap;
import java.util.Map;

public final class ItemDurability {

    private static final Field MAX_DAMAGE = ObfuscationReflectionHelper.findField(Item.class, "f_41371_");
    private static final Map<Item, Integer> ORIGINAL = new IdentityHashMap<>();

    private ItemDurability() {
    }

    public static synchronized void apply() {
        for (ConfigurableItem entry : ConfigurableItems.ALL) {
            Item item = ConfigurableItems.item(entry);
            if (item == null) {
                continue;
            }
            int original = ORIGINAL.computeIfAbsent(item, Item::getMaxDamage);
            int configured = entry.durability();
            try {
                MAX_DAMAGE.setInt(item, configured >= 0 ? configured : original);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not set durability of " + entry.id, e);
            }
        }
    }
}
