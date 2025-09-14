package com.crimsoncrips.borninconfiguration.mixins.weapon;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModItems;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PumpkinStaffProProcedure.class)

public class PumpkinStaffMixin {


    @Inject(method = "execute", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        if (entity instanceof LivingEntity livingEntity){
            ItemStack mainHandItem = livingEntity.getMainHandItem();

            if (mainHandItem.is(BornInChaosV1ModItems.PUMPKINSTAFFA.get()) && world.getBlockState(BlockPos.containing(x, y, z)).canOcclude() && !world.getBlockState(BlockPos.containing(x, y + (double)1.0F, z)).canOcclude() && !livingEntity.hasEffect( BornInChaosV1ModMobEffects.MAGIC_DEPLETION.get())){
                livingEntity.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.MAGIC_DEPLETION.get(), 500, 1));

                for (int i = 0;i < BornInConfiguration.COMMON_CONFIG.PUMPKIN_STAFF_SUMMON_AMOUNT.get();i++){
                    if (world instanceof ServerLevel serverLevel) {
                        Entity pumpkin = ((EntityType) BornInChaosV1ModEntities.MR_PUMPKIN_CONTROLLED.get()).spawn(serverLevel, BlockPos.containing(x + (double) 0.5F, y + (double) 1.5F, z + (double) 0.5F), MobSpawnType.MOB_SUMMONED);
                        if (pumpkin != null) {
                            pumpkin.setYRot(world.getRandom().nextFloat() * 360.0F);
                        }
                    }
                }
                livingEntity.level().playLocalSound(BlockPos.containing(x, y, z), SoundEvents.GLOW_SQUID_SQUIRT, SoundSource.AMBIENT, 1, 1, false);
                if (world instanceof ServerLevel serverLevel) {
                    serverLevel.sendParticles(ParticleTypes.POOF, x, y + (double)1.0F, z, 9,0.5F,0.5F, 0.5F, 0.1);
                    serverLevel.sendParticles(BornInChaosV1ModParticleTypes.PUMPKIN_STAFF_S.get(), x, y + (double)1.0F, z, 12,0.5F,0.5F,0.5F, 0.1);
                }
            }
        }


    }



}
