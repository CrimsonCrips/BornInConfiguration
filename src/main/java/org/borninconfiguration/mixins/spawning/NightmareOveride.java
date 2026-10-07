package org.borninconfiguration.mixins.spawning;

import org.borninconfiguration.utils.SpawnDays;
import net.mcreator.borninchaosv.procedures.NightmareStalkerNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(NightmareStalkerNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.class)
public class NightmareOveride {

    @ModifyConstant(method = "execute", constant = @Constant(longValue = 61000L), remap = false)
    private static long borninconfiguration$spawnDay(long original) {
        return SpawnDays.nightmare(original);
    }
}
