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
        if (entity instanceof LivingEntity livingEntity) {
            ci.cancel();
            if (livingEntity.getHealth() <= 0.5F * livingEntity.getMaxHealth()) {
                if (world instanceof ServerLevel serverLevel) {
                    Entity entityToSpawn;
                    entityToSpawn = ((EntityType)BornInChaosV1ModEntities.SIAMESE_SKELETONSRIGHT.get()).spawn(serverLevel, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.setYRot(entity.getYRot());
                        entityToSpawn.setYBodyRot(entity.getYRot());
                        entityToSpawn.setYHeadRot(entity.getYRot());
                        entityToSpawn.setXRot(entity.getXRot());
                    }

                    entityToSpawn = ((EntityType)BornInChaosV1ModEntities.SIAMESE_SKELETONSLEFT.get()).spawn(serverLevel, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.setYRot(entity.getYRot());
                        entityToSpawn.setYBodyRot(entity.getYRot());
                        entityToSpawn.setYHeadRot(entity.getYRot());
                        entityToSpawn.setXRot(entity.getXRot());
                    }

                    serverLevel.sendParticles(ParticleTypes.POOF, x, y, z, 6, 0.2, 0.2, 0.2, 0.1);

                }

                if (!entity.level().isClientSide()) {
                    entity.discard();
                }

                if (world instanceof Level level) {
                    if (!level.isClientSide()) {
                        level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.hurt")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                    } else {
                        level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.hurt")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                    }
                }

            }

            if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z))) {
                if (world instanceof Level level) {
                    if (level.isDay() && !level.isRaining() && !level.isThundering() && !entity.isInWaterRainOrBubble() && !entity.isOnFire() && !((Level) world).isClientSide){
                        entity.setSecondsOnFire(5);
                    }

                }
            }

        }
    }


}
