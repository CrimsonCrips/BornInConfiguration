package org.borninconfiguration.mixins;

import org.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.entity.NightmareStalkerEntity;
import net.mcreator.borninchaosv.procedures.NightmareStalkerPriRanieniiSushchnostiProcedure;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NightmareStalkerEntity.class)
public abstract class StalkerImmunity extends Monster {

    protected StalkerImmunity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Inject(method = "hurt", at = @At("HEAD"), cancellable = true)
    private void bornInConfiguration$skipImmunity(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (!BornInConfiguration.COMMON_CONFIG.STALKER_IMMUNITY_ENABLED.get()) {
            NightmareStalkerPriRanieniiSushchnostiProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this, source.getEntity());
            cir.setReturnValue(super.hurt(source, amount));
        }
    }
}
