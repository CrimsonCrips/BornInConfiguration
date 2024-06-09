package com.crimsoncrips.borninconfiguration.mixins.spawning.maggot;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModEntities;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.BarrelZombieDeathTimeIsReachedProcedure;
import net.mcreator.borninchaosv.procedures.ZombieMaggotsProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;

@Mixin(ZombieMaggotsProcedure.class)

public class ZombieMaggot {
    @Unique
    private static void spawnMaggot(ServerLevel serverLevel, double x, double y, double z){
        Entity entityToSpawn = (BornInChaosV1ModEntities.MAGGOT.get()).spawn(serverLevel, BlockPos.containing(x + 0.5, y + 1.0, z + 0.5), MobSpawnType.MOB_SUMMONED);
        if (entityToSpawn == null)
            return;
        serverLevel.sendParticles(ParticleTypes.POOF, x + 0.5, y + 1.0, z + 0.5, 3, 0.1, 0.1, 0.1, 0.1);
        entityToSpawn.setYRot(serverLevel.getRandom().nextFloat() * 360.0F);
    }

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity,CallbackInfo ci) {
        ci.cancel();
        if (entity instanceof Zombie || entity instanceof ZombieVillager || entity instanceof ZombieHorse || entity instanceof Husk || entity instanceof Drowned) {
            if (BIConfig.MAGGOTS_APPEARANCE_ENABLED && Math.random() < 0.15){
                if (world instanceof ServerLevel serverLevel) {
                    serverLevel.sendParticles(BornInChaosV1ModParticleTypes.FLESHSPLASH.get(), x, y + 1.0, z, 5, 0.3, 0.3, 0.3, 0.1);
                    spawnMaggot(serverLevel,x,y,z);
                    if (!(Math.random() < 0.6))
                        return;
                    spawnMaggot(serverLevel,x,y,z);
                    if (!(Math.random() < 0.3))
                        return;
                    spawnMaggot(serverLevel,x,y,z);
                }
                if (world instanceof Level level) {
                    if (!level.isClientSide){
                        level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break")), SoundSource.NEUTRAL, 0.9F, 0.9F);
                        level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stomach_open")), SoundSource.NEUTRAL, 0.8F, 1.0F);
                    } else {
                        level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stomach_open")), SoundSource.NEUTRAL, 0.8F, 1.0F, false);
                        level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break")), SoundSource.NEUTRAL, 0.9F, 0.9F, false);
                    }
                }
            }
        }
    }




}
