package com.crimsoncrips.borninconfiguration.mixins.spawning.nightstalker;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import net.mcreator.borninchaosv.init.BornInChaosV1ModGameRules;
import net.mcreator.borninchaosv.procedures.WarningSoundProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WarningSoundProcedure.class)

public class NightStalkerWarningConfig {

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injected(Event event, LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
        if (entity == null)
            return;
        Player player = (Player)entity;
        if (BIConfig.NIGHTMARE_SPAWN_ENABLED && world.dayTime() == BIConfig.DAYS_TILL_NIGHTMARE * 24000L){
            if (world instanceof Level level){
                if (!level.isClientSide){
                    player.displayClientMessage(Component.literal("§cYou feel like something is chasing you..."), false);
                    level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stalker_roar_distant")), SoundSource.NEUTRAL, 1.2F, 1.0F);
                } else level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:stalker_roar_distant")), SoundSource.NEUTRAL, 1.2F, 1.0F, false);
            }
        }
        if (BIConfig.NIGHTMARE_SPAWN_ENABLED && world.dayTime() == BIConfig.DAYS_TILL_MISSIONER * 24000L){
            if (world instanceof Level level){
                if (!level.isClientSide){
                    player.displayClientMessage(Component.literal("§cSomething powerful is invading this world..."), false);
                    level.playSound((Player)null, BlockPos.containing(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:missionary_alert")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                } else level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("born_in_chaos_v1:missionary_alert")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
            }
        }
    }
}
