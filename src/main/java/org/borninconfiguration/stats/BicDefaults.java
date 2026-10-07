package org.borninconfiguration.stats;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BicDefaults {

    private static final Set<String> ZERO_WHEN_UNSET = Set.of(
            MobStat.ARMOR.name(), MobStat.ARMOR_TOUGHNESS.name(), MobStat.ATTACK_KNOCKBACK.name(), MobStat.KNOCKBACK_RESISTANCE.name());

    private final Map<String, Map<String, Double>> values;

    private BicDefaults(Map<String, Map<String, Double>> values) {
        this.values = values;
    }

    public static BicDefaults load(String file) {
        try (InputStream stream = BicDefaults.class.getResourceAsStream("/borninconfiguration/" + file)) {
            if (stream == null) {
                return new BicDefaults(Map.of());
            }
            Map<String, Map<String, Double>> values = new Gson().fromJson(
                    new InputStreamReader(stream, StandardCharsets.UTF_8),
                    new TypeToken<Map<String, Map<String, Double>>>() {}.getType());
            return new BicDefaults(values);
        } catch (Exception e) {
            return new BicDefaults(Map.of());
        }
    }

    public String describe(List<String> ids, String key) {
        Map<String, Double> perId = new LinkedHashMap<>();
        for (String id : ids) {
            Map<String, Double> attributes = values.get(id);
            if (attributes == null) {
                continue;
            }
            Double value = attributes.get(key);
            if (value == null && ZERO_WHEN_UNSET.contains(key)) {
                value = 0.0;
            }
            if (value != null) {
                perId.put(id, value);
            }
        }
        if (perId.isEmpty()) {
            return null;
        }
        if (perId.values().stream().distinct().count() == 1) {
            return format(perId.values().iterator().next());
        }
        StringBuilder text = new StringBuilder();
        perId.forEach((id, value) -> text.append(text.length() == 0 ? "" : ", ").append(id).append(' ').append(format(value)));
        return text.toString();
    }

    private static String format(double value) {
        return value == Math.rint(value) ? String.valueOf((long) value) : String.valueOf(value);
    }
}
