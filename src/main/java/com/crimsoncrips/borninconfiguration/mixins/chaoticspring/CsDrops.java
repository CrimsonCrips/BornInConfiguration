package com.crimsoncrips.borninconfiguration.mixins.chaoticspring;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import net.mcreator.borninchaosv.init.BornInChaosV1ModBlocks;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.init.BornInChaosV1ModItems;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.ChaoticSpringEventDropProcedure;
import net.mcreator.borninchaosv.procedures.ChillingHorrorEventDropProcedure;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Calendar;

@Mixin(ChaoticSpringEventDropProcedure.class)

public abstract class CsDrops {


    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true,remap = false)
    private static void injected(Event event, LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        boolean season = ((Calendar.getInstance().get(2) == 3 && Calendar.getInstance().get(5) >= 10 && Calendar.getInstance().get(5) <= 22) || BornInConfiguration.COMMON_CONFIG.CHAOTIC_SPRING_ENABLED.get());
        if (entity != null) {
            if ((entity instanceof Zombie || entity instanceof Skeleton) && season) {
                ItemStack var10000;
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor = (LivingEntity)entity;
                    var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                if (var10000.getItem() != BornInChaosV1ModItems.KILLER_RABBIT_EARS_HELMET.get()) {
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entity;
                        var10000 = _livEnt.getMainHandItem();
                    } else {
                        var10000 = ItemStack.EMPTY;
                    }

                    if (var10000.getItem() != BornInChaosV1ModItems.CARROT_SWORD.get()) {
                        return;
                    }
                }

                if (Math.random() < (double)0.5F) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY() + (double)0.5F, entity.getZ(), new ItemStack((ItemLike)ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("born_in_chaos_v1:easter_eggs"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR)));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }

                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        _level.sendParticles((SimpleParticleType)BornInChaosV1ModParticleTypes.LITTLE_CARROT.get(), entity.getX(), entity.getY() + (double)1.0F, entity.getZ(), Mth.nextInt(RandomSource.create(), 4, 6), 0.3, 0.3, 0.3, 0.2);
                    }

                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
                    }
                } else if (Math.random() < 0.1) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY() + (double)0.5F, entity.getZ(), new ItemStack((ItemLike)BornInChaosV1ModItems.TRANSFORMING_EASTER_CAKE.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }

                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        _level.sendParticles((SimpleParticleType)BornInChaosV1ModParticleTypes.LITTLE_CARROT.get(), entity.getX(), entity.getY() + (double)1.0F, entity.getZ(), Mth.nextInt(RandomSource.create(), 4, 6), 0.3, 0.3, 0.3, 0.2);
                    }

                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
                    }
                }
            }

        }
    }
}
