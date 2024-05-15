package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.entity.NightmareStalkerEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;

@Mixin(NightmareStalkerEntity.class)

public class StalkerImmunity extends Monster implements GeoEntity {

    protected StalkerImmunity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (BIConfig.STALKER_IMMUNITY_ENABLED) {
            if (source.getDirectEntity() instanceof AbstractArrow)
                return false;
            if (source.is(DamageTypes.FALL))
                return false;
            if (source.is(DamageTypes.DROWN))
                return false;
            if (source.is(DamageTypes.TRIDENT))
                return false;
            if (source.is(DamageTypes.WITHER))
                return false;
            if (source.is(DamageTypes.WITHER_SKULL))
                return false;
            else {
                super.hurt(source, amount);
                return true;
            }
        } else {
            super.hurt(source, amount);
            return true;
        }
    }



    @Override
    @Shadow
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
    }

    @Override
    @Shadow
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }
}
