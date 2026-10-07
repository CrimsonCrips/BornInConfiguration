package com.crimsoncrips.borninconfiguration.stats;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public final class ConfigurableItems {

    public static final List<ConfigurableItem> WEAPONS = List.of(
            melee("Birch Branches", "birch_branches"),
            melee("Carrot Sword", "carrot_sword"),
            melee("Dark Ritual Dagger", "dark_ritual_dagger"),
            melee("Dark Warblade", "darkwarblade"),
            melee("Frostbitten Blade", "frostbitten_blade"),
            melee("Great Reaper Axe", "great_reaper_axe"),
            melee("Icy Sweetness", "icy_sweetness"),
            melee("Intoxicating Dagger", "intoxicating_dagger"),
            melee("Nightmare Scythe", "nightmare_scythe"),
            melee("Nut Hammer", "nut_hammer"),
            melee("Pitchfork", "trident_hayfork"),
            melee("Sharpened Dark Metal Sword", "sharpened_dark_metal_sword"),
            melee("Shell Mace", "shell_mace"),
            melee("Skullbreaker Hammer", "skullbreaker_hammer"),
            melee("Soul Saber", "soul_cutlass"),
            melee("Soulbane", "soulbane"),
            melee("Spider Bite", "spider_bite_sword"),
            melee("Spirit Divider", "spiritual_sword"),
            melee("Supreme Measure", "supreme_measure"),
            melee("Sweet Axe", "sweet_axe"),
            melee("Sweet Sword", "sweet_sword"),
            melee("Wood Splitter", "wood_splitter_axe"),
            ranged("Bonescaller Staff", "bonescaller_staff"),
            ranged("Pumpkin Pistol", "pumpkinhandgun"),
            ranged("Pumpkin Staff", "pumpkinstaffa"),
            ranged("Staff of Blindness", "staffof_blindness"),
            ranged("Staff of Magic Arrows", "staff_of_magic_arrows"),
            ranged("Stormcaller's Horn", "stormcallers_horn"));

    public static final List<ConfigurableItem> ARMOR = List.of(
            armor("Damned Demoman's Hat", "damned_demomans_hat_helmet"),
            armor("Dark Metal Helmet", "dark_metal_armor_helmet"),
            armor("Dark Metal Chestplate", "dark_metal_armor_chestplate"),
            armor("Dark Metal Leggings", "dark_metal_armor_leggings"),
            armor("Dark Metal Boots", "dark_metal_armor_boots"),
            armor("Killer Rabbit Ears", "killer_rabbit_ears_helmet"),
            armor("Lord Pumpkinhead's Hat", "lord_pumpkinheads_hat_helmet"),
            armor("Missionary Hat", "missionary_hat_helmet"),
            armor("Nightmare Mask", "nightmare_mantleofthe_night_helmet"),
            armor("Nightmare Robe", "nightmare_mantleofthe_night_chestplate"),
            armor("Nightmare Pants", "nightmare_mantleofthe_night_leggings"),
            armor("Nightmare Boots", "nightmare_mantleofthe_night_boots"),
            armor("Spiny Shell Helmet", "spiny_shell_armor_helmet"),
            armor("Spiny Shell Chestplate", "spiny_shell_armor_chestplate"),
            armor("Spiritual Guide Sombrero", "spiritual_guide_sombrero_helmet"));

    public static final List<ConfigurableItem> ALL = Stream.concat(WEAPONS.stream(), ARMOR.stream()).toList();

    private static Map<Item, ConfigurableItem> byItem;

    private ConfigurableItems() {
    }

    private static ConfigurableItem melee(String name, String id) {
        return new ConfigurableItem(name, id, ConfigurableItem.Kind.MELEE);
    }

    private static ConfigurableItem ranged(String name, String id) {
        return new ConfigurableItem(name, id, ConfigurableItem.Kind.RANGED);
    }

    private static ConfigurableItem armor(String name, String id) {
        return new ConfigurableItem(name, id, ConfigurableItem.Kind.ARMOR);
    }

    public static Item item(ConfigurableItem entry) {
        ResourceLocation key = new ResourceLocation(MobGroups.BIC_NAMESPACE, entry.id);
        return ForgeRegistries.ITEMS.containsKey(key) ? ForgeRegistries.ITEMS.getValue(key) : null;
    }

    public static ConfigurableItem get(Item item) {
        Map<Item, ConfigurableItem> map = byItem;
        if (map == null) {
            map = new IdentityHashMap<>();
            for (ConfigurableItem entry : ALL) {
                Item registered = item(entry);
                if (registered != null) {
                    map.put(registered, entry);
                }
            }
            byItem = map;
        }
        return map.get(item);
    }
}
