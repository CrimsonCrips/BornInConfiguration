package com.crimsoncrips.borninconfiguration.stats;

import com.crimsoncrips.borninconfiguration.stats.MobGroup.Spawning;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MobGroups {

    public static final String BIC_NAMESPACE = "born_in_chaos_v1";

    public static final MobGroup BABY_SKELETON = new MobGroup("Baby Skeleton", "BABY_SKELETON_SPAWNING_ENABLED", Spawning.ALL, "baby_skeleton", "baby_skeleton_minion");
    public static final MobGroup BABY_SPIDER = new MobGroup("Baby Spider", "BABY_SPIDER_SPAWNING_ENABLED", Spawning.FIRST, "baby_spider", "baby_spider_controlled");
    public static final MobGroup BARREL_ZOMBIE = new MobGroup("Barrel Zombie", "ZOMBIE_BARREL_SPAWNING_ENABLED", Spawning.ALL, "barrel_zombie");
    public static final MobGroup BLOODY_GADFLY = new MobGroup("Bloody Gadfly", "BLOODY_GADFLY_SPAWNING_ENABLED", Spawning.ALL, "bloody_gadfly");
    public static final MobGroup BONESCALLER = new MobGroup("Bones Caller", "BONES_CALLER_SPAWNING_ENABLED", Spawning.ALL, "bonescaller", "bonescaller_not_despawn");
    public static final MobGroup BONE_IMP = new MobGroup("Bone Imp", "BONE_IMP_SPAWNING_ENABLED", Spawning.ALL, "bone_imp", "bone_imp_minion");
    public static final MobGroup CONTROLLED_BABY_SKELETON = new MobGroup("Controlled Baby Skeleton", null, Spawning.NONE, "controlled_baby_skeleton");
    public static final MobGroup CONTROLLED_SPIRITUAL_ASSISTANT = new MobGroup("Controlled Spiritual Assistant", null, Spawning.NONE, "controlled_spiritual_assistant");
    public static final MobGroup CORPSE_FISH = new MobGroup("Corpse Fish", "CORPSE_FISH_SPAWNING_ENABLED", Spawning.ALL, "corpse_fish");
    public static final MobGroup CORPSE_FLY = new MobGroup("Corpse Fly", "CORPSE_FLY_SPAWNING_ENABLED", Spawning.ALL, "corpse_fly");
    public static final MobGroup DARK_VORTEX = new MobGroup("Dark Vortex", "DARK_VORTEX_SPAWNING_ENABLED", Spawning.ALL, "dark_vortex");
    public static final MobGroup DECAYING_ZOMBIE = new MobGroup("Decaying Zombie", "DECAYING_ZOMBIE_SPAWNING_ENABLED", Spawning.ALL, "decaying_zombie", "decaying_zombie_not_despawn");
    public static final MobGroup DECREPIT_SKELETON = new MobGroup("Decrepit Skeleton", "DECREPIT_SKELETON_SPAWNING_ENABLED", Spawning.ALL, "decrepit_skeleton");
    public static final MobGroup DIAMOND_TERMITE = new MobGroup("Diamond Thermite", null, Spawning.NONE, "diamond_termite");
    public static final MobGroup DIRE_HOUND_LEADER = new MobGroup("Dire Hound Leader", "DIRE_HOUND_SPAWNING_ENABLED", Spawning.ALL, "dire_hound_leader");
    public static final MobGroup DOOR_KNIGHT = new MobGroup("Door Knight", "DOOR_KNIGHT_SPAWNING_ENABLED", Spawning.ALL, "door_knight", "door_knight_not_despawn");
    public static final MobGroup DREAD_HOUND = new MobGroup("Dread Hound", "DREAD_HOUND_SPAWNING_ENABLED", Spawning.ALL, "dread_hound", "dread_hound_not_despawn");
    public static final MobGroup FALLEN_CHAOS_KNIGHT = new MobGroup("Fallen Chaos Knight", "FALLEN_KNIGHT_SPAWNING_ENABLED", Spawning.ALL, "fallen_chaos_knight");
    public static final MobGroup FELSTEED = new MobGroup("Felsteed", null, Spawning.NONE, "felsteed", "riding_felsteed");
    public static final MobGroup FIRELIGHT = new MobGroup("Firelight", "FIRELIGHT_SPAWNING_ENABLED", Spawning.ALL, "firelight", "firelight_not_despawn");
    public static final MobGroup GLUTTON_FISH = new MobGroup("Glutton Fish", "GLUTTON_FISH_SPAWNING_ENABLED", Spawning.ALL, "glutton_fish");
    public static final MobGroup INFERNAL_SPIRIT = new MobGroup("Infernal Spirit", null, Spawning.NONE, "infernal_spirit");
    public static final MobGroup KRAMPUS = new MobGroup("Krampus", "KRAMPUS_SPAWNING_ENABLED", Spawning.ALL, "krampus");
    public static final MobGroup KRAMPUS_HENCHMAN = new MobGroup("Krampus Henchman", "KRAMPUS_HENCHMAN_SPAWNING_ENABLED", Spawning.ALL, "krampus_henchman");
    public static final MobGroup LIFESTEALER = new MobGroup("Lifestealer", "LIFESTEALER_SPAWNING_ENABLED", Spawning.ALL, "lifestealer", "lifestealer_true_form");
    public static final MobGroup LORD_PUMPKINHEAD = new MobGroup("Lord Pumpkin Head", null, Spawning.NONE, "lord_pumpkinhead");
    public static final MobGroup LORD_PUMPKINHEAD_HEAD = new MobGroup("Lord Pumpkin Head Head", null, Spawning.NONE, "lord_pumpkinhead_head");
    public static final MobGroup LORD_PUMPKINHEAD_HORSELESS = new MobGroup("Lord Pumpkin Head Horseless", null, Spawning.NONE, "lord_pumpkinhead_withouta_horse");
    public static final MobGroup LORD_THE_HEADLESS = new MobGroup("Lord Pumpkin Head Headless", null, Spawning.NONE, "lord_the_headless");
    public static final MobGroup LORDS_FELSTEED = new MobGroup("Lord Felsteed", null, Spawning.NONE, "lords_felsteed");
    public static final MobGroup RIDING_LORDS_FELSTEED = new MobGroup("Rideable Lord Felsteed", null, Spawning.NONE, "riding_lords_felsteed");
    public static final MobGroup MAGGOT = new MobGroup("Maggots", "MAGGOT_SPAWNING_ENABLED", Spawning.ALL, "maggot");
    public static final MobGroup MISSIONER = new MobGroup("Missioner", "MISSIONER_SPAWNING_ENABLED", Spawning.ALL, "missioner", "missionary_raider");
    public static final MobGroup MOTHER_SPIDER = new MobGroup("Mother Spider", "MOTHER_SPIDER_SPAWNING_ENABLED", Spawning.ALL, "mother_spider");
    public static final MobGroup MR_PUMPKIN = new MobGroup("Mr Pumpkin Head", "MR_PUMPKIN_SPAWNING_ENABLED", Spawning.FIRST, "mr_pumpkin", "mr_pumpkin_controlled");
    public static final MobGroup MRS_PUMPKIN = new MobGroup("Ms Pumpkin Head", "MS_PUMPKIN_SPAWNING_ENABLED", Spawning.ALL, "mrs_pumpkin");
    public static final MobGroup NIGHTMARE_STALKER = new MobGroup("Nightmare Stalker", "NIGHTMARE_STALKER_SPAWNING_ENABLED", Spawning.ALL, "nightmare_stalker");
    public static final MobGroup PHANTOM_CREEPER = new MobGroup("Phantom Creeper", "PHANTOM_CREEPER_SPAWNING_ENABLED", Spawning.ALL, "phantom_creeper", "phantom_creeper_copy");
    public static final MobGroup PUMPKIN_BRUISER = new MobGroup("Pumpkin Bruiser", "PUMPKIN_BRUISER_SPAWNING_ENABLED", Spawning.ALL, "pumpkin_bruiser");
    public static final MobGroup PUMPKIN_DUNCE = new MobGroup("Pumpkin Dunce", "PUMPKIN_DUNCE_SPAWNING_ENABLED", Spawning.ALL, "pumpkin_dunce");
    public static final MobGroup PUMPKINHEAD = new MobGroup("Pumpkin Head", "PUMPKIN_HEAD_SPAWNING_ENABLED", Spawning.ALL, "pumpkinhead");
    public static final MobGroup PUMPKIN_SPIRIT = new MobGroup("Pumpkin Spirit", null, Spawning.NONE, "pumpkin_spirit");
    public static final MobGroup RESTLESS_SPIRIT = new MobGroup("Restless Spirit", "RESTLESS_SPIRIT_SPAWNING_ENABLED", Spawning.ALL, "restless_spirit");
    public static final MobGroup SCARLET_PERSECUTOR = new MobGroup("Scarlet Prosecuter", null, Spawning.NONE, "scarlet_persecutor");
    public static final MobGroup SEARED_SPIRIT = new MobGroup("Seared Spirit", "SEARED_SPIRIT_SPAWNING_ENABLED", Spawning.ALL, "seared_spirit", "seared_spirit_not_despawn");
    public static final MobGroup SENOR_PUMPKIN = new MobGroup("Senor Pumpkinhead", "SENOR_PUMPKIN_SPAWNING_ENABLED", Spawning.ALL, "senor_pumpkin");
    public static final MobGroup SIAMESE_SKELETONS = new MobGroup("Siamese Skeletons", "SIAMESE_SKELETON_SPAWNING_ENABLED", Spawning.ALL, "siamese_skeletons");
    public static final MobGroup SIAMESE_SKELETON_HALVES = new MobGroup("Siamese Skeleton Halves", null, Spawning.NONE, "siamese_skeletonsleft", "siamese_skeletonsright");
    public static final MobGroup SIR_PUMPKINHEAD = new MobGroup("Sir Pumpkinhead", "SIR_PUMPKINHEAD_SPAWNING_ENABLED", Spawning.ALL, "sir_pumpkinhead");
    public static final MobGroup SIR_PUMPKINHEAD_HORSELESS = new MobGroup("Sir Pumpkinhead Horseless", null, Spawning.NONE, "sir_pumpkinhead_without_horse");
    public static final MobGroup SIR_THE_HEADLESS = new MobGroup("Sir Pumpkinhead Headless", null, Spawning.NONE, "sir_the_headless");
    public static final MobGroup SKELETON_DEMOMAN = new MobGroup("Skeleton Demoman", "SKELETON_DEMOMAN_SPAWNING_ENABLED", Spawning.ALL, "skeleton_demoman");
    public static final MobGroup SKELETON_THRASHER = new MobGroup("Skeleton Thrasher", "SKELETON_THRASHER_SPAWNING_ENABLED", Spawning.ALL, "skeleton_thrasher", "skeleton_thrasher_not_despawn");
    public static final MobGroup SPIRIT_GUIDE = new MobGroup("Spirit Guide", "SPIRIT_GUIDE_SPAWNING_ENABLED", Spawning.ALL, "spirit_guide");
    public static final MobGroup SPIRIT_GUIDE_ASSISTANT = new MobGroup("Spirit Guide Assistant", null, Spawning.NONE, "spirit_guide_assistant");
    public static final MobGroup SPIRIT_OF_CHAOS = new MobGroup("Spirit Of Chaos", "SPIRIT_OF_CHAOS_SPAWNING_ENABLED", Spawning.ALL, "spiritof_chaos");
    public static final MobGroup SUPREME_BONESCALLER = new MobGroup("Supreme Bonescaller", "SUPREME_BONESCALLER_SPAWNING_ENABLED", Spawning.ALL, "supreme_bonescaller", "supreme_bonescaller_not_despawn");
    public static final MobGroup SUPREME_BONESCALLER_PHASE_2 = new MobGroup("Supreme Bonescaller Phase 2", null, Spawning.NONE, "supreme_bonescaller_stage_2");
    public static final MobGroup SWARMER = new MobGroup("Swarmer", "SWARMER_SPAWNING_ENABLED", Spawning.ALL, "swarmer");
    public static final MobGroup THORNSHELL_CRAB = new MobGroup("THORNSHELL_CRAB", "THORNSHELL_CRAB_SPAWNING_ENABLED", Spawning.ALL, "thornshell_crab");
    public static final MobGroup ZOMBIE_BRUISER = new MobGroup("Zombie Bruiser", "ZOMBIE_BRUISER_SPAWNING_ENABLED", Spawning.ALL, "zombie_bruiser");
    public static final MobGroup ZOMBIE_CLOWN = new MobGroup("Zombie Clown", "ZOMBIE_CLOWN_SPAWNING_ENABLED", Spawning.ALL, "zombie_clown", "zombie_clown_not_despawn");
    public static final MobGroup ZOMBIE_FISHERMAN = new MobGroup("Zombie Fisherman", "ZOMBIE_FISHERMAN_SPAWNING_ENABLED", Spawning.ALL, "zombie_fisherman");
    public static final MobGroup ZOMBIE_LUMBERJACK = new MobGroup("Zombie Lumberjack", "ZOMBIE_LUMBERJACK_SPAWNING_ENABLED", Spawning.ALL, "zombie_lumberjack");

    public static final List<MobGroup> ALL = List.of(
            BABY_SKELETON, BABY_SPIDER, BARREL_ZOMBIE, BLOODY_GADFLY, BONESCALLER, BONE_IMP,
            CONTROLLED_BABY_SKELETON, CONTROLLED_SPIRITUAL_ASSISTANT, CORPSE_FISH, CORPSE_FLY, DARK_VORTEX,
            DECAYING_ZOMBIE, DECREPIT_SKELETON, DIAMOND_TERMITE, DIRE_HOUND_LEADER, DOOR_KNIGHT, DREAD_HOUND,
            FALLEN_CHAOS_KNIGHT, FELSTEED, FIRELIGHT, GLUTTON_FISH, INFERNAL_SPIRIT, KRAMPUS, KRAMPUS_HENCHMAN,
            LIFESTEALER, LORD_PUMPKINHEAD, LORD_PUMPKINHEAD_HEAD, LORD_PUMPKINHEAD_HORSELESS, LORD_THE_HEADLESS,
            LORDS_FELSTEED, RIDING_LORDS_FELSTEED, MAGGOT, MISSIONER, MOTHER_SPIDER, MR_PUMPKIN, MRS_PUMPKIN,
            NIGHTMARE_STALKER, PHANTOM_CREEPER, PUMPKIN_BRUISER, PUMPKIN_DUNCE, PUMPKINHEAD, PUMPKIN_SPIRIT,
            RESTLESS_SPIRIT, SCARLET_PERSECUTOR, SEARED_SPIRIT, SENOR_PUMPKIN, SIAMESE_SKELETONS,
            SIAMESE_SKELETON_HALVES, SIR_PUMPKINHEAD, SIR_PUMPKINHEAD_HORSELESS, SIR_THE_HEADLESS,
            SKELETON_DEMOMAN, SKELETON_THRASHER, SPIRIT_GUIDE, SPIRIT_GUIDE_ASSISTANT, SPIRIT_OF_CHAOS,
            SUPREME_BONESCALLER, SUPREME_BONESCALLER_PHASE_2, SWARMER, THORNSHELL_CRAB, ZOMBIE_BRUISER,
            ZOMBIE_CLOWN, ZOMBIE_FISHERMAN, ZOMBIE_LUMBERJACK);

    private static final Map<String, MobGroup> BY_ID = new HashMap<>();

    static {
        for (MobGroup group : ALL) {
            for (String id : group.ids) {
                if (BY_ID.put(id, group) != null) {
                    throw new IllegalStateException("Born in Chaos id " + id + " is in more than one mob group");
                }
            }
        }
    }

    private MobGroups() {
    }

    public static MobGroup get(EntityType<?> type) {
        ResourceLocation key = ForgeRegistries.ENTITY_TYPES.getKey(type);
        if (key == null || !BIC_NAMESPACE.equals(key.getNamespace())) {
            return null;
        }
        return BY_ID.get(key.getPath());
    }

    public static String idPath(EntityType<?> type) {
        ResourceLocation key = ForgeRegistries.ENTITY_TYPES.getKey(type);
        return key == null ? "" : key.getPath();
    }
}
