package com.crimsoncrips.borninconfiguration.config;

import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

import static com.mojang.text2speech.Narrator.LOGGER;

public class BIConfig {


    //Baby Skeleton && Baby Skeleton Minion
    public static boolean BABY_SKELETON_SPAWNING_ENABLED;
    public static double BABY_SKELETON_ARMOR;
    public static double BABY_SKELETON_DAMAGE;
    public static double BABY_SKELETON_HEALTH;
    public static double BABY_SKELETON_KNOCKBACK;
    public static double BABY_SKELETON_SPEED;
    public static double BABY_SKELETON_KNOCKBACK_RESISTANCE;

    //Baby Spider && Baby Spider Minion
    public static boolean BABY_SPIDER_SPAWNING_ENABLED;
    public static double BABY_SPIDER_KNOCKBACK_RESISTANCE;
    public static double BABY_SPIDER_ARMOR;
    public static double BABY_SPIDER_DAMAGE;
    public static double BABY_SPIDER_HEALTH;
    public static double BABY_SPIDER_KNOCKBACK;
    public static double BABY_SPIDER_SPEED;

    //Barrel Zombie
    public static boolean ZOMBIE_BARREL_SPAWNING_ENABLED;
    public static double ZOMBIE_BARREL_ARMOR;
    public static double ZOMBIE_BARREL_DAMAGE;
    public static double ZOMBIE_BARREL_HEALTH;
    public static double ZOMBIE_BARREL_KNOCKBACK;
    public static double ZOMBIE_BARREL_KNOCKBACK_RESISTANCE;
    public static double ZOMBIE_BARREL_SPEED;

    //Bloody Gadfly
    public static boolean BLOODY_GADFLY_SPAWNING_ENABLED;
    public static double BLOODY_GADFLY_ARMOR;
    public static double BLOODY_GADFLY_DAMAGE;
    public static double BLOODY_GADFLY_HEALTH;
    public static double BLOODY_GADFLY_KNOCKBACK;
    public static double BLOODY_GADFLY_KNOCKBACK_RESISTANCE;
    public static double BLOODY_GADFLY_SPEED;

    //Bone Imp & Bone Imp Minion
    public static boolean BONE_IMP_SPAWNING_ENABLED;
    public static double BONE_IMP_ARMOR;
    public static double BONE_IMP_DAMAGE;
    public static double BONE_IMP_HEALTH;
    public static double BONE_IMP_KNOCKBACK;
    public static double BONE_IMP_KNOCKBACK_RESISTANCE;
    public static double BONE_IMP_SPEED;

    //Bonescaller
    public static boolean BONES_CALLER_SPAWNING_ENABLED;
    public static double BONES_CALLER_ARMOR;
    public static double BONES_CALLER_DAMAGE;
    public static double BONES_CALLER_HEALTH;
    public static double BONES_CALLER_KNOCKBACK;
    public static double BONES_CALLER_KNOCKBACK_RESISTANCE;
    public static double BONES_CALLER_SPEED;

    //Controlled Baby Skeleton
    public static double CONTROLLED_BABY_SKELETON_KNOCKBACK_RESISTANCE;
    public static double CONTROLLED_BABY_SKELETON_ARMOR;
    public static double CONTROLLED_BABY_SKELETON_DAMAGE;
    public static double CONTROLLED_BABY_SKELETON_HEALTH;
    public static double CONTROLLED_BABY_SKELETON_KNOCKBACK;
    public static double CONTROLLED_BABY_SKELETON_SPEED;

    //Controlled Spiritual Assistant
    public static double CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK_RESISTANCE;
    public static double CONTROLLED_SPIRITUAL_ASSISTANT_ARMOR;
    public static double CONTROLLED_SPIRITUAL_ASSISTANT_DAMAGE;
    public static double CONTROLLED_SPIRITUAL_ASSISTANT_HEALTH;
    public static double CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK;
    public static double CONTROLLED_SPIRITUAL_ASSISTANT_SPEED;

    //Corpse Fish
    public static boolean CORPSE_FISH_SPAWNING_ENABLED;
    public static double CORPSE_FISH_ARMOR;
    public static double CORPSE_FISH_DAMAGE;
    public static double CORPSE_FISH_HEALTH;
    public static double CORPSE_FISH_KNOCKBACK;
    public static double CORPSE_FISH_KNOCKBACK_RESISTANCE;
    public static double CORPSE_FISH_SPEED;

    //Corpse Fly
    public static boolean CORPSE_FLY_SPAWNING_ENABLED;
    public static double CORPSE_FLY_ARMOR;
    public static double CORPSE_FLY_DAMAGE;
    public static double CORPSE_FLY_HEALTH;
    public static double CORPSE_FLY_KNOCKBACK;
    public static double CORPSE_FLY_KNOCKBACK_RESISTANCE;
    public static double CORPSE_FLY_SPEED;

    //Dark Vortex
    public static boolean DARK_VORTEX_SPAWNING_ENABLED;
    public static double DARK_VORTEX_ARMOR;
    public static double DARK_VORTEX_DAMAGE;
    public static double DARK_VORTEX_HEALTH;
    public static double DARK_VORTEX_KNOCKBACK;
    public static double DARK_VORTEX_KNOCKBACK_RESISTANCE;
    public static double DARK_VORTEX_SPEED;

    //Decaying Zombie
    public static boolean DECAYING_ZOMBIE_SPAWNING_ENABLED;
    public static double DECAYING_ZOMBIE_ARMOR;
    public static double DECAYING_ZOMBIE_DAMAGE;
    public static double DECAYING_ZOMBIE_HEALTH;
    public static double DECAYING_ZOMBIE_KNOCKBACK;
    public static double DECAYING_ZOMBIE_KNOCKBACK_RESISTANCE;
    public static double DECAYING_ZOMBIE_SPEED;

    //Decrepit Skeleton
    public static boolean DECREPIT_SKELETON_SPAWNING_ENABLED;
    public static double DECREPIT_SKELETON_ARMOR;
    public static double DECREPIT_SKELETON_DAMAGE;
    public static double DECREPIT_SKELETON_HEALTH;
    public static double DECREPIT_SKELETON_KNOCKBACK;
    public static double DECREPIT_SKELETON_KNOCKBACK_RESISTANCE;
    public static double DECREPIT_SKELETON_SPEED;

    //Diamond Termite
    public static double DIAMOND_TERMITE_ARMOR;
    public static double DIAMOND_TERMITE_DAMAGE;
    public static double DIAMOND_TERMITE_HEALTH;
    public static double DIAMOND_TERMITE_KNOCKBACK;
    public static double DIAMOND_TERMITE_KNOCKBACK_RESISTANCE;
    public static double DIAMOND_TERMITE_SPEED;

    //Dire Hound Leader
    public static boolean DIRE_HOUND_SPAWNING_ENABLED;
    public static double DIRE_HOUND_LEADER_ARMOR;
    public static double DIRE_HOUND_LEADER_DAMAGE;
    public static double DIRE_HOUND_LEADER_HEALTH;
    public static double DIRE_HOUND_LEADER_KNOCKBACK;
    public static double DIRE_HOUND_LEADER_KNOCKBACK_RESISTANCE;
    public static double DIRE_HOUND_LEADER_SPEED;

    //Door Knight
    public static boolean DOOR_KNIGHT_SPAWNING_ENABLED;
    public static double DOOR_KNIGHT_ARMOR;
    public static double DOOR_KNIGHT_DAMAGE;
    public static double DOOR_KNIGHT_HEALTH;
    public static double DOOR_KNIGHT_KNOCKBACK;
    public static double DOOR_KNIGHT_KNOCKBACK_RESISTANCE;
    public static double DOOR_KNIGHT_SPEED;

    //Dread Hound
    public static boolean DREAD_HOUND_SPAWNING_ENABLED;
    public static double DREAD_HOUND_ARMOR;
    public static double DREAD_HOUND_DAMAGE;
    public static double DREAD_HOUND_HEALTH;
    public static double DREAD_HOUND_KNOCKBACK;
    public static double DREAD_HOUND_KNOCKBACK_RESISTANCE;
    public static double DREAD_HOUND_SPEED;

    //Fallen Knight
    public static boolean FALLEN_KNIGHT_SPAWNING_ENABLED;
    public static double FALLEN_KNIGHT_ARMOR;
    public static double FALLEN_KNIGHT_DAMAGE;
    public static double FALLEN_KNIGHT_HEALTH;
    public static double FALLEN_KNIGHT_KNOCKBACK;
    public static double FALLEN_KNIGHT_KNOCKBACK_RESISTANCE;
    public static double FALLEN_KNIGHT_SPEED;

    //Fellsteed
    public static double FELSTEED_ARMOR;
    public static double FELSTEED_DAMAGE;
    public static double FELSTEED_HEALTH;
    public static double FELSTEED_KNOCKBACK;
    public static double FELSTEED_KNOCKBACK_RESISTANCE;
    public static double FELSTEED_SPEED;

    //Firelight
    public static boolean FIRELIGHT_SPAWNING_ENABLED;
    public static double FIRELIGHT_ARMOR;
    public static double FIRELIGHT_DAMAGE;
    public static double FIRELIGHT_HEALTH;
    public static double FIRELIGHT_KNOCKBACK;
    public static double FIRELIGHT_KNOCKBACK_RESISTANCE;
    public static double FIRELIGHT_SPEED;

    //Glutton Fish
    public static boolean GLUTTON_FISH_SPAWNING_ENABLED;
    public static double GLUTTON_FISH_ARMOR;
    public static double GLUTTON_FISH_DAMAGE;
    public static double GLUTTON_FISH_HEALTH;
    public static double GLUTTON_FISH_KNOCKBACK;
    public static double GLUTTON_FISH_KNOCKBACK_RESISTANCE;
    public static double GLUTTON_FISH_SPEED;

    //Infernal Spirit
    public static double INFERNAL_SPIRIT_ARMOR;
    public static double INFERNAL_SPIRIT_DAMAGE;
    public static double INFERNAL_SPIRIT_HEALTH;
    public static double INFERNAL_SPIRIT_KNOCKBACK;
    public static double INFERNAL_SPIRIT_KNOCKBACK_RESISTANCE;
    public static double INFERNAL_SPIRIT_SPEED;

    //Lifestealer
    public static int DAYS_TILL_LIFESTEALER;
    public static boolean LIFESTEALER_SPAWNING_ENABLED;
    public static double LIFESTEALER_ARMOR;
    public static double LIFESTEALER_DAMAGE;
    public static double LIFESTEALER_HEALTH;
    public static double LIFESTEALER_KNOCKBACK;
    public static double LIFESTEALER_KNOCKBACK_RESISTANCE;
    public static double LIFESTEALER_SPEED;

    //Lord Pumpkin Head
    public static double LORD_PUMPKIN_HEAD_ARMOR;
    public static double LORD_PUMPKIN_HEAD_DAMAGE;
    public static double LORD_PUMPKIN_HEAD_HEALTH;
    public static double LORD_PUMPKIN_HEAD_KNOCKBACK;
    public static double LORD_PUMPKIN_HEAD_KNOCKBACK_RESISTANCE;
    public static double LORD_PUMPKIN_HEAD_SPEED;

