package com.crimsoncrips.borninconfiguration.mixins.weapon;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.procedures.NutHammerPriUdariePoSushchnostiInstrumientomProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(NutHammerPriUdariePoSushchnostiInstrumientomProcedure.class)

public class NuthammerMixin {


    @ModifyConstant(method = "execute",constant = @Constant(doubleValue = 0.35),remap = false)
    private static double bornInConfig$execute(double constant) {
        return BornInConfiguration.COMMON_CONFIG.NUTBREAKER_HEAD_CHANCE.get();
    }

    @ModifyConstant(method = "execute",constant = @Constant(doubleValue = 0.6),remap = false)
    private static double bornInConfig$execute1(double constant) {
        return BornInConfiguration.COMMON_CONFIG.NUTBREAKER_HEAD_CHANCE.get();
    }



}
