package org.borninconfiguration.mixins.chillingevent;




import net.mcreator.borninchaosv.init.BornInChaosV1ModBlocks;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.init.BornInChaosV1ModItems;
import net.mcreator.borninchaosv.procedures.ChillingHorrorEventSpawnProcedure;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.bus.api.Event;
import org.borninconfiguration.BornInConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Calendar;

@Mixin(ChillingHorrorEventSpawnProcedure.class)

public abstract class ChSpawn {


    @Inject(method = "execute(Lnet/neoforged/bus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, Entity entity, CallbackInfo ci) {
        ci.cancel();
        boolean season = ((Calendar.getInstance().get(2) == 11 && Calendar.getInstance().get(5) >= 21 && Calendar.getInstance().get(5) <= 31 || Calendar.getInstance().get(2) == 0 && Calendar.getInstance().get(5) >= 1 && Calendar.getInstance().get(5) <= 10) || BornInConfiguration.COMMON_CONFIG.CHILLING_HORROR_ENABLED.get());
        if (entity != null) {
            if ((entity instanceof Zombie || entity instanceof Skeleton) && season) {
                if (entity instanceof Zombie) {
                    if (Math.random() < 0.35 && !world.isClientSide()) {
                        if (entity instanceof Player) {
                            Player _player = (Player)entity;
                            _player.getInventory().armor.set(3, new ItemStack((ItemLike)BornInChaosV1ModBlocks.CREEPY_NUTCRACKER.get()));
                            _player.getInventory().setChanged();
                        } else if (entity instanceof LivingEntity) {
                            LivingEntity _living = (LivingEntity)entity;
                            _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)BornInChaosV1ModBlocks.CREEPY_NUTCRACKER.get()));
                        }

                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity = (LivingEntity)entity;
                            ItemStack _setstack = (new ItemStack((ItemLike)BornInChaosV1ModItems.NUT_HAMMER.get())).copy();
                            _setstack.setCount(1);
                            _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (_entity instanceof Player) {
                                Player _player = (Player)_entity;
                                _player.getInventory().setChanged();
                            }
                        }
                    } else if (Math.random() < 0.35 && !world.isClientSide()) {
                        if (entity instanceof Player) {
                            Player _player = (Player)entity;
                            _player.getInventory().armor.set(3, new ItemStack((ItemLike)BornInChaosV1ModBlocks.SPOOKY_SNOWMAN_HEAD.get()));
                            _player.getInventory().setChanged();
                        } else if (entity instanceof LivingEntity) {
                            LivingEntity _living = (LivingEntity)entity;
                            _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)BornInChaosV1ModBlocks.SPOOKY_SNOWMAN_HEAD.get()));
                        }

                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity = (LivingEntity)entity;
                            ItemStack _setstack = (new ItemStack((ItemLike)BornInChaosV1ModItems.ICY_SWEETNESS.get())).copy();
                            _setstack.setCount(1);
                            _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (_entity instanceof Player) {
                                Player _player = (Player)_entity;
                                _player.getInventory().setChanged();
                            }
                        }
                    }
                }

                if (entity instanceof Skeleton) {
                    if (Math.random() < (double)0.25F && !world.isClientSide()) {
                        if (entity instanceof Player) {
                            Player _player = (Player)entity;
                            _player.getInventory().armor.set(3, new ItemStack((ItemLike)BornInChaosV1ModBlocks.CREEPY_NUTCRACKER.get()));
                            _player.getInventory().setChanged();
                        } else if (entity instanceof LivingEntity) {
                            LivingEntity _living = (LivingEntity)entity;
                            _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)BornInChaosV1ModBlocks.CREEPY_NUTCRACKER.get()));
                        }

                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity = (LivingEntity)entity;
                            ItemStack _setstack = (new ItemStack((ItemLike)BornInChaosV1ModItems.NUT_HAMMER.get())).copy();
                            _setstack.setCount(1);
                            _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (_entity instanceof Player) {
                                Player _player = (Player)_entity;
                                _player.getInventory().setChanged();
                            }
                        }
                    } else if (Math.random() < 0.35 && !world.isClientSide()) {
                        if (entity instanceof Player) {
                            Player _player = (Player)entity;
                            _player.getInventory().armor.set(3, new ItemStack((ItemLike)BornInChaosV1ModBlocks.SPOOKY_SNOWMAN_HEAD.get()));
                            _player.getInventory().setChanged();
                        } else if (entity instanceof LivingEntity) {
                            LivingEntity _living = (LivingEntity)entity;
                            _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)BornInChaosV1ModBlocks.SPOOKY_SNOWMAN_HEAD.get()));
                        }

                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity = (LivingEntity)entity;
                            ItemStack _setstack = (new ItemStack((ItemLike)BornInChaosV1ModItems.ICY_SWEETNESS.get())).copy();
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
}
