package org.borninconfiguration.mixins;

import org.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.procedures.GenerationofInfectedDiamondsProProcedure;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GenerationofInfectedDiamondsProProcedure.class)
public class InfestedDiamonds {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, CallbackInfoReturnable<Boolean> cir) {
        if (!BornInConfiguration.COMMON_CONFIG.INFESTED_DIAMONDS_ENABLED.get()) {
            cir.setReturnValue(false);
        }
    }
}
