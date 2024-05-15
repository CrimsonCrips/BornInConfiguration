package com.crimsoncrips.borninconfiguration.mixins.Spawning;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.procedures.BabySkeletonNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import net.mcreator.borninchaosv.procedures.FirelightNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FirelightNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.class)

public class FirelightSpawning {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world));
    }



    private static boolean doSomething4(LevelAccessor world) {
        return BIConfig.FIRELIGHT_SPAWNING_ENABLED;
    }
}
