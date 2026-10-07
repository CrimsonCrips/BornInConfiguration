package com.crimsoncrips.borninconfiguration;

import com.crimsoncrips.borninconfiguration.stats.BicDefaults;
import com.crimsoncrips.borninconfiguration.stats.ConfigurableItem;
import com.crimsoncrips.borninconfiguration.stats.ConfigurableItems;
import com.crimsoncrips.borninconfiguration.stats.MobGroup;
import com.crimsoncrips.borninconfiguration.stats.MobGroups;
import net.minecraftforge.common.ForgeConfigSpec;

public class BICServerConfig {

    public final ForgeConfigSpec.BooleanValue ROTTEN_CONSUMPTION_ENABLED;
    public final ForgeConfigSpec.BooleanValue SOUL_STRATIFICATION_EFFECT_ENABLED;
    public final ForgeConfigSpec.BooleanValue SPIRIT_DISSAPPEAR_IN_SUN_ENABLED;
    public final ForgeConfigSpec.BooleanValue RETALLIATION_ENABLED;
    public final ForgeConfigSpec.BooleanValue INFESTED_DIAMONDS_ENABLED;
    public final ForgeConfigSpec.BooleanValue WARNING_SPAWN_ENABLED;
    public final ForgeConfigSpec.BooleanValue NAUGHTINESS_ENABLED;
    public final ForgeConfigSpec.BooleanValue CHAOTIC_SPRING_ENABLED;
    public final ForgeConfigSpec.BooleanValue CHILLING_HORROR_ENABLED;

    public final ForgeConfigSpec.IntValue PHANTOM_BOMB_COUNT;
    public final ForgeConfigSpec.IntValue UPGRADED_PUMPKIN_PISTOL_COOLDOWN;
    public final ForgeConfigSpec.IntValue PUMPKIN_PISTOL_COOLDOWN;
    public final ForgeConfigSpec.IntValue PUMPKIN_STAFF_SUMMON_AMOUNT;

    public final ForgeConfigSpec.BooleanValue FALLEN_KNIGHT_CURSE_ENABLED;
    public final ForgeConfigSpec.BooleanValue KRAMPUS_HENCHMAN_DROPING_ENABLED;
    public final ForgeConfigSpec.IntValue DAYS_TILL_LIFESTEALER;
    public final ForgeConfigSpec.IntValue DAYS_TILL_MISSIONER;
    public final ForgeConfigSpec.BooleanValue MISSIONER_RAIN_ENABLED;
    public final ForgeConfigSpec.BooleanValue MISSIONER_RAID_ENABLED;
    public final ForgeConfigSpec.BooleanValue NIGHTMARE_STRENGTH_ENABLED;
    public final ForgeConfigSpec.BooleanValue NIGHTMARE_FREEZE_ENABLED;
    public final ForgeConfigSpec.IntValue DAYS_TILL_NIGHTMARE;
    public final ForgeConfigSpec.BooleanValue STALKER_IMMUNITY_ENABLED;
    public final ForgeConfigSpec.IntValue SCARLET_SPAWN_AMMOUNT;

    public final ForgeConfigSpec.BooleanValue MISSIONER_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue NIGHTMARE_STALKER_SPAWNING_ENABLED;

    public BICServerConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("General");
        this.ROTTEN_CONSUMPTION_ENABLED = buildBoolean(builder, "ROTTEN_CONSUMPTION_ENABLED", true, "Whether Rotten Flesh afflicts you with Rotten Stink");
        this.SOUL_STRATIFICATION_EFFECT_ENABLED = buildBoolean(builder, "SOUL_STRATIFICATION_EFFECT_ENABLED", true, "Whether soul stratisfaction is enabled");
        this.SPIRIT_DISSAPPEAR_IN_SUN_ENABLED = buildBoolean(builder, "SPIRIT_DISSAPPEAR_IN_SUN_ENABLED", true, "Whether spirits disappear in the sun is enabled");
        this.RETALLIATION_ENABLED = buildBoolean(builder, "RETALLIATION_ENABLED", true, "Whether mobs retalliate to other mobs attacking them");
        this.INFESTED_DIAMONDS_ENABLED = buildBoolean(builder, "INFESTED_DIAMONDS_ENABLED", true, "Whether infested diamonds generate");
        this.WARNING_SPAWN_ENABLED = buildBoolean(builder, "WARNING_SPAWN_ENABLED", true, "Whether you get the warning effect that you get for Missioners and Nightmare Stalkers");
        this.NAUGHTINESS_ENABLED = buildBoolean(builder, "NAUGHTINESS_ENABLED", true, "Whether you gain naughtiness from certain actions");
        this.CHAOTIC_SPRING_ENABLED = buildBoolean(builder, "CHAOTIC_SPRING_ENABLED", false, "Forces the Chaotic Spring event on outside its usual dates (Born in Chaos's seasonal events game rule still applies)");
        this.CHILLING_HORROR_ENABLED = buildBoolean(builder, "CHILLING_HORROR_ENABLED", false, "Forces the Chilling Horror event on outside its usual dates (Born in Chaos's seasonal events game rule still applies)");
        builder.pop();

