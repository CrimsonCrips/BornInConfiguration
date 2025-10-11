package com.crimsoncrips.borninconfiguration.mixins.spawning;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.CursedMarkKoghdaEffiektZakanchivaietsiaProcedure;
import net.mcreator.borninchaosv.procedures.NightmareStalkerGonProcedure;
import net.mcreator.borninchaosv.procedures.NightmareStalkerNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NightmareStalkerNaturalnoieUsloviiePoiavlieniiaSushchnostiProcedure.class)

public class NightmareOveride {


    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(doSomething4(world,x,y,z));
    }

    private static boolean doSomething4(LevelAccessor world, double x, double y, double z) {
        if (world.dayTime() >= 24000L * BornInConfiguration.COMMON_CONFIG.DAYS_TILL_MISSIONER.get() && (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + (double)1.0F, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 4 || !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + (double)1.0F, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 0) && !world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_dark")) && !world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mushroom_fields")) && world.getLevelData().getGameRules().getBoolean(BornInChaosV1ModGameRules.THEAPPEARANCEOFTHENIGHTMARESTALKER)) {
            ResourceKey var10000;
            if (world instanceof Level) {
                Level _lvl = (Level)world;
                var10000 = _lvl.dimension();
            } else if (world instanceof WorldGenLevel) {
                WorldGenLevel _wgl = (WorldGenLevel)world;
                var10000 = _wgl.getLevel().dimension();
            } else {
                var10000 = Level.OVERWORLD;
            }

            if (var10000 == Level.OVERWORLD && (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_overworld"))) || world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("terralith:all_terralith_biomes"))))) {
                return true;
            }
        }

        return false;
    }


}
