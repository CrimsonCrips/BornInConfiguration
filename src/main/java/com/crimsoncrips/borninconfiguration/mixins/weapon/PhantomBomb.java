package com.crimsoncrips.borninconfiguration.mixins.weapon;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.procedures.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PhantomBombProjectileKoghdaSnariadPopadaietVBlokProcedure.class)

public class PhantomBomb {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, CallbackInfo cir) {
        cir.cancel();
        if (world instanceof Level level){
            if (level.isClientSide())
                return;
            level.explode((Entity)null, x, y, z, 4.0F, Level.ExplosionInteraction.TNT);
        }

        if (world instanceof ServerLevel serverLevel) {
            if (BornInConfiguration.COMMON_CONFIG.PHANTOM_BOMB_COUNT.get() != 0) {
                for (int i = 0; i < BornInConfiguration.COMMON_CONFIG.PHANTOM_BOMB_COUNT.get(); i++) {
                    phantomBomb(serverLevel,world,x,y,z);
                }
            }
            serverLevel.sendParticles(ParticleTypes.PORTAL, x, y, z, 18, 0.3, 0.3, 0.3, 0.1);
        }

    }

    private static void phantomBomb(ServerLevel serverLevel, LevelAccessor world, double x, double y, double z){
        Entity entityToSpawn;
        entityToSpawn = (BornInChaosV1ModEntities.PHANTOM_BOMB_ENTITY.get()).spawn(serverLevel, BlockPos.containing(x + RandomSource.create().nextInt(-3,3), y, z + RandomSource.create().nextInt(-3,3)), MobSpawnType.MOB_SUMMONED);
        if (entityToSpawn != null) {
            entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
        }
    }



}
