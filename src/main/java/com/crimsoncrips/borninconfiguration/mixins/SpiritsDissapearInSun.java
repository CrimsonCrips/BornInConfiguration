package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.procedures.SpiritGonProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SpiritGonProcedure.class)

public class SpiritsDissapearInSun {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel(); // prevent the original method from running

        if (entity != null) {
            if (BornInConfiguration.COMMON_CONFIG.SPIRIT_DISSAPPEAR_IN_SUN_ENABLED.get() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z)) && world instanceof Level) {
                Level _lvl2 = (Level)world;
                if (_lvl2.isDay() && !world.getLevelData().isRaining() && !world.getLevelData().isThundering() && !world.isClientSide()) {
                    if (!entity.level().isClientSide()) {
                        entity.discard();
                    }

                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.3, 0.3, 0.3, 0.1);
                    }
                }
            }
        }
    }

}
