package org.borninconfiguration.mixins;



import net.mcreator.borninchaosv.entity.NightmareStalkerEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;
import org.borninconfiguration.BornInConfiguration;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import software.bernie.geckolib.animatable.GeoEntity;

@Mixin(NightmareStalkerEntity.class)

public abstract class StalkerImmunity extends Monster {


    protected StalkerImmunity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean hurt(@NotNull DamageSource source, float amount) {
        if (!BornInConfiguration.COMMON_CONFIG.STALKER_IMMUNITY_ENABLED.get()) {
            super.hurt(source, amount);
            return true;
        }

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

        super.hurt(source, amount);
        return true;
    }
}
