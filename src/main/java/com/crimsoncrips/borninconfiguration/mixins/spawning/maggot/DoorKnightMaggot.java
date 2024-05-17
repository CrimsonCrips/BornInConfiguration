package com.crimsoncrips.borninconfiguration.mixins.spawning.maggot;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.DoorKnightDeathTimeIsReachedProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DoorKnightDeathTimeIsReachedProcedure.class)

public class DoorKnightMaggot {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfo ci) {
        if (BIConfig.MAGGOTS_APPEARANCE_ENABLED && Math.random() < 0.2) {
            ServerLevel _level;
            if (world instanceof ServerLevel) {
                _level = (ServerLevel) world;
                _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.FLESHSPLASH.get(), x, y + 1.0, z, 5, 0.3, 0.3, 0.3, 0.1);
            }

            Entity entityToSpawn;
            if (world instanceof ServerLevel) {
                _level = (ServerLevel) world;
                entityToSpawn = ((EntityType) BornInChaosV1ModEntities.MAGGOT.get()).spawn(_level, BlockPos.containing(x + 0.5, y + 1.0, z + 0.1), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                }
            }

            if (world instanceof ServerLevel) {
                _level = (ServerLevel) world;
                _level.sendParticles(ParticleTypes.POOF, x + 0.5, y + 1.0, z + 0.1, 3, 0.1, 0.1, 0.1, 0.1);
            }

            if (world instanceof ServerLevel) {
                _level = (ServerLevel) world;
                entityToSpawn = ((EntityType) BornInChaosV1ModEntities.MAGGOT.get()).spawn(_level, BlockPos.containing(x + 0.5, y + 1.0, z + 0.9), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                }
            }

            if (world instanceof ServerLevel) {
                _level = (ServerLevel) world;
                _level.sendParticles(ParticleTypes.POOF, x + 0.5, y + 1.0, z + 0.9, 3, 0.1, 0.1, 0.1, 0.1);
            }

            if (!world.isClientSide()) {
                Level _levels;
                if (world instanceof Level) {
                    _levels = (Level) world;
                    if (!_levels.isClientSide()) {
                        _levels.playSound((Player) null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break")), SoundSource.NEUTRAL, 0.9F, 0.9F);
                    } else {
                        _levels.playLocalSound(x, y, z, (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break")), SoundSource.NEUTRAL, 0.9F, 0.9F, false);
                    }
                }

                if (world instanceof Level) {
                    _levels = (Level) world;
                    if (!_levels.isClientSide()) {
                        _levels.playSound((Player) null, BlockPos.containing(x, y, z), (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stomach_open")), SoundSource.NEUTRAL, 0.8F, 1.0F);
                    } else {
                        _levels.playLocalSound(x, y, z, (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stomach_open")), SoundSource.NEUTRAL, 0.8F, 1.0F, false);
                    }
                }
            }
        }

    }


}
