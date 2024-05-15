package com.crimsoncrips.borninconfiguration.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BornInChaosConfig {
    public final ForgeConfigSpec.BooleanValue NIGHTMARE_SPAWN_ENABLED;
    public final ForgeConfigSpec.BooleanValue DECREPIT_SKELETON_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue SKELETON_BOMB_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue DECAYING_ZOMBIE_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue BABY_SKELETON_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue ZOMBIE_BARREL_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue PHANTOM_CREEPER_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue DOOR_KNIGHT_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue RESTLESS_SPIRIT_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue SKELETON_THRASHER_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue FIRELIGHT_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue BONES_CALLER_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue BONE_IMP_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue DARK_VORTEX_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue DREADHOUND_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue FALLEN_CHAOS_KNIGHT_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue SER_PUMPKIN_HEAD_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue ZOMBIE_CLOWN_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue SPIRIT_GUIDE_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue FIRE_WELL_GENERATION_ENABLED;
    public final ForgeConfigSpec.BooleanValue OBSERVATION_TOWER_GENERATION_ENABLED;
    public final ForgeConfigSpec.BooleanValue DARK_TOWER_GENERATION_ENABLED;
    public final ForgeConfigSpec.BooleanValue FARM_GENERATION_ENABLED;
    public final ForgeConfigSpec.BooleanValue CLOWN_TENT_GENERATION_ENABLED;
    public final ForgeConfigSpec.BooleanValue SPIRIT_DISSAPPEAR_IN_SUN_ENABLED;
    public final ForgeConfigSpec.BooleanValue SOUL_STRATIFICATION_EFFECT_ENABLED;
    public final ForgeConfigSpec.BooleanValue CORPSE_FLY_SPAWN_ENABLED;
    public final ForgeConfigSpec.BooleanValue BLOODY_GADFLY_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue CORPSE_FISH_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue ZOMBIE_FISHERMAN_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue THORNSHELL_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue GLUTTON_FISH_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue ZOMBIE_BRUISER_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue MAGGOTS_APPEARANCE_ENABLED;
    public final ForgeConfigSpec.BooleanValue ZOMBIE_LUMBERJACK_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue MISSIONER_SPAWNING_ENABLED;
    public final ForgeConfigSpec.BooleanValue STALKER_IMMUNITY_ENABLED;
    public final ForgeConfigSpec.BooleanValue INFESTED_DIAMONDS_ENABLED;
    public final ForgeConfigSpec.IntValue DAYS_TILL_NIGHTMARE;
    public final ForgeConfigSpec.IntValue DAYS_TILL_MISSIONER;
    public final ForgeConfigSpec.BooleanValue ROTTEN_CONSUMPTION_ENABLED;



    public BornInChaosConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("Born In Configuration");
        builder.push("Spawning");
        this.SKELETON_BOMB_SPAWNING_ENABLED = buildBoolean(builder, "SKELETON_BOMB_SPAWNING_ENABLED", " ", true, "Whether Skeleton Bombs spawning is enabled");
        this.DECAYING_ZOMBIE_SPAWNING_ENABLED = buildBoolean(builder, "DECAYING_ZOMBIE_SPAWNING_ENABLED", " ", true, "Whether Decaying Zombie spawning is enabled");
        this.BABY_SKELETON_SPAWNING_ENABLED = buildBoolean(builder, "BABY_SKELETON_SPAWNING_ENABLED", " ", true, "Whether Baby Skeleton spawning is enabled");
        this.ZOMBIE_BARREL_SPAWNING_ENABLED = buildBoolean(builder, "ZOMBIE_BARREL_SPAWNING_ENABLED", " ", true, "Whether Zombie Barrels spawning is enabled");
        this.PHANTOM_CREEPER_SPAWNING_ENABLED = buildBoolean(builder, "PHANTOM_CREEPER_SPAWNING_ENABLED", " ", true, "Whether Phantom Creepers spawning is enabled");
        this.DOOR_KNIGHT_SPAWNING_ENABLED = buildBoolean(builder, "DOOR_KNIGHT_SPAWNING_ENABLED", " ", true, "Whether Door Knights spawning is enabled");
        this.RESTLESS_SPIRIT_SPAWNING_ENABLED = buildBoolean(builder, "RESTLESS_SPIRIT_SPAWNING_ENABLED", " ", true, "Whether Restless Spirits spawning is enabled");
        this.SKELETON_THRASHER_SPAWNING_ENABLED = buildBoolean(builder, "SKELETON_THRASHER_SPAWNING_ENABLED", " ", true, "Whether Skeleton Thrasher spawning is enabled");
        this.FIRELIGHT_SPAWNING_ENABLED = buildBoolean(builder, "FIRELIGHT_SPAWNING_ENABLED", " ", true, "Whether Firelight spawning is enabled");
        this.BONES_CALLER_SPAWNING_ENABLED = buildBoolean(builder, "BONES_CALLER_SPAWNING_ENABLED", " ", true, "Whether Bones Caller spawning is enabled");
        this.BONE_IMP_SPAWNING_ENABLED = buildBoolean(builder, "BONE_IMP_SPAWNING_ENABLED", " ", true, "Whether Bone Imp spawning is enabled");
        this.DARK_VORTEX_SPAWNING_ENABLED = buildBoolean(builder, "DARK_VORTEX_SPAWNING_ENABLED", " ", true, "Whether Dark Vortex spawning is enabled");
        this.DREADHOUND_SPAWNING_ENABLED = buildBoolean(builder, "DREADHOUND_SPAWNING_ENABLED", " ", true, "Whether Dreadhounds spawning is enabled");
        this.FALLEN_CHAOS_KNIGHT_SPAWNING_ENABLED = buildBoolean(builder, "FALLEN_CHAOS_KNIGHT_SPAWNING_ENABLED", " ", true, "Whether Fallen Chaos Knights spawning is enabled");
        this.SER_PUMPKIN_HEAD_SPAWNING_ENABLED = buildBoolean(builder, "SER_PUMPKIN_HEAD_SPAWNING_ENABLED", " ", true, "Whether Ser Pumpkin Head spawning is enabled");
        this.ZOMBIE_CLOWN_SPAWNING_ENABLED = buildBoolean(builder, "ZOMBIE_CLOWN_SPAWNING_ENABLED", " ", true, "Whether Zombie Clown spawning is enabled");
        this.SPIRIT_GUIDE_SPAWNING_ENABLED = buildBoolean(builder, "SPIRIT_GUIDE_SPAWNING_ENABLED", " ", true, "Whether SoulStratisfaction Guide spawning is enabled");
        this.CORPSE_FLY_SPAWN_ENABLED = buildBoolean(builder, "CORPSE_FLY_SPAWN_ENABLED", " ", true, "Whether Corpse Fly spawning is enabled");
        this.BLOODY_GADFLY_SPAWNING_ENABLED = buildBoolean(builder, "BLOODY_GADFLY_SPAWNING_ENABLED", " ", true, "Whether Bloody Gadlies spawning is enabled");
        this.CORPSE_FISH_SPAWNING_ENABLED = buildBoolean(builder, "CORPSE_FISH_SPAWNING_ENABLED", " ", true, "Whether Corpse Fish spawning is enabled");
        this.ZOMBIE_FISHERMAN_SPAWNING_ENABLED = buildBoolean(builder, "ZOMBIE_FISHERMAN_SPAWNING_ENABLED", " ", true, "Whether Zombie Fisherman spawning is enabled");
        this.THORNSHELL_SPAWNING_ENABLED = buildBoolean(builder, "THORNSHELL_SPAWNING_ENABLED", " ", true, "Whether Thornshell spawning is enabled");
        this.GLUTTON_FISH_SPAWNING_ENABLED = buildBoolean(builder, "GLUTTON_FISH_SPAWNING_ENABLED", " ", true, "Whether Glutton Fish spawning is enabled");
        this.ZOMBIE_BRUISER_SPAWNING_ENABLED = buildBoolean(builder, "ZOMBIE_BRUISER_SPAWNING_ENABLED", " ", true, "Whether Zombie Bruiser spawning is enabled");
        this.ZOMBIE_LUMBERJACK_SPAWNING_ENABLED = buildBoolean(builder, "ZOMBIE_LUMBERJACK_SPAWNING_ENABLED", " ", true, "Whether Zombie Lumberjack spawning is enabled");
        this.MISSIONER_SPAWNING_ENABLED = buildBoolean(builder, "MISSIONER_SPAWNING_ENABLED", " ", true, "Whether Missionary spawning is enabled");
        this.DECREPIT_SKELETON_SPAWNING_ENABLED = buildBoolean(builder, "DECREPIT_SKELETON_SPAWNING_ENABLED", " ", true, "Whether Decrepit Skeletons spawning is enabled");
        this.NIGHTMARE_SPAWN_ENABLED = buildBoolean(builder, "NIGHTMARE_SPAWN_ENABLED", " ", true, "Whether Nightmare Stalker Spawns in the world");
        builder.pop();
        builder.push("Generation");
        this.FIRE_WELL_GENERATION_ENABLED = buildBoolean(builder, "FIRE_WELL_GENERATION_ENABLED", " ", true, "Whether Fire Wells generate is enabled");
        this.OBSERVATION_TOWER_GENERATION_ENABLED = buildBoolean(builder, "OBSERVATION_TOWER_GENERATION_ENABLED", " ", true, "Whether generate is enabled");
        this.DARK_TOWER_GENERATION_ENABLED = buildBoolean(builder, "DARK_TOWER_GENERATION_ENABLED", " ", true, "Whether Dark Towers generate is enabled");
        this.FARM_GENERATION_ENABLED = buildBoolean(builder, "FARM_GENERATION_ENABLED", " ", true, "Whether Farms generate is enabled");
        this.CLOWN_TENT_GENERATION_ENABLED = buildBoolean(builder, "CLOWN_TENT_GENERATION_ENABLED", " ", true, "Whether Clown Tent generate is enabled");
        builder.pop();
        builder.push("Misc");
        this.MAGGOTS_APPEARANCE_ENABLED = buildBoolean(builder, "MAGGOTS_APPEARANCE_ENABLED", " ", true, "Whether maggots appearing is enabled");
        this.SOUL_STRATIFICATION_EFFECT_ENABLED = buildBoolean(builder, "SOUL_STRATIFICATION_EFFECT_ENABLED", " ", true, "Whether soul stratisfaction is enabled");
        this.SPIRIT_DISSAPPEAR_IN_SUN_ENABLED = buildBoolean(builder, "SPIRIT_DISSAPPEAR_IN_SUN_ENABLED", " ", true, "Whether spirits disappear in the sun is enabled");
        this.INFESTED_DIAMONDS_ENABLED = buildBoolean(builder, "INFESTED_DIAMONDS_ENABLED", " ", true, "Whether infested diamonds Spawn within the world");
        builder.pop();
        builder.push("Custom");
        this.STALKER_IMMUNITY_ENABLED = buildBoolean(builder, "STALKER_IMMUNITY_ENABLED", " ", true, "Whether Nightmare Stalker has its base immunity to certain things");
        this.ROTTEN_CONSUMPTION_ENABLED = buildBoolean(builder, "ROTTEN_CONSUMPTION_ENABLED", " ", true, "Whether Rotten Flesh afflicts you with Rotten Stink");
        this.DAYS_TILL_NIGHTMARE = buildInt(builder, "DAYS_TILL_NIGHTMARE", " ", 3, 1,1000,"Days till Nightmare Stalker spawns");
        this.DAYS_TILL_MISSIONER = buildInt(builder, "DAYS_TILL_MISSIONER", " ", 10, 1,1000,"Days till The Missioner spawns");

    }

    private static ForgeConfigSpec.BooleanValue buildBoolean(ForgeConfigSpec.Builder builder, String name, String catagory, boolean defaultValue, String comment){
        return builder.comment(comment).translation(name).define(name, defaultValue);
    }

    private static ForgeConfigSpec.IntValue buildInt(ForgeConfigSpec.Builder builder, String name, String catagory, int defaultValue, int min, int max, String comment){
        return builder.comment(comment).translation(name).defineInRange(name, defaultValue, min, max);
    }
}
