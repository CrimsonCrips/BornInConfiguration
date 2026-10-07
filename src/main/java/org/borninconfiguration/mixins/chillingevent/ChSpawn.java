package org.borninconfiguration.mixins.chillingevent;

import org.borninconfiguration.BornInConfiguration;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.mcreator.borninchaosv.procedures.ChillingHorrorEventSpawnProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ChillingHorrorEventSpawnProcedure.class)
public abstract class ChSpawn {

    @ModifyExpressionValue(method = "execute(Lnet/neoforged/bus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/GameRules;getBoolean(Lnet/minecraft/world/level/GameRules$Key;)Z", ordinal = 1))
    private static boolean bornInConfiguration$forceEvent(boolean eventRule) {
        return eventRule || BornInConfiguration.COMMON_CONFIG.CHILLING_HORROR_ENABLED.get();
    }
}
