package com.crimsoncrips.borninconfiguration.mixins.mobs;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.entity.DecayingZombieEntity;
import net.mcreator.borninchaosv.entity.PumpkinheadEntity;
import net.mcreator.borninchaosv.entity.SenorPumpkinEntity;
import net.mcreator.borninchaosv.entity.SirPumpkinheadEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SirPumpkinheadEntity.class)

public abstract class SerPumpkinHead extends Monster {

    protected SerPumpkinHead(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    @Inject(method = "createAttributes", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
        cir.setReturnValue(doSomething4());
    }



    private static AttributeSupplier.Builder doSomething4() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, BIConfig.SER_PUMPKIN_HEAD_ARMOR);
        builder = builder.add(Attributes.MAX_HEALTH, BIConfig.SER_PUMPKIN_HEAD_HEALTH);
        builder = builder.add(Attributes.ARMOR, BIConfig.SER_PUMPKIN_HEAD_ARMOR);
        builder = builder.add(Attributes.ATTACK_DAMAGE, BIConfig.SER_PUMPKIN_HEAD_DAMAGE);
        builder = builder.add(Attributes.FOLLOW_RANGE, 20.0);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, BIConfig.SER_PUMPKIN_HEAD_KNOCKBACK);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, BIConfig.SER_PUMPKIN_HEAD_KNOCKBACK_RESISTANCE);
        return builder;
    }


}
