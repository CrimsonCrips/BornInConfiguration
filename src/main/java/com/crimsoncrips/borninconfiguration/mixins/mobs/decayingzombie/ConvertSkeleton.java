package com.crimsoncrips.borninconfiguration.mixins.mobs.decayingzombie;


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

@Mixin(DecayingZombiePriObnovlieniiTaktaSushchnostiProcedure.class)

public abstract class ConvertSkeleton {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        if (entity != null) {
            LivingEntity _livEnt20;

            LivingEntity _livEntity = (LivingEntity)entity;
            float var10000 = _livEntity.getHealth();
            float maxHealth = _livEntity.getMaxHealth();

            ServerLevel _level;
            if (var10000 <= 0.33F * maxHealth) {
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.SPLASHOFFLESH.get(), x, y + 0.5, z, 15, 0.5, 0.5, 0.5, 0.2);
                }

                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    _level.sendParticles((SimpleParticleType)BornInChaosV1ModParticleTypes.FLESHSPLASH.get(), x, y + 1.0, z, 5, 0.3, 0.3, 0.3, 0.1);
                }

                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    Entity entityToSpawn = ((EntityType) BornInChaosV1ModEntities.DECREPIT_SKELETON.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
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

                for(int index0 = 0; index0 < 2; ++index0) {
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ROTTEN_FLESH));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }


                if (world instanceof Level) {
                    _level = (ServerLevel) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stomach_open")), SoundSource.HOSTILE, 0.7F, 1.0F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stomach_open")), SoundSource.HOSTILE, 0.7F, 1.0F, false);
                    }
                }

                if (world instanceof Level) {
                    _level = (ServerLevel) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break")), SoundSource.NEUTRAL, 0.9F, 0.9F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break")), SoundSource.NEUTRAL, 0.9F, 0.9F, false);
                    }
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

            if (entity instanceof LivingEntity) {
                _livEnt20 = (LivingEntity)entity;
                if (_livEnt20.hasEffect((MobEffect)BornInChaosV1ModMobEffects.INFESTATIONOF_FLIES.get())) {
                    int var19;
                    label102: {
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)entity;
                            if (_livEnt.hasEffect((MobEffect)BornInChaosV1ModMobEffects.INFESTATIONOF_FLIES.get())) {
                                var19 = _livEnt.getEffect((MobEffect)BornInChaosV1ModMobEffects.INFESTATIONOF_FLIES.get()).getDuration();
                                break label102;
                            }
                        }

                        var19 = 0;
                    }

                    if (var19 <= 20) {
                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            Entity entityToSpawn = ((EntityType)BornInChaosV1ModEntities.SWARMER.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
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

                        if (world instanceof Level) {
                            Level _levels = (Level)world;
                            if (!_levels.isClientSide()) {
                                _levels.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.converted_to_drowned")), SoundSource.NEUTRAL, 0.8F, 0.9F);
                            } else {
                                _levels.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.converted_to_drowned")), SoundSource.NEUTRAL, 0.8F, 0.9F, false);
                            }
                        }

                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.sendParticles((SimpleParticleType)BornInChaosV1ModParticleTypes.FLI.get(), x, y + 1.0, z, 14, 0.5, 0.5, 0.5, 0.2);
                        }
                    }
                }
            }

        }
    }


}
