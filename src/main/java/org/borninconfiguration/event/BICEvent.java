package org.borninconfiguration.event;


import net.mcreator.borninchaosv.entity.*;
import net.mcreator.borninchaosv.network.BornInChaosV1ModVariables;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.ItemAttributeModifierEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.living.FinalizeSpawnEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import org.borninconfiguration.BornInConfiguration;
import org.borninconfiguration.stats.ConfigurableItem;
import org.borninconfiguration.stats.ConfigurableItems;
import org.borninconfiguration.stats.ItemStat;
import org.borninconfiguration.stats.MobGroup;
import org.borninconfiguration.stats.MobGroups;


public class BICEvent {

    private static final String STATS_APPLIED = BornInConfiguration.MODID + ":stats_applied";

    private static final ResourceLocation BASE_ATTACK_DAMAGE = ResourceLocation.withDefaultNamespace("base_attack_damage");
    private static final ResourceLocation BASE_ATTACK_SPEED = ResourceLocation.withDefaultNamespace("base_attack_speed");

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
    public void tick(PlayerTickEvent.Pre tickEvent){
        if (tickEvent.getEntity() instanceof Player player && !BornInConfiguration.COMMON_CONFIG.NAUGHTINESS_ENABLED.get()){
            double naughty = ((player.getData(BornInChaosV1ModVariables.PLAYER_VARIABLES)).naughtiness);
            if (naughty > 0){
                (player.getData(BornInChaosV1ModVariables.PLAYER_VARIABLES)).naughtiness = 0;
            }
        }
    }

    @SubscribeEvent
    public void onMobSpawn(FinalizeSpawnEvent event) {
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
            ResourceLocation id = ResourceLocation.withDefaultNamespace("armor." + armor.getType().getName());
            EquipmentSlotGroup slot = EquipmentSlotGroup.bySlot(armor.getEquipmentSlot());
            replaceBase(event, Attributes.ARMOR, id, slot, item.stat(ItemStat.ARMOR), 0.0);
            replaceBase(event, Attributes.ARMOR_TOUGHNESS, id, slot, item.stat(ItemStat.ARMOR_TOUGHNESS), 0.0);
            replaceBase(event, Attributes.KNOCKBACK_RESISTANCE, id, slot, item.stat(ItemStat.KNOCKBACK_RESISTANCE), 0.0);
        } else {
            replaceBase(event, Attributes.ATTACK_DAMAGE, BASE_ATTACK_DAMAGE, EquipmentSlotGroup.MAINHAND, item.stat(ItemStat.ATTACK_DAMAGE), 1.0);
            replaceBase(event, Attributes.ATTACK_SPEED, BASE_ATTACK_SPEED, EquipmentSlotGroup.MAINHAND, item.stat(ItemStat.ATTACK_SPEED), 4.0);
        }
    }

    private static void replaceBase(ItemAttributeModifierEvent event, Holder<Attribute> attribute, ResourceLocation id, EquipmentSlotGroup slot, double configured, double playerBase) {
        if (configured < 0) {
            return;
        }
        event.replaceModifier(attribute, new AttributeModifier(id, configured - playerBase, AttributeModifier.Operation.ADD_VALUE), slot);
    }
}
