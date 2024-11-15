package com.crimsoncrips.borninconfiguration.mixins.spawning;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.procedures.WarningSoundProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WarningSoundProcedure.class)

public class WarningConfig {

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, Entity entity, CallbackInfo ci) {
       ci.cancel();
        if (entity == null)
            return;
        if (!BIConfig.WARNING_SPAWN_ENABLED)
            return;
        if (entity instanceof LivingEntity livingEntity) {
            if (BIConfig.NIGHTMARE_STALKER_SPAWNING_ENABLED && world.dayTime() == BIConfig.DAYS_TILL_NIGHTMARE * 24000L) {
                if (!livingEntity.level().isClientSide()) {
                    livingEntity.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.BAD_FEELING.get(), 10, 0, false, false));
                }
            }
            if (BIConfig.MISSIONER_SPAWNING_ENABLED && world.dayTime() == BIConfig.DAYS_TILL_MISSIONER * 24000L) {
                if (!livingEntity.level().isClientSide()) {
                    livingEntity.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.BAD_FEELING.get(), 10, 0, false, false));
                }
            }

        }


    }
}
