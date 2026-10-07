package com.crimsoncrips.borninconfiguration.mixins.spawning;

import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.crimsoncrips.borninconfiguration.utils.SpawnDays;
import net.mcreator.borninchaosv.procedures.WarningSoundProcedure;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WarningSoundProcedure.class)
public class WarningConfig {

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, Entity entity, CallbackInfo ci) {
        if (!BornInConfiguration.COMMON_CONFIG.WARNING_SPAWN_ENABLED.get()) {
            ci.cancel();
        }
    }

    @ModifyConstant(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V", constant = @Constant(longValue = 60500L), remap = false)
    private static long borninconfiguration$nightmareWarning(long original) {
        return SpawnDays.nightmareWarning(original);
    }

    @ModifyConstant(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V", constant = @Constant(longValue = 228400L), remap = false)
    private static long borninconfiguration$missionerWarning(long original) {
        return SpawnDays.missionerWarning(original);
    }
}
