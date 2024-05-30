package com.crimsoncrips.borninconfiguration.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public final class ConfigHolder {

    public static final BornInChaosConfig BORNCONFIG;

    public static final ForgeConfigSpec BORNCONFIG_SPEC;

    static {
        final Pair<BornInChaosConfig, ForgeConfigSpec> config = new ForgeConfigSpec.Builder().configure(BornInChaosConfig::new);
        BORNCONFIG = config.getLeft();
        BORNCONFIG_SPEC = config.getRight();
    }
}