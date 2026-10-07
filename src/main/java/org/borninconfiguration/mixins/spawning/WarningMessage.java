package org.borninconfiguration.mixins.spawning;

import org.borninconfiguration.utils.SpawnDays;
import net.mcreator.borninchaosv.procedures.BadFeelingactivationProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BadFeelingactivationProcedure.class)
public class WarningMessage {

    @ModifyConstant(method = "execute", constant = {@Constant(longValue = 60500L), @Constant(longValue = 60700L)}, remap = false)
    private static long borninconfiguration$nightmareWindow(long original) {
        return SpawnDays.nightmareWarning(original);
    }

    @ModifyConstant(method = "execute", constant = {@Constant(longValue = 228400L), @Constant(longValue = 228600L)}, remap = false)
    private static long borninconfiguration$missionerWindow(long original) {
        return SpawnDays.missionerWarning(original);
    }
}
