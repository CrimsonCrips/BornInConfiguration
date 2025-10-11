package org.borninconfiguration.mixins;


import net.mcreator.borninchaosv.entity.KrampusHenchmanEntity;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.KrampusHenchmanAttackProcedure;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.bus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KrampusHenchmanAttackProcedure.class)

public abstract class HenchmanAttackMixin {


    @Inject(method = "execute(Lnet/neoforged/bus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true,remap = false)
    private static void injected(Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, CallbackInfo ci) {
        ci.cancel();
        if (entity instanceof Player player && sourceentity instanceof KrampusHenchmanEntity) {
            if (Math.random() < 0.35) {
                if (player.isBlocking()) {
                    return;
                }

                ItemStack var = player.getMainHandItem();


                if (var.getMaxStackSize() == 1 && !var.isEmpty()) {
                    if (world instanceof Level level) {
                        level.playLocalSound(x, y, z, (SoundEvent) BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("born_in_chaos_v1:minion_blow")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                    }

                    if (world instanceof ServerLevel serverLevel) {
                        ItemEntity var22 = new ItemEntity(serverLevel, entity.getX(),entity.getY() + (double)1.0F,entity.getZ(),var);
                        var22.setPickUpDelay(45);
                        serverLevel.addFreshEntity(var22);
                        var.shrink(1);
                        serverLevel.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.STUNSTARS.get(), entity.getX(), entity.getY() + 1.3, entity.getZ(), 3, (double)0.25F, 0.3, (double)0.25F, 0.1);
                        player.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.LOST_ITEMS, 35, 0, false, false));
                    }
                }
            }

        }
    }
}