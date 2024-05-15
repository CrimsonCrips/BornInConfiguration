package com.crimsoncrips.borninconfiguration.config;

import static com.mojang.text2speech.Narrator.LOGGER;

public class BIConfig {
    public static boolean SKELETON_BOMB_SPAWNING_ENABLED = true;
    public static boolean DECAYING_ZOMBIE_SPAWNING_ENABLED = true;
    public static boolean BABY_SKELETON_SPAWNING_ENABLED = true;
    public static boolean ZOMBIE_BARREL_SPAWNING_ENABLED = true;
    public static boolean PHANTOM_CREEPER_SPAWNING_ENABLED = true;
    public static boolean DOOR_KNIGHT_SPAWNING_ENABLED = true;
    public static boolean RESTLESS_SPIRIT_SPAWNING_ENABLED = true;
    public static boolean SKELETON_THRASHER_SPAWNING_ENABLED = true;
    public static boolean FIRELIGHT_SPAWNING_ENABLED = true;
    public static boolean BONES_CALLER_SPAWNING_ENABLED = true;
    public static boolean BONE_IMP_SPAWNING_ENABLED = true;
    public static boolean DARK_VORTEX_SPAWNING_ENABLED = true;
    public static boolean DREADHOUND_SPAWNING_ENABLED = true;
    public static boolean FALLEN_CHAOS_KNIGHT_SPAWNING_ENABLED = true;
    public static boolean SER_PUMPKIN_HEAD_SPAWNING_ENABLED = true;
    public static boolean ZOMBIE_CLOWN_SPAWNING_ENABLED = true;
    public static boolean SPIRIT_GUIDE_SPAWNING_ENABLED = true;

    public static boolean CORPSE_FLY_SPAWN_ENABLED = true;
    public static boolean BLOODY_GADFLY_SPAWNING_ENABLED = true;
    public static boolean CORPSE_FISH_SPAWNING_ENABLED = true;
    public static boolean ZOMBIE_FISHERMAN_SPAWNING_ENABLED = true;
    public static boolean THORNSHELL_SPAWNING_ENABLED = true;
    public static boolean GLUTTON_FISH_SPAWNING_ENABLED = true;

    public static boolean ZOMBIE_BRUISER_SPAWNING_ENABLED = true;
    public static boolean MAGGOTS_APPEARANCE_ENABLED = true;
    public static boolean ZOMBIE_LUMBERJACK_SPAWNING_ENABLED = true;
    public static boolean MISSIONER_SPAWNING_ENABLED = true;
    public static boolean FIRE_WELL_GENERATION_ENABLED = true;
    public static boolean OBSERVATION_TOWER_GENERATION_ENABLED = true;
    public static boolean DARK_TOWER_GENERATION_ENABLED = true;
    public static boolean FARM_GENERATION_ENABLED = true;
    public static boolean CLOWN_TENT_GENERATION_ENABLED = true;
    public static boolean SPIRIT_DISSAPPEAR_IN_SUN_ENABLED = true;
    public static boolean SOUL_STRATIFICATION_EFFECT_ENABLED = true;

    public static boolean ROTTEN_CONSUMPTION_ENABLED = true;

    public static boolean STALKER_IMMUNITY_ENABLED = true;

    public static boolean DECREPIT_SKELETON_SPAWNING_ENABLED = true;

    public static boolean INFESTED_DIAMONDS_ENABLED = true;

    public static boolean NIGHTMARE_SPAWN_ENABLED = true;

    public static int DAYS_TILL_NIGHTMARE = 3;

    public static int DAYS_TILL_MISSIONER = 10;


    public static void bake() {
        try {
            DECREPIT_SKELETON_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.DECREPIT_SKELETON_SPAWNING_ENABLED.get();
            NIGHTMARE_SPAWN_ENABLED = ConfigHolder.BORNCONFIG.NIGHTMARE_SPAWN_ENABLED.get();
            DAYS_TILL_NIGHTMARE = ConfigHolder.BORNCONFIG.DAYS_TILL_NIGHTMARE.get();
            DAYS_TILL_MISSIONER = ConfigHolder.BORNCONFIG.DAYS_TILL_MISSIONER.get();
            STALKER_IMMUNITY_ENABLED = ConfigHolder.BORNCONFIG.STALKER_IMMUNITY_ENABLED.get();
            ROTTEN_CONSUMPTION_ENABLED = ConfigHolder.BORNCONFIG.ROTTEN_CONSUMPTION_ENABLED.get();


        } catch (Exception e) {
            LOGGER.warn("An exception was caused trying to load the config for Born In Configuration");
            e.printStackTrace();
        }
    }

}
