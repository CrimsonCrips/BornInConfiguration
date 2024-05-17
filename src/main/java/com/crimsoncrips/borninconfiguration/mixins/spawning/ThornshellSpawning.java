package com.crimsoncrips.borninconfiguration.mixins.spawning;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.procedures.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ThornshellCrabpriProcedure.class)

public class ThornshellSpawning {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world, x, y, z));
    }



    private static boolean doSomething4(LevelAccessor world, double x, double y, double z) {
        return BIConfig.THORNSHELL_SPAWNING_ENABLED && (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_river"))) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mangrove_swamp")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stony_shore")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("beach")));
    }
}
