package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.entity.NightmareStalkerEntity;
import net.mcreator.borninchaosv.init.BornInChaosV1ModItems;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.NightmareMantleoftheNightKazhdyiTikDliaNaghrudnikaProcedure;
import net.mcreator.borninchaosv.procedures.NightmareScytheKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure;
import net.mcreator.borninchaosv.procedures.NightmareStalkerPriRanieniiSushchnostiProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Comparator;

@Mixin(NightmareScytheKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure.class)

public abstract class StalkerDamageEffects {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Entity entity, Entity sourceentity, CallbackInfo ci) {
        ci.cancel();

        if (entity != null && sourceentity != null) {
            ItemStack var10000;
            if (sourceentity instanceof LivingEntity livingEntity) {
                var10000 = livingEntity.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == BornInChaosV1ModItems.NIGHTMARE_MANTLEOFTHE_NIGHT_HELMET.get()) {
                if (sourceentity instanceof LivingEntity livingEntity) {
                    var10000 = livingEntity.getItemBySlot(EquipmentSlot.LEGS);
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                if (var10000.getItem() == BornInChaosV1ModItems.NIGHTMARE_MANTLEOFTHE_NIGHT_LEGGINGS.get()) {
                    if (sourceentity instanceof LivingEntity livingEntity) {
                        var10000 = livingEntity.getItemBySlot(EquipmentSlot.CHEST);
                    } else {
                        var10000 = ItemStack.EMPTY;
                    }

                    if (var10000.getItem() == BornInChaosV1ModItems.NIGHTMARE_MANTLEOFTHE_NIGHT_CHESTPLATE.get()) {
                        if (sourceentity instanceof LivingEntity livingEntity) {
                            var10000 = livingEntity.getItemBySlot(EquipmentSlot.FEET);
                        } else {
                            var10000 = ItemStack.EMPTY;
                        }

                        if (var10000.getItem() == BornInChaosV1ModItems.NIGHTMARE_MANTLEOFTHE_NIGHT_BOOTS.get()) {
                            if (entity instanceof LivingEntity livingEntity) {
                                if (!livingEntity.level().isClientSide() && BIConfig.NIGHTMARE_EFFECTS_ENABLED) {
                                    livingEntity.addEffect(new MobEffectInstance((MobEffect)BornInChaosV1ModMobEffects.GAZE_OF_TERROR.get(), 250, 0));
                                    livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 2));
                                    livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40, 2, false, false));
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }

            if (entity instanceof LivingEntity livingEntity && BIConfig.NIGHTMARE_EFFECTS_ENABLED) {
                if (!livingEntity.level().isClientSide()) {
                    livingEntity.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.GAZE_OF_TERROR.get(), 100, 0));
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1));
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 2, false, false));

                }
            }
        }
    }
}
