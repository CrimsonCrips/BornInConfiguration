package com.crimsoncrips.borninconfiguration.mixins.healtharguments;


import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.LifestealerPriObnovlieniiTikaSushchnostiProcedure;
import net.mcreator.borninchaosv.procedures.SkeletonBombKoghdaSushchnostRanienaProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LifestealerPriObnovlieniiTikaSushchnostiProcedure.class)

public abstract class LifestealerConvert {

    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        if (entity != null) {
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.DIM.get(), x, y, z, 2, 0.3, 0.2, 0.3, 0.1);
            }

            LivingEntity _livEntity = (LivingEntity)entity;
            float var10000 = _livEntity.getHealth();
            float maxHealth = _livEntity.getMaxHealth();

            if (var10000 <= 0.99F * maxHealth) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    Entity entityToSpawn = ((EntityType) BornInChaosV1ModEntities.LIFESTEALER_TRUE_FORM.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.setYRot(entity.getYRot());
                        entityToSpawn.setYBodyRot(entity.getYRot());
                        entityToSpawn.setYHeadRot(entity.getYRot());
                        entityToSpawn.setXRot(entity.getXRot());
                    }
                }

                if (!entity.level().isClientSide()) {
                    entity.discard();
                }

                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:lifestealer_scream_ap")), SoundSource.NEUTRAL, 3.0F, 1.0F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:lifestealer_scream_ap")), SoundSource.NEUTRAL, 3.0F, 1.0F, false);
                    }
                }
            }

        }
    }


}
