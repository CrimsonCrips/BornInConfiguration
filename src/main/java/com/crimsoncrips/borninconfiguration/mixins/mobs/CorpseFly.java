package com.crimsoncrips.borninconfiguration.mixins.mobs;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.entity.CorpseFlyEntity;
import net.mcreator.borninchaosv.entity.DecayingZombieEntity;
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

@Mixin(CorpseFlyEntity.class)

public abstract class CorpseFly extends Monster {

    protected CorpseFly(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    @Inject(method = "createAttributes", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
        cir.setReturnValue(doSomething4());
    }



    private static AttributeSupplier.Builder doSomething4() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, BIConfig.CORPSE_FLY_SPEED);
        builder = builder.add(Attributes.MAX_HEALTH, BIConfig.CORPSE_FLY_HEALTH);
        builder = builder.add(Attributes.ARMOR, BIConfig.CORPSE_FLY_ARMOR);
        builder = builder.add(Attributes.ATTACK_DAMAGE, BIConfig.CORPSE_FLY_DAMAGE);
        builder = builder.add(Attributes.FOLLOW_RANGE, 15.0);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, BIConfig.CORPSE_FLY_KNOCKBACK);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, BIConfig.CORPSE_FLY_KNOCKBACK_RESISTANCE);
        return builder;
    }


}
