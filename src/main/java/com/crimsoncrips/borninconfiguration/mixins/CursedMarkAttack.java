package com.crimsoncrips.borninconfiguration.mixins;

import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.procedures.CursedMarkAtacProcedure;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CursedMarkAtacProcedure.class)
public abstract class CursedMarkAttack {

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, CallbackInfo ci) {
        if (!BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_CURSE_ENABLED.get()) {
            ci.cancel();
        }
    }
}
