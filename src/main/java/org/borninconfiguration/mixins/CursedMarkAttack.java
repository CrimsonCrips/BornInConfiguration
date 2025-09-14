package org.borninconfiguration.mixins;



import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.mcreator.borninchaosv.entity.MissionerEntity;
import net.mcreator.borninchaosv.procedures.CursedMarkAtacProcedure;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.level.Level;
import org.borninconfiguration.BornInConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CursedMarkAtacProcedure.class)

public abstract class CursedMarkAttack {


    @WrapWithCondition(method = "execute(Lnet/neoforged/bus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;addEffect(Lnet/minecraft/world/effect/MobEffectInstance;)Z"))
    private static boolean bornInChaos$init(LivingEntity instance, MobEffectInstance pEffectInstance) {
        return BornInConfiguration.COMMON_CONFIG.FALLEN_KNIGHT_CURSE_ENABLED.get();
    }
}
