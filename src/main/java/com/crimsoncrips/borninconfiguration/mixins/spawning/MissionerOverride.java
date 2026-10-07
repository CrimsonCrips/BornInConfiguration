package com.crimsoncrips.borninconfiguration.mixins.spawning;

import com.crimsoncrips.borninconfiguration.utils.SpawnDays;
import net.mcreator.borninchaosv.procedures.MissionarySpawnProProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MissionarySpawnProProcedure.class)
public class MissionerOverride {

    @ModifyConstant(method = "execute", constant = @Constant(longValue = 228400L), remap = false)
    private static long borninconfiguration$spawnDay(long original) {
        return SpawnDays.missioner(original);
    }
}
