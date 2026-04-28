package com.crimsoncrips.borninconfiguration.mixins.chaoticspring;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.init.BornInChaosV1ModBlocks;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.init.BornInChaosV1ModItems;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.ChaoticSpringEventDropProcedure;
import net.mcreator.borninchaosv.procedures.ChaoticSpringEventSpawnProcedure;
import net.mcreator.borninchaosv.procedures.ChillingHorrorEventSpawnProcedure;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Calendar;

@Mixin(ChaoticSpringEventSpawnProcedure.class)

public abstract class CsSpawn {


    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, Entity entity, CallbackInfo ci) {
        ci.cancel();
        boolean season = ((Calendar.getInstance().get(2) == 3 && Calendar.getInstance().get(5) >= 10 && Calendar.getInstance().get(5) <= 22 )|| BornInConfiguration.COMMON_CONFIG.CHAOTIC_SPRING_ENABLED.get());
        if (entity != null) {
            if ((entity instanceof Zombie || entity instanceof Skeleton) && season) {
                if (entity instanceof Zombie && Math.random() < 0.35 && !world.isClientSide()) {
                    if (entity instanceof Player) {
                        Player _player = (Player)entity;
                        _player.getInventory().armor.set(3, new ItemStack((ItemLike)BornInChaosV1ModItems.KILLER_RABBIT_EARS_HELMET.get()));
                        _player.getInventory().setChanged();
                    } else if (entity instanceof LivingEntity) {
                        LivingEntity _living = (LivingEntity)entity;
                        _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)BornInChaosV1ModItems.KILLER_RABBIT_EARS_HELMET.get()));
                    }

                    if (entity instanceof LivingEntity) {
                        LivingEntity _entity = (LivingEntity)entity;
                        ItemStack _setstack = (new ItemStack((ItemLike)BornInChaosV1ModItems.CARROT_SWORD.get())).copy();
                        _setstack.setCount(1);
                        _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (_entity instanceof Player) {
                            Player _player = (Player)_entity;
                            _player.getInventory().setChanged();
                        }
                    }

                    if (entity instanceof LivingEntity) {
                        LivingEntity _entity = (LivingEntity)entity;
                        if (!_entity.level().isClientSide()) {
                            _entity.addEffect(new MobEffectInstance(MobEffects.JUMP, Integer.MAX_VALUE, 1, false, false));
                        }
                    }
                }

                if (entity instanceof Skeleton && Math.random() < (double)0.25F && !world.isClientSide()) {
                    if (entity instanceof Player) {
                        Player _player = (Player)entity;
                        _player.getInventory().armor.set(3, new ItemStack((ItemLike)BornInChaosV1ModItems.KILLER_RABBIT_EARS_HELMET.get()));
                        _player.getInventory().setChanged();
                    } else if (entity instanceof LivingEntity) {
                        LivingEntity _living = (LivingEntity)entity;
                        _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)BornInChaosV1ModItems.KILLER_RABBIT_EARS_HELMET.get()));
                    }

                    if (entity instanceof LivingEntity) {
                        LivingEntity _entity = (LivingEntity)entity;
                        if (!_entity.level().isClientSide()) {
                            _entity.addEffect(new MobEffectInstance(MobEffects.JUMP, Integer.MAX_VALUE, 1, false, false));
                        }
                    }

                    if (Math.random() < 0.45 && entity instanceof LivingEntity) {
                        LivingEntity _entity = (LivingEntity)entity;
                        ItemStack _setstack = (new ItemStack((ItemLike)BornInChaosV1ModItems.CARROT_SWORD.get())).copy();
                        _setstack.setCount(1);
                        _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (_entity instanceof Player) {
                            Player _player = (Player)_entity;
                            _player.getInventory().setChanged();
                        }
                    }
                }
            }

        }
    }
}