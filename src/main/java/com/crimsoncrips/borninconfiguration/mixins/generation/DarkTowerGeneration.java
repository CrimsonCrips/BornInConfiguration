package com.crimsoncrips.borninconfiguration.mixins.generation;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.procedures.DarckToverBlocSpavnProcedure;
import net.mcreator.borninchaosv.procedures.DarckToverSpavnProProcedure;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DarckToverSpavnProProcedure.class)

public class DarkTowerGeneration {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world, x, y, z));
    }



    private static boolean doSomething4(LevelAccessor world, double x, double y, double z) {
        return BIConfig.DARK_TOWER_GENERATION_ENABLED && DarckToverBlocSpavnProcedure.execute(world, x, y, z);
    }
}
