package org.borninconfiguration.mixins;




import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.mcreator.borninchaosv.entity.DoorKnightEntity;
import net.mcreator.borninchaosv.entity.DoorKnightNotDespawnEntity;
import net.mcreator.borninchaosv.entity.SkeletonThrasherEntity;
import net.mcreator.borninchaosv.entity.SkeletonThrasherNotDespawnEntity;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.procedures.AxeAtackProcedure;
import net.mcreator.borninchaosv.procedures.BlockBreakKoghdaEffiektNachatprimienienProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;


import net.neoforged.bus.api.Event;
import org.borninconfiguration.datagen.tags.BIConfigItemTagGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AxeAtackProcedure.class)

public abstract class AxeAttackMixin {


    @Inject(method = "execute(Lnet/neoforged/bus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true,remap = false)
    private static void injected(Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, CallbackInfo ci) {
        ci.cancel();
        if (entity instanceof LivingEntity target && sourceentity instanceof LivingEntity sourceTarget && !target.hasEffect(BornInChaosV1ModMobEffects.BLOCK_BREAK)) {
            ItemStack heldItem = sourceTarget.getMainHandItem();

            if (heldItem.is(BIConfigItemTagGenerator.BLOCK_BREAKERS)) {
                EntityType<?>[] shieldedMobs = {
                        BornInChaosV1ModEntities.DOOR_KNIGHT.get(),
                        BornInChaosV1ModEntities.DOOR_KNIGHT_NOT_DESPAWN.get(),
                        BornInChaosV1ModEntities.SKELETON_THRASHER.get(),
                        BornInChaosV1ModEntities.SKELETON_THRASHER_NOT_DESPAWN.get(),
                };
                for (EntityType<?> shieldedMob : shieldedMobs) {
                    if (target.getType() == shieldedMob) {
                        target.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.BLOCK_BREAK, 120, 0, false, false));
                        target.playSound(SoundEvents.ZOMBIE_BREAK_WOODEN_DOOR, 0.2F, target.getVoicePitch());
                        target.removeEffect(MobEffects.DAMAGE_RESISTANCE);
                        if (world instanceof ServerLevel serverLevel) {
                            serverLevel.sendParticles(ParticleTypes.CRIT, x, y, z, 9, 0.6, (double) 1.0F, 0.6, 0.6);
                        }
                    }

                }
            }
        }
    }
}
