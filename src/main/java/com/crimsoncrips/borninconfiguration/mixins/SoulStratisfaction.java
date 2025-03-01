package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.SoulStratificationKazhdyiTikVoVriemiaEffiektaProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SoulStratificationKazhdyiTikVoVriemiaEffiektaProcedure.class)

public class SoulStratisfaction {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel(); // prevent the original method from running

        if (entity != null) {
            if (BornInConfiguration.COMMON_CONFIG.SOUL_STRATIFICATION_EFFECT_ENABLED.get()) {
                LivingEntity _livEnt;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity) entity;
                    if (!_livEnt.level().isClientSide()) {
                        _livEnt.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, false, false));
                    }
                }

                int var10000;
                label192:
                {
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity) entity;
                        if (_livEnt.hasEffect((MobEffect) BornInChaosV1ModMobEffects.SOUL_STRATIFICATION.get())) {
                            var10000 = _livEnt.getEffect((MobEffect) BornInChaosV1ModMobEffects.SOUL_STRATIFICATION.get()).getDuration();
                            break label192;
                        }
                    }

                    var10000 = 0;
                }

                if (var10000 <= 40) {
                    LivingEntity _livEnt8;
                    if (entity instanceof LivingEntity) {
                        _livEnt8 = (LivingEntity) entity;
                        _livEnt8.removeEffect((MobEffect) BornInChaosV1ModMobEffects.SOUL_STRATIFICATION.get());
                    }

                    if (!world.isClientSide()) {
                        float var19;
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity) entity;
                            var19 = _livEnt.getHealth();
                        } else {
                            var19 = -1.0F;
                        }

                        if (!(var19 <= 4.0F)) {
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt7 = (LivingEntity) entity;
                                var19 = _livEnt7.getHealth();
                            } else {
                                var19 = -1.0F;
                            }

                            ServerLevel _level;
                            LivingEntity _entity;
                            if (var19 < 20.0F) {
                                entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 3.0F);
                                if (world instanceof Level) {
                                    _level = (ServerLevel) world;
                                    if (!_level.isClientSide()) {
                                        _level.playSound((Player) null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F);
                                    } else {
                                        _level.playLocalSound(x, y, z, (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F, false);
                                    }
                                }

                                if (world instanceof ServerLevel) {
                                    _level = (ServerLevel) world;
                                    _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.ANIM_FIRE.get(), x, y, z, 9, 0.8, 1.0, 0.8, 0.3);
                                }

                                if (world instanceof ServerLevel) {
                                    _level = (ServerLevel) world;
                                    _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.SOUL_SLASH.get(), x, y + 1.0, z, 1, 0.1, 0.1, 0.1, 0.1);
                                }

                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity) entity;
                                    _entity.removeAllEffects();
                                }
                            } else {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt4 = (LivingEntity) entity;
                                    var19 = _livEnt4.getHealth();
                                } else {
                                    var19 = -1.0F;
                                }

                                if (var19 >= 20.0F) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt4 = (LivingEntity) entity;
                                        var19 = _livEnt4.getHealth();
                                    } else {
                                        var19 = -1.0F;
                                    }

                                    if (var19 < 30.0F) {
                                        entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 6.0F);
                                        if (world instanceof Level) {
                                            _level = (ServerLevel) world;
                                            if (!_level.isClientSide()) {
                                                _level.playSound((Player) null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F);
                                            } else {
                                                _level.playLocalSound(x, y, z, (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F, false);
                                            }
                                        }

                                        if (entity instanceof LivingEntity) {
                                            _entity = (LivingEntity) entity;
                                            _entity.removeAllEffects();
                                        }

                                        if (world instanceof ServerLevel) {
                                            _level = (ServerLevel) world;
                                            _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.ANIM_FIRE.get(), x, y, z, 9, 0.8, 1.0, 0.8, 0.3);
                                        }

                                        if (world instanceof ServerLevel) {
                                            _level = (ServerLevel) world;
                                            _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.SOUL_SLASH.get(), x, y + 1.0, z, 1, 0.1, 0.1, 0.1, 0.1);
                                        }

                                        return;
                                    }
                                }

                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt3 = (LivingEntity) entity;
                                    var19 = _livEnt3.getHealth();
                                } else {
                                    var19 = -1.0F;
                                }

                                if (var19 >= 30.0F) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt3 = (LivingEntity) entity;
                                        var19 = _livEnt3.getHealth();
                                    } else {
                                        var19 = -1.0F;
                                    }

                                    if (var19 < 50.0F) {
                                        entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 10.0F);
                                        if (world instanceof Level) {
                                            _level = (ServerLevel) world;
                                            if (!_level.isClientSide()) {
                                                _level.playSound((Player) null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F);
                                            } else {
                                                _level.playLocalSound(x, y, z, (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F, false);
                                            }
                                        }

                                        if (entity instanceof LivingEntity) {
                                            _entity = (LivingEntity) entity;
                                            _entity.removeAllEffects();
                                        }

                                        if (world instanceof ServerLevel) {
                                            _level = (ServerLevel) world;
                                            _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.ANIM_FIRE.get(), x, y, z, 9, 0.8, 1.0, 0.8, 0.3);
                                        }

                                        if (world instanceof ServerLevel) {
                                            _level = (ServerLevel) world;
                                            _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.SOUL_SLASH.get(), x, y + 1.0, z, 1, 0.1, 0.1, 0.1, 0.1);
                                        }

                                        return;
                                    }
                                }

                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = (LivingEntity) entity;
                                    var19 = _livEnt2.getHealth();
                                } else {
                                    var19 = -1.0F;
                                }

                                if (var19 >= 50.0F) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt2 = (LivingEntity) entity;
                                        var19 = _livEnt2.getHealth();
                                    } else {
                                        var19 = -1.0F;
                                    }

                                    if (var19 < 100.0F) {
                                        entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 20.0F);
                                        if (world instanceof Level) {
                                            _level = (ServerLevel) world;
                                            if (!_level.isClientSide()) {
                                                _level.playSound((Player) null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F);
                                            } else {
                                                _level.playLocalSound(x, y, z, (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F, false);
                                            }
                                        }

                                        if (entity instanceof LivingEntity) {
                                            _entity = (LivingEntity) entity;
                                            _entity.removeAllEffects();
                                        }

                                        if (world instanceof ServerLevel) {
                                            _level = (ServerLevel) world;
                                            _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.ANIM_FIRE.get(), x, y, z, 9, 0.8, 1.0, 0.8, 0.3);
                                        }

                                        if (world instanceof ServerLevel) {
                                            _level = (ServerLevel) world;
                                            _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.SOUL_SLASH.get(), x, y + 1.0, z, 1, 0.1, 0.1, 0.1, 0.1);
                                        }

                                        return;
                                    }
                                }

                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt1 = (LivingEntity) entity;
                                    var19 = _livEnt1.getHealth();
                                } else {
                                    var19 = -1.0F;
                                }

                                if (var19 >= 100.0F) {
                                    entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 35.0F);
                                    if (world instanceof Level) {
                                        _level = (ServerLevel) world;
                                        if (!_level.isClientSide()) {
                                            _level.playSound((Player) null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F);
                                        } else {
                                            _level.playLocalSound(x, y, z, (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.NEUTRAL, 0.8F, 0.6F, false);
                                        }
                                    }

                                    if (entity instanceof LivingEntity) {
                                        _entity = (LivingEntity) entity;
                                        _entity.removeAllEffects();
                                    }

                                    if (world instanceof ServerLevel) {
                                        _level = (ServerLevel) world;
                                        _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.ANIM_FIRE.get(), x, y, z, 9, 0.8, 1.0, 0.8, 0.3);
                                    }

                                    if (world instanceof ServerLevel) {
                                        _level = (ServerLevel) world;
                                        _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.SOUL_SLASH.get(), x, y + 1.0, z, 1, 0.1, 0.1, 0.1, 0.1);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }


}
