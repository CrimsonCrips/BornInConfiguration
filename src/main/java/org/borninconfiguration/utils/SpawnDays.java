package org.borninconfiguration.utils;

import org.borninconfiguration.BornInConfiguration;

public final class SpawnDays {

    private static final long DAY = 24000L;
    private static final int BIC_NIGHTMARE_DAYS = 3;
    private static final int BIC_MISSIONER_DAYS = 10;
    private static final int BIC_LIFESTEALER_DAYS = 10;

    private SpawnDays() {
    }

    public static long nightmare(long bicTime) {
        return shift(bicTime, BIC_NIGHTMARE_DAYS, BornInConfiguration.COMMON_CONFIG.DAYS_TILL_NIGHTMARE.get());
    }

    public static long missioner(long bicTime) {
        return shift(bicTime, BIC_MISSIONER_DAYS, BornInConfiguration.COMMON_CONFIG.DAYS_TILL_MISSIONER.get());
    }

    public static long lifestealer(long bicTime) {
        return shift(bicTime, BIC_LIFESTEALER_DAYS, BornInConfiguration.COMMON_CONFIG.DAYS_TILL_LIFESTEALER.get());
    }

    public static long nightmareWarning(long bicTime) {
        return BornInConfiguration.COMMON_CONFIG.NIGHTMARE_STALKER_SPAWNING_ENABLED.get() ? nightmare(bicTime) : -1L;
    }

    public static long missionerWarning(long bicTime) {
        return BornInConfiguration.COMMON_CONFIG.MISSIONER_SPAWNING_ENABLED.get() ? missioner(bicTime) : -1L;
    }

    private static long shift(long bicTime, int bicDays, int configuredDays) {
        return bicTime + (configuredDays - bicDays) * DAY;
    }
}
