package com.crimsoncrips.borninconfiguration.mixins.healtharguments;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.entity.SkeletonDemomanEntity;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.procedures.SkeletonBombKoghdaSushchnostRanienaProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SkeletonBombKoghdaSushchnostRanienaProcedure.class)

public abstract class Kamikaze{

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        if (entity != null) {
            float var10000;
            float maxHealth;

            LivingEntity _livEnt = (LivingEntity)entity;
            var10000 = _livEnt.getHealth();
            maxHealth = _livEnt.getMaxHealth();

            if (var10000 <= 0.60F * maxHealth) {
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt1 = (LivingEntity)entity;
                    if (_livEnt1.hasEffect((MobEffect) BornInChaosV1ModMobEffects.DETONATION.get())) {
                        return;
                    }
                }

                LivingEntity _livEnt4;
                if (entity instanceof LivingEntity) {
                    _livEnt4 = (LivingEntity)entity;
                    if (!_livEnt4.level().isClientSide()) {
                        _livEnt4.addEffect(new MobEffectInstance((MobEffect)BornInChaosV1ModMobEffects.DETONATION.get(), 80, 0, false, false));
                    }
                }

                if (entity instanceof LivingEntity) {
                    _livEnt4 = (LivingEntity)entity;
                    if (!_livEnt4.level().isClientSide()) {
                        _livEnt4.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 5, false, false));
                    }
                }

                if (entity instanceof LivingEntity) {
                    _livEnt4 = (LivingEntity)entity;
                    if (_livEnt4.hasEffect((MobEffect)BornInChaosV1ModMobEffects.DETONATION.get()) && world instanceof Level) {
                        Level _level = (Level)world;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                        } else {
                            _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                        }
                    }
                }
            }

        }
    }


}
