package org.borninconfiguration.mixins.spawning;


import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.procedures.WarningSoundProcedure;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.bus.api.Event;
import org.borninconfiguration.BornInConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WarningSoundProcedure.class)

public class WarningConfig {

    @Inject(method = "execute(Lnet/neoforged/bus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, Entity entity, CallbackInfo ci) {
       ci.cancel();
        if (entity == null)
            return;
        if (!BornInConfiguration.COMMON_CONFIG.WARNING_SPAWN_ENABLED.get())
            return;
        if (entity instanceof LivingEntity livingEntity) {
            if (BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_SPAWNING_ENABLED.get() && world.dayTime() == BornInConfiguration.COMMON_CONFIG.DAYS_TILL_NIGHTMARE.get() * 24000L) {
                if (!livingEntity.level().isClientSide()) {
                    livingEntity.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.BAD_FEELING, 10, 0, false, false));
                }
            }
            if (BornInConfiguration.COMMON_CONFIG.MISSIONER_SPAWNING_ENABLED.get() && world.dayTime() == BornInConfiguration.COMMON_CONFIG.DAYS_TILL_MISSIONER.get() * 24000L) {
                if (!livingEntity.level().isClientSide()) {
                    livingEntity.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.BAD_FEELING, 10, 0, false, false));
                }
            }

        }


    }
}
