package com.crimsoncrips.borninconfiguration;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import com.crimsoncrips.borninconfiguration.config.ConfigHolder;
import com.crimsoncrips.borninconfiguration.utils.EntityUtils;
import net.mcreator.borninchaosv.entity.DarkVortexEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.MobSpawnEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BornInConfiguration.MODID)
public class BornInConfiguration {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "borninconfiguration";

    public BornInConfiguration() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onModConfigEvent);
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHolder.BORNCONFIG_SPEC, "borninconfiguration.toml");

    }

    public void onModConfigEvent(final ModConfigEvent event) {
        final ModConfig config = event.getConfig();
        // Rebake the configs when they change
        if (config.getSpec() == ConfigHolder.BORNCONFIG_SPEC) {
            BIConfig.bake();
        }
    }

    @SubscribeEvent
    public void onMobSpawn(MobSpawnEvent.FinalizeSpawn event) {
        Mob mob = event.getEntity();

        if (mob instanceof DarkVortexEntity) {
            EntityUtils.setAttribute(mob, Attributes.MOVEMENT_SPEED, BIConfig.DARK_VORTEX_SPEED);
            EntityUtils.setAttribute(mob, Attributes.MAX_HEALTH, BIConfig.DARK_VORTEX_HEALTH);
            mob.setHealth((float) BIConfig.DARK_VORTEX_HEALTH);
            EntityUtils.setAttribute(mob, Attributes.ARMOR, BIConfig.DARK_VORTEX_ARMOR);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_DAMAGE, BIConfig.DARK_VORTEX_DAMAGE);
            EntityUtils.setAttribute(mob, Attributes.FOLLOW_RANGE, 17.0);
            EntityUtils.setAttribute(mob, Attributes.ATTACK_KNOCKBACK, BIConfig.DARK_VORTEX_KNOCKBACK);
            EntityUtils.setAttribute(mob, Attributes.KNOCKBACK_RESISTANCE, BIConfig.DARK_VORTEX_KNOCKBACK_RESISTANCE);
        }

        // TODO: Add more entities here
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }


}
