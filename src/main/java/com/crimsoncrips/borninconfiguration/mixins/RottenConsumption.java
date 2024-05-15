package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModMobEffects;
import net.mcreator.borninchaosv.procedures.EatingRottenFleshProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EatingRottenFleshProcedure.class)

public class RottenConsumption {

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, Entity entity, ItemStack itemstack, CallbackInfo ci) {
        ci.cancel();
        if (entity != null && BIConfig.ROTTEN_CONSUMPTION_ENABLED) {
            if (itemstack.copy().getItem() == Items.ROTTEN_FLESH && entity instanceof LivingEntity) {
                LivingEntity _entity = (LivingEntity)entity;
                if (!_entity.level().isClientSide()) {
                    _entity.addEffect(new MobEffectInstance((MobEffect) BornInChaosV1ModMobEffects.ROTTEN_SMELL.get(), 2400, 0));
                }
            }

        }
    }
}
