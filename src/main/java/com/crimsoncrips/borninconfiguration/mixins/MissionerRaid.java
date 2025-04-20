package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.mcreator.borninchaosv.entity.MissionerEntity;
import net.mcreator.borninchaosv.procedures.GenerationofInfectedDiamondsProProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MissionerEntity.class)

public abstract class MissionerRaid extends Raider {

    protected MissionerRaid(EntityType<? extends Raider> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @ModifyArg(method = "init", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/raid/Raid$RaiderType;create(Ljava/lang/String;Lnet/minecraft/world/entity/EntityType;[I)Lnet/minecraft/world/entity/raid/Raid$RaiderType;"),remap = false)
    private static int[] alexsMobsInteraction$renderIcons(int[] intarray){
        if (!BornInConfiguration.COMMON_CONFIG.MISSIONER_RAID_ENABLED.get()){
            return new int[]{0,0, 0, 0, 0, 0, 0, 0};
        }
        return intarray;
    }
}
