package com.crimsoncrips.borninconfiguration.mixins.weapon;

import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.mcreator.borninchaosv.procedures.PumpkinStaffProProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PumpkinStaffProProcedure.class)
public class PumpkinStaffMixin {

    @WrapOperation(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/EntityType;spawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/MobSpawnType;)Lnet/minecraft/world/entity/Entity;"))
    private static Entity bornInConfiguration$summonMore(EntityType<?> type, ServerLevel level, BlockPos pos, MobSpawnType spawnType, Operation<Entity> original) {
        Entity first = original.call(type, level, pos, spawnType);
        for (int i = 1; i < BornInConfiguration.COMMON_CONFIG.PUMPKIN_STAFF_SUMMON_AMOUNT.get(); i++) {
            Entity extra = original.call(type, level, pos, spawnType);
            if (extra != null) {
                extra.setYRot(level.getRandom().nextFloat() * 360.0F);
            }
        }
        return first;
    }
}
