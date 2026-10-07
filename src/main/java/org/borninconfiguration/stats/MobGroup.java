package org.borninconfiguration.stats;

import org.borninconfiguration.utils.EntityUtils;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class MobGroup {

    public enum Spawning {
        NONE,
        ALL,
        FIRST
    }

    public final String name;
    public final List<String> ids;
    private final String spawnKey;
    private final Spawning spawning;

    private ModConfigSpec.BooleanValue spawnEnabled;
    private final Map<MobStat, ModConfigSpec.DoubleValue> stats = new EnumMap<>(MobStat.class);

    MobGroup(String name, String spawnKey, Spawning spawning, String... ids) {
        this.name = name;
        this.spawnKey = spawnKey;
        this.spawning = spawning;
        this.ids = List.of(ids);
    }

    public void define(ModConfigSpec.Builder builder, BicDefaults defaults) {
        builder.comment("Applies to: born_in_chaos_v1:" + String.join(", born_in_chaos_v1:", ids)).push(name);
        if (spawning != Spawning.NONE) {
            spawnEnabled = builder.comment("Whether " + name + " can spawn").define(spawnKey, true);
        }
        for (MobStat stat : MobStat.values()) {
            String bicDefault = defaults.describe(ids, stat.name());
            if (stat.optional && bicDefault == null) {
                continue;
            }
            stats.put(stat, builder
                    .comment("Born in Chaos default: " + (bicDefault == null ? "none" : bicDefault), "-1 keeps Born in Chaos's value")
                    .defineInRange(stat.name(), -1.0, -1.0, 1_000_000.0));
        }
        builder.pop();
    }

    public ModConfigSpec.BooleanValue spawnEnabled() {
        return spawnEnabled;
    }

    public boolean isSpawnBlocked(String id) {
        if (spawnEnabled == null || spawnEnabled.get()) {
            return false;
        }
        return spawning == Spawning.ALL || ids.get(0).equals(id);
    }

    public void applyStats(LivingEntity entity) {
        stats.forEach((stat, value) -> {
            double configured = value.get();
            if (configured >= 0) {
                EntityUtils.setAttribute(entity, stat.attribute(), configured);
            }
        });
    }
}
