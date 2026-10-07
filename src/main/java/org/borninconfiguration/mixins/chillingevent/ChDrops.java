package org.borninconfiguration.mixins.chillingevent;

import org.borninconfiguration.BornInConfiguration;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.mcreator.borninchaosv.procedures.ChillingHorrorEventDropProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ChillingHorrorEventDropProcedure.class)
public abstract class ChDrops {

    @ModifyExpressionValue(method = "execute(Lnet/neoforged/bus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/GameRules;getBoolean(Lnet/minecraft/world/level/GameRules$Key;)Z", ordinal = 1))
    private static boolean bornInConfiguration$forceEvent(boolean eventRule) {
        return eventRule || BornInConfiguration.COMMON_CONFIG.CHILLING_HORROR_ENABLED.get();
    }
}
