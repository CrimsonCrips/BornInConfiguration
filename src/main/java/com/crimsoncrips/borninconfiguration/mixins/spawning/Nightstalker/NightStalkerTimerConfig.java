package com.crimsoncrips.borninconfiguration.mixins.spawning.Nightstalker;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.procedures.NightmareStalkerNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
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

@Mixin(NightmareStalkerNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.class)

public class NightStalkerTimerConfig {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world,x,y,z));
    }



    private static boolean doSomething4(LevelAccessor world, double x, double y, double z) {
        if (world.dayTime() >= (13000L * BIConfig.DAYS_TILL_NIGHTMARE) && BIConfig.NIGHTMARE_SPAWN_ENABLED && (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 4 || !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 0) && !world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_dark")) && !world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mushroom_fields")) && !world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("plains")) && world.getLevelData().getGameRules().getBoolean(BornInChaosV1ModGameRules.THEAPPEARANCEOFTHENIGHTMARESTALKER)) {
            ResourceKey var10000;
            if (world instanceof Level) {
                Level _lvl = (Level)world;
                var10000 = _lvl.dimension();
            } else {
                var10000 = Level.OVERWORLD;
            }

            if (var10000 == Level.OVERWORLD && (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) || world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("terralith:all_terralith_biomes"))) || world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("alexscaves:forlorn_hollows"))))) {
                return true;
            }
        }

        return false;
    }
}