    //Lord Pumpkin Head Head
    public static double LORD_PUMPKIN_HEAD_HEAD_ARMOR;
    public static double LORD_PUMPKIN_HEAD_HEAD_DAMAGE;
    public static double LORD_PUMPKIN_HEAD_HEAD_HEALTH;
    public static double LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK;
    public static double LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK_RESISTANCE;
    public static double LORD_PUMPKIN_HEAD_HEAD_SPEED;

    //Lord Pumpkin Head Horseless
    public static double LORD_PUMPKIN_HEAD_HORSELESS_ARMOR;
    public static double LORD_PUMPKIN_HEAD_HORSELESS_DAMAGE;
    public static double LORD_PUMPKIN_HEAD_HORSELESS_HEALTH;
    public static double LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK;
    public static double LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK_RESISTANCE;
    public static double LORD_PUMPKIN_HEAD_HORSELESS_SPEED;

    //Lord Pumpkin Head Headless
    public static double LORD_HEADLESS_ARMOR;
    public static double LORD_HEADLESS_DAMAGE;
    public static double LORD_HEADLESS_HEALTH;
    public static double LORD_HEADLESS_KNOCKBACK;
    public static double LORD_HEADLESS_KNOCKBACK_RESISTANCE;
    public static double LORD_HEADLESS_SPEED;

    //Lord Felsteed
    public static double LORD_FELSTEED_ARMOR;
    public static double LORD_FELSTEED_DAMAGE;
    public static double LORD_FELSTEED_HEALTH;
    public static double LORD_FELSTEED_KNOCKBACK;
    public static double LORD_FELSTEED_KNOCKBACK_RESISTANCE;
    public static double LORD_FELSTEED_SPEED;

    //Maggot
    public static double MAGGOT_ARMOR;
    public static double MAGGOT_DAMAGE;
    public static double MAGGOT_HEALTH;
    public static double MAGGOT_KNOCKBACK;
    public static double MAGGOT_KNOCKBACK_RESISTANCE;
    public static double MAGGOT_SPEED;

    //Missioner

    public static int DAYS_TILL_MISSIONER;
    public static boolean MISSIONER_SPAWNING_ENABLED;
    public static double MISSIONER_ARMOR;
    public static double MISSIONER_DAMAGE;
    public static double MISSIONER_HEALTH;
    public static double MISSIONER_KNOCKBACK;
    public static double MISSIONER_KNOCKBACK_RESISTANCE;
    public static double MISSIONER_SPEED;

    //Mother Spider
    public static boolean MOTHER_SPIDER_SPAWNING_ENABLED;
    public static double MOTHER_SPIDER_ARMOR;
    public static double MOTHER_SPIDER_DAMAGE;
    public static double MOTHER_SPIDER_HEALTH;
    public static double MOTHER_SPIDER_KNOCKBACK;
    public static double MOTHER_SPIDER_KNOCKBACK_RESISTANCE;
    public static double MOTHER_SPIDER_SPEED;

    //Ms Pumpkin
    public static boolean MR_PUMPKIN_SPAWNING_ENABLED;
    public static double MR_PUMPKIN_ARMOR;
    public static double MR_PUMPKIN_DAMAGE;
    public static double MR_PUMPKIN_HEALTH;
    public static double MR_PUMPKIN_KNOCKBACK;
    public static double MR_PUMPKIN_KNOCKBACK_RESISTANCE;
    public static double MR_PUMPKIN_SPEED;
    public static double MR_PUMPKIN_FLYING_SPEED;

    //MS Pumpkin
    public static boolean MS_PUMPKIN_SPAWNING_ENABLED;
    public static double MS_PUMPKIN_ARMOR;
    public static double MS_PUMPKIN_DAMAGE;
    public static double MS_PUMPKIN_HEALTH;
    public static double MS_PUMPKIN_KNOCKBACK;
    public static double MS_PUMPKIN_KNOCKBACK_RESISTANCE;
    public static double MS_PUMPKIN_SPEED;
    public static double MS_PUMPKIN_FLYING_SPEED;

    //Nightmare Stalker
    public static int DAYS_TILL_NIGHTMARE;
    public static boolean NIGHTMARE_STALKER_SPAWNING_ENABLED;
    public static boolean NIGHTMARE_STRENGTH_ENABLED;
    public static boolean NIGHTMARE_EFFECTS_ENABLED;
    public static double NIGHTMARE_STALKER_ARMOR;
    public static double NIGHTMARE_STALKER_DAMAGE;
    public static double NIGHTMARE_STALKER_HEALTH;
    public static double NIGHTMARE_STALKER_KNOCKBACK;
    public static double NIGHTMARE_STALKER_KNOCKBACK_RESISTANCE;
    public static double NIGHTMARE_STALKER_SPEED;

    //Phantom Creeper & Phantom Creeper Copy
    public static boolean PHANTOM_CREEPER_SPAWNING_ENABLED;
    public static double PHANTOM_CREEPER_ARMOR;
    public static double PHANTOM_CREEPER_DAMAGE;
    public static double PHANTOM_CREEPER_HEALTH;
    public static double PHANTOM_CREEPER_KNOCKBACK_RESISTANCE;
    public static double PHANTOM_CREEPER_SPEED;

    //Pumpkin Bruiser
    public static boolean PUMPKIN_BRUISER_SPAWNING_ENABLED;
    public static double PUMPKIN_BRUISER_ARMOR;
    public static double PUMPKIN_BRUISER_DAMAGE;
    public static double PUMPKIN_BRUISER_HEALTH;
    public static double PUMPKIN_BRUISER_KNOCKBACK_RESISTANCE;
    public static double PUMPKIN_BRUISER_SPEED;
    public static double PUMPKIN_BRUISER_KNOCKBACK;

    //Pumpkin Dunce
    public static boolean PUMPKIN_DUNCE_SPAWNING_ENABLED;
    public static double PUMPKIN_DUNCE_ARMOR;
    public static double PUMPKIN_DUNCE_DAMAGE;
    public static double PUMPKIN_DUNCE_HEALTH;
    public static double PUMPKIN_DUNCE_KNOCKBACK_RESISTANCE;
    public static double PUMPKIN_DUNCE_SPEED;
    public static double PUMPKIN_DUNCE_KNOCKBACK;

    //Pumpkin Spirit
    public static double PUMPKIN_SPIRIT_ARMOR;
    public static double PUMPKIN_SPIRIT_DAMAGE;
    public static double PUMPKIN_SPIRIT_HEALTH;
    public static double PUMPKIN_SPIRIT_KNOCKBACK;
    public static double PUMPKIN_SPIRIT_KNOCKBACK_RESISTANCE;
    public static double PUMPKIN_SPIRIT_SPEED;

    //Pumpkinhead
    public static boolean PUMPKIN_HEAD_SPAWNING_ENABLED;
    public static double PUMPKIN_HEAD_ARMOR;
    public static double PUMPKIN_HEAD_DAMAGE;
    public static double PUMPKIN_HEAD_HEALTH;
    public static double PUMPKIN_HEAD_KNOCKBACK;
    public static double PUMPKIN_HEAD_KNOCKBACK_RESISTANCE;
    public static double PUMPKIN_HEAD_SPEED;

    //Restless Spirit
    public static boolean RESTLESS_SPIRIT_SPAWNING_ENABLED;
    public static double RESTLESS_SPIRIT_ARMOR;
    public static double RESTLESS_SPIRIT_DAMAGE;
    public static double RESTLESS_SPIRIT_HEALTH;
    public static double RESTLESS_SPIRIT_KNOCKBACK;
    public static double RESTLESS_SPIRIT_KNOCKBACK_RESISTANCE;
    public static double RESTLESS_SPIRIT_SPEED;
    public static double RESTLESS_SPIRIT_FLYING_SPEED;

    //Rideable Lord Felsteed
    public static double RIDEABLE_LORD_FELSTEED_ARMOR;
    public static double RIDEABLE_LORD_FELSTEED_DAMAGE;
    public static double RIDEABLE_LORD_FELSTEED_HEALTH;
    public static double RIDEABLE_LORD_FELSTEED_KNOCKBACK;
    public static double RIDEABLE_LORD_FELSTEED_KNOCKBACK_RESISTANCE;
    public static double RIDEABLE_LORD_FELSTEED_SPEED;

    //Scarlet Prosecuter
    public static int SCARLET_SPAWN_AMMOUNT;
    public static double SCARLET_PROSECUTER_ARMOR;
    public static double SCARLET_PROSECUTER_DAMAGE;
    public static double SCARLET_PROSECUTER_HEALTH;
    public static double SCARLET_PROSECUTER_KNOCKBACK;
    public static double SCARLET_PROSECUTER_KNOCKBACK_RESISTANCE;
    public static double SCARLET_PROSECUTER_SPEED;
    public static double SCARLET_PROSECUTER_FLYING_SPEED;


    //Seared Spirit
    public static boolean SEARED_SPIRIT_SPAWNING_ENABLED;
    public static double SEARED_SPIRIT_ARMOR;
    public static double SEARED_SPIRIT_DAMAGE;
    public static double SEARED_SPIRIT_HEALTH;
    public static double SEARED_SPIRIT_KNOCKBACK;
    public static double SEARED_SPIRIT_KNOCKBACK_RESISTANCE;
    public static double SEARED_SPIRIT_SPEED;

    //Senor Pumpkin
    public static boolean SENOR_PUMPKIN_SPAWNING_ENABLED;
    public static double SENOR_PUMPKIN_ARMOR;
    public static double SENOR_PUMPKIN_DAMAGE;
    public static double SENOR_PUMPKIN_HEALTH;
    public static double SENOR_PUMPKIN_KNOCKBACK;
    public static double SENOR_PUMPKIN_KNOCKBACK_RESISTANCE;
    public static double SENOR_PUMPKIN_SPEED;

    //Siamese Skeleton
    public static boolean SIAMESE_SKELETON_SPAWNING_ENABLED;
    public static double SIAMESE_SKELETON_ARMOR;
    public static double SIAMESE_SKELETON_DAMAGE;
    public static double SIAMESE_SKELETON_HEALTH;
    public static double SIAMESE_SKELETON_KNOCKBACK;
    public static double SIAMESE_SKELETON_KNOCKBACK_RESISTANCE;
    public static double SIAMESE_SKELETON_SPEED;

    //Sir Pumpkinhead
    public static boolean SIR_PUMPKINHEAD_SPAWNING_ENABLED;
    public static double SIR_PUMPKINHEAD_ARMOR;
    public static double SIR_PUMPKINHEAD_DAMAGE;
    public static double SIR_PUMPKINHEAD_HEALTH;
    public static double SIR_PUMPKINHEAD_KNOCKBACK;
    public static double SIR_PUMPKINHEAD_KNOCKBACK_RESISTANCE;
    public static double SIR_PUMPKINHEAD_SPEED;

