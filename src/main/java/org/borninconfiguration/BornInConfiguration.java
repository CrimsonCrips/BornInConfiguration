package org.borninconfiguration;


import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.NeoForge;
import org.apache.commons.lang3.tuple.Pair;
import org.borninconfiguration.datagen.BIConfigDatagen;
import org.borninconfiguration.event.BICEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(BornInConfiguration.MODID)
public class BornInConfiguration {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "borninconfiguration";

    public static final BICServerConfig COMMON_CONFIG;
    private static final ModConfigSpec COMMON_CONFIG_SPEC;

    static {
        final Pair<BICServerConfig, ModConfigSpec> serverPair = new ModConfigSpec.Builder().configure(BICServerConfig::new);
        COMMON_CONFIG = serverPair.getLeft();
        COMMON_CONFIG_SPEC = serverPair.getRight();
    }

    public BornInConfiguration(ModContainer modContainer,IEventBus eventBus) {
        modContainer.registerConfig(ModConfig.Type.COMMON, COMMON_CONFIG_SPEC, "borninconfiguration-general.toml");
        eventBus.addListener(BIConfigDatagen::generateData);
        NeoForge.EVENT_BUS.register(new BICEvent());
    }


    public static ResourceLocation prefix(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name.toLowerCase(Locale.ROOT));
    }

}
