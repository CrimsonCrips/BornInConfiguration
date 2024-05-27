package com.crimsoncrips.borninconfiguration.mixins.mobs.skeletonbomber;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.entity.SkeletonDemomanEntity;
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

@Mixin(SkeletonDemomanEntity.class)

public abstract class SkeletonBomber extends Monster {

    protected SkeletonBomber(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    @Inject(method = "createAttributes", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
        cir.setReturnValue(doSomething4());
    }



    private static AttributeSupplier.Builder doSomething4() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, BIConfig.SKELETON_BOMBER_SPEED);
        builder = builder.add(Attributes.MAX_HEALTH, BIConfig.SKELETON_BOMBER_HEALTH);
        builder = builder.add(Attributes.ARMOR, BIConfig.SKELETON_BOMBER_ARMOR);
        builder = builder.add(Attributes.ATTACK_DAMAGE, BIConfig.SKELETON_BOMBER_DAMAGE);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, BIConfig.SKELETON_BOMBER_KNOCKBACK);
        return builder;
    }


}
