package com.crimsoncrips.borninconfiguration.mixins.generation;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.procedures.MiniFirewellBlockSpavnProcedure;
import net.mcreator.borninchaosv.procedures.MiniFirewellSpavnProProcedure;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MiniFirewellSpavnProProcedure.class)

public class FarmGeneration {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world, x, y, z));
    }



    private static boolean doSomething4(LevelAccessor world, double x, double y, double z) {
        return BIConfig.FARM_GENERATION_ENABLED && MiniFirewellBlockSpavnProcedure.execute(world, x, y, z);
    }
}
