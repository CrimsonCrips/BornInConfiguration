package com.crimsoncrips.borninconfiguration.utils;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;

public final class EntityUtils {
    public static void setAttribute(LivingEntity entity, Attribute attribute, double value) {
        AttributeInstance attributeInstance = entity.getAttribute(attribute);
        if (attributeInstance == null)
            return;
        attributeInstance.setBaseValue(value);
    }
}
