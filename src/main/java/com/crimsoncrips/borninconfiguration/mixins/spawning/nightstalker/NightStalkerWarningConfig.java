package com.crimsoncrips.borninconfiguration.mixins.spawning.nightstalker;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.procedures.WarningSoundProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WarningSoundProcedure.class)

public class NightStalkerWarningConfig {

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        if (entity != null) {
            if (world.dayTime() == (13000L * BIConfig.DAYS_TILL_NIGHTMARE) && BIConfig.NIGHTMARE_SPAWN_ENABLED) {
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stalker_roar_distant")), SoundSource.NEUTRAL, 1.2F, 1.0F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stalker_roar_distant")), SoundSource.NEUTRAL, 1.2F, 1.0F, false);
                    }
                }

                if (entity instanceof Player) {
                    Player _player = (Player)entity;
                    if (!_player.level().isClientSide()) {
                        _player.displayClientMessage(Component.literal("§cYou feel like something is chasing you..."), false);
                    }
                }
            }

        }
    }



    private static boolean doSomething4(LevelAccessor world, double x, double y, double z) {
        if (world.dayTime() >= (13000L * BIConfig.DAYS_TILL_NIGHTMARE) && (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 4 || !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1.0, z)) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 0) && !world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("deep_dark")) && !world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("mushroom_fields")) && !world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("plains")) && world.getLevelData().getGameRules().getBoolean(BornInChaosV1ModGameRules.THEAPPEARANCEOFTHENIGHTMARESTALKER)) {
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
