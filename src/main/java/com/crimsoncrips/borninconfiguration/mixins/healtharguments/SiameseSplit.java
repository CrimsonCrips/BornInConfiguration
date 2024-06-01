package com.crimsoncrips.borninconfiguration.mixins.healtharguments;


import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.DecayingZombiePriObnovlieniiTaktaSushchnostiProcedure;
import net.mcreator.borninchaosv.procedures.SiameseskeletonsticProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SiameseskeletonsticProcedure.class)

public abstract class SiameseSplit {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        if (entity != null) {
            LivingEntity _livEntity = (LivingEntity)entity;
            float var10000 = _livEntity.getHealth();
            float maxHealth = _livEntity.getMaxHealth();

            if (var10000 <= 0.5F * maxHealth) {
                ServerLevel _level;
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.sendParticles(ParticleTypes.POOF, x, y, z, 6, 0.2, 0.2, 0.2, 0.1);
                }

                if (world instanceof Level) {
                    Level s_level = (Level)world;
                    if (!s_level.isClientSide()) {
                        s_level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.hurt")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                    } else {
                        s_level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.hurt")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                    }
                }

                Entity entityToSpawn;
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    entityToSpawn = ((EntityType)BornInChaosV1ModEntities.SIAMESE_SKELETONSRIGHT.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.setYRot(entity.getYRot());
                        entityToSpawn.setYBodyRot(entity.getYRot());
                        entityToSpawn.setYHeadRot(entity.getYRot());
                        entityToSpawn.setXRot(entity.getXRot());
                    }
                }

                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    entityToSpawn = ((EntityType)BornInChaosV1ModEntities.SIAMESE_SKELETONSLEFT.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.setYRot(entity.getYRot());
                        entityToSpawn.setYBodyRot(entity.getYRot());
                        entityToSpawn.setYHeadRot(entity.getYRot());
                        entityToSpawn.setXRot(entity.getXRot());
                    }
                }

                if (!entity.level().isClientSide()) {
                    entity.discard();
                }
            }

            if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z))) {
                if (world instanceof Level) {
                    Level _lvl11 = (Level)world;
                    if (_lvl11.isDay() && !world.getLevelData().isRaining() && !world.getLevelData().isThundering() && !entity.isInWaterRainOrBubble() && !entity.isOnFire() && !world.isClientSide()) {
                        entity.setSecondsOnFire(5);
                    }
                }

                if (entity.isInWaterRainOrBubble()) {
                    entity.clearFire();
                }
            }

        }
    }


}
