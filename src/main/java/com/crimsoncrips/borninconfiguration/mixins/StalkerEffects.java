package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.entity.NightmareStalkerEntity;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.NightmareStalkerPriRanieniiSushchnostiProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;

import java.util.Comparator;

@Mixin(NightmareStalkerPriRanieniiSushchnostiProcedure.class)

public abstract class StalkerEffects{

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, CallbackInfo ci) {
        ci.cancel();

        if (entity != null && sourceentity != null) {
            if (BIConfig.NIGHTMARE_STRENGTH_ENABLED && world.dayTime() >= 600000L * BIConfig.DAYS_TILL_NIGHTMARE && entity instanceof LivingEntity livingEntity) {
                if (entity.getPersistentData().getDouble("ragescale") <= (double)7.0F) {
                    if (!livingEntity.hasEffect(BornInChaosV1ModMobEffects.TERRIFYING_PRESENCE.get())) {
                        entity.getPersistentData().putDouble("ragescale", entity.getPersistentData().getDouble("ragescale") + (double) 1.0F);
                    }
                } else {
                    Level level =  livingEntity.level();
                    if (!level.isClientSide) {
                        livingEntity.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.TERRIFYING_PRESENCE.get(), 2000, 0, false, false));
                        livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 6, false, false));

                    }
                    if (world instanceof ServerLevel serverLevel) {
                        serverLevel.sendParticles(BornInChaosV1ModParticleTypes.ROARSPLASH.get(), entity.getX(), entity.getY() + (double)2.0F, entity.getZ(), 3, 0.3, 0.2, 0.3, (double)0.0F);
                    }
                    if (!level.isClientSide) {
                        if (!level.isClientSide()) {
                            level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stalker_roar_distant")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                        } else {
                            level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stalker_roar_distant")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                        }
                    }

                    }
                }

            if (sourceentity instanceof Player player && player.isUnderWater()) {
                if (!player.hasEffect(BornInChaosV1ModMobEffects.GAZE_OF_TERROR.get())){
                    sourceentity.setAirSupply(0);
                }

            }

            if (world.dayTime() >= 240000L && entity.isPassenger()){
                entity.stopRiding();
                if (!world.isClientSide() && world instanceof Level level1){
                    if (!level1.isClientSide()) {
                        level1.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                    } else {
                        level1.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                    }
                }
            }

                Vec3 _center = new Vec3(x, y, z);

                for(Entity entityiterator : world.getEntitiesOfClass(Entity.class, (new AABB(_center, _center)).inflate((double)2.5F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.distanceToSqr(_center))).toList()) {
                    if (entityiterator instanceof Boat || entityiterator instanceof ChestBoat) {
                        if (!entityiterator.level().isClientSide()) {
                            entityiterator.discard();
                        }

                        if (world instanceof ServerLevel serverLevel) {
                            serverLevel.sendParticles(ParticleTypes.CRIT, entityiterator.getX(), entityiterator.getY() + (double)1.0F, entityiterator.getZ(), 5, 0.3, 0.2, 0.3, 0.1);
                        }
                    }
                }


                for(Entity entityiterator : world.getEntitiesOfClass(Entity.class, (new AABB(_center, _center)).inflate((double)7.0F), (e) -> true).stream().sorted(Comparator.comparingDouble((_entcnd) -> _entcnd.distanceToSqr(_center))).toList()) {
                    if (entityiterator instanceof Player player) {
                        if (!player.level().isClientSide()) {
                            player.addEffect(new MobEffectInstance((MobEffect)BornInChaosV1ModMobEffects.CURSEOFTHE_BOAT.get(), 200, 0));
                        }
                    }
                }
            }

    }
}