    //Sir Pumpkinhead Horseless
    public static double SIR_PUMPKINHEAD_HORSELESS_ARMOR;
    public static double SIR_PUMPKINHEAD_HORSELESS_DAMAGE;
    public static double SIR_PUMPKINHEAD_HORSELESS_HEALTH;
    public static double SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK;
    public static double SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK_RESISTANCE;
    public static double SIR_PUMPKINHEAD_HORSELESS_SPEED;

    //Sir Pumpkinhead Headless
    public static double SIR_PUMPKINHEAD_HEADLESS_ARMOR;
    public static double SIR_PUMPKINHEAD_HEADLESS_DAMAGE;
    public static double SIR_PUMPKINHEAD_HEADLESS_HEALTH;
    public static double SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK;
    public static double SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK_RESISTANCE;
    public static double SIR_PUMPKINHEAD_HEADLESS_SPEED;

    //Skeleton Demoman
    public static boolean SKELETON_DEMOMAN_SPAWNING_ENABLED;
    public static double SKELETON_DEMOMAN_ARMOR;
    public static double SKELETON_DEMOMAN_DAMAGE;
    public static double SKELETON_DEMOMAN_HEALTH;
    public static double SKELETON_DEMOMAN_KNOCKBACK;
    public static double SKELETON_DEMOMAN_KNOCKBACK_RESISTANCE;
    public static double SKELETON_DEMOMAN_SPEED;

    //Skeleton Thrasher
    public static boolean SKELETON_THRASHER_SPAWNING_ENABLED;
    public static double SKELETON_THRASHER_ARMOR;
    public static double SKELETON_THRASHER_DAMAGE;
    public static double SKELETON_THRASHER_HEALTH;
    public static double SKELETON_THRASHER_KNOCKBACK;
    public static double SKELETON_THRASHER_KNOCKBACK_RESISTANCE;
    public static double SKELETON_THRASHER_SPEED;

    //Spirit Guide
    public static boolean SPIRIT_GUIDE_SPAWNING_ENABLED;
    public static double SPIRIT_GUIDE_ARMOR;
    public static double SPIRIT_GUIDE_DAMAGE;
    public static double SPIRIT_GUIDE_HEALTH;
    public static double SPIRIT_GUIDE_KNOCKBACK;
    public static double SPIRIT_GUIDE_KNOCKBACK_RESISTANCE;
    public static double SPIRIT_GUIDE_SPEED;

    //Spirit Guide Assistant
    public static double SPIRIT_GUIDE_ASSISTANT_ARMOR;
    public static double SPIRIT_GUIDE_ASSISTANT_DAMAGE;
    public static double SPIRIT_GUIDE_ASSISTANT_HEALTH;
    public static double SPIRIT_GUIDE_ASSISTANT_KNOCKBACK;
    public static double SPIRIT_GUIDE_ASSISTANT_KNOCKBACK_RESISTANCE;
    public static double SPIRIT_GUIDE_ASSISTANT_SPEED;


    //Spirit of Chaos
    public static boolean SPIRIT_OF_CHAOS_SPAWNING_ENABLED;
    public static double SPIRIT_OF_CHAOS_ARMOR;
    public static double SPIRIT_OF_CHAOS_DAMAGE;
    public static double SPIRIT_OF_CHAOS_HEALTH;
    public static double SPIRIT_OF_CHAOS_KNOCKBACK;
    public static double SPIRIT_OF_CHAOS_KNOCKBACK_RESISTANCE;
    public static double SPIRIT_OF_CHAOS_SPEED;

    //Supreme Bonescaller
    public static boolean SUPREME_BONESCALLER_SPAWNING_ENABLED;
    public static double SUPREME_BONESCALLER_ARMOR;
    public static double SUPREME_BONESCALLER_DAMAGE;
    public static double SUPREME_BONESCALLER_HEALTH;
    public static double SUPREME_BONESCALLER_KNOCKBACK;
    public static double SUPREME_BONESCALLER_KNOCKBACK_RESISTANCE;
    public static double SUPREME_BONESCALLER_SPEED;

    //Supreme Bonescaller(Phase 2)
    public static double SUPREME_BONESCALLER_PHASE_2_ARMOR;
    public static double SUPREME_BONESCALLER_PHASE_2_DAMAGE;
    public static double SUPREME_BONESCALLER_PHASE_2_HEALTH;
    public static double SUPREME_BONESCALLER_PHASE_2_KNOCKBACK;
    public static double SUPREME_BONESCALLER_PHASE_2_KNOCKBACK_RESISTANCE;
    public static double SUPREME_BONESCALLER_PHASE_2_SPEED;

    //Swarmer
    public static boolean SWARMER_SPAWNING_ENABLED;
    public static double SWARMER_ARMOR;
    public static double SWARMER_DAMAGE;
    public static double SWARMER_HEALTH;
    public static double SWARMER_KNOCKBACK;
    public static double SWARMER_KNOCKBACK_RESISTANCE;
    public static double SWARMER_SPEED;

    //Thornshell Crab
    public static boolean THORNSHELL_CRAB_SPAWNING_ENABLED;
    public static double THORNSHELL_CRAB_ARMOR;
    public static double THORNSHELL_CRAB_DAMAGE;
    public static double THORNSHELL_CRAB_HEALTH;
    public static double THORNSHELL_CRAB_KNOCKBACK;
    public static double THORNSHELL_CRAB_KNOCKBACK_RESISTANCE;
    public static double THORNSHELL_CRAB_SPEED;

    //Zombie Bruiser
    public static boolean ZOMBIE_BRUISER_SPAWNING_ENABLED;
    public static double ZOMBIE_BRUISER_ARMOR;
    public static double ZOMBIE_BRUISER_DAMAGE;
    public static double ZOMBIE_BRUISER_HEALTH;
    public static double ZOMBIE_BRUISER_KNOCKBACK;
    public static double ZOMBIE_BRUISER_KNOCKBACK_RESISTANCE;
    public static double ZOMBIE_BRUISER_SPEED;

    //Zombie Clown
    public static boolean ZOMBIE_CLOWN_SPAWNING_ENABLED;
    public static double ZOMBIE_CLOWN_ARMOR;
    public static double ZOMBIE_CLOWN_DAMAGE;
    public static double ZOMBIE_CLOWN_HEALTH;
    public static double ZOMBIE_CLOWN_KNOCKBACK;
    public static double ZOMBIE_CLOWN_KNOCKBACK_RESISTANCE;
    public static double ZOMBIE_CLOWN_SPEED;

    //Zombie Fisherman
    public static boolean ZOMBIE_FISHERMAN_SPAWNING_ENABLED;
    public static double ZOMBIE_FISHERMAN_ARMOR;
    public static double ZOMBIE_FISHERMAN_DAMAGE;
    public static double ZOMBIE_FISHERMAN_HEALTH;
    public static double ZOMBIE_FISHERMAN_KNOCKBACK;
    public static double ZOMBIE_FISHERMAN_KNOCKBACK_RESISTANCE;
    public static double ZOMBIE_FISHERMAN_SPEED;

    //Zombie Lumberjack
    public static boolean ZOMBIE_LUMBERJACK_SPAWNING_ENABLED;
    public static double ZOMBIE_LUMBERJACK_ARMOR;
    public static double ZOMBIE_LUMBERJACK_DAMAGE;
    public static double ZOMBIE_LUMBERJACK_HEALTH;
    public static double ZOMBIE_LUMBERJACK_KNOCKBACK;
    public static double ZOMBIE_LUMBERJACK_KNOCKBACK_RESISTANCE;
    public static double ZOMBIE_LUMBERJACK_SPEED;

    public static boolean INFESTED_DIAMONDS_ENABLED;
    public static boolean ROTTEN_CONSUMPTION_ENABLED;

    public static boolean RETALLIATION_ENABLED;
    public static boolean STALKER_IMMUNITY_ENABLED;
    public static boolean SOUL_STRATIFICATION_EFFECT_ENABLED;
    public static boolean SPIRIT_DISSAPPEAR_IN_SUN_ENABLED;
    public static boolean WARNING_SPAWN_ENABLED;
    public static int PHANTOM_BOMB_COUNT;



