package com.crimsoncrips.borninconfiguration.mixins.spawning;

import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.CursedMarkKoghdaEffiektZakanchivaietsiaProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

@Mixin(CursedMarkKoghdaEffiektZakanchivaietsiaProcedure.class)
public abstract class ScarletProsecuterSpawning {

    private static final double[][] OFFSETS = {{3, 0}, {-3, 0}, {0, 3}, {0, -3}};

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfo ci) {
        ci.cancel();
        if (!(world instanceof ServerLevel level)) {
            return;
        }
        BlockPos center = BlockPos.containing(x, y, z);
        level.playSound(null, center, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:persecutor_scream")), SoundSource.NEUTRAL, 0.4F, 1.0F);
        level.playSound(null, center, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 0.3F, 1.0F);

        List<double[]> open = new ArrayList<>();
        for (double[] offset : OFFSETS) {
            if (!level.getBlockState(BlockPos.containing(x + offset[0], y + 1.0, z + offset[1])).canOcclude()) {
                open.add(offset);
            }
        }
        if (open.isEmpty()) {
            return;
        }
        int amount = BornInConfiguration.COMMON_CONFIG.SCARLET_SPAWN_AMMOUNT.get();
        for (int i = 0; i < amount; i++) {
            double[] offset = open.get(i % open.size());
            Entity persecutor = BornInChaosV1ModEntities.SCARLET_PERSECUTOR.get().spawn(level, BlockPos.containing(x + offset[0], y + 0.5, z + offset[1]), MobSpawnType.MOB_SUMMONED);
            if (persecutor != null) {
                persecutor.setYRot(level.getRandom().nextFloat() * 360.0F);
                level.sendParticles(BornInChaosV1ModParticleTypes.DARK_SMOKE.get(), x + offset[0], y + 0.5, z + offset[1], 6, 0.5, 0.5, 0.5, 0.1);
            }
        }
    }
}
