package org.borninconfiguration.mixins;

import org.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.procedures.SpiritGonProcedure;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SpiritGonProcedure.class)
public class SpiritsDissapearInSun {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        if (!BornInConfiguration.COMMON_CONFIG.SPIRIT_DISSAPPEAR_IN_SUN_ENABLED.get()) {
            ci.cancel();
        }
    }
}
