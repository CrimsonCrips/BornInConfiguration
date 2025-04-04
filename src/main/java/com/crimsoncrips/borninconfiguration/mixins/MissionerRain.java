package com.crimsoncrips.borninconfiguration.mixins;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.mcreator.borninchaosv.entity.MissionerEntity;
import net.mcreator.borninchaosv.procedures.MissionerPriNachalnomPrizyvieSushchnostiProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(MissionerPriNachalnomPrizyvieSushchnostiProcedure.class)

public abstract class MissionerRain {


    @WrapWithCondition(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/CompoundTag;putBoolean(Ljava/lang/String;Z)V"),remap = false)
    private static boolean bornInChaos$init(CompoundTag instance, String pKey, boolean pValue) {
        return BornInConfiguration.COMMON_CONFIG.MISSIONER_RAIN_ENABLED.get();
    }
}
