package com.crimsoncrips.borninconfiguration.mixins.chaoticspring;

import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.mcreator.borninchaosv.procedures.ChaoticSpringEventDropProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ChaoticSpringEventDropProcedure.class)
public abstract class CsDrops {

    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/GameRules;getBoolean(Lnet/minecraft/world/level/GameRules$Key;)Z", ordinal = 1))
    private static boolean bornInConfiguration$forceEvent(boolean eventRule) {
        return eventRule || BornInConfiguration.COMMON_CONFIG.CHAOTIC_SPRING_ENABLED.get();
    }
}
