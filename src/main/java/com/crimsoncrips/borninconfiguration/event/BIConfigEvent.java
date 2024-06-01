package com.crimsoncrips.borninconfiguration.event;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.crimsoncrips.borninconfiguration.config.BIConfig;
import com.crimsoncrips.borninconfiguration.utils.EntityUtils;
import net.mcreator.borninchaosv.entity.*;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.living.MobSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BornInConfiguration.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BIConfigEvent {

    @SubscribeEvent
    public void onMobSpawn(MobSpawnEvent.FinalizeSpawn event) {
        Mob mob = event.getEntity();
        if (mob instanceof BabySkeletonEntity || mob instanceof BabySkeletonMinionEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.BABY_SKELETON_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.BABY_SKELETON_HEALTH);
            mob.setHealth((float) BIConfig.BABY_SKELETON_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.BABY_SKELETON_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.BABY_SKELETON_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.BABY_SKELETON_KNOCKBACK);
        }
        if (mob instanceof BarrelZombieEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_BARREL_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_BARREL_HEALTH);
            mob.setHealth((float) BIConfig.ZOMBIE_BARREL_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.ZOMBIE_BARREL_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_BARREL_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_BARREL_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_BARREL_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof BloodyGadflyEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.BLOODY_GADFLY_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.BLOODY_GADFLY_HEALTH);
            mob.setHealth((float) BIConfig.BLOODY_GADFLY_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.BLOODY_GADFLY_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.BLOODY_GADFLY_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.BLOODY_GADFLY_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BLOODY_GADFLY_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof BoneImpEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.BONE_IMP_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.BONE_IMP_HEALTH);
            mob.setHealth((float) BIConfig.BONE_IMP_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.BONE_IMP_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.BONE_IMP_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.BONE_IMP_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BONE_IMP_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof BoneImpMinionEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.BONE_MINION_IMP_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.BONE_MINION_IMP_HEALTH);
            mob.setHealth((float) BIConfig.BONE_MINION_IMP_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.BONE_MINION_IMP_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.BONE_MINION_IMP_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.BONE_MINION_IMP_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BONE_MINION_IMP_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof BonescallerEntity || mob instanceof BonescallerNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.BONES_CALLER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.BONES_CALLER_HEALTH);
            mob.setHealth((float) BIConfig.BONES_CALLER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.BONES_CALLER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.BONES_CALLER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.BONES_CALLER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BONES_CALLER_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof CorpseFishEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.CORPSE_FISH_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.CORPSE_FISH_HEALTH);
            mob.setHealth((float) BIConfig.CORPSE_FISH_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.CORPSE_FISH_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.CORPSE_FISH_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.CORPSE_FISH_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.CORPSE_FISH_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof CorpseFlyEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.CORPSE_FLY_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.CORPSE_FLY_HEALTH);
            mob.setHealth((float) BIConfig.CORPSE_FLY_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.CORPSE_FLY_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.CORPSE_FLY_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.CORPSE_FLY_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.CORPSE_FLY_KNOCKBACK_RESISTANCE);

        }
        if (mob instanceof DarkVortexEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.DARK_VORTEX_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.DARK_VORTEX_HEALTH);
            mob.setHealth((float) BIConfig.DARK_VORTEX_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.DARK_VORTEX_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.DARK_VORTEX_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.DARK_VORTEX_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DARK_VORTEX_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof DecayingZombieEntity || mob instanceof DecayingZombieNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.DECAYING_ZOMBIE_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.DECAYING_ZOMBIE_HEALTH);
            mob.setHealth((float) BIConfig.DECAYING_ZOMBIE_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.DECAYING_ZOMBIE_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.DECAYING_ZOMBIE_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.DECAYING_ZOMBIE_KNOCKBACK);
        }
        if (mob instanceof DecrepitSkeletonEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.DECREPIT_SKELETON_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.DECREPIT_SKELETON_HEALTH);
            mob.setHealth((float) BIConfig.DECREPIT_SKELETON_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.DECREPIT_SKELETON_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.DECREPIT_SKELETON_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.DECREPIT_SKELETON_KNOCKBACK);
        }
        if (mob instanceof DiamondThermiteEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.DIAMOND_TERMITE_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.DIAMOND_TERMITE_HEALTH);
            mob.setHealth((float) BIConfig.DIAMOND_TERMITE_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.DIAMOND_TERMITE_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.DIAMOND_TERMITE_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.DIAMOND_TERMITE_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DIAMOND_TERMITE_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof DoorKnightEntity || mob instanceof DoorKnightNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.DOOR_KNIGHT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.DOOR_KNIGHT_HEALTH);
            mob.setHealth((float) BIConfig.DOOR_KNIGHT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.DOOR_KNIGHT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.DOOR_KNIGHT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.DOOR_KNIGHT_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DOOR_KNIGHT_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof DreadHoundEntity || mob instanceof DreadHoundNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.DREADHOUND_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.DREADHOUND_HEALTH);
            mob.setHealth((float) BIConfig.DREADHOUND_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.DREADHOUND_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.DREADHOUND_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.DREADHOUND_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DREADHOUND_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof FallenChaosKnightEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.FALLEN_CHAOS_KNIGHT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.FALLEN_CHAOS_KNIGHT_HEALTH);
            mob.setHealth((float) BIConfig.FALLEN_CHAOS_KNIGHT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.FALLEN_CHAOS_KNIGHT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.FALLEN_CHAOS_KNIGHT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.FALLEN_CHAOS_KNIGHT_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.FALLEN_CHAOS_KNIGHT_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof FirelightEntity || mob instanceof FirelightNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.FIRELIGHT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.FIRELIGHT_HEALTH);
            mob.setHealth((float) BIConfig.FIRELIGHT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.FIRELIGHT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.FIRELIGHT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.FIRELIGHT_KNOCKBACK);
        }
        if (mob instanceof GluttonFishEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.GLUTTON_FISH_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.GLUTTON_FISH_HEALTH);
            mob.setHealth((float) BIConfig.GLUTTON_FISH_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.GLUTTON_FISH_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.GLUTTON_FISH_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.GLUTTON_FISH_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.GLUTTON_FISH_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof InfernalSpiritEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.INFERNAL_SPIRIT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.INFERNAL_SPIRIT_HEALTH);
            mob.setHealth((float) BIConfig.INFERNAL_SPIRIT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.INFERNAL_SPIRIT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.INFERNAL_SPIRIT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.INFERNAL_SPIRIT_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.INFERNAL_SPIRIT_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof LifestealerEntity || mob instanceof LifestealerTrueFormEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.LIFESTEALER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.LIFESTEALER_HEALTH);
            mob.setHealth((float) BIConfig.LIFESTEALER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.LIFESTEALER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.LIFESTEALER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.LIFESTEALER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LIFESTEALER_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof LordPumpkinheadEntity || mob instanceof LordPumpkinheadWithoutaHorseEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.LORD_PUMPKINHEAD_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.LORD_PUMPKINHEAD_HEALTH);
            mob.setHealth((float) BIConfig.LORD_PUMPKINHEAD_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.LORD_PUMPKINHEAD_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.LORD_PUMPKINHEAD_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.LORD_PUMPKINHEAD_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LORD_PUMPKINHEAD_KNOCKBACK_RESISTANCE);
        }if (mob instanceof LordTheHeadlessEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.LORD_HEADLESS_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.LORD_HEADLESS_HEALTH);
            mob.setHealth((float) BIConfig.LORD_HEADLESS_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.LORD_HEADLESS_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.LORD_HEADLESS_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.LORD_HEADLESS_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LORD_HEADLESS_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof MaggotEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.MAGGOT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.MAGGOT_HEALTH);
            mob.setHealth((float) BIConfig.MAGGOT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.MAGGOT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.MAGGOT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.MAGGOT_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.MAGGOT_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof MissionerEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.MISSIONER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.MISSIONER_HEALTH);
            mob.setHealth((float) BIConfig.MISSIONER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.MISSIONER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.MISSIONER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.MISSIONER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.MISSIONER_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof MrPumpkinEntity || mob instanceof MrPumpkinControlledEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.MR_PUMPKIN_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.MR_PUMPKIN_HEALTH);
            mob.setHealth((float) BIConfig.MR_PUMPKIN_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.MR_PUMPKIN_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.MR_PUMPKIN_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.MR_PUMPKIN_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.MR_PUMPKIN_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof NightmareStalkerEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.NIGHTMARE_STALKER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.NIGHTMARE_STALKER_HEALTH);
            mob.setHealth((float) BIConfig.NIGHTMARE_STALKER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.NIGHTMARE_STALKER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.NIGHTMARE_STALKER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.NIGHTMARE_STALKER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.NIGHTMARE_STALKER_KNOCKBACK_RESISTANCE);
        }if (mob instanceof PhantomCreeperCopyEntity || mob instanceof PhantomCreeperEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.PHANTOM_CREEPER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.PHANTOM_CREEPER_HEALTH);
            mob.setHealth((float) BIConfig.PHANTOM_CREEPER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.PHANTOM_CREEPER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.PHANTOM_CREEPER_DAMAGE);
        }
        if (mob instanceof PumpkinheadEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.PUMPKINHEAD_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.PUMPKINHEAD_HEALTH);
            mob.setHealth((float) BIConfig.PUMPKINHEAD_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.PUMPKINHEAD_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.PUMPKINHEAD_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.PUMPKINHEAD_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.PUMPKINHEAD_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof PumpkinSpiritEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.PUMPKIN_SPIRIT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.PUMPKIN_SPIRIT_HEALTH);
            mob.setHealth((float) BIConfig.PUMPKIN_SPIRIT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.PUMPKIN_SPIRIT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.PUMPKIN_SPIRIT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.PUMPKIN_SPIRIT_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.PUMPKIN_SPIRIT_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof RestlessSpiritEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.RESTLESS_SPIRIT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.RESTLESS_SPIRIT_HEALTH);
            mob.setHealth((float) BIConfig.RESTLESS_SPIRIT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.RESTLESS_SPIRIT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.RESTLESS_SPIRIT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.RESTLESS_SPIRIT_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.RESTLESS_SPIRIT_KNOCKBACK_RESISTANCE);
            EntityUtils.setAttribute(mob, Attributes.FLYING_SPEED, BIConfig.RESTLESS_SPIRIT_FLYING_SPEED);
        }
        if (mob instanceof ScarletPersecutorEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SCARLET_PROSECUTER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SCARLET_PROSECUTER_HEALTH);
            mob.setHealth((float) BIConfig.SCARLET_PROSECUTER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SCARLET_PROSECUTER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SCARLET_PROSECUTER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SCARLET_PROSECUTER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SCARLET_PROSECUTER_KNOCKBACK_RESISTANCE);
            EntityUtils.setAttribute(mob, Attributes.FLYING_SPEED, BIConfig.SCARLET_PROSECUTER_FLYING_SPEED);
        }
        if (mob instanceof SearedSpiritEntity || mob instanceof SearedSpiritNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SEARED_SPIRIT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SEARED_SPIRIT_HEALTH);
            mob.setHealth((float) BIConfig.SEARED_SPIRIT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SEARED_SPIRIT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SEARED_SPIRIT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SEARED_SPIRIT_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SEARED_SPIRIT_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof SenorPumpkinEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SENOR_PUMPKIN_HEAD_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SENOR_PUMPKIN_HEAD_HEALTH);
            mob.setHealth((float) BIConfig.SENOR_PUMPKIN_HEAD_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SENOR_PUMPKIN_HEAD_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SENOR_PUMPKIN_HEAD_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SENOR_PUMPKIN_HEAD_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SENOR_PUMPKIN_HEAD_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof SiameseSkeletonsEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SIAMESE_SKELETONS_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SIAMESE_SKELETONS_HEALTH);
            mob.setHealth((float) BIConfig.SIAMESE_SKELETONS_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SIAMESE_SKELETONS_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SIAMESE_SKELETONS_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SIAMESE_SKELETONS_KNOCKBACK);
        }
        if (mob instanceof SiameseSkeletonsleftEntity || mob instanceof SiameseSkeletonsrightEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SIAMESE_SKELETONS_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SIAMESE_SKELETONS_HEALTH / 2);
            mob.setHealth((float) BIConfig.SIAMESE_SKELETONS_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SIAMESE_SKELETONS_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SIAMESE_SKELETONS_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SIAMESE_SKELETONS_KNOCKBACK);
        }
        if (mob instanceof SirPumpkinheadEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SIR_PUMPKIN_HEAD_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SIR_PUMPKIN_HEAD_HEALTH);
            mob.setHealth((float) BIConfig.SIR_PUMPKIN_HEAD_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SIR_PUMPKIN_HEAD_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SIR_PUMPKIN_HEAD_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SIR_PUMPKIN_HEAD_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SIR_PUMPKIN_HEAD_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof SkeletonDemomanEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SKELETON_BOMBER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SKELETON_BOMBER_HEALTH);
            mob.setHealth((float) BIConfig.SKELETON_BOMBER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SKELETON_BOMBER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SKELETON_BOMBER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SKELETON_BOMBER_KNOCKBACK);
        }
        if (mob instanceof SkeletonThrasherEntity || mob instanceof SkeletonThrasherNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SKELETON_THRASHER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SKELETON_THRASHER_HEALTH);
            mob.setHealth((float) BIConfig.SKELETON_THRASHER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SKELETON_THRASHER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SKELETON_THRASHER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SKELETON_THRASHER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SKELETON_THRASHER_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof SpiritGuideEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SPIRIT_GUIDE_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SPIRIT_GUIDE_HEALTH);
            mob.setHealth((float) BIConfig.SPIRIT_GUIDE_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SPIRIT_GUIDE_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SPIRIT_GUIDE_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SPIRIT_GUIDE_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SPIRIT_GUIDE_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof SpiritofChaosEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SPIRIT_OF_CHAOS_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SPIRIT_OF_CHAOS_HEALTH);
            mob.setHealth((float) BIConfig.SPIRIT_OF_CHAOS_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SPIRIT_OF_CHAOS_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SPIRIT_OF_CHAOS_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SPIRIT_OF_CHAOS_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof SupremeBonescallerEntity || mob instanceof SupremeBonescallerNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SUPREME_BONES_CALLER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SUPREME_BONES_CALLER_HEALTH);
            mob.setHealth((float) BIConfig.SUPREME_BONES_CALLER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SUPREME_BONES_CALLER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SUPREME_BONES_CALLER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SUPREME_BONES_CALLER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SUPREME_BONES_CALLER_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof SpiritGuideAssistantEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SPIRIT_ASSISTANT_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SPIRIT_ASSISTANT_HEALTH);
            mob.setHealth((float) BIConfig.SPIRIT_ASSISTANT_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SPIRIT_ASSISTANT_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SPIRIT_ASSISTANT_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SPIRIT_ASSISTANT_KNOCKBACK);
        }
        if (mob instanceof SwarmerEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.SWARMER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.SWARMER_HEALTH);
            mob.setHealth((float) BIConfig.SWARMER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.SWARMER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.SWARMER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.SWARMER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SWARMER_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof ThornshellCrabEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.THORNSHELL_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.THORNSHELL_HEALTH);
            mob.setHealth((float) BIConfig.THORNSHELL_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.THORNSHELL_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.THORNSHELL_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.THORNSHELL_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.THORNSHELL_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof ZombieBruiserEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_BRUISER_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_BRUISER_HEALTH);
            mob.setHealth((float) BIConfig.ZOMBIE_BRUISER_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.ZOMBIE_BRUISER_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_BRUISER_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_BRUISER_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_BRUISER_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof ZombieClownEntity || mob instanceof ZombieClownNotDespawnEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_CLOWN_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_CLOWN_HEALTH);
            mob.setHealth((float) BIConfig.ZOMBIE_CLOWN_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.ZOMBIE_CLOWN_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_CLOWN_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_CLOWN_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_CLOWN_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof ZombieFishermanEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_FISHERMAN_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_FISHERMAN_HEALTH);
            mob.setHealth((float) BIConfig.ZOMBIE_FISHERMAN_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.ZOMBIE_FISHERMAN_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_FISHERMAN_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_FISHERMAN_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_FISHERMAN_KNOCKBACK_RESISTANCE);
        }
        if (mob instanceof ZombieLumberjackEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_LUMBERJACK_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_LUMBERJACK_HEALTH);
            mob.setHealth((float) BIConfig.ZOMBIE_LUMBERJACK_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.ZOMBIE_LUMBERJACK_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_LUMBERJACK_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_LUMBERJACK_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_LUMBERJACK_KNOCKBACK_RESISTANCE);
        }





    }


}
