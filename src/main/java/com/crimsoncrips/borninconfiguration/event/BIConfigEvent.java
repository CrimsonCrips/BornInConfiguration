package com.crimsoncrips.borninconfiguration.event;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.crimsoncrips.borninconfiguration.config.BIConfig;
import com.crimsoncrips.borninconfiguration.utils.EntityUtils;
import net.mcreator.borninchaosv.entity.*;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.entity.living.MobSpawnEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BornInConfiguration.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BIConfigEvent {

    @SubscribeEvent
    public void onMobSpawn(MobSpawnEvent.FinalizeSpawn event) {
        Mob spawningEntity = event.getEntity();
        if (spawningEntity instanceof BabySkeletonEntity || spawningEntity instanceof BabySkeletonMinionEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.BABY_SKELETON_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.BABY_SKELETON_HEALTH);
            spawningEntity.setHealth((float) BIConfig.BABY_SKELETON_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.BABY_SKELETON_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.BABY_SKELETON_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.BABY_SKELETON_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BABY_SKELETON_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof BabySpiderEntity || spawningEntity instanceof BabySpiderControlledEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.BABY_SPIDER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.BABY_SPIDER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.BABY_SPIDER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.BABY_SPIDER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.BABY_SPIDER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.BABY_SPIDER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BABY_SPIDER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof BarrelZombieEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_BARREL_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_BARREL_HEALTH);
            spawningEntity.setHealth((float) BIConfig.ZOMBIE_BARREL_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.ZOMBIE_BARREL_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_BARREL_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_BARREL_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_BARREL_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof BloodyGadflyEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.BLOODY_GADFLY_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.BLOODY_GADFLY_HEALTH);
            spawningEntity.setHealth((float) BIConfig.BLOODY_GADFLY_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.BLOODY_GADFLY_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.BLOODY_GADFLY_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.BLOODY_GADFLY_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BLOODY_GADFLY_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof BoneImpEntity || spawningEntity instanceof BoneImpMinionEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.BONE_IMP_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.BONE_IMP_HEALTH);
            spawningEntity.setHealth((float) BIConfig.BONE_IMP_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.BONE_IMP_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.BONE_IMP_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.BONE_IMP_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BONE_IMP_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof BonescallerEntity || spawningEntity instanceof BonescallerNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.BONES_CALLER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.BONES_CALLER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.BONES_CALLER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.BONES_CALLER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.BONES_CALLER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.BONES_CALLER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.BONES_CALLER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof ControlledBabySkeletonEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.CONTROLLED_BABY_SKELETON_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.CONTROLLED_BABY_SKELETON_HEALTH);
            spawningEntity.setHealth((float) BIConfig.CONTROLLED_BABY_SKELETON_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.CONTROLLED_BABY_SKELETON_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.CONTROLLED_BABY_SKELETON_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.CONTROLLED_BABY_SKELETON_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.CONTROLLED_BABY_SKELETON_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof ControlledSpiritualAssistantEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.CONTROLLED_SPIRITUAL_ASSISTANT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.CONTROLLED_SPIRITUAL_ASSISTANT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.CONTROLLED_SPIRITUAL_ASSISTANT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.CONTROLLED_SPIRITUAL_ASSISTANT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.CONTROLLED_SPIRITUAL_ASSISTANT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof CorpseFishEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.CORPSE_FISH_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.CORPSE_FISH_HEALTH);
            spawningEntity.setHealth((float) BIConfig.CORPSE_FISH_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.CORPSE_FISH_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.CORPSE_FISH_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.CORPSE_FISH_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.CORPSE_FISH_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof CorpseFlyEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.CORPSE_FLY_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.CORPSE_FLY_HEALTH);
            spawningEntity.setHealth((float) BIConfig.CORPSE_FLY_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.CORPSE_FLY_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.CORPSE_FLY_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.CORPSE_FLY_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.CORPSE_FLY_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof DarkVortexEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.DARK_VORTEX_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.DARK_VORTEX_HEALTH);
            spawningEntity.setHealth((float) BIConfig.DARK_VORTEX_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.DARK_VORTEX_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.DARK_VORTEX_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.DARK_VORTEX_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DARK_VORTEX_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof DecayingZombieEntity || spawningEntity instanceof DecayingZombieNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.DECAYING_ZOMBIE_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.DECAYING_ZOMBIE_HEALTH);
            spawningEntity.setHealth((float) BIConfig.DECAYING_ZOMBIE_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.DECAYING_ZOMBIE_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.DECAYING_ZOMBIE_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.DECAYING_ZOMBIE_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DECAYING_ZOMBIE_KNOCKBACK_RESISTANCE);

        }
        if (spawningEntity instanceof DecrepitSkeletonEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.DECREPIT_SKELETON_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.DECREPIT_SKELETON_HEALTH);
            spawningEntity.setHealth((float) BIConfig.DECREPIT_SKELETON_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.DECREPIT_SKELETON_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.DECREPIT_SKELETON_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.DECREPIT_SKELETON_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DECAYING_ZOMBIE_KNOCKBACK_RESISTANCE);

        }
        if (spawningEntity instanceof DiamondThermiteEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.DIAMOND_TERMITE_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.DIAMOND_TERMITE_HEALTH);
            spawningEntity.setHealth((float) BIConfig.DIAMOND_TERMITE_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.DIAMOND_TERMITE_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.DIAMOND_TERMITE_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.DIAMOND_TERMITE_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DIAMOND_TERMITE_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof DoorKnightEntity || spawningEntity instanceof DoorKnightNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.DOOR_KNIGHT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.DOOR_KNIGHT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.DOOR_KNIGHT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.DOOR_KNIGHT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.DOOR_KNIGHT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.DOOR_KNIGHT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DOOR_KNIGHT_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof DreadHoundEntity || spawningEntity instanceof DreadHoundNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.DREAD_HOUND_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.DREAD_HOUND_HEALTH);
            spawningEntity.setHealth((float) BIConfig.DREAD_HOUND_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.DREAD_HOUND_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.DREAD_HOUND_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.DREAD_HOUND_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DREAD_HOUND_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof FallenChaosKnightEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.FALLEN_KNIGHT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.FALLEN_KNIGHT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.FALLEN_KNIGHT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.FALLEN_KNIGHT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.FALLEN_KNIGHT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.FALLEN_KNIGHT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.FALLEN_KNIGHT_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof FelsteedEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal(
                        (PathfinderMob) spawningEntity, new Class[]{
                        LordPumpkinheadEntity.class,
                        LordPumpkinheadHeadEntity.class,
                        LordTheHeadlessEntity.class,
                        LordPumpkinheadWithoutaHorseEntity.class,
                        SirPumpkinheadEntity.class,
                        SirPumpkinheadWithoutHorseEntity.class,
                        SirTheHeadlessEntity.class
                }));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.FELSTEED_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.FELSTEED_HEALTH);
            spawningEntity.setHealth((float) BIConfig.FELSTEED_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.FELSTEED_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.FELSTEED_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.FELSTEED_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.FELSTEED_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof RidingFelsteedEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.FELSTEED_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.FELSTEED_HEALTH);
            spawningEntity.setHealth((float) BIConfig.FELSTEED_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.FELSTEED_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.FELSTEED_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.FELSTEED_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.FELSTEED_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof FirelightEntity || spawningEntity instanceof FirelightNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.FIRELIGHT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.FIRELIGHT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.FIRELIGHT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.FIRELIGHT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.FIRELIGHT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.FIRELIGHT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.FIRELIGHT_KNOCKBACK_RESISTANCE);

        }
        if (spawningEntity instanceof GluttonFishEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.GLUTTON_FISH_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.GLUTTON_FISH_HEALTH);
            spawningEntity.setHealth((float) BIConfig.GLUTTON_FISH_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.GLUTTON_FISH_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.GLUTTON_FISH_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.GLUTTON_FISH_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.GLUTTON_FISH_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof InfernalSpiritEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.INFERNAL_SPIRIT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.INFERNAL_SPIRIT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.INFERNAL_SPIRIT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.INFERNAL_SPIRIT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.INFERNAL_SPIRIT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.INFERNAL_SPIRIT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.INFERNAL_SPIRIT_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof LifestealerEntity || spawningEntity instanceof LifestealerTrueFormEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.LIFESTEALER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.LIFESTEALER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.LIFESTEALER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.LIFESTEALER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.LIFESTEALER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.LIFESTEALER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LIFESTEALER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof LordPumpkinheadEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.LORD_PUMPKIN_HEAD_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.LORD_PUMPKIN_HEAD_HEALTH);
            spawningEntity.setHealth((float) BIConfig.LORD_PUMPKIN_HEAD_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.LORD_PUMPKIN_HEAD_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.LORD_PUMPKIN_HEAD_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.LORD_PUMPKIN_HEAD_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LORD_PUMPKIN_HEAD_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof LordPumpkinheadHeadEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.LORD_PUMPKIN_HEAD_HEAD_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.LORD_PUMPKIN_HEAD_HEAD_HEALTH);
            spawningEntity.setHealth((float) BIConfig.LORD_PUMPKIN_HEAD_HEAD_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.LORD_PUMPKIN_HEAD_HEAD_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.LORD_PUMPKIN_HEAD_HEAD_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof LordPumpkinheadWithoutaHorseEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.LORD_PUMPKIN_HEAD_HORSELESS_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.LORD_PUMPKIN_HEAD_HORSELESS_HEALTH);
            spawningEntity.setHealth((float) BIConfig.LORD_PUMPKIN_HEAD_HORSELESS_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.LORD_PUMPKIN_HEAD_HORSELESS_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.LORD_PUMPKIN_HEAD_HORSELESS_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof LordTheHeadlessEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.LORD_HEADLESS_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.LORD_HEADLESS_HEALTH);
            spawningEntity.setHealth((float) BIConfig.LORD_HEADLESS_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.LORD_HEADLESS_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.LORD_HEADLESS_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.LORD_HEADLESS_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LORD_HEADLESS_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof LordsFelsteedEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal(
                        (PathfinderMob) spawningEntity, new Class[]{
                        LordPumpkinheadEntity.class,
                        LordPumpkinheadHeadEntity.class,
                        LordTheHeadlessEntity.class,
                        LordPumpkinheadWithoutaHorseEntity.class,
                        SirPumpkinheadEntity.class,
                        SirPumpkinheadWithoutHorseEntity.class,
                        SirTheHeadlessEntity.class
                }));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.LORD_HEADLESS_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.LORD_HEADLESS_HEALTH);
            spawningEntity.setHealth((float) BIConfig.LORD_HEADLESS_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.LORD_HEADLESS_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.LORD_HEADLESS_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.LORD_HEADLESS_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.LORD_HEADLESS_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof MaggotEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.MAGGOT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.MAGGOT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.MAGGOT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.MAGGOT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.MAGGOT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.MAGGOT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.MAGGOT_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof MissionerEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.MISSIONER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.MISSIONER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.MISSIONER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.MISSIONER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.MISSIONER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.MISSIONER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.MISSIONER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof MotherSpiderEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.MOTHER_SPIDER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.MOTHER_SPIDER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.MOTHER_SPIDER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.MOTHER_SPIDER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.MOTHER_SPIDER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.MOTHER_SPIDER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.MOTHER_SPIDER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof MrPumpkinEntity || spawningEntity instanceof MrPumpkinControlledEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.MR_PUMPKIN_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.MR_PUMPKIN_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.FLYING_SPEED, BIConfig.MR_PUMPKIN_FLYING_SPEED);
            spawningEntity.setHealth((float) BIConfig.MR_PUMPKIN_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.MR_PUMPKIN_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.MR_PUMPKIN_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.MR_PUMPKIN_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.MR_PUMPKIN_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof MrsPumpkinEntity ) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.MS_PUMPKIN_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.MS_PUMPKIN_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.FLYING_SPEED, BIConfig.MS_PUMPKIN_FLYING_SPEED);
            spawningEntity.setHealth((float) BIConfig.MS_PUMPKIN_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.MS_PUMPKIN_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.MS_PUMPKIN_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.MS_PUMPKIN_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.MS_PUMPKIN_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof NightmareStalkerEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.NIGHTMARE_STALKER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.NIGHTMARE_STALKER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.NIGHTMARE_STALKER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.NIGHTMARE_STALKER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.NIGHTMARE_STALKER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.NIGHTMARE_STALKER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.NIGHTMARE_STALKER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof PhantomCreeperCopyEntity || spawningEntity instanceof PhantomCreeperEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.PHANTOM_CREEPER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.PHANTOM_CREEPER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.PHANTOM_CREEPER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.PHANTOM_CREEPER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.PHANTOM_CREEPER_DAMAGE);
        }
        if (spawningEntity instanceof PumpkinBruiserEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.PUMPKIN_BRUISER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.PUMPKIN_BRUISER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.PUMPKIN_BRUISER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.PUMPKIN_BRUISER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.PUMPKIN_BRUISER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.PUMPKIN_BRUISER_DAMAGE);
        }
        if (spawningEntity instanceof PumpkinDunceEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.PUMPKIN_DUNCE_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.PUMPKIN_DUNCE_HEALTH);
            spawningEntity.setHealth((float) BIConfig.PUMPKIN_DUNCE_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.PUMPKIN_DUNCE_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.PUMPKIN_DUNCE_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.PUMPKIN_DUNCE_DAMAGE);
        }
        if (spawningEntity instanceof PumpkinSpiritEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.PUMPKIN_SPIRIT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.PUMPKIN_SPIRIT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.PUMPKIN_SPIRIT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.PUMPKIN_SPIRIT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.PUMPKIN_SPIRIT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.PUMPKIN_SPIRIT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.PUMPKIN_SPIRIT_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof PumpkinheadEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.PUMPKIN_HEAD_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.PUMPKIN_HEAD_HEALTH);
            spawningEntity.setHealth((float) BIConfig.PUMPKIN_HEAD_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.PUMPKIN_HEAD_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.PUMPKIN_HEAD_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.PUMPKIN_HEAD_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.PUMPKIN_HEAD_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof RestlessSpiritEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.RESTLESS_SPIRIT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.RESTLESS_SPIRIT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.RESTLESS_SPIRIT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.RESTLESS_SPIRIT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.RESTLESS_SPIRIT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.RESTLESS_SPIRIT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.RESTLESS_SPIRIT_KNOCKBACK_RESISTANCE);
            EntityUtils.setAttribute(spawningEntity, Attributes.FLYING_SPEED, BIConfig.RESTLESS_SPIRIT_FLYING_SPEED);
        }
        if (spawningEntity instanceof RidingLordsFelsteedEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.RIDEABLE_LORD_FELSTEED_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.RIDEABLE_LORD_FELSTEED_HEALTH);
            spawningEntity.setHealth((float) BIConfig.RIDEABLE_LORD_FELSTEED_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.RIDEABLE_LORD_FELSTEED_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.RIDEABLE_LORD_FELSTEED_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.RIDEABLE_LORD_FELSTEED_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.RIDEABLE_LORD_FELSTEED_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof ScarletPersecutorEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SCARLET_PROSECUTER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SCARLET_PROSECUTER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SCARLET_PROSECUTER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SCARLET_PROSECUTER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SCARLET_PROSECUTER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SCARLET_PROSECUTER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SCARLET_PROSECUTER_KNOCKBACK_RESISTANCE);
            EntityUtils.setAttribute(spawningEntity, Attributes.FLYING_SPEED, BIConfig.SCARLET_PROSECUTER_FLYING_SPEED);
        }
        if (spawningEntity instanceof SearedSpiritEntity || spawningEntity instanceof SearedSpiritNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SEARED_SPIRIT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SEARED_SPIRIT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SEARED_SPIRIT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SEARED_SPIRIT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SEARED_SPIRIT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SEARED_SPIRIT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SEARED_SPIRIT_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SenorPumpkinEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SENOR_PUMPKIN_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SENOR_PUMPKIN_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SENOR_PUMPKIN_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SENOR_PUMPKIN_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SENOR_PUMPKIN_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SENOR_PUMPKIN_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SENOR_PUMPKIN_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SiameseSkeletonsEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SIAMESE_SKELETON_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SIAMESE_SKELETON_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SIAMESE_SKELETON_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SIAMESE_SKELETON_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SIAMESE_SKELETON_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SIAMESE_SKELETON_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SIAMESE_SKELETON_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SiameseSkeletonsleftEntity || spawningEntity instanceof SiameseSkeletonsrightEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SIAMESE_SKELETON_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SIAMESE_SKELETON_HEALTH / 2);
            spawningEntity.setHealth((float) BIConfig.SIAMESE_SKELETON_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SIAMESE_SKELETON_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SIAMESE_SKELETON_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SIAMESE_SKELETON_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SIAMESE_SKELETON_KNOCKBACK_RESISTANCE);

        }
        if (spawningEntity instanceof SirPumpkinheadEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SIR_PUMPKINHEAD_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SIR_PUMPKINHEAD_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SIR_PUMPKINHEAD_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SIR_PUMPKINHEAD_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SIR_PUMPKINHEAD_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SIR_PUMPKINHEAD_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SIR_PUMPKINHEAD_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SirPumpkinheadWithoutHorseEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SIR_PUMPKINHEAD_HORSELESS_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SIR_PUMPKINHEAD_HORSELESS_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SIR_PUMPKINHEAD_HORSELESS_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SIR_PUMPKINHEAD_HORSELESS_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SIR_PUMPKINHEAD_HORSELESS_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SirTheHeadlessEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SIR_PUMPKINHEAD_HEADLESS_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SIR_PUMPKINHEAD_HEADLESS_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SIR_PUMPKINHEAD_HEADLESS_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SIR_PUMPKINHEAD_HEADLESS_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SIR_PUMPKINHEAD_HEADLESS_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK_RESISTANCE);
        }

        if (spawningEntity instanceof SkeletonDemomanEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SKELETON_DEMOMAN_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SKELETON_DEMOMAN_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SKELETON_DEMOMAN_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SKELETON_DEMOMAN_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SKELETON_DEMOMAN_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SKELETON_DEMOMAN_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SKELETON_DEMOMAN_KNOCKBACK_RESISTANCE);

        }
        if (spawningEntity instanceof SkeletonThrasherEntity || spawningEntity instanceof SkeletonThrasherNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SKELETON_THRASHER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SKELETON_THRASHER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SKELETON_THRASHER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SKELETON_THRASHER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SKELETON_THRASHER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SKELETON_THRASHER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SKELETON_THRASHER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SpiritGuideEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SPIRIT_GUIDE_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SPIRIT_GUIDE_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SPIRIT_GUIDE_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SPIRIT_GUIDE_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SPIRIT_GUIDE_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SPIRIT_GUIDE_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SPIRIT_GUIDE_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SpiritGuideAssistantEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SPIRIT_GUIDE_ASSISTANT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SPIRIT_GUIDE_ASSISTANT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SPIRIT_GUIDE_ASSISTANT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SPIRIT_GUIDE_ASSISTANT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SPIRIT_GUIDE_ASSISTANT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SpiritofChaosEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SPIRIT_OF_CHAOS_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SPIRIT_OF_CHAOS_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SPIRIT_OF_CHAOS_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SPIRIT_OF_CHAOS_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SPIRIT_OF_CHAOS_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SPIRIT_OF_CHAOS_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SPIRIT_OF_CHAOS_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SupremeBonescallerEntity || spawningEntity instanceof SupremeBonescallerNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SUPREME_BONESCALLER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SUPREME_BONESCALLER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SUPREME_BONESCALLER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SUPREME_BONESCALLER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SUPREME_BONESCALLER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SUPREME_BONESCALLER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SUPREME_BONESCALLER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SupremeBonescallerStage2Entity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SUPREME_BONESCALLER_PHASE_2_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SUPREME_BONESCALLER_PHASE_2_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SUPREME_BONESCALLER_PHASE_2_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SUPREME_BONESCALLER_PHASE_2_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SUPREME_BONESCALLER_PHASE_2_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SUPREME_BONESCALLER_PHASE_2_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SUPREME_BONESCALLER_PHASE_2_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof SpiritGuideAssistantEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SPIRIT_GUIDE_ASSISTANT_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SPIRIT_GUIDE_ASSISTANT_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SPIRIT_GUIDE_ASSISTANT_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SPIRIT_GUIDE_ASSISTANT_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SPIRIT_GUIDE_ASSISTANT_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK_RESISTANCE);

        }
        if (spawningEntity instanceof SwarmerEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.SWARMER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.SWARMER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.SWARMER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.SWARMER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.SWARMER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.SWARMER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.SWARMER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof ThornshellCrabEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.THORNSHELL_CRAB_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.THORNSHELL_CRAB_HEALTH);
            spawningEntity.setHealth((float) BIConfig.THORNSHELL_CRAB_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.THORNSHELL_CRAB_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.THORNSHELL_CRAB_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.THORNSHELL_CRAB_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.THORNSHELL_CRAB_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof ZombieBruiserEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_BRUISER_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_BRUISER_HEALTH);
            spawningEntity.setHealth((float) BIConfig.ZOMBIE_BRUISER_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.ZOMBIE_BRUISER_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_BRUISER_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_BRUISER_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_BRUISER_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof ZombieClownEntity || spawningEntity instanceof ZombieClownNotDespawnEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_CLOWN_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_CLOWN_HEALTH);
            spawningEntity.setHealth((float) BIConfig.ZOMBIE_CLOWN_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.ZOMBIE_CLOWN_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_CLOWN_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_CLOWN_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_CLOWN_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof ZombieFishermanEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_FISHERMAN_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_FISHERMAN_HEALTH);
            spawningEntity.setHealth((float) BIConfig.ZOMBIE_FISHERMAN_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.ZOMBIE_FISHERMAN_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_FISHERMAN_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_FISHERMAN_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_FISHERMAN_KNOCKBACK_RESISTANCE);
        }
        if (spawningEntity instanceof ZombieLumberjackEntity) {
            if (BIConfig.RETALLIATION_ENABLED){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BIConfig.ZOMBIE_LUMBERJACK_SPEED);
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BIConfig.ZOMBIE_LUMBERJACK_HEALTH);
            spawningEntity.setHealth((float) BIConfig.ZOMBIE_LUMBERJACK_HEALTH);
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BIConfig.ZOMBIE_LUMBERJACK_ARMOR);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BIConfig.ZOMBIE_LUMBERJACK_DAMAGE);
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BIConfig.ZOMBIE_LUMBERJACK_KNOCKBACK);
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BIConfig.ZOMBIE_LUMBERJACK_KNOCKBACK_RESISTANCE);
        }
    }


    @SubscribeEvent
    public void mobSpawn(MobSpawnEvent.PositionCheck spawnPlacementCheck){
        EntityType<?> entityType = spawnPlacementCheck.getEntity().getType();
        Holder<Biome> biome = spawnPlacementCheck.getLevel().getBiome(spawnPlacementCheck.getEntity().blockPosition());
        long time = spawnPlacementCheck.getLevel().dayTime();

        if(entityType == BornInChaosV1ModEntities.BABY_SKELETON.get() || entityType == BornInChaosV1ModEntities.BABY_SKELETON_MINION.get()){
            if (!BIConfig.BABY_SKELETON_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.BABY_SPIDER.get() || entityType == BornInChaosV1ModEntities.BABY_SPIDER_CONTROLLED.get()){
            if (!BIConfig.BABY_SPIDER_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.BARREL_ZOMBIE.get()){
            if (!BIConfig.ZOMBIE_BARREL_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.BLOODY_GADFLY.get()){
            if (!BIConfig.BLOODY_GADFLY_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.BONE_IMP.get() || entityType == BornInChaosV1ModEntities.BONE_IMP_MINION.get()){
            if (!BIConfig.BONE_IMP_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.BONESCALLER.get() || entityType == BornInChaosV1ModEntities.BONESCALLER_NOT_DESPAWN.get()){
            if (!BIConfig.BONE_IMP_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.CORPSE_FISH.get()){
            if (!BIConfig.CORPSE_FISH_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.CORPSE_FLY.get()){
            if (!BIConfig.CORPSE_FLY_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.DARK_VORTEX.get()){
            if (!BIConfig.DARK_VORTEX_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.DECAYING_ZOMBIE.get() || entityType == BornInChaosV1ModEntities.DECAYING_ZOMBIE_NOT_DESPAWN.get()){
            if (!BIConfig.DECAYING_ZOMBIE_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.DECREPIT_SKELETON.get()){
            if (!BIConfig.DECREPIT_SKELETON_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.DIRE_HOUND_LEADER.get()){
            if (!BIConfig.DIRE_HOUND_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.DOOR_KNIGHT.get() || entityType == BornInChaosV1ModEntities.DOOR_KNIGHT_NOT_DESPAWN.get()){
            if (!BIConfig.DOOR_KNIGHT_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.DREAD_HOUND.get()  || entityType == BornInChaosV1ModEntities.DREAD_HOUND_NOT_DESPAWN.get()){
            if (!BIConfig.DREAD_HOUND_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.FALLEN_CHAOS_KNIGHT.get()){
            if (!BIConfig.FALLEN_KNIGHT_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.FIRELIGHT.get()){
            if (!BIConfig.FIRELIGHT_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.GLUTTON_FISH.get()){
            if (!BIConfig.GLUTTON_FISH_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.LIFESTEALER.get()){
            if (BIConfig.LIFESTEALER_SPAWNING_ENABLED) {
                if (time < 24000L * BIConfig.DAYS_TILL_LIFESTEALER) {
                    spawnPlacementCheck.setResult(Event.Result.DENY);
                }
            } else {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.MISSIONER.get()){
            if (BIConfig.MISSIONER_SPAWNING_ENABLED) {
                if (time < 24000L * BIConfig.DAYS_TILL_MISSIONER) {
                    spawnPlacementCheck.setResult(Event.Result.DENY);
                }
            } else {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.MOTHER_SPIDER.get()){
            if (!BIConfig.MOTHER_SPIDER_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.MR_PUMPKIN.get()){
            if (!BIConfig.MR_PUMPKIN_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.MRS_PUMPKIN.get()){
            if (!BIConfig.MS_PUMPKIN_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.NIGHTMARE_STALKER.get()){
            if (BIConfig.NIGHTMARE_STALKER_SPAWNING_ENABLED) {
                if (time < 24000L * BIConfig.DAYS_TILL_NIGHTMARE) {
                    spawnPlacementCheck.setResult(Event.Result.DENY);
                }
            } else {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.PHANTOM_CREEPER.get()){
            if (!BIConfig.PHANTOM_CREEPER_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }
        if(entityType == BornInChaosV1ModEntities.PUMPKIN_BRUISER.get()){
            if (!BIConfig.PUMPKIN_BRUISER_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }
        if(entityType == BornInChaosV1ModEntities.PUMPKIN_DUNCE.get()){
            if (!BIConfig.PUMPKIN_DUNCE_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.PUMPKINHEAD.get()){
            if (!BIConfig.PUMPKIN_HEAD_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.RESTLESS_SPIRIT.get()){
            if (!BIConfig.RESTLESS_SPIRIT_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }
        if(entityType == BornInChaosV1ModEntities.SEARED_SPIRIT.get()){
            if (!BIConfig.SEARED_SPIRIT_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SENOR_PUMPKIN.get()){
            if (!BIConfig.SENOR_PUMPKIN_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SIAMESE_SKELETONS.get()){
            if (!BIConfig.SIAMESE_SKELETON_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SIR_PUMPKINHEAD.get()){
            if (!BIConfig.SIR_PUMPKINHEAD_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SKELETON_DEMOMAN.get()){
            if (!BIConfig.SKELETON_DEMOMAN_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SKELETON_THRASHER.get()){
            if (!BIConfig.SKELETON_THRASHER_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SPIRIT_GUIDE.get()){
            if (!BIConfig.SPIRIT_GUIDE_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SPIRITOF_CHAOS.get()){
            if (!BIConfig.SPIRIT_OF_CHAOS_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SUPREME_BONESCALLER.get() || entityType == BornInChaosV1ModEntities.SUPREME_BONESCALLER_NOT_DESPAWN.get() ){
            if (!BIConfig.SUPREME_BONESCALLER_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.SWARMER.get()){
            if (!BIConfig.SWARMER_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.THORNSHELL_CRAB.get()){
            if (!BIConfig.THORNSHELL_CRAB_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.ZOMBIE_BRUISER.get()){
            if (!BIConfig.ZOMBIE_BRUISER_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.ZOMBIE_CLOWN.get()){
            if (!BIConfig.ZOMBIE_CLOWN_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.ZOMBIE_FISHERMAN.get()){
            if (!BIConfig.ZOMBIE_FISHERMAN_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }

        if(entityType == BornInChaosV1ModEntities.ZOMBIE_LUMBERJACK.get()){
            if (!BIConfig.ZOMBIE_LUMBERJACK_SPAWNING_ENABLED) {
                spawnPlacementCheck.setResult(Event.Result.DENY);
            }
        }







    }





}
