package org.borninconfiguration.event;


import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.living.FinalizeSpawnEvent;
import net.neoforged.neoforge.event.entity.living.MobSpawnEvent;
import org.borninconfiguration.BornInConfiguration;
import org.borninconfiguration.utils.EntityUtils;
import net.mcreator.borninchaosv.entity.*;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.minecraft.core.Holder;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.level.biome.Biome;


public class BICEvent {

    @SubscribeEvent
    public void onMobSpawn(FinalizeSpawnEvent event) {
        Mob spawningEntity = event.getEntity();
        if (spawningEntity instanceof BabySkeletonEntity || spawningEntity instanceof BabySkeletonMinionEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_SPEED.get());

            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_KNOCKBACK_RESISTANCE.get());

            if (!BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_SPAWNING_ENABLED.get()) {
                event.setSpawnCancelled(true);
            }

        }
        if (spawningEntity instanceof BabySpiderEntity || spawningEntity instanceof BabySpiderControlledEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.BABY_SPIDER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.BABY_SPIDER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.BABY_SPIDER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.BABY_SPIDER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.BABY_SPIDER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.BABY_SPIDER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.BABY_SPIDER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof BarrelZombieEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BARREL_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BARREL_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.ZOMBIE_BARREL_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BARREL_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BARREL_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BARREL_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BARREL_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof BloodyGadflyEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.BLOODY_GADFLY_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.BLOODY_GADFLY_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.BLOODY_GADFLY_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.BLOODY_GADFLY_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.BLOODY_GADFLY_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.BLOODY_GADFLY_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.BLOODY_GADFLY_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof BoneImpEntity || spawningEntity instanceof BoneImpMinionEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.BONE_IMP_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.BONE_IMP_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.BONE_IMP_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.BONE_IMP_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.BONE_IMP_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.BONE_IMP_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.BONE_IMP_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof BonescallerEntity || spawningEntity instanceof BonescallerNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.BONES_CALLER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.BONES_CALLER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.BONES_CALLER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.BONES_CALLER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.BONES_CALLER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.BONES_CALLER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.BONES_CALLER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof ControlledBabySkeletonEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.CONTROLLED_BABY_SKELETON_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.CONTROLLED_BABY_SKELETON_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.CONTROLLED_BABY_SKELETON_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.CONTROLLED_BABY_SKELETON_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.CONTROLLED_BABY_SKELETON_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.CONTROLLED_BABY_SKELETON_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.CONTROLLED_BABY_SKELETON_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof ControlledSpiritualAssistantEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.CONTROLLED_SPIRITUAL_ASSISTANT_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof CorpseFishEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.CORPSE_FISH_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.CORPSE_FISH_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.CORPSE_FISH_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.CORPSE_FISH_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.CORPSE_FISH_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.CORPSE_FISH_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.CORPSE_FISH_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof CorpseFlyEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.CORPSE_FLY_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.CORPSE_FLY_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.CORPSE_FLY_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.CORPSE_FLY_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.CORPSE_FLY_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.CORPSE_FLY_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.CORPSE_FLY_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof DarkVortexEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.DARK_VORTEX_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.DARK_VORTEX_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.DARK_VORTEX_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.DARK_VORTEX_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.DARK_VORTEX_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.DARK_VORTEX_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.DARK_VORTEX_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof DireHoundLeaderEntity){
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.DIRE_HOUND_LEADER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.DIRE_HOUND_LEADER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.DIRE_HOUND_LEADER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.DIRE_HOUND_LEADER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.DIRE_HOUND_LEADER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.DIRE_HOUND_LEADER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.DIRE_HOUND_LEADER_KNOCKBACK_RESISTANCE.get());

        }
        if (spawningEntity instanceof DecayingZombieEntity || spawningEntity instanceof DecayingZombieNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_KNOCKBACK_RESISTANCE.get());

        }
        if (spawningEntity instanceof DecrepitSkeletonEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.DECREPIT_SKELETON_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.DECREPIT_SKELETON_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.DECREPIT_SKELETON_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.DECREPIT_SKELETON_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.DECREPIT_SKELETON_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.DECREPIT_SKELETON_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_KNOCKBACK_RESISTANCE.get());

        }
        if (spawningEntity instanceof DiamondThermiteEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.DIAMOND_TERMITE_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.DIAMOND_TERMITE_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.DIAMOND_TERMITE_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.DIAMOND_TERMITE_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.DIAMOND_TERMITE_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.DIAMOND_TERMITE_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.DIAMOND_TERMITE_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof DoorKnightEntity || spawningEntity instanceof DoorKnightNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.DOOR_KNIGHT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.DOOR_KNIGHT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.DOOR_KNIGHT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.DOOR_KNIGHT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.DOOR_KNIGHT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.DOOR_KNIGHT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.DOOR_KNIGHT_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof DreadHoundEntity || spawningEntity instanceof DreadHoundNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.DREAD_HOUND_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.DREAD_HOUND_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.DREAD_HOUND_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.DREAD_HOUND_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.DREAD_HOUND_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.DREAD_HOUND_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.DREAD_HOUND_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof FallenChaosKnightEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof FelsteedEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
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
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.FELSTEED_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.FELSTEED_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.FELSTEED_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.FELSTEED_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.FELSTEED_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.FELSTEED_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.FELSTEED_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof RidingFelsteedEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.FELSTEED_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.FELSTEED_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.FELSTEED_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.FELSTEED_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.FELSTEED_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.FELSTEED_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.FELSTEED_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof FirelightEntity || spawningEntity instanceof FirelightNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.FIRELIGHT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.FIRELIGHT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.FIRELIGHT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.FIRELIGHT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.FIRELIGHT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.FIRELIGHT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.FIRELIGHT_KNOCKBACK_RESISTANCE.get());

        }
        if (spawningEntity instanceof GluttonFishEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.GLUTTON_FISH_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.GLUTTON_FISH_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.GLUTTON_FISH_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.GLUTTON_FISH_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.GLUTTON_FISH_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.GLUTTON_FISH_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.GLUTTON_FISH_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof InfernalSpiritEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.INFERNAL_SPIRIT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.INFERNAL_SPIRIT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.INFERNAL_SPIRIT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.INFERNAL_SPIRIT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.INFERNAL_SPIRIT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.INFERNAL_SPIRIT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.INFERNAL_SPIRIT_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof LifestealerEntity || spawningEntity instanceof LifestealerTrueFormEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.LIFESTEALER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.LIFESTEALER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.LIFESTEALER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.LIFESTEALER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.LIFESTEALER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.LIFESTEALER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.LIFESTEALER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof LordPumpkinheadEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof LordPumpkinheadHeadEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEAD_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEAD_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEAD_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEAD_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEAD_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HEAD_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof LordPumpkinheadWithoutaHorseEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HORSELESS_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HORSELESS_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HORSELESS_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HORSELESS_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HORSELESS_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.LORD_PUMPKIN_HEAD_HORSELESS_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof LordTheHeadlessEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof LordsFelsteedEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
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
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.LORD_HEADLESS_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof MaggotEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.MAGGOT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.MAGGOT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.MAGGOT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.MAGGOT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.MAGGOT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.MAGGOT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.MAGGOT_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof MissionerEntity || spawningEntity instanceof MissionaryRaiderEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.MISSIONER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.MISSIONER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.MISSIONER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.MISSIONER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.MISSIONER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.MISSIONER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.MISSIONER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof MotherSpiderEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.MOTHER_SPIDER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.MOTHER_SPIDER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.MOTHER_SPIDER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.MOTHER_SPIDER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.MOTHER_SPIDER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.MOTHER_SPIDER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.MOTHER_SPIDER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof MrPumpkinEntity || spawningEntity instanceof MrPumpkinControlledEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.FLYING_SPEED, BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_FLYING_SPEED.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof MrsPumpkinEntity ) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.FLYING_SPEED, BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_FLYING_SPEED.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof NightmareStalkerEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof PhantomCreeperCopyEntity || spawningEntity instanceof PhantomCreeperEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.PHANTOM_CREEPER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.PHANTOM_CREEPER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.PHANTOM_CREEPER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.PHANTOM_CREEPER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.PHANTOM_CREEPER_DAMAGE.get());
        }
        if (spawningEntity instanceof PumpkinBruiserEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.PUMPKIN_BRUISER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.PUMPKIN_BRUISER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.PUMPKIN_BRUISER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.PUMPKIN_BRUISER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.PUMPKIN_BRUISER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.PUMPKIN_BRUISER_DAMAGE.get());
        }
        if (spawningEntity instanceof PumpkinDunceEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.PUMPKIN_DUNCE_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.PUMPKIN_DUNCE_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.PUMPKIN_DUNCE_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.PUMPKIN_DUNCE_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.PUMPKIN_DUNCE_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.PUMPKIN_DUNCE_DAMAGE.get());
        }
        if (spawningEntity instanceof PumpkinSpiritEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.PUMPKIN_SPIRIT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.PUMPKIN_SPIRIT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.PUMPKIN_SPIRIT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.PUMPKIN_SPIRIT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.PUMPKIN_SPIRIT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.PUMPKIN_SPIRIT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.PUMPKIN_SPIRIT_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof PumpkinheadEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.PUMPKIN_HEAD_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.PUMPKIN_HEAD_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.PUMPKIN_HEAD_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.PUMPKIN_HEAD_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.PUMPKIN_HEAD_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.PUMPKIN_HEAD_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.PUMPKIN_HEAD_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof RestlessSpiritEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_KNOCKBACK_RESISTANCE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.FLYING_SPEED, BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_FLYING_SPEED.get());
        }
        if (spawningEntity instanceof RidingLordsFelsteedEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.RIDEABLE_LORD_FELSTEED_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.RIDEABLE_LORD_FELSTEED_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.RIDEABLE_LORD_FELSTEED_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.RIDEABLE_LORD_FELSTEED_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.RIDEABLE_LORD_FELSTEED_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.RIDEABLE_LORD_FELSTEED_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.RIDEABLE_LORD_FELSTEED_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof ScarletPersecutorEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SCARLET_PROSECUTER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SCARLET_PROSECUTER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SCARLET_PROSECUTER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SCARLET_PROSECUTER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SCARLET_PROSECUTER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SCARLET_PROSECUTER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SCARLET_PROSECUTER_KNOCKBACK_RESISTANCE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.FLYING_SPEED, BornInConfiguration.COMMON_CONFIG.SCARLET_PROSECUTER_FLYING_SPEED.get());
        }
        if (spawningEntity instanceof SearedSpiritEntity || spawningEntity instanceof SearedSpiritNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SEARED_SPIRIT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SEARED_SPIRIT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SEARED_SPIRIT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SEARED_SPIRIT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SEARED_SPIRIT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SEARED_SPIRIT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SEARED_SPIRIT_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SenorPumpkinEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SENOR_PUMPKIN_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SENOR_PUMPKIN_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SENOR_PUMPKIN_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SENOR_PUMPKIN_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SENOR_PUMPKIN_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SENOR_PUMPKIN_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SENOR_PUMPKIN_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SiameseSkeletonsEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SiameseSkeletonsleftEntity || spawningEntity instanceof SiameseSkeletonsrightEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_HEALTH.get() / 2);
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_KNOCKBACK_RESISTANCE.get());

        }
        if (spawningEntity instanceof SirPumpkinheadEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SirPumpkinheadWithoutHorseEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HORSELESS_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HORSELESS_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HORSELESS_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HORSELESS_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HORSELESS_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HORSELESS_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SirTheHeadlessEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEADLESS_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEADLESS_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEADLESS_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEADLESS_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEADLESS_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_HEADLESS_KNOCKBACK_RESISTANCE.get());
        }

        if (spawningEntity instanceof SkeletonDemomanEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SKELETON_DEMOMAN_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SKELETON_DEMOMAN_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SKELETON_DEMOMAN_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SKELETON_DEMOMAN_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SKELETON_DEMOMAN_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SKELETON_DEMOMAN_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SKELETON_DEMOMAN_KNOCKBACK_RESISTANCE.get());

        }
        if (spawningEntity instanceof SkeletonThrasherEntity || spawningEntity instanceof SkeletonThrasherNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SKELETON_THRASHER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SKELETON_THRASHER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SKELETON_THRASHER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SKELETON_THRASHER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SKELETON_THRASHER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SKELETON_THRASHER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SKELETON_THRASHER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SpiritGuideEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SpiritGuideAssistantEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SpiritofChaosEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SPIRIT_OF_CHAOS_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SPIRIT_OF_CHAOS_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SPIRIT_OF_CHAOS_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SPIRIT_OF_CHAOS_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SPIRIT_OF_CHAOS_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SPIRIT_OF_CHAOS_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SPIRIT_OF_CHAOS_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SupremeBonescallerEntity || spawningEntity instanceof SupremeBonescallerNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SupremeBonescallerStage2Entity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_PHASE_2_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_PHASE_2_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_PHASE_2_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_PHASE_2_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_PHASE_2_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_PHASE_2_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_PHASE_2_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof SpiritGuideAssistantEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_ASSISTANT_KNOCKBACK_RESISTANCE.get());

        }
        if (spawningEntity instanceof SwarmerEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.SWARMER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.SWARMER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.SWARMER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.SWARMER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.SWARMER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.SWARMER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.SWARMER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof ThornshellCrabEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.THORNSHELL_CRAB_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.THORNSHELL_CRAB_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.THORNSHELL_CRAB_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.THORNSHELL_CRAB_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.THORNSHELL_CRAB_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.THORNSHELL_CRAB_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.THORNSHELL_CRAB_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof ZombieBruiserEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BRUISER_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BRUISER_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.ZOMBIE_BRUISER_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BRUISER_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BRUISER_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BRUISER_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_BRUISER_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof ZombieClownEntity || spawningEntity instanceof ZombieClownNotDespawnEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.ZOMBIE_CLOWN_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.ZOMBIE_CLOWN_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.ZOMBIE_CLOWN_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.ZOMBIE_CLOWN_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_CLOWN_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.ZOMBIE_CLOWN_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_CLOWN_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof ZombieFishermanEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.ZOMBIE_FISHERMAN_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.ZOMBIE_FISHERMAN_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.ZOMBIE_FISHERMAN_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.ZOMBIE_FISHERMAN_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_FISHERMAN_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.ZOMBIE_FISHERMAN_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_FISHERMAN_KNOCKBACK_RESISTANCE.get());
        }
        if (spawningEntity instanceof ZombieLumberjackEntity) {
            if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get()){
                spawningEntity.targetSelector.addGoal(1, new HurtByTargetGoal((PathfinderMob) spawningEntity));
            }
            EntityUtils.setAttribute(spawningEntity, Attributes.MOVEMENT_SPEED, BornInConfiguration.COMMON_CONFIG.ZOMBIE_LUMBERJACK_SPEED.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.MAX_HEALTH, BornInConfiguration.COMMON_CONFIG.ZOMBIE_LUMBERJACK_HEALTH.get());
            setHealth(spawningEntity,BornInConfiguration.COMMON_CONFIG.ZOMBIE_LUMBERJACK_HEALTH.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ARMOR, BornInConfiguration.COMMON_CONFIG.ZOMBIE_LUMBERJACK_ARMOR.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_DAMAGE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_LUMBERJACK_DAMAGE.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.ATTACK_KNOCKBACK, BornInConfiguration.COMMON_CONFIG.ZOMBIE_LUMBERJACK_KNOCKBACK.get());
            EntityUtils.setAttribute(spawningEntity, Attributes.KNOCKBACK_RESISTANCE, BornInConfiguration.COMMON_CONFIG.ZOMBIE_LUMBERJACK_KNOCKBACK_RESISTANCE.get());

        }
    }


