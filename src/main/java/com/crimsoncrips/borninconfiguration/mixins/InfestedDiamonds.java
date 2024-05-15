package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
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
        cir.setReturnValue(doSomething4());
    }



    private static boolean doSomething4() {
       return BIConfig.INFESTED_DIAMONDS_ENABLED;
    }
}
