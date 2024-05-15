package com.crimsoncrips.borninconfiguration.mixins.Spawning;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.procedures.CorpseFishPriProcedure;
import net.mcreator.borninchaosv.procedures.ZombieFishermanPriProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ZombieFishermanPriProcedure.class)

public class ZombieFishermanSpawning {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world, x, y, z));
    }



    private static boolean doSomething4(LevelAccessor world, double x, double y, double z) {
        return BIConfig.ZOMBIE_FISHERMAN_SPAWNING_ENABLED && (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 4 || !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 0) && (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_river"))) || world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:has_structure/swamp_hut"))) || world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_beach"))) || world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_swamp"))) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("beach")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("river")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stony_shore")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mangrove_swamp")));
    }
}
