package com.crimsoncrips.borninconfiguration;


import com.crimsoncrips.borninconfiguration.config.BIConfig;
import com.crimsoncrips.borninconfiguration.config.ConfigHolder;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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

    @SubscribeEvent
    public void onModConfigEvent(final ModConfigEvent event) {
        final ModConfig config = event.getConfig();
        // Rebake the configs when they change
        if (config.getSpec() == ConfigHolder.BORNCONFIG_SPEC) {
            BIConfig.bake();
        }
    }


}
