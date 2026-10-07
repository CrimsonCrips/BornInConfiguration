package com.crimsoncrips.borninconfiguration.event;


import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.crimsoncrips.borninconfiguration.stats.ConfigurableItem;
import com.crimsoncrips.borninconfiguration.stats.ConfigurableItems;
import com.crimsoncrips.borninconfiguration.stats.ItemStat;
import com.crimsoncrips.borninconfiguration.stats.MobGroup;
import com.crimsoncrips.borninconfiguration.stats.MobGroups;
import net.mcreator.borninchaosv.entity.*;
import net.mcreator.borninchaosv.network.BornInChaosV1ModVariables;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.MobSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Mod.EventBusSubscriber(modid = BornInConfiguration.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BICEvent {

    private static final String STATS_APPLIED = BornInConfiguration.MODID + ":stats_applied";

    private static final UUID BASE_ATTACK_DAMAGE = ObfuscationReflectionHelper.getPrivateValue(Item.class, null, "f_41374_");
    private static final UUID BASE_ATTACK_SPEED = ObfuscationReflectionHelper.getPrivateValue(Item.class, null, "f_41375_");
    private static final Map<ArmorItem.Type, UUID> ARMOR_MODIFIERS = new EnumMap<>(Map.of(
            ArmorItem.Type.BOOTS, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            ArmorItem.Type.LEGGINGS, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            ArmorItem.Type.CHESTPLATE, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            ArmorItem.Type.HELMET, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")));

    private static final Class<?>[] PUMPKIN_RIDERS = {
            LordPumpkinheadEntity.class,
            LordPumpkinheadHeadEntity.class,
            LordTheHeadlessEntity.class,
            LordPumpkinheadWithoutaHorseEntity.class,
            SirPumpkinheadEntity.class,
            SirPumpkinheadWithoutHorseEntity.class,
            SirTheHeadlessEntity.class
    };

    @SubscribeEvent
    public void tick(LivingEvent.LivingTickEvent livingTickEvent){
        LivingEntity livingEntity = livingTickEvent.getEntity();


        if (livingEntity instanceof Player player && !BornInConfiguration.COMMON_CONFIG.NAUGHTINESS_ENABLED.get()){
            double naughty = (player.getCapability(BornInChaosV1ModVariables.PLAYER_VARIABLES_CAPABILITY, (Direction)null).orElse(new BornInChaosV1ModVariables.PlayerVariables())).naughtiness;
            if (naughty > 0){
                (player.getCapability(BornInChaosV1ModVariables.PLAYER_VARIABLES_CAPABILITY, (Direction)null).orElse(new BornInChaosV1ModVariables.PlayerVariables())).naughtiness = 0;
            }
        }
    }

    @SubscribeEvent
    public void onMobSpawn(MobSpawnEvent.FinalizeSpawn event) {
        Mob mob = event.getEntity();
        MobGroup group = MobGroups.get(mob.getType());
        if (group == null) {
            return;
        }
        String id = MobGroups.idPath(mob.getType());
        if (group.isSpawnBlocked(id)
                || (id.equals("missionary_raider") && !BornInConfiguration.COMMON_CONFIG.MISSIONER_RAID_ENABLED.get())) {
            event.setSpawnCancelled(true);
        }
    }

    @SubscribeEvent
    public void onJoinLevel(EntityJoinLevelEvent event) {
        if (event.getLevel().isClientSide() || !(event.getEntity() instanceof Mob mob)) {
            return;
        }
        MobGroup group = MobGroups.get(mob.getType());
        if (group == null) {
            return;
        }

        group.applyStats(mob);
        CompoundTag data = mob.getPersistentData();
        if (!data.getBoolean(STATS_APPLIED)) {
            mob.setHealth(mob.getMaxHealth());
            data.putBoolean(STATS_APPLIED, true);
        } else if (mob.getHealth() > mob.getMaxHealth()) {
            mob.setHealth(mob.getMaxHealth());
        }

        if (BornInConfiguration.COMMON_CONFIG.RETALLIATION_ENABLED.get() && mob instanceof PathfinderMob pathfinder) {
            boolean mount = mob instanceof FelsteedEntity || mob instanceof LordsFelsteedEntity;
            pathfinder.targetSelector.addGoal(1, mount ? new HurtByTargetGoal(pathfinder, PUMPKIN_RIDERS) : new HurtByTargetGoal(pathfinder));
        }
    }

    @SubscribeEvent
    public void onItemAttributes(ItemAttributeModifierEvent event) {
        ConfigurableItem item = ConfigurableItems.get(event.getItemStack().getItem());
        if (item == null) {
            return;
        }
        if (event.getItemStack().getItem() instanceof ArmorItem armor) {
            if (event.getSlotType() != armor.getEquipmentSlot()) {
                return;
            }
            UUID id = ARMOR_MODIFIERS.get(armor.getType());
            replaceBase(event, Attributes.ARMOR, id, "Armor modifier", item.stat(ItemStat.ARMOR), 0.0);
            replaceBase(event, Attributes.ARMOR_TOUGHNESS, id, "Armor toughness", item.stat(ItemStat.ARMOR_TOUGHNESS), 0.0);
            replaceBase(event, Attributes.KNOCKBACK_RESISTANCE, id, "Armor knockback resistance", item.stat(ItemStat.KNOCKBACK_RESISTANCE), 0.0);
        } else if (event.getSlotType() == EquipmentSlot.MAINHAND) {
            replaceBase(event, Attributes.ATTACK_DAMAGE, BASE_ATTACK_DAMAGE, "Weapon modifier", item.stat(ItemStat.ATTACK_DAMAGE), 1.0);
            replaceBase(event, Attributes.ATTACK_SPEED, BASE_ATTACK_SPEED, "Weapon modifier", item.stat(ItemStat.ATTACK_SPEED), 4.0);
        }
    }

    private static void replaceBase(ItemAttributeModifierEvent event, Attribute attribute, UUID id, String name, double configured, double playerBase) {
        if (configured < 0) {
            return;
        }
        List<AttributeModifier> existing = event.getModifiers().get(attribute).stream()
                .filter(modifier -> modifier.getId().equals(id))
                .toList();
        existing.forEach(modifier -> event.removeModifier(attribute, modifier));
        event.addModifier(attribute, new AttributeModifier(id, name, configured - playerBase, AttributeModifier.Operation.ADDITION));
    }
}
