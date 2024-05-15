package com.crimsoncrips.borninconfiguration.mixins.Generation;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.procedures.MarqueeProgenProcedure;
import net.mcreator.borninchaosv.procedures.MarqueeSpavnProcedure;
import net.mcreator.borninchaosv.procedures.ToverBlocSpavnProcedure;
import net.mcreator.borninchaosv.procedures.ToverSpavnProProcedure;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ToverSpavnProProcedure.class)

public class ObservationTowerGeneration {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world, x, y, z));
    }



    private static boolean doSomething4(LevelAccessor world, double x, double y, double z) {
        return BIConfig.OBSERVATION_TOWER_GENERATION_ENABLED && ToverBlocSpavnProcedure.execute(world, x, y, z);
    }
}
