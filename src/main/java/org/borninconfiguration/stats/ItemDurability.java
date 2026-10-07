package org.borninconfiguration.stats;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;

public final class ItemDurability {

    private ItemDurability() {
    }

    public static void modifyDefaults(ModifyDefaultComponentsEvent event) {
        for (ConfigurableItem entry : ConfigurableItems.ALL) {
            Item item = ConfigurableItems.item(entry);
            int configured = entry.durability();
            if (item == null || configured < 0) {
                continue;
            }
            event.modify(item, builder -> {
                if (configured == 0) {
                    builder.remove(DataComponents.MAX_DAMAGE).remove(DataComponents.DAMAGE);
                } else {
                    builder.set(DataComponents.MAX_DAMAGE, configured).set(DataComponents.DAMAGE, 0).set(DataComponents.MAX_STACK_SIZE, 1);
                }
            });
        }
    }
}
