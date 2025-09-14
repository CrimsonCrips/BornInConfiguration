package org.borninconfiguration.mixins.spawning;



import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.CursedMarkKoghdaEffiektZakanchivaietsiaProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import org.borninconfiguration.BornInConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CursedMarkKoghdaEffiektZakanchivaietsiaProcedure.class)

public abstract class ScarletProsecuterSpawning{

    @Unique
    private static void spawnProescuter(ServerLevel serverLevel, double x, double y, double z){
        Entity entityToSpawn = (BornInChaosV1ModEntities.SCARLET_PERSECUTOR.get()).spawn(serverLevel, BlockPos.containing(x + 3.0, y + 0.5, z), MobSpawnType.MOB_SUMMONED);
        if (entityToSpawn == null)
            return;
        serverLevel.sendParticles(BornInChaosV1ModParticleTypes.DIM.get(), x + 3.0, y + 0.5, z, 6, 1.0, 1.0, 1.0, 1.0);
        entityToSpawn.setYRot(serverLevel.getRandom().nextFloat() * 360.0F);
    }

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfo ci) {
        ci.cancel();
        if (world instanceof Level level){
            if (!level.isClientSide){
                level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("born_in_chaos_v1:persecutor_scream")), SoundSource.NEUTRAL, 0.4F, 1.0F);
                level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wither.spawn")), SoundSource.NEUTRAL, 0.3F, 1.0F);
            }else{
                level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wither.spawn")), SoundSource.NEUTRAL, 0.3F, 1.0F, false);
                level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("born_in_chaos_v1:persecutor_scream")), SoundSource.NEUTRAL, 0.4F, 1.0F, false);
            }
            if (world.getBlockState(BlockPos.containing(x + 3.0, y + 1.0, z)).canOcclude())
                return;
            if (BornInConfiguration.COMMON_CONFIG.SCARLET_SPAWN_AMMOUNT.get() != 0) {
                for (int i = 0; i < BornInConfiguration.COMMON_CONFIG.SCARLET_SPAWN_AMMOUNT.get(); i++) {
                    spawnProescuter((ServerLevel) level, x, y, z);
                }
            }
        }
    }


}
