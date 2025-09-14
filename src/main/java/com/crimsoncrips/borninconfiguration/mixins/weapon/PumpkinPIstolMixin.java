package com.crimsoncrips.borninconfiguration.mixins.weapon;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.llamalad7.mixinextras.sugar.Local;
import net.mcreator.borninchaosv.procedures.PumpkinPistolshotProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(PumpkinPistolshotProcedure.class)

public class PumpkinPIstolMixin {

    @ModifyArg(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemCooldowns;addCooldown(Lnet/minecraft/world/item/Item;I)V",ordinal = 0),index = 1)
    private static int bornInConfig$execute1(int ticks) {
        return BornInConfiguration.COMMON_CONFIG.UPGRADED_PUMPKIN_PISTOL_COOLDOWN.get() * 20;
    }

    @ModifyArg(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemCooldowns;addCooldown(Lnet/minecraft/world/item/Item;I)V",ordinal = 1),index = 1)
    private static int bornInConfig$execute2(int ticks) {
        return BornInConfiguration.COMMON_CONFIG.PUMPKIN_PISTOL_COOLDOWN.get() * 20;
    }



}
