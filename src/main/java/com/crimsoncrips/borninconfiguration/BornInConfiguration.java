package com.crimsoncrips.borninconfiguration;


import com.crimsoncrips.borninconfiguration.datagen.BIConfigDatagen;
import com.crimsoncrips.borninconfiguration.event.BICEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Locale;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BornInConfiguration.MODID)
public class BornInConfiguration {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "borninconfiguration";

    public static final BICServerConfig COMMON_CONFIG;
    private static final ForgeConfigSpec COMMON_CONFIG_SPEC;

    static {
        final Pair<BICServerConfig, ForgeConfigSpec> serverPair = new ForgeConfigSpec.Builder().configure(BICServerConfig::new);
        COMMON_CONFIG = serverPair.getLeft();
        COMMON_CONFIG_SPEC = serverPair.getRight();
    }

    public BornInConfiguration() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_CONFIG_SPEC, "borninconfiguration-general.toml");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(BIConfigDatagen::generateData);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new BICEvent());
    }


    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MODID, name.toLowerCase(Locale.ROOT));
    }


}