//    @SubscribeEvent
//    public void mobSpawn(MobSpawnEvent.PositionCheck spawnPlacementCheck){
//        EntityType<?> entityType = spawnPlacementCheck.getEntity().getType();
//        Holder<Biome> biome = spawnPlacementCheck.getLevel().getBiome(spawnPlacementCheck.getEntity().blockPosition());
//        long time = spawnPlacementCheck.getLevel().dayTime();
//
//        if(entityType == BornInChaosV1ModEntities.BABY_SKELETON.get() || entityType == BornInChaosV1ModEntities.BABY_SKELETON_MINION.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.BABY_SKELETON_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.BABY_SPIDER.get() || entityType == BornInChaosV1ModEntities.BABY_SPIDER_CONTROLLED.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.BABY_SPIDER_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.BARREL_ZOMBIE.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.ZOMBIE_BARREL_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.BLOODY_GADFLY.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.BLOODY_GADFLY_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.BONE_IMP.get() || entityType == BornInChaosV1ModEntities.BONE_IMP_MINION.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.BONE_IMP_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.BONESCALLER.get() || entityType == BornInChaosV1ModEntities.BONESCALLER_NOT_DESPAWN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.BONE_IMP_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.CORPSE_FISH.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.CORPSE_FISH_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.CORPSE_FLY.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.CORPSE_FLY_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.DARK_VORTEX.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.DARK_VORTEX_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.DECAYING_ZOMBIE.get() || entityType == BornInChaosV1ModEntities.DECAYING_ZOMBIE_NOT_DESPAWN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.DECAYING_ZOMBIE_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.DECREPIT_SKELETON.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.DECREPIT_SKELETON_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.DIRE_HOUND_LEADER.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.DIRE_HOUND_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.DOOR_KNIGHT.get() || entityType == BornInChaosV1ModEntities.DOOR_KNIGHT_NOT_DESPAWN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.DOOR_KNIGHT_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.DREAD_HOUND.get()  || entityType == BornInChaosV1ModEntities.DREAD_HOUND_NOT_DESPAWN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.DREAD_HOUND_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.FALLEN_CHAOS_KNIGHT.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.FIRELIGHT.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.FIRELIGHT_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.GLUTTON_FISH.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.GLUTTON_FISH_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.KRAMPUS_HENCHMAN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.KRAMPUS_HENCHMAN_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.KRAMPUS.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.KRAMPUS_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.LIFESTEALER.get()){
//            if (BornInConfiguration.COMMON_CONFIG.LIFESTEALER_SPAWNING_ENABLED.get()) {
//                if (time < 24000L * BornInConfiguration.COMMON_CONFIG.DAYS_TILL_LIFESTEALER.get()) {
//                    spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//                }
//            } else {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.MISSIONER.get() || entityType == BornInChaosV1ModEntities.MISSIONARY_RAIDER.get()){
//            if (BornInConfiguration.COMMON_CONFIG.MISSIONER_SPAWNING_ENABLED.get()) {
//                if (time < 24000L * BornInConfiguration.COMMON_CONFIG.DAYS_TILL_MISSIONER.get()) {
//                    spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//                }
//            } else {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.MOTHER_SPIDER.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.MOTHER_SPIDER_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.MR_PUMPKIN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.MR_PUMPKIN_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.MRS_PUMPKIN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.MS_PUMPKIN_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.NIGHTMARE_STALKER.get()){
//            if (BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_SPAWNING_ENABLED.get()) {
//                if (time < 24000L * BornInConfiguration.COMMON_CONFIG.DAYS_TILL_NIGHTMARE.get()) {
//                    spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//                }
//            } else {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.PHANTOM_CREEPER.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.PHANTOM_CREEPER_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//        if(entityType == BornInChaosV1ModEntities.PUMPKIN_BRUISER.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.PUMPKIN_BRUISER_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//        if(entityType == BornInChaosV1ModEntities.PUMPKIN_DUNCE.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.PUMPKIN_DUNCE_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.PUMPKINHEAD.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.PUMPKIN_HEAD_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.RESTLESS_SPIRIT.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.RESTLESS_SPIRIT_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//        if(entityType == BornInChaosV1ModEntities.SEARED_SPIRIT.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SEARED_SPIRIT_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SENOR_PUMPKIN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SENOR_PUMPKIN_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SIAMESE_SKELETONS.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SIAMESE_SKELETON_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SIR_PUMPKINHEAD.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SIR_PUMPKINHEAD_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SKELETON_DEMOMAN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SKELETON_DEMOMAN_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SKELETON_THRASHER.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SKELETON_THRASHER_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SPIRIT_GUIDE.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SPIRIT_GUIDE_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SPIRITOF_CHAOS.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SPIRIT_OF_CHAOS_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SUPREME_BONESCALLER.get() || entityType == BornInChaosV1ModEntities.SUPREME_BONESCALLER_NOT_DESPAWN.get() ){
//            if (!BornInConfiguration.COMMON_CONFIG.SUPREME_BONESCALLER_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.SWARMER.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.SWARMER_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.THORNSHELL_CRAB.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.THORNSHELL_CRAB_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.ZOMBIE_BRUISER.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.ZOMBIE_BRUISER_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.ZOMBIE_CLOWN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.ZOMBIE_CLOWN_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.ZOMBIE_FISHERMAN.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.ZOMBIE_FISHERMAN_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//        if(entityType == BornInChaosV1ModEntities.ZOMBIE_LUMBERJACK.get()){
//            if (!BornInConfiguration.COMMON_CONFIG.ZOMBIE_LUMBERJACK_SPAWNING_ENABLED.get()) {
//                spawnPlacementCheck.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
//            }
//        }
//
//
//
//
//
//
//
//    }

    public void setHealth(LivingEntity living,double pHealth) {
        living.setHealth((float)pHealth);
    }





}