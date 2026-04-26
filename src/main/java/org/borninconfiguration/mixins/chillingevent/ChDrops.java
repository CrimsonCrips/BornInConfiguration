package org.borninconfiguration.mixins.chillingevent;




import net.mcreator.borninchaosv.init.BornInChaosV1ModBlocks;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.init.BornInChaosV1ModItems;
import net.mcreator.borninchaosv.init.BornInChaosV1ModParticleTypes;
import net.mcreator.borninchaosv.procedures.ChillingHorrorEventDropProcedure;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.Event;
import org.borninconfiguration.BornInConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Calendar;

@Mixin(ChillingHorrorEventDropProcedure.class)

public abstract class ChDrops {


    @Inject(method = "execute(Lnet/neoforged/bus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        boolean season = ((Calendar.getInstance().get(2) == 11 && Calendar.getInstance().get(5) >= 21 && Calendar.getInstance().get(5) <= 31 || Calendar.getInstance().get(2) == 0 && Calendar.getInstance().get(5) >= 1 && Calendar.getInstance().get(5) <= 10) || BornInConfiguration.COMMON_CONFIG.CHILLING_HORROR_ENABLED.get());
        if (entity != null) {
            if ((entity instanceof Zombie || entity instanceof Skeleton) && season) {
                ItemStack var10000;
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor = (LivingEntity) entity;
                    var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                if (var10000.getItem() != ((Block) BornInChaosV1ModBlocks.SPOOKY_SNOWMAN_HEAD.get()).asItem()) {
                    if (entity instanceof LivingEntity) {
                        LivingEntity _entGetArmor = (LivingEntity) entity;
                        var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                    } else {
                        var10000 = ItemStack.EMPTY;
                    }

                    if (var10000.getItem() != ((Block) BornInChaosV1ModBlocks.CREEPY_NUTCRACKER.get()).asItem()) {
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity) entity;
                            var10000 = _livEnt.getMainHandItem();
                        } else {
                            var10000 = ItemStack.EMPTY;
                        }

                        if (var10000.getItem() != BornInChaosV1ModItems.NUT_HAMMER.get()) {
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity) entity;
                                var10000 = _livEnt.getMainHandItem();
                            } else {
                                var10000 = ItemStack.EMPTY;
                            }

                            if (var10000.getItem() != BornInChaosV1ModItems.ICY_SWEETNESS.get()) {
                                return;
                            }
                        }
                    }
                }

                if (Math.random() < (double) 0.5F) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel) world;
                        ItemEntity entityToSpawn = new ItemEntity(_level, entity.getX(), entity.getY() + (double) 0.5F, entity.getZ(), new ItemStack((ItemLike) BornInChaosV1ModItems.CREEPY_GIFT.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }

                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel) world;
                        _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.SNOWCLOUD.get(), entity.getX(), entity.getY() + (double) 1.0F, entity.getZ(), 4, 0.3, 0.3, 0.3, 0.1);
                    }

                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel) world;
                        _level.sendParticles((SimpleParticleType) BornInChaosV1ModParticleTypes.WANINGSNOWFLAKE.get(), entity.getX(), entity.getY() + (double) 1.0F, entity.getZ(), 7, 0.3, 0.3, 0.3, 0.2);
                    }

                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel) world;
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
                    }
                }
            }

        }
    }
}
