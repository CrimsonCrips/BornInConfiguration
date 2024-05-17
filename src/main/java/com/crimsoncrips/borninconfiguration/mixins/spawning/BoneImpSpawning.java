package com.crimsoncrips.borninconfiguration.mixins.spawning;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.procedures.BoneImpNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BoneImpNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.class)

public class BoneImpSpawning {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world));
    }



    private static boolean doSomething4(LevelAccessor world) {
        return BIConfig.BONE_IMP_SPAWNING_ENABLED;
    }
}