    public static void bake() {
        try {
            //Baby Skeleton && Baby Skeleton Minion
            BABY_SKELETON_ARMOR = ConfigHolder.BORNCONFIG.BABY_SKELETON_ARMOR.get();
            BABY_SKELETON_DAMAGE = ConfigHolder.BORNCONFIG.BABY_SKELETON_DAMAGE.get();
            BABY_SKELETON_HEALTH = ConfigHolder.BORNCONFIG.BABY_SKELETON_HEALTH.get();
            BABY_SKELETON_KNOCKBACK = ConfigHolder.BORNCONFIG.BABY_SKELETON_KNOCKBACK.get();
            BABY_SKELETON_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.BABY_SKELETON_SPAWNING_ENABLED.get();
            BABY_SKELETON_SPEED = ConfigHolder.BORNCONFIG.BABY_SKELETON_SPEED.get();
            BABY_SKELETON_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.BABY_SKELETON_KNOCKBACK_RESISTANCE.get();

            //Baby Spider && Baby Spider Minion
            BABY_SPIDER_ARMOR = ConfigHolder.BORNCONFIG.BABY_SPIDER_ARMOR.get();
            BABY_SPIDER_DAMAGE = ConfigHolder.BORNCONFIG.BABY_SPIDER_DAMAGE.get();
            BABY_SPIDER_HEALTH = ConfigHolder.BORNCONFIG.BABY_SPIDER_HEALTH.get();
            BABY_SPIDER_KNOCKBACK = ConfigHolder.BORNCONFIG.BABY_SPIDER_KNOCKBACK.get();
            BABY_SPIDER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.BABY_SPIDER_SPAWNING_ENABLED.get();
            BABY_SPIDER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.BABY_SPIDER_KNOCKBACK_RESISTANCE.get();
            BABY_SPIDER_SPEED = ConfigHolder.BORNCONFIG.BABY_SPIDER_SPEED.get();

            //Barrel Zombie
            ZOMBIE_BARREL_ARMOR = ConfigHolder.BORNCONFIG.ZOMBIE_BARREL_ARMOR.get();
            ZOMBIE_BARREL_DAMAGE = ConfigHolder.BORNCONFIG.ZOMBIE_BARREL_DAMAGE.get();
            ZOMBIE_BARREL_HEALTH = ConfigHolder.BORNCONFIG.ZOMBIE_BARREL_HEALTH.get();
            ZOMBIE_BARREL_KNOCKBACK = ConfigHolder.BORNCONFIG.ZOMBIE_BARREL_KNOCKBACK.get();
            ZOMBIE_BARREL_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.ZOMBIE_BARREL_KNOCKBACK_RESISTANCE.get();
            ZOMBIE_BARREL_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.ZOMBIE_BARREL_SPAWNING_ENABLED.get();
            ZOMBIE_BARREL_SPEED = ConfigHolder.BORNCONFIG.ZOMBIE_BARREL_SPEED.get();

            //Bloody Gadfly
            BLOODY_GADFLY_ARMOR = ConfigHolder.BORNCONFIG.BLOODY_GADFLY_ARMOR.get();
            BLOODY_GADFLY_DAMAGE = ConfigHolder.BORNCONFIG.BLOODY_GADFLY_DAMAGE.get();
            BLOODY_GADFLY_HEALTH = ConfigHolder.BORNCONFIG.BLOODY_GADFLY_HEALTH.get();
            BLOODY_GADFLY_KNOCKBACK = ConfigHolder.BORNCONFIG.BLOODY_GADFLY_KNOCKBACK.get();
            BLOODY_GADFLY_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.BLOODY_GADFLY_KNOCKBACK_RESISTANCE.get();
            BLOODY_GADFLY_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.BLOODY_GADFLY_SPAWNING_ENABLED.get();
            BLOODY_GADFLY_SPEED = ConfigHolder.BORNCONFIG.BLOODY_GADFLY_SPEED.get();

            //Bone Imp & Bone Imp Minion
            BONE_IMP_ARMOR = ConfigHolder.BORNCONFIG.BONE_IMP_ARMOR.get();
            BONE_IMP_DAMAGE = ConfigHolder.BORNCONFIG.BONE_IMP_DAMAGE.get();
            BONE_IMP_HEALTH = ConfigHolder.BORNCONFIG.BONE_IMP_HEALTH.get();
            BONE_IMP_KNOCKBACK = ConfigHolder.BORNCONFIG.BONE_IMP_KNOCKBACK.get();
            BONE_IMP_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.BONE_IMP_KNOCKBACK_RESISTANCE.get();
            BONE_IMP_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.BONE_IMP_SPAWNING_ENABLED.get();
            BONE_IMP_SPEED = ConfigHolder.BORNCONFIG.BONE_IMP_SPEED.get();

            //Bonescaller
            BONES_CALLER_ARMOR = ConfigHolder.BORNCONFIG.BONES_CALLER_ARMOR.get();
            BONES_CALLER_DAMAGE = ConfigHolder.BORNCONFIG.BONES_CALLER_DAMAGE.get();
            BONES_CALLER_HEALTH = ConfigHolder.BORNCONFIG.BONES_CALLER_HEALTH.get();
            BONES_CALLER_KNOCKBACK = ConfigHolder.BORNCONFIG.BONES_CALLER_KNOCKBACK.get();
            BONES_CALLER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.BONES_CALLER_KNOCKBACK_RESISTANCE.get();
            BONES_CALLER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.BONES_CALLER_SPAWNING_ENABLED.get();
            BONES_CALLER_SPEED = ConfigHolder.BORNCONFIG.BONES_CALLER_SPEED.get();

            //Controlled Baby Skeleton
            CONTROLLED_BABY_SKELETON_ARMOR = ConfigHolder.BORNCONFIG.CONTROLLED_BABY_SKELETON_ARMOR.get();
            CONTROLLED_BABY_SKELETON_DAMAGE = ConfigHolder.BORNCONFIG.CONTROLLED_BABY_SKELETON_DAMAGE.get();
            CONTROLLED_BABY_SKELETON_HEALTH = ConfigHolder.BORNCONFIG.CONTROLLED_BABY_SKELETON_HEALTH.get();
            CONTROLLED_BABY_SKELETON_KNOCKBACK = ConfigHolder.BORNCONFIG.CONTROLLED_BABY_SKELETON_KNOCKBACK.get();
            CONTROLLED_BABY_SKELETON_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.CONTROLLED_BABY_SKELETON_KNOCKBACK_RESISTANCE.get();
            CONTROLLED_BABY_SKELETON_SPEED = ConfigHolder.BORNCONFIG.CONTROLLED_BABY_SKELETON_SPEED.get();

            //Controlled Spiritual Assistant
            CONTROLLED_SPIRITUAL_ASSISTANT_ARMOR = ConfigHolder.BORNCONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_ARMOR.get();
            CONTROLLED_SPIRITUAL_ASSISTANT_DAMAGE = ConfigHolder.BORNCONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_DAMAGE.get();
            CONTROLLED_SPIRITUAL_ASSISTANT_HEALTH = ConfigHolder.BORNCONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_HEALTH.get();
            CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK = ConfigHolder.BORNCONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK.get();
            CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK_RESISTANCE.get();
            CONTROLLED_SPIRITUAL_ASSISTANT_SPEED = ConfigHolder.BORNCONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_SPEED.get();

            //Corpse Fish
            CORPSE_FISH_ARMOR = ConfigHolder.BORNCONFIG.CORPSE_FISH_ARMOR.get();
            CORPSE_FISH_DAMAGE = ConfigHolder.BORNCONFIG.CORPSE_FISH_DAMAGE.get();
            CORPSE_FISH_HEALTH = ConfigHolder.BORNCONFIG.CORPSE_FISH_HEALTH.get();
            CORPSE_FISH_KNOCKBACK = ConfigHolder.BORNCONFIG.CORPSE_FISH_KNOCKBACK.get();
            CORPSE_FISH_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.CORPSE_FISH_KNOCKBACK_RESISTANCE.get();
            CORPSE_FISH_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.CORPSE_FISH_SPAWNING_ENABLED.get();
            CORPSE_FISH_SPEED = ConfigHolder.BORNCONFIG.CORPSE_FISH_SPEED.get();

            //Corpse Fly
            CORPSE_FLY_ARMOR = ConfigHolder.BORNCONFIG.CORPSE_FLY_ARMOR.get();
            CORPSE_FLY_DAMAGE = ConfigHolder.BORNCONFIG.CORPSE_FLY_DAMAGE.get();
            CORPSE_FLY_HEALTH = ConfigHolder.BORNCONFIG.CORPSE_FLY_HEALTH.get();
            CORPSE_FLY_KNOCKBACK = ConfigHolder.BORNCONFIG.CORPSE_FLY_KNOCKBACK.get();
            CORPSE_FLY_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.CORPSE_FLY_KNOCKBACK_RESISTANCE.get();
            CORPSE_FLY_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.CORPSE_FLY_SPAWNING_ENABLED.get();
            CORPSE_FLY_SPEED = ConfigHolder.BORNCONFIG.CORPSE_FLY_SPEED.get();

            //Dark Vortex
            DARK_VORTEX_ARMOR = ConfigHolder.BORNCONFIG.DARK_VORTEX_ARMOR.get();
            DARK_VORTEX_DAMAGE = ConfigHolder.BORNCONFIG.DARK_VORTEX_DAMAGE.get();
            DARK_VORTEX_HEALTH = ConfigHolder.BORNCONFIG.DARK_VORTEX_HEALTH.get();
            DARK_VORTEX_KNOCKBACK = ConfigHolder.BORNCONFIG.DARK_VORTEX_KNOCKBACK.get();
            DARK_VORTEX_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.DARK_VORTEX_KNOCKBACK_RESISTANCE.get();
            DARK_VORTEX_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.DARK_VORTEX_SPAWNING_ENABLED.get();
            DARK_VORTEX_SPEED = ConfigHolder.BORNCONFIG.DARK_VORTEX_SPEED.get();

            //Decaying Zombie
            DECAYING_ZOMBIE_ARMOR = ConfigHolder.BORNCONFIG.DECAYING_ZOMBIE_ARMOR.get();
            DECAYING_ZOMBIE_DAMAGE = ConfigHolder.BORNCONFIG.DECAYING_ZOMBIE_DAMAGE.get();
            DECAYING_ZOMBIE_HEALTH = ConfigHolder.BORNCONFIG.DECAYING_ZOMBIE_HEALTH.get();
            DECAYING_ZOMBIE_KNOCKBACK = ConfigHolder.BORNCONFIG.DECAYING_ZOMBIE_KNOCKBACK.get();
            DECAYING_ZOMBIE_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.DECAYING_ZOMBIE_KNOCKBACK_RESISTANCE.get();
            DECAYING_ZOMBIE_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.DECAYING_ZOMBIE_SPAWNING_ENABLED.get();
            DECAYING_ZOMBIE_SPEED = ConfigHolder.BORNCONFIG.DECAYING_ZOMBIE_SPEED.get();

            //Decrepit Skeleton
            DECREPIT_SKELETON_ARMOR = ConfigHolder.BORNCONFIG.DECREPIT_SKELETON_ARMOR.get();
            DECREPIT_SKELETON_DAMAGE = ConfigHolder.BORNCONFIG.DECREPIT_SKELETON_DAMAGE.get();
            DECREPIT_SKELETON_HEALTH = ConfigHolder.BORNCONFIG.DECREPIT_SKELETON_HEALTH.get();
            DECREPIT_SKELETON_KNOCKBACK = ConfigHolder.BORNCONFIG.DECREPIT_SKELETON_KNOCKBACK.get();
            DECREPIT_SKELETON_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.DECREPIT_SKELETON_KNOCKBACK_RESISTANCE.get();
            DECREPIT_SKELETON_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.DECREPIT_SKELETON_SPAWNING_ENABLED.get();
            DECREPIT_SKELETON_SPEED = ConfigHolder.BORNCONFIG.DECREPIT_SKELETON_SPEED.get();

            //Diamond Termite
            DIAMOND_TERMITE_ARMOR = ConfigHolder.BORNCONFIG.DIAMOND_TERMITE_ARMOR.get();
            DIAMOND_TERMITE_DAMAGE = ConfigHolder.BORNCONFIG.DIAMOND_TERMITE_DAMAGE.get();
            DIAMOND_TERMITE_HEALTH = ConfigHolder.BORNCONFIG.DIAMOND_TERMITE_HEALTH.get();
            DIAMOND_TERMITE_KNOCKBACK = ConfigHolder.BORNCONFIG.DIAMOND_TERMITE_KNOCKBACK.get();
            DIAMOND_TERMITE_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.DIAMOND_TERMITE_KNOCKBACK_RESISTANCE.get();
            DIAMOND_TERMITE_SPEED = ConfigHolder.BORNCONFIG.DIAMOND_TERMITE_SPEED.get();

            //Dire Hound Leader
            DIRE_HOUND_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.DIRE_HOUND_SPAWNING_ENABLED.get();
            DIRE_HOUND_LEADER_ARMOR = ConfigHolder.BORNCONFIG.DIRE_HOUND_LEADER_ARMOR.get();
            DIRE_HOUND_LEADER_DAMAGE = ConfigHolder.BORNCONFIG.DIRE_HOUND_LEADER_DAMAGE.get();
            DIRE_HOUND_LEADER_HEALTH = ConfigHolder.BORNCONFIG.DIRE_HOUND_LEADER_HEALTH.get();
            DIRE_HOUND_LEADER_KNOCKBACK = ConfigHolder.BORNCONFIG.DIRE_HOUND_LEADER_KNOCKBACK.get();
            DIRE_HOUND_LEADER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.DIRE_HOUND_LEADER_KNOCKBACK_RESISTANCE.get();
            DIRE_HOUND_LEADER_SPEED = ConfigHolder.BORNCONFIG.DIRE_HOUND_LEADER_SPEED.get();

            //Door Knight
            DOOR_KNIGHT_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.DOOR_KNIGHT_SPAWNING_ENABLED.get();
            DOOR_KNIGHT_ARMOR = ConfigHolder.BORNCONFIG.DOOR_KNIGHT_ARMOR.get();
            DOOR_KNIGHT_DAMAGE = ConfigHolder.BORNCONFIG.DOOR_KNIGHT_DAMAGE.get();
            DOOR_KNIGHT_HEALTH = ConfigHolder.BORNCONFIG.DOOR_KNIGHT_HEALTH.get();
            DOOR_KNIGHT_KNOCKBACK = ConfigHolder.BORNCONFIG.DOOR_KNIGHT_KNOCKBACK.get();
            DOOR_KNIGHT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.DOOR_KNIGHT_KNOCKBACK_RESISTANCE.get();
            DOOR_KNIGHT_SPEED = ConfigHolder.BORNCONFIG.DOOR_KNIGHT_SPEED.get();
            
            //Dread Hound
            DREAD_HOUND_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.DREAD_HOUND_SPAWNING_ENABLED.get();
            DREAD_HOUND_ARMOR = ConfigHolder.BORNCONFIG.DREAD_HOUND_ARMOR.get();
            DREAD_HOUND_DAMAGE = ConfigHolder.BORNCONFIG.DREAD_HOUND_DAMAGE.get();
            DREAD_HOUND_HEALTH = ConfigHolder.BORNCONFIG.DREAD_HOUND_HEALTH.get();
            DREAD_HOUND_KNOCKBACK = ConfigHolder.BORNCONFIG.DREAD_HOUND_KNOCKBACK.get();
            DREAD_HOUND_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.DREAD_HOUND_KNOCKBACK_RESISTANCE.get();
            DREAD_HOUND_SPEED = ConfigHolder.BORNCONFIG.DREAD_HOUND_SPEED.get();

            //Fallen Knight
            FALLEN_KNIGHT_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.FALLEN_KNIGHT_SPAWNING_ENABLED.get();
            FALLEN_KNIGHT_ARMOR = ConfigHolder.BORNCONFIG.FALLEN_KNIGHT_ARMOR.get();
            FALLEN_KNIGHT_DAMAGE = ConfigHolder.BORNCONFIG.FALLEN_KNIGHT_DAMAGE.get();
            FALLEN_KNIGHT_HEALTH = ConfigHolder.BORNCONFIG.FALLEN_KNIGHT_HEALTH.get();
            FALLEN_KNIGHT_KNOCKBACK = ConfigHolder.BORNCONFIG.FALLEN_KNIGHT_KNOCKBACK.get();
            FALLEN_KNIGHT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.FALLEN_KNIGHT_KNOCKBACK_RESISTANCE.get();
            FALLEN_KNIGHT_SPEED = ConfigHolder.BORNCONFIG.FALLEN_KNIGHT_SPEED.get();

            //Felsteed
            FELSTEED_ARMOR = ConfigHolder.BORNCONFIG.FELSTEED_ARMOR.get();
            FELSTEED_DAMAGE = ConfigHolder.BORNCONFIG.FELSTEED_DAMAGE.get();
            FELSTEED_HEALTH = ConfigHolder.BORNCONFIG.FELSTEED_HEALTH.get();
            FELSTEED_KNOCKBACK = ConfigHolder.BORNCONFIG.FELSTEED_KNOCKBACK.get();
            FELSTEED_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.FELSTEED_KNOCKBACK_RESISTANCE.get();
            FELSTEED_SPEED = ConfigHolder.BORNCONFIG.FELSTEED_SPEED.get();

            //Firelight
            FIRELIGHT_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.FIRELIGHT_SPAWNING_ENABLED.get();
            FIRELIGHT_ARMOR = ConfigHolder.BORNCONFIG.FIRELIGHT_ARMOR.get();
            FIRELIGHT_DAMAGE = ConfigHolder.BORNCONFIG.FIRELIGHT_DAMAGE.get();
            FIRELIGHT_HEALTH = ConfigHolder.BORNCONFIG.FIRELIGHT_HEALTH.get();
            FIRELIGHT_KNOCKBACK = ConfigHolder.BORNCONFIG.FIRELIGHT_KNOCKBACK.get();
            FIRELIGHT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.FIRELIGHT_KNOCKBACK_RESISTANCE.get();
            FIRELIGHT_SPEED = ConfigHolder.BORNCONFIG.FIRELIGHT_SPEED.get();

            //Glutton Fish
            GLUTTON_FISH_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.GLUTTON_FISH_SPAWNING_ENABLED.get();
            GLUTTON_FISH_ARMOR = ConfigHolder.BORNCONFIG.GLUTTON_FISH_ARMOR.get();
            GLUTTON_FISH_DAMAGE = ConfigHolder.BORNCONFIG.GLUTTON_FISH_DAMAGE.get();
            GLUTTON_FISH_HEALTH = ConfigHolder.BORNCONFIG.GLUTTON_FISH_HEALTH.get();
            GLUTTON_FISH_KNOCKBACK = ConfigHolder.BORNCONFIG.GLUTTON_FISH_KNOCKBACK.get();
            GLUTTON_FISH_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.GLUTTON_FISH_KNOCKBACK_RESISTANCE.get();
            GLUTTON_FISH_SPEED = ConfigHolder.BORNCONFIG.GLUTTON_FISH_SPEED.get();

            //Infernal Spirit
            INFERNAL_SPIRIT_ARMOR = ConfigHolder.BORNCONFIG.INFERNAL_SPIRIT_ARMOR.get();
            INFERNAL_SPIRIT_DAMAGE = ConfigHolder.BORNCONFIG.INFERNAL_SPIRIT_DAMAGE.get();
            INFERNAL_SPIRIT_HEALTH = ConfigHolder.BORNCONFIG.INFERNAL_SPIRIT_HEALTH.get();
            INFERNAL_SPIRIT_KNOCKBACK = ConfigHolder.BORNCONFIG.INFERNAL_SPIRIT_KNOCKBACK.get();
            INFERNAL_SPIRIT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.INFERNAL_SPIRIT_KNOCKBACK_RESISTANCE.get();
            INFERNAL_SPIRIT_SPEED = ConfigHolder.BORNCONFIG.INFERNAL_SPIRIT_SPEED.get();

            //Lifestealer
            DAYS_TILL_LIFESTEALER = ConfigHolder.BORNCONFIG.DAYS_TILL_LIFESTEALER.get();
            LIFESTEALER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.LIFESTEALER_SPAWNING_ENABLED.get();
            LIFESTEALER_ARMOR = ConfigHolder.BORNCONFIG.LIFESTEALER_ARMOR.get();
            LIFESTEALER_DAMAGE = ConfigHolder.BORNCONFIG.LIFESTEALER_DAMAGE.get();
            LIFESTEALER_HEALTH = ConfigHolder.BORNCONFIG.LIFESTEALER_HEALTH.get();
            LIFESTEALER_KNOCKBACK = ConfigHolder.BORNCONFIG.LIFESTEALER_KNOCKBACK.get();
            LIFESTEALER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.LIFESTEALER_KNOCKBACK_RESISTANCE.get();
            LIFESTEALER_SPEED = ConfigHolder.BORNCONFIG.LIFESTEALER_SPEED.get();

            //Lord Pumpkin Head
            LORD_PUMPKIN_HEAD_ARMOR = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_ARMOR.get();
            LORD_PUMPKIN_HEAD_DAMAGE = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_DAMAGE.get();
            LORD_PUMPKIN_HEAD_HEALTH = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HEALTH.get();
            LORD_PUMPKIN_HEAD_KNOCKBACK = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_KNOCKBACK.get();
            LORD_PUMPKIN_HEAD_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_KNOCKBACK_RESISTANCE.get();
            LORD_PUMPKIN_HEAD_SPEED = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_SPEED.get();

            //Lord Pumpkin Head Head
            LORD_PUMPKIN_HEAD_HEAD_ARMOR = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HEAD_ARMOR.get();
            LORD_PUMPKIN_HEAD_HEAD_DAMAGE = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HEAD_DAMAGE.get();
            LORD_PUMPKIN_HEAD_HEAD_HEALTH = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HEAD_HEALTH.get();
            LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK.get();
            LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK_RESISTANCE.get();
            LORD_PUMPKIN_HEAD_HEAD_SPEED = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HEAD_SPEED.get();

            //Lord Pumpkin Head Horseless
            LORD_PUMPKIN_HEAD_HORSELESS_ARMOR = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HORSELESS_ARMOR.get();
            LORD_PUMPKIN_HEAD_HORSELESS_DAMAGE = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HORSELESS_DAMAGE.get();
            LORD_PUMPKIN_HEAD_HORSELESS_HEALTH = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HORSELESS_HEALTH.get();
            LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK.get();
            LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK_RESISTANCE.get();
            LORD_PUMPKIN_HEAD_HORSELESS_SPEED = ConfigHolder.BORNCONFIG.LORD_PUMPKIN_HEAD_HORSELESS_SPEED.get();

            //Lord Pumpkin Head Headless
            LORD_HEADLESS_ARMOR = ConfigHolder.BORNCONFIG.LORD_HEADLESS_ARMOR.get();
            LORD_HEADLESS_DAMAGE = ConfigHolder.BORNCONFIG.LORD_HEADLESS_DAMAGE.get();
            LORD_HEADLESS_HEALTH = ConfigHolder.BORNCONFIG.LORD_HEADLESS_HEALTH.get();
            LORD_HEADLESS_KNOCKBACK = ConfigHolder.BORNCONFIG.LORD_HEADLESS_KNOCKBACK.get();
            LORD_HEADLESS_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.LORD_HEADLESS_KNOCKBACK_RESISTANCE.get();
            LORD_HEADLESS_SPEED = ConfigHolder.BORNCONFIG.LORD_HEADLESS_SPEED.get();

            //Lord Felsteed
            LORD_FELSTEED_ARMOR = ConfigHolder.BORNCONFIG.LORD_FELSTEED_ARMOR.get();
            LORD_FELSTEED_DAMAGE = ConfigHolder.BORNCONFIG.LORD_FELSTEED_DAMAGE.get();
            LORD_FELSTEED_HEALTH = ConfigHolder.BORNCONFIG.LORD_FELSTEED_HEALTH.get();
            LORD_FELSTEED_KNOCKBACK = ConfigHolder.BORNCONFIG.LORD_FELSTEED_KNOCKBACK.get();
            LORD_FELSTEED_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.LORD_FELSTEED_KNOCKBACK_RESISTANCE.get();
            LORD_FELSTEED_SPEED = ConfigHolder.BORNCONFIG.LORD_FELSTEED_SPEED.get();

            //Maggot
            MAGGOT_ARMOR = ConfigHolder.BORNCONFIG.MAGGOT_ARMOR.get();
            MAGGOT_DAMAGE = ConfigHolder.BORNCONFIG.MAGGOT_DAMAGE.get();
            MAGGOT_HEALTH = ConfigHolder.BORNCONFIG.MAGGOT_HEALTH.get();
            MAGGOT_KNOCKBACK = ConfigHolder.BORNCONFIG.MAGGOT_KNOCKBACK.get();
            MAGGOT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.MAGGOT_KNOCKBACK_RESISTANCE.get();
            MAGGOT_SPEED = ConfigHolder.BORNCONFIG.MAGGOT_SPEED.get();

            //Missioner
            DAYS_TILL_MISSIONER = ConfigHolder.BORNCONFIG.DAYS_TILL_MISSIONER.get();
            MISSIONER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.MISSIONER_SPAWNING_ENABLED.get();
            MISSIONER_ARMOR = ConfigHolder.BORNCONFIG.MISSIONER_ARMOR.get();
            MISSIONER_DAMAGE = ConfigHolder.BORNCONFIG.MISSIONER_DAMAGE.get();
            MISSIONER_HEALTH = ConfigHolder.BORNCONFIG.MISSIONER_HEALTH.get();
            MISSIONER_KNOCKBACK = ConfigHolder.BORNCONFIG.MISSIONER_KNOCKBACK.get();
            MISSIONER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.MISSIONER_KNOCKBACK_RESISTANCE.get();
            MISSIONER_SPEED = ConfigHolder.BORNCONFIG.MISSIONER_SPEED.get();

            //Mother Spider
            MOTHER_SPIDER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.MOTHER_SPIDER_SPAWNING_ENABLED.get();
            MOTHER_SPIDER_ARMOR = ConfigHolder.BORNCONFIG.MOTHER_SPIDER_ARMOR.get();
            MOTHER_SPIDER_DAMAGE = ConfigHolder.BORNCONFIG.MOTHER_SPIDER_DAMAGE.get();
            MOTHER_SPIDER_HEALTH = ConfigHolder.BORNCONFIG.MOTHER_SPIDER_HEALTH.get();
            MOTHER_SPIDER_KNOCKBACK = ConfigHolder.BORNCONFIG.MOTHER_SPIDER_KNOCKBACK.get();
            MOTHER_SPIDER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.MOTHER_SPIDER_KNOCKBACK_RESISTANCE.get();
            MOTHER_SPIDER_SPEED = ConfigHolder.BORNCONFIG.MOTHER_SPIDER_SPEED.get();

            //Mr Pumpkin
            MR_PUMPKIN_FLYING_SPEED = ConfigHolder.BORNCONFIG.MR_PUMPKIN_FLYING_SPEED.get();

            MR_PUMPKIN_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.MR_PUMPKIN_SPAWNING_ENABLED.get();
            MR_PUMPKIN_ARMOR = ConfigHolder.BORNCONFIG.MR_PUMPKIN_ARMOR.get();
            MR_PUMPKIN_DAMAGE = ConfigHolder.BORNCONFIG.MR_PUMPKIN_DAMAGE.get();
            MR_PUMPKIN_HEALTH = ConfigHolder.BORNCONFIG.MR_PUMPKIN_HEALTH.get();
            MR_PUMPKIN_KNOCKBACK = ConfigHolder.BORNCONFIG.MR_PUMPKIN_KNOCKBACK.get();
            MR_PUMPKIN_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.MR_PUMPKIN_KNOCKBACK_RESISTANCE.get();
            MR_PUMPKIN_SPEED = ConfigHolder.BORNCONFIG.MR_PUMPKIN_SPEED.get();

            //Ms Pumpkin
            MS_PUMPKIN_FLYING_SPEED = ConfigHolder.BORNCONFIG.MR_PUMPKIN_FLYING_SPEED.get();

            MS_PUMPKIN_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.MS_PUMPKIN_SPAWNING_ENABLED.get();
            MS_PUMPKIN_ARMOR = ConfigHolder.BORNCONFIG.MS_PUMPKIN_ARMOR.get();
            MS_PUMPKIN_DAMAGE = ConfigHolder.BORNCONFIG.MS_PUMPKIN_DAMAGE.get();
            MS_PUMPKIN_HEALTH = ConfigHolder.BORNCONFIG.MS_PUMPKIN_HEALTH.get();
            MS_PUMPKIN_KNOCKBACK = ConfigHolder.BORNCONFIG.MS_PUMPKIN_KNOCKBACK.get();
            MS_PUMPKIN_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.MS_PUMPKIN_KNOCKBACK_RESISTANCE.get();
            MS_PUMPKIN_SPEED = ConfigHolder.BORNCONFIG.MS_PUMPKIN_SPEED.get();

            //Nightmare Stalker
            NIGHTMARE_EFFECTS_ENABLED = ConfigHolder.BORNCONFIG.NIGHTMARE_EFFECTS_ENABLED.get();
            NIGHTMARE_STRENGTH_ENABLED = ConfigHolder.BORNCONFIG.NIGHTMARE_STRENGTH_ENABLED.get();
            DAYS_TILL_NIGHTMARE = ConfigHolder.BORNCONFIG.DAYS_TILL_NIGHTMARE.get();
            NIGHTMARE_STALKER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.NIGHTMARE_STALKER_SPAWNING_ENABLED.get();
            NIGHTMARE_STALKER_ARMOR = ConfigHolder.BORNCONFIG.NIGHTMARE_STALKER_ARMOR.get();
            NIGHTMARE_STALKER_DAMAGE = ConfigHolder.BORNCONFIG.NIGHTMARE_STALKER_DAMAGE.get();
            NIGHTMARE_STALKER_HEALTH = ConfigHolder.BORNCONFIG.NIGHTMARE_STALKER_HEALTH.get();
            NIGHTMARE_STALKER_KNOCKBACK = ConfigHolder.BORNCONFIG.NIGHTMARE_STALKER_KNOCKBACK.get();
            NIGHTMARE_STALKER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.NIGHTMARE_STALKER_KNOCKBACK_RESISTANCE.get();
            NIGHTMARE_STALKER_SPEED = ConfigHolder.BORNCONFIG.NIGHTMARE_STALKER_SPEED.get();

            //Phantom Creeper & Phantom Creeper Copy
            PHANTOM_CREEPER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.PHANTOM_CREEPER_SPAWNING_ENABLED.get();
            PHANTOM_CREEPER_ARMOR = ConfigHolder.BORNCONFIG.PHANTOM_CREEPER_ARMOR.get();
            PHANTOM_CREEPER_DAMAGE = ConfigHolder.BORNCONFIG.PHANTOM_CREEPER_DAMAGE.get();
            PHANTOM_CREEPER_HEALTH = ConfigHolder.BORNCONFIG.PHANTOM_CREEPER_HEALTH.get();
            PHANTOM_CREEPER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.PHANTOM_CREEPER_KNOCKBACK_RESISTANCE.get();
            PHANTOM_CREEPER_SPEED = ConfigHolder.BORNCONFIG.PHANTOM_CREEPER_SPEED.get();

            //Pumpkin Bruiser
            PUMPKIN_BRUISER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.PUMPKIN_BRUISER_SPAWNING_ENABLED.get();
            PUMPKIN_BRUISER_ARMOR = ConfigHolder.BORNCONFIG.PUMPKIN_BRUISER_ARMOR.get();
            PUMPKIN_BRUISER_DAMAGE = ConfigHolder.BORNCONFIG.PUMPKIN_BRUISER_DAMAGE.get();
            PUMPKIN_BRUISER_HEALTH = ConfigHolder.BORNCONFIG.PUMPKIN_BRUISER_HEALTH.get();
            PUMPKIN_BRUISER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.PUMPKIN_BRUISER_KNOCKBACK_RESISTANCE.get();
            PUMPKIN_BRUISER_SPEED = ConfigHolder.BORNCONFIG.PUMPKIN_BRUISER_SPEED.get();
            PUMPKIN_BRUISER_KNOCKBACK = ConfigHolder.BORNCONFIG.PUMPKIN_BRUISER_KNOCKBACK.get();

            //Pumpkin Dunce
            PUMPKIN_DUNCE_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.PUMPKIN_DUNCE_SPAWNING_ENABLED.get();
            PUMPKIN_DUNCE_ARMOR = ConfigHolder.BORNCONFIG.PUMPKIN_DUNCE_ARMOR.get();
            PUMPKIN_DUNCE_DAMAGE = ConfigHolder.BORNCONFIG.PUMPKIN_DUNCE_DAMAGE.get();
            PUMPKIN_DUNCE_HEALTH = ConfigHolder.BORNCONFIG.PUMPKIN_DUNCE_HEALTH.get();
            PUMPKIN_DUNCE_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.PUMPKIN_DUNCE_KNOCKBACK_RESISTANCE.get();
            PUMPKIN_DUNCE_SPEED = ConfigHolder.BORNCONFIG.PUMPKIN_DUNCE_SPEED.get();
            PUMPKIN_DUNCE_KNOCKBACK = ConfigHolder.BORNCONFIG.PUMPKIN_DUNCE_KNOCKBACK.get();

            //Pumpkin Spirit
            PUMPKIN_SPIRIT_ARMOR = ConfigHolder.BORNCONFIG.PUMPKIN_SPIRIT_ARMOR.get();
            PUMPKIN_SPIRIT_DAMAGE = ConfigHolder.BORNCONFIG.PUMPKIN_SPIRIT_DAMAGE.get();
            PUMPKIN_SPIRIT_HEALTH = ConfigHolder.BORNCONFIG.PUMPKIN_SPIRIT_HEALTH.get();
            PUMPKIN_SPIRIT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.PUMPKIN_SPIRIT_KNOCKBACK_RESISTANCE.get();
            PUMPKIN_SPIRIT_SPEED = ConfigHolder.BORNCONFIG.PUMPKIN_SPIRIT_SPEED.get();
            PUMPKIN_SPIRIT_KNOCKBACK = ConfigHolder.BORNCONFIG.PUMPKIN_SPIRIT_KNOCKBACK.get();

            //Pumpkinhead
            PUMPKIN_HEAD_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.PUMPKIN_HEAD_SPAWNING_ENABLED.get();
            PUMPKIN_HEAD_ARMOR = ConfigHolder.BORNCONFIG.PUMPKIN_HEAD_ARMOR.get();
            PUMPKIN_HEAD_DAMAGE = ConfigHolder.BORNCONFIG.PUMPKIN_HEAD_DAMAGE.get();
            PUMPKIN_HEAD_HEALTH = ConfigHolder.BORNCONFIG.PUMPKIN_HEAD_HEALTH.get();
            PUMPKIN_HEAD_KNOCKBACK = ConfigHolder.BORNCONFIG.PUMPKIN_HEAD_KNOCKBACK.get();
            PUMPKIN_HEAD_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.PUMPKIN_HEAD_KNOCKBACK_RESISTANCE.get();
            PUMPKIN_HEAD_SPEED = ConfigHolder.BORNCONFIG.PUMPKIN_HEAD_SPEED.get();

            //Restless Spirit
            RESTLESS_SPIRIT_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.RESTLESS_SPIRIT_SPAWNING_ENABLED.get();
            RESTLESS_SPIRIT_ARMOR = ConfigHolder.BORNCONFIG.RESTLESS_SPIRIT_ARMOR.get();
            RESTLESS_SPIRIT_DAMAGE = ConfigHolder.BORNCONFIG.RESTLESS_SPIRIT_DAMAGE.get();
            RESTLESS_SPIRIT_HEALTH = ConfigHolder.BORNCONFIG.RESTLESS_SPIRIT_HEALTH.get();
            RESTLESS_SPIRIT_KNOCKBACK = ConfigHolder.BORNCONFIG.RESTLESS_SPIRIT_KNOCKBACK.get();
            RESTLESS_SPIRIT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.RESTLESS_SPIRIT_KNOCKBACK_RESISTANCE.get();
            RESTLESS_SPIRIT_SPEED = ConfigHolder.BORNCONFIG.RESTLESS_SPIRIT_SPEED.get();
            RESTLESS_SPIRIT_FLYING_SPEED = ConfigHolder.BORNCONFIG.RESTLESS_SPIRIT_FLYING_SPEED.get();

            //Rideable Lord Felsteed
            RIDEABLE_LORD_FELSTEED_ARMOR = ConfigHolder.BORNCONFIG.RIDEABLE_LORD_FELSTEED_ARMOR.get();
            RIDEABLE_LORD_FELSTEED_DAMAGE = ConfigHolder.BORNCONFIG.RIDEABLE_LORD_FELSTEED_DAMAGE.get();
            RIDEABLE_LORD_FELSTEED_HEALTH = ConfigHolder.BORNCONFIG.RIDEABLE_LORD_FELSTEED_HEALTH.get();
            RIDEABLE_LORD_FELSTEED_KNOCKBACK = ConfigHolder.BORNCONFIG.RIDEABLE_LORD_FELSTEED_KNOCKBACK.get();
            RIDEABLE_LORD_FELSTEED_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.RIDEABLE_LORD_FELSTEED_KNOCKBACK_RESISTANCE.get();
            RIDEABLE_LORD_FELSTEED_SPEED = ConfigHolder.BORNCONFIG.RIDEABLE_LORD_FELSTEED_SPEED.get();

            //Scarlet Prosecuter
            SCARLET_SPAWN_AMMOUNT = ConfigHolder.BORNCONFIG.SCARLET_SPAWN_AMMOUNT.get();
            SCARLET_PROSECUTER_ARMOR = ConfigHolder.BORNCONFIG.SCARLET_PROSECUTER_ARMOR.get();
            SCARLET_PROSECUTER_DAMAGE = ConfigHolder.BORNCONFIG.SCARLET_PROSECUTER_DAMAGE.get();
            SCARLET_PROSECUTER_HEALTH = ConfigHolder.BORNCONFIG.SCARLET_PROSECUTER_HEALTH.get();
            SCARLET_PROSECUTER_KNOCKBACK = ConfigHolder.BORNCONFIG.SCARLET_PROSECUTER_KNOCKBACK.get();
            SCARLET_PROSECUTER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SCARLET_PROSECUTER_KNOCKBACK_RESISTANCE.get();
            SCARLET_PROSECUTER_SPEED = ConfigHolder.BORNCONFIG.SCARLET_PROSECUTER_SPEED.get();
            SCARLET_PROSECUTER_FLYING_SPEED = ConfigHolder.BORNCONFIG.SCARLET_PROSECUTER_FLYING_SPEED.get();

            //Seared Spirit
            SEARED_SPIRIT_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SEARED_SPIRIT_SPAWNING_ENABLED.get();
            SEARED_SPIRIT_ARMOR = ConfigHolder.BORNCONFIG.SEARED_SPIRIT_ARMOR.get();
            SEARED_SPIRIT_DAMAGE = ConfigHolder.BORNCONFIG.SEARED_SPIRIT_DAMAGE.get();
            SEARED_SPIRIT_HEALTH = ConfigHolder.BORNCONFIG.SEARED_SPIRIT_HEALTH.get();
            SEARED_SPIRIT_KNOCKBACK = ConfigHolder.BORNCONFIG.SEARED_SPIRIT_KNOCKBACK.get();
            SEARED_SPIRIT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SEARED_SPIRIT_KNOCKBACK_RESISTANCE.get();
            SEARED_SPIRIT_SPEED = ConfigHolder.BORNCONFIG.SEARED_SPIRIT_SPEED.get();

            //Senor Pumpkinhead
            SENOR_PUMPKIN_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SENOR_PUMPKIN_SPAWNING_ENABLED.get();
            SENOR_PUMPKIN_ARMOR = ConfigHolder.BORNCONFIG.SENOR_PUMPKIN_ARMOR.get();
            SENOR_PUMPKIN_DAMAGE = ConfigHolder.BORNCONFIG.SENOR_PUMPKIN_DAMAGE.get();
            SENOR_PUMPKIN_HEALTH = ConfigHolder.BORNCONFIG.SENOR_PUMPKIN_HEALTH.get();
            SENOR_PUMPKIN_KNOCKBACK = ConfigHolder.BORNCONFIG.SENOR_PUMPKIN_KNOCKBACK.get();
            SENOR_PUMPKIN_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SENOR_PUMPKIN_KNOCKBACK_RESISTANCE.get();
            SENOR_PUMPKIN_SPEED = ConfigHolder.BORNCONFIG.SENOR_PUMPKIN_SPEED.get();

            //Siamese Skeleton
            SIAMESE_SKELETON_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SIAMESE_SKELETON_SPAWNING_ENABLED.get();
            SIAMESE_SKELETON_ARMOR = ConfigHolder.BORNCONFIG.SIAMESE_SKELETON_ARMOR.get();
            SIAMESE_SKELETON_DAMAGE = ConfigHolder.BORNCONFIG.SIAMESE_SKELETON_DAMAGE.get();
            SIAMESE_SKELETON_HEALTH = ConfigHolder.BORNCONFIG.SIAMESE_SKELETON_HEALTH.get();
            SIAMESE_SKELETON_KNOCKBACK = ConfigHolder.BORNCONFIG.SIAMESE_SKELETON_KNOCKBACK.get();
            SIAMESE_SKELETON_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SIAMESE_SKELETON_KNOCKBACK_RESISTANCE.get();
            SIAMESE_SKELETON_SPEED = ConfigHolder.BORNCONFIG.SIAMESE_SKELETON_SPEED.get();

            //Sir Pumpkinhead
            SIR_PUMPKINHEAD_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_SPAWNING_ENABLED.get();
            SIR_PUMPKINHEAD_ARMOR = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_ARMOR.get();
            SIR_PUMPKINHEAD_DAMAGE = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_DAMAGE.get();
            SIR_PUMPKINHEAD_HEALTH = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HEALTH.get();
            SIR_PUMPKINHEAD_KNOCKBACK = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_KNOCKBACK.get();
            SIR_PUMPKINHEAD_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_KNOCKBACK_RESISTANCE.get();
            SIR_PUMPKINHEAD_SPEED = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_SPEED.get();

            //Sir Pumpkinhead Horseless
            SIR_PUMPKINHEAD_HORSELESS_ARMOR = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HORSELESS_ARMOR.get();
            SIR_PUMPKINHEAD_HORSELESS_DAMAGE = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HORSELESS_DAMAGE.get();
            SIR_PUMPKINHEAD_HORSELESS_HEALTH = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HORSELESS_HEALTH.get();
            SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK.get();
            SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK_RESISTANCE.get();
            SIR_PUMPKINHEAD_HORSELESS_SPEED = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HORSELESS_SPEED.get();

            //Sir Pumpkinhead Headless
            SIR_PUMPKINHEAD_HEADLESS_ARMOR = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HEADLESS_ARMOR.get();
            SIR_PUMPKINHEAD_HEADLESS_DAMAGE = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HEADLESS_DAMAGE.get();
            SIR_PUMPKINHEAD_HEADLESS_HEALTH = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HEADLESS_HEALTH.get();
            SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK.get();
            SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK_RESISTANCE.get();
            SIR_PUMPKINHEAD_HEADLESS_SPEED = ConfigHolder.BORNCONFIG.SIR_PUMPKINHEAD_HEADLESS_SPEED.get();

            //Skeleton Demoman
            SKELETON_DEMOMAN_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SKELETON_DEMOMAN_SPAWNING_ENABLED.get();
            SKELETON_DEMOMAN_ARMOR = ConfigHolder.BORNCONFIG.SKELETON_DEMOMAN_ARMOR.get();
            SKELETON_DEMOMAN_DAMAGE = ConfigHolder.BORNCONFIG.SKELETON_DEMOMAN_DAMAGE.get();
            SKELETON_DEMOMAN_HEALTH = ConfigHolder.BORNCONFIG.SKELETON_DEMOMAN_HEALTH.get();
            SKELETON_DEMOMAN_KNOCKBACK = ConfigHolder.BORNCONFIG.SKELETON_DEMOMAN_KNOCKBACK.get();
            SKELETON_DEMOMAN_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SKELETON_DEMOMAN_KNOCKBACK_RESISTANCE.get();
            SKELETON_DEMOMAN_SPEED = ConfigHolder.BORNCONFIG.SKELETON_DEMOMAN_SPEED.get();

            //Skeleton Thrasher
            SKELETON_THRASHER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SKELETON_THRASHER_SPAWNING_ENABLED.get();
            SKELETON_THRASHER_ARMOR = ConfigHolder.BORNCONFIG.SKELETON_THRASHER_ARMOR.get();
            SKELETON_THRASHER_DAMAGE = ConfigHolder.BORNCONFIG.SKELETON_THRASHER_DAMAGE.get();
            SKELETON_THRASHER_HEALTH = ConfigHolder.BORNCONFIG.SKELETON_THRASHER_HEALTH.get();
            SKELETON_THRASHER_KNOCKBACK = ConfigHolder.BORNCONFIG.SKELETON_THRASHER_KNOCKBACK.get();
            SKELETON_THRASHER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SKELETON_THRASHER_KNOCKBACK_RESISTANCE.get();
            SKELETON_THRASHER_SPEED = ConfigHolder.BORNCONFIG.SKELETON_THRASHER_SPEED.get();

            //Spirit Guide
            SPIRIT_GUIDE_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_SPAWNING_ENABLED.get();
            SPIRIT_GUIDE_ARMOR = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_ARMOR.get();
            SPIRIT_GUIDE_DAMAGE = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_DAMAGE.get();
            SPIRIT_GUIDE_HEALTH = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_HEALTH.get();
            SPIRIT_GUIDE_KNOCKBACK = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_KNOCKBACK.get();
            SPIRIT_GUIDE_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_KNOCKBACK_RESISTANCE.get();
            SPIRIT_GUIDE_SPEED = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_SPEED.get();

            //Spirit Guide Assistant
            SPIRIT_GUIDE_ASSISTANT_ARMOR = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_ASSISTANT_ARMOR.get();
            SPIRIT_GUIDE_ASSISTANT_DAMAGE = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_ASSISTANT_DAMAGE.get();
            SPIRIT_GUIDE_ASSISTANT_HEALTH = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_ASSISTANT_HEALTH.get();
            SPIRIT_GUIDE_ASSISTANT_KNOCKBACK = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK.get();
            SPIRIT_GUIDE_ASSISTANT_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK_RESISTANCE.get();
            SPIRIT_GUIDE_ASSISTANT_SPEED = ConfigHolder.BORNCONFIG.SPIRIT_GUIDE_ASSISTANT_SPEED.get();

            //Spirit Of Chaos
            SPIRIT_OF_CHAOS_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SPIRIT_OF_CHAOS_SPAWNING_ENABLED.get();
            SPIRIT_OF_CHAOS_ARMOR = ConfigHolder.BORNCONFIG.SPIRIT_OF_CHAOS_ARMOR.get();
            SPIRIT_OF_CHAOS_DAMAGE = ConfigHolder.BORNCONFIG.SPIRIT_OF_CHAOS_DAMAGE.get();
            SPIRIT_OF_CHAOS_HEALTH = ConfigHolder.BORNCONFIG.SPIRIT_OF_CHAOS_HEALTH.get();
            SPIRIT_OF_CHAOS_KNOCKBACK = ConfigHolder.BORNCONFIG.SPIRIT_OF_CHAOS_KNOCKBACK.get();
            SPIRIT_OF_CHAOS_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SPIRIT_OF_CHAOS_KNOCKBACK_RESISTANCE.get();
            SPIRIT_OF_CHAOS_SPEED = ConfigHolder.BORNCONFIG.SPIRIT_OF_CHAOS_SPEED.get();

            //Supreme Bonescaller
            SUPREME_BONESCALLER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_SPAWNING_ENABLED.get();
            SUPREME_BONESCALLER_ARMOR = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_ARMOR.get();
            SUPREME_BONESCALLER_DAMAGE = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_DAMAGE.get();
            SUPREME_BONESCALLER_HEALTH = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_HEALTH.get();
            SUPREME_BONESCALLER_KNOCKBACK = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_KNOCKBACK.get();
            SUPREME_BONESCALLER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_KNOCKBACK_RESISTANCE.get();
            SUPREME_BONESCALLER_SPEED = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_SPEED.get();

            //Supreme Bonescaller(Phase 2)
            SUPREME_BONESCALLER_PHASE_2_ARMOR = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_PHASE_2_ARMOR.get();
            SUPREME_BONESCALLER_PHASE_2_DAMAGE = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_PHASE_2_DAMAGE.get();
            SUPREME_BONESCALLER_PHASE_2_HEALTH = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_PHASE_2_HEALTH.get();
            SUPREME_BONESCALLER_PHASE_2_KNOCKBACK = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_PHASE_2_KNOCKBACK.get();
            SUPREME_BONESCALLER_PHASE_2_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_PHASE_2_KNOCKBACK_RESISTANCE.get();
            SUPREME_BONESCALLER_PHASE_2_SPEED = ConfigHolder.BORNCONFIG.SUPREME_BONESCALLER_PHASE_2_SPEED.get();

            //Swarmer
            SWARMER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.SWARMER_SPAWNING_ENABLED.get();
            SWARMER_ARMOR = ConfigHolder.BORNCONFIG.SWARMER_ARMOR.get();
            SWARMER_DAMAGE = ConfigHolder.BORNCONFIG.SWARMER_DAMAGE.get();
            SWARMER_HEALTH = ConfigHolder.BORNCONFIG.SWARMER_HEALTH.get();
            SWARMER_KNOCKBACK = ConfigHolder.BORNCONFIG.SWARMER_KNOCKBACK.get();
            SWARMER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.SWARMER_KNOCKBACK_RESISTANCE.get();
            SWARMER_SPEED = ConfigHolder.BORNCONFIG.SWARMER_SPEED.get();

            //Thornshell Crab
            THORNSHELL_CRAB_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.THORNSHELL_CRAB_SPAWNING_ENABLED.get();
            THORNSHELL_CRAB_ARMOR = ConfigHolder.BORNCONFIG.THORNSHELL_CRAB_ARMOR.get();
            THORNSHELL_CRAB_DAMAGE = ConfigHolder.BORNCONFIG.THORNSHELL_CRAB_DAMAGE.get();
            THORNSHELL_CRAB_HEALTH = ConfigHolder.BORNCONFIG.THORNSHELL_CRAB_HEALTH.get();
            THORNSHELL_CRAB_KNOCKBACK = ConfigHolder.BORNCONFIG.THORNSHELL_CRAB_KNOCKBACK.get();
            THORNSHELL_CRAB_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.THORNSHELL_CRAB_KNOCKBACK_RESISTANCE.get();
            THORNSHELL_CRAB_SPEED = ConfigHolder.BORNCONFIG.THORNSHELL_CRAB_SPEED.get();

            //Zombie Bruiser
            ZOMBIE_BRUISER_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.ZOMBIE_BRUISER_SPAWNING_ENABLED.get();
            ZOMBIE_BRUISER_ARMOR = ConfigHolder.BORNCONFIG.ZOMBIE_BRUISER_ARMOR.get();
            ZOMBIE_BRUISER_DAMAGE = ConfigHolder.BORNCONFIG.ZOMBIE_BRUISER_DAMAGE.get();
            ZOMBIE_BRUISER_HEALTH = ConfigHolder.BORNCONFIG.ZOMBIE_BRUISER_HEALTH.get();
            ZOMBIE_BRUISER_KNOCKBACK = ConfigHolder.BORNCONFIG.ZOMBIE_BRUISER_KNOCKBACK.get();
            ZOMBIE_BRUISER_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.ZOMBIE_BRUISER_KNOCKBACK_RESISTANCE.get();
            ZOMBIE_BRUISER_SPEED = ConfigHolder.BORNCONFIG.ZOMBIE_BRUISER_SPEED.get();

            //Zombie Clown
            ZOMBIE_CLOWN_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.ZOMBIE_CLOWN_SPAWNING_ENABLED.get();
            ZOMBIE_CLOWN_ARMOR = ConfigHolder.BORNCONFIG.ZOMBIE_CLOWN_ARMOR.get();
            ZOMBIE_CLOWN_DAMAGE = ConfigHolder.BORNCONFIG.ZOMBIE_CLOWN_DAMAGE.get();
            ZOMBIE_CLOWN_HEALTH = ConfigHolder.BORNCONFIG.ZOMBIE_CLOWN_HEALTH.get();
            ZOMBIE_CLOWN_KNOCKBACK = ConfigHolder.BORNCONFIG.ZOMBIE_CLOWN_KNOCKBACK.get();
            ZOMBIE_CLOWN_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.ZOMBIE_CLOWN_KNOCKBACK_RESISTANCE.get();
            ZOMBIE_CLOWN_SPEED = ConfigHolder.BORNCONFIG.ZOMBIE_CLOWN_SPEED.get();

            //Zombie Fisherman
            ZOMBIE_FISHERMAN_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.ZOMBIE_FISHERMAN_SPAWNING_ENABLED.get();
            ZOMBIE_FISHERMAN_ARMOR = ConfigHolder.BORNCONFIG.ZOMBIE_FISHERMAN_ARMOR.get();
            ZOMBIE_FISHERMAN_DAMAGE = ConfigHolder.BORNCONFIG.ZOMBIE_FISHERMAN_DAMAGE.get();
            ZOMBIE_FISHERMAN_HEALTH = ConfigHolder.BORNCONFIG.ZOMBIE_FISHERMAN_HEALTH.get();
            ZOMBIE_FISHERMAN_KNOCKBACK = ConfigHolder.BORNCONFIG.ZOMBIE_FISHERMAN_KNOCKBACK.get();
            ZOMBIE_FISHERMAN_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.ZOMBIE_FISHERMAN_KNOCKBACK_RESISTANCE.get();
            ZOMBIE_FISHERMAN_SPEED = ConfigHolder.BORNCONFIG.ZOMBIE_FISHERMAN_SPEED.get();

            //Zombie Lumberjack
            ZOMBIE_LUMBERJACK_SPAWNING_ENABLED = ConfigHolder.BORNCONFIG.ZOMBIE_LUMBERJACK_SPAWNING_ENABLED.get();
            ZOMBIE_LUMBERJACK_ARMOR = ConfigHolder.BORNCONFIG.ZOMBIE_LUMBERJACK_ARMOR.get();
            ZOMBIE_LUMBERJACK_DAMAGE = ConfigHolder.BORNCONFIG.ZOMBIE_LUMBERJACK_DAMAGE.get();
            ZOMBIE_LUMBERJACK_HEALTH = ConfigHolder.BORNCONFIG.ZOMBIE_LUMBERJACK_HEALTH.get();
            ZOMBIE_LUMBERJACK_KNOCKBACK = ConfigHolder.BORNCONFIG.ZOMBIE_LUMBERJACK_KNOCKBACK.get();
            ZOMBIE_LUMBERJACK_KNOCKBACK_RESISTANCE = ConfigHolder.BORNCONFIG.ZOMBIE_LUMBERJACK_KNOCKBACK_RESISTANCE.get();
            ZOMBIE_LUMBERJACK_SPEED = ConfigHolder.BORNCONFIG.ZOMBIE_LUMBERJACK_SPEED.get();

            RETALLIATION_ENABLED = ConfigHolder.BORNCONFIG.RETALLIATION_ENABLED.get();
            PHANTOM_BOMB_COUNT = ConfigHolder.BORNCONFIG.PHANTOM_BOMB_COUNT.get();
            INFESTED_DIAMONDS_ENABLED = ConfigHolder.BORNCONFIG.INFESTED_DIAMONDS_ENABLED.get();
            ROTTEN_CONSUMPTION_ENABLED = ConfigHolder.BORNCONFIG.ROTTEN_CONSUMPTION_ENABLED.get();
            SOUL_STRATIFICATION_EFFECT_ENABLED = ConfigHolder.BORNCONFIG.SOUL_STRATIFICATION_EFFECT_ENABLED.get();
            SPIRIT_DISSAPPEAR_IN_SUN_ENABLED = ConfigHolder.BORNCONFIG.SPIRIT_DISSAPPEAR_IN_SUN_ENABLED.get();
            STALKER_IMMUNITY_ENABLED = ConfigHolder.BORNCONFIG.STALKER_IMMUNITY_ENABLED.get();
            WARNING_SPAWN_ENABLED = ConfigHolder.BORNCONFIG.WARNING_SPAWN_ENABLED.get();






        } catch (Exception e) {
            LOGGER.warn("An exception was caused trying to load the config for Born In Configuration");
            e.printStackTrace();
        }
    }

}
