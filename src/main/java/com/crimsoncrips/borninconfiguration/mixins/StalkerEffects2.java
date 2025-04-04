package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.procedures.NightmareStalkerGonProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NightmareStalkerGonProcedure.class)

public abstract class StalkerEffects2 {

    @WrapWithCondition(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/LevelAccessor;setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z"))
    private static boolean bornInChaos$execute(LevelAccessor instance, BlockPos blockPos, BlockState blockState, int i) {
        return BornInConfiguration.COMMON_CONFIG.NIGHTMARE_FREEZE_ENABLED.get();
    }

    @WrapWithCondition(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;addEffect(Lnet/minecraft/world/effect/MobEffectInstance;)Z"))
    private static boolean bornInChaos$execute1(LivingEntity instance, MobEffectInstance pEffectInstance) {
        return BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STRENGTH_ENABLED.get();
    }

    @Inject(method = "execute", at = @At(value = "HEAD"),remap = false)
    private static void bornInChaos$execute2(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        if (entity != null && !BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STRENGTH_ENABLED.get()){
            float var10000;
            float var10001;
            if (entity instanceof LivingEntity living) {
                var10000 = living.getHealth();
                var10001 = living.getMaxHealth();
                if (var10000 >= var10001) {
                    if (!living.level().isClientSide()) {
                        living.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.UNITY_WITH_DARKNESS.get(), 10, 0, false, false));
                    }
                }
            }
        }
    }
}
