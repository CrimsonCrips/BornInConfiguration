package com.crimsoncrips.borninconfiguration.stats;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.common.ForgeMod;

import java.util.function.Supplier;

public enum MobStat {
    MAX_HEALTH(() -> Attributes.MAX_HEALTH),
    ARMOR(() -> Attributes.ARMOR),
    ARMOR_TOUGHNESS(() -> Attributes.ARMOR_TOUGHNESS),
    ATTACK_DAMAGE(() -> Attributes.ATTACK_DAMAGE),
    ATTACK_KNOCKBACK(() -> Attributes.ATTACK_KNOCKBACK),
    KNOCKBACK_RESISTANCE(() -> Attributes.KNOCKBACK_RESISTANCE),
    MOVEMENT_SPEED(() -> Attributes.MOVEMENT_SPEED),
    FOLLOW_RANGE(() -> Attributes.FOLLOW_RANGE),
    FLYING_SPEED(() -> Attributes.FLYING_SPEED, true),
    SWIM_SPEED(ForgeMod.SWIM_SPEED, true);

    private final Supplier<Attribute> attribute;
    public final boolean optional;

    MobStat(Supplier<Attribute> attribute) {
        this(attribute, false);
    }

    MobStat(Supplier<Attribute> attribute, boolean optional) {
        this.attribute = attribute;
        this.optional = optional;
    }

    public Attribute attribute() {
        return attribute.get();
    }
}
