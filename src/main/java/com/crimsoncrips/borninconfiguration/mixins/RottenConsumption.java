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
        ci.cancel(); // prevent the original method from running

        if (!BIConfig.ROTTEN_CONSUMPTION_ENABLED) // don't run if the feature is disabled
            return;
        if (itemstack.getItem() != Items.ROTTEN_FLESH)
            return;
        if (!(entity instanceof LivingEntity livingEntity))
            return;
        if (livingEntity.level().isClientSide()) // only run on the server
            return;

        livingEntity.addEffect(new MobEffectInstance(BornInChaosV1ModMobEffects.ROTTEN_SMELL.get(), 2400, 0));
    }
}