        builder.push("Weapons");
        this.PHANTOM_BOMB_COUNT = buildInt(builder, "PHANTOM_BOMB_COUNT", 2, 1, Integer.MAX_VALUE, "Amount of phantom bombs that gets spawned when thrown");
        this.UPGRADED_PUMPKIN_PISTOL_COOLDOWN = buildInt(builder, "UPGRADED_PUMPKIN_PISTOL_COOLDOWN", 1, 0, Integer.MAX_VALUE, "Amount of seconds for the cooldown of pumpkin pistol with the hat on");
        this.PUMPKIN_PISTOL_COOLDOWN = buildInt(builder, "PUMPKIN_PISTOL_COOLDOWN", 2, 0, Integer.MAX_VALUE, "Amount of seconds for the cooldown of pumpkin pistol");
        this.PUMPKIN_STAFF_SUMMON_AMOUNT = buildInt(builder, "PUMPKIN_STAFF_SUMMON_AMOUNT", 1, 1, Integer.MAX_VALUE, "Amount of Mr.Pumpkins spawned");

        BicDefaults itemDefaults = BicDefaults.load("bic_item_defaults.json");
        for (ConfigurableItem item : ConfigurableItems.WEAPONS) {
            item.define(builder, itemDefaults);
        }

        builder.comment("Stats for every Born in Chaos mob. Every stat defaults to -1, which keeps Born in Chaos's own value,",
                "so updating Born in Chaos never leaves you on outdated numbers. Set a stat to 0 or higher to override it.").push("Mobs");
        BicDefaults defaults = BicDefaults.load("bic_defaults.json");
        for (MobGroup group : MobGroups.ALL) {
            group.define(builder, defaults);
        }
        this.MISSIONER_SPAWNING_ENABLED = MobGroups.MISSIONER.spawnEnabled();
        this.NIGHTMARE_STALKER_SPAWNING_ENABLED = MobGroups.NIGHTMARE_STALKER.spawnEnabled();

        builder.push(MobGroups.FALLEN_CHAOS_KNIGHT.name);
        this.FALLEN_KNIGHT_CURSE_ENABLED = buildBoolean(builder, "FALLEN_KNIGHT_CURSE_ENABLED", true, "Whether Fallen Knights inflict cursed marks");
        builder.pop();

        builder.push(MobGroups.KRAMPUS_HENCHMAN.name);
        this.KRAMPUS_HENCHMAN_DROPING_ENABLED = buildBoolean(builder, "KRAMPUS_HENCHMAN_DROPING_ENABLED", true, "Whether Krampus Henchnmen make you drop your items when hit");
        builder.pop();

        builder.push(MobGroups.LIFESTEALER.name);
        this.DAYS_TILL_LIFESTEALER = buildInt(builder, "DAYS_TILL_LIFESTEALER", 10, 1, 999999, "Days till Lifestealer spawns");
        builder.pop();

        builder.push(MobGroups.MISSIONER.name);
        this.DAYS_TILL_MISSIONER = buildInt(builder, "DAYS_TILL_MISSIONER", 10, 1, 999999, "Days till The Missioner spawns");
        this.MISSIONER_RAIN_ENABLED = buildBoolean(builder, "MISSIONER_RAIN_ENABLED", true, "Missioner can switch weather to rain");
        this.MISSIONER_RAID_ENABLED = buildBoolean(builder, "MISSIONER_RAID_ENABLED", true, "Missioner can spawn in raids");
        builder.pop();

        builder.push(MobGroups.NIGHTMARE_STALKER.name);
        this.NIGHTMARE_STRENGTH_ENABLED = buildBoolean(builder, "NIGHTMARE_STRENGTH_ENABLED", true, "Whether nightmare stalker, gets stronger the longer the world is");
        this.NIGHTMARE_FREEZE_ENABLED = buildBoolean(builder, "NIGHTMARE_FREEZE_ENABLED", true, "Whether nightmare stalker freezes water");
        this.DAYS_TILL_NIGHTMARE = buildInt(builder, "DAYS_TILL_NIGHTMARE", 3, 1, 999999, "Days till Nightmare Stalker spawns");
        this.STALKER_IMMUNITY_ENABLED = buildBoolean(builder, "STALKER_IMMUNITY_ENABLED", true, "Whether Nightmare Stalker has its base immunity to certain things");
        builder.pop();

        builder.push(MobGroups.SCARLET_PERSECUTOR.name);
        this.SCARLET_SPAWN_AMMOUNT = buildInt(builder, "SCARLET_SPAWN_AMMOUNT", 5, 0, 1000, "Amount of Scarlet Prosecuters (setting it to 0 will cause non to spawn)");
        builder.pop();

        builder.pop(2);

        builder.push("Armor");
        for (ConfigurableItem item : ConfigurableItems.ARMOR) {
            item.define(builder, itemDefaults);
        }
        builder.pop();
    }

    private static ForgeConfigSpec.BooleanValue buildBoolean(ForgeConfigSpec.Builder builder, String name, boolean defaultValue, String comment){
        return builder.comment(comment).translation(name).define(name, defaultValue);
    }

    private static ForgeConfigSpec.IntValue buildInt(ForgeConfigSpec.Builder builder, String name, int defaultValue, int min, int max, String comment){
        return builder.comment(comment).translation(name).defineInRange(name, defaultValue, min, max);
    }
}
