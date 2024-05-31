package com.crimsoncrips.borninconfiguration.mixins.mobs;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.entity.DireHoundLeaderEntity;
import net.mcreator.borninchaosv.entity.DreadHoundEntity;
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

@Mixin(DireHoundLeaderEntity.class)

public abstract class DreadhoundLeader extends Monster {

    protected DreadhoundLeader(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    @Inject(method = "createAttributes", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
        cir.setReturnValue(doSomething4());
    }



    private static AttributeSupplier.Builder doSomething4() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, BIConfig.DREADHOUND_LEADER_SPEED);
        builder = builder.add(Attributes.MAX_HEALTH, BIConfig.DREADHOUND_LEADER_HEALTH);
        builder = builder.add(Attributes.ARMOR, BIConfig.DREADHOUND_LEADER_ARMOR);
        builder = builder.add(Attributes.ATTACK_DAMAGE, BIConfig.DREADHOUND_LEADER_DAMAGE);
        builder = builder.add(Attributes.FOLLOW_RANGE, 18.0);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, BIConfig.DREADHOUND_LEADER_KNOCKBACK);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, BIConfig.DREADHOUND_LEADER_KNOCKBACK_RESISTANCE);
        return builder;
    }


}
