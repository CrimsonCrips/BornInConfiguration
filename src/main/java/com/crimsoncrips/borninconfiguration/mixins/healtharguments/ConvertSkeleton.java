package com.crimsoncrips.borninconfiguration.mixins.healtharguments;


import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.DecayingZombiePriObnovlieniiTaktaSushchnostiProcedure;
import net.minecraft.core.BlockPos;
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

import java.util.Objects;

@Mixin(DecayingZombiePriObnovlieniiTaktaSushchnostiProcedure.class)

public abstract class ConvertSkeleton {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        if (entity instanceof LivingEntity livingEntity) {
            if (livingEntity.getHealth() <= 0.33F * livingEntity.getMaxHealth()){
                if (world instanceof ServerLevel serverLevel) {
                    serverLevel.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.SPLASHOFFLESH.get(), x, y + 0.5, z, 15, 0.5, 0.5, 0.5, 0.2);
                    serverLevel.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.FLESHSPLASH.get(), x, y + 1.0, z, 5, 0.3, 0.3, 0.3, 0.1);

                    Entity entityToSpawn = ((EntityType)BornInChaosV1ModEntities.DECREPIT_SKELETON.get()).spawn(serverLevel, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.setYRot(entity.getYRot());
                        entityToSpawn.setYBodyRot(entity.getYRot());
                        entityToSpawn.setYHeadRot(entity.getYRot());
                        entityToSpawn.setXRot(entity.getXRot());
                    }

                    if (!entity.level().isClientSide()) {
                        entity.discard();
                    }

                    ItemEntity entityItem = new ItemEntity(serverLevel, x, y, z, new ItemStack(Items.ROTTEN_FLESH));
                    entityItem.setPickUpDelay(10);

                    if (!serverLevel.isClientSide()) {
                        serverLevel.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break")), SoundSource.NEUTRAL, 0.9F, 0.9F);

                        serverLevel.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stomach_open")), SoundSource.HOSTILE, 0.7F, 1.0F);
                    } else {
                        serverLevel.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break")), SoundSource.NEUTRAL, 0.9F, 0.9F, false);

                        serverLevel.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stomach_open")), SoundSource.HOSTILE, 0.7F, 1.0F, false);
                    }


                }

            }

            if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z))) {
                if (world instanceof Level) {
                    if ( ((Level) world).isDay() && !((Level) world).isRaining() && !((Level) world).isThundering() && !entity.isInWaterRainOrBubble() && !entity.isOnFire() && !((Level) world).isClientSide)
                        entity.setSecondsOnFire(5);

                }

            }

            if (livingEntity.hasEffect(BornInChaosV1ModMobEffects.INFESTATIONOF_FLIES.get())){
                int time = Objects.requireNonNull(livingEntity.getEffect(BornInChaosV1ModMobEffects.INFESTATIONOF_FLIES.get())).getDuration();
                if (time <= 1) {
                    if (world instanceof ServerLevel serverLevel) {
                        serverLevel.sendParticles( BornInChaosV1ModParticleTypes.FLI.get(), x, y + 1.0, z, 14, 0.5, 0.5, 0.5, 0.2);
                        Entity entityToSpawn = ((EntityType) BornInChaosV1ModEntities.SWARMER.get()).spawn(serverLevel, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn == null) {
                            entityToSpawn.setYRot(entity.getYRot());
                            entityToSpawn.setYBodyRot(entity.getYRot());
                            entityToSpawn.setYHeadRot(entity.getYRot());
                            entityToSpawn.setXRot(entity.getXRot());
                        }
                        if (!entity.level().isClientSide()) {
                            entity.discard();
                        }
                    }

                    if (world instanceof Level level) {
                        if (!level.isClientSide()) {
                            level.playSound((Player) null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.converted_to_drowned")), SoundSource.NEUTRAL, 0.8F, 0.9F);
                        } else {
                            level.playLocalSound(x, y, z, (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.converted_to_drowned")), SoundSource.NEUTRAL, 0.8F, 0.9F, false);
                        }
                    }
                }


            }

        }


    }
}
