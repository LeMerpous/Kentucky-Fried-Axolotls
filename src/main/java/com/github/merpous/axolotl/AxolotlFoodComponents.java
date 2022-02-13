package com.github.merpous.axolotl;


import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.effect.StatusEffectInstance;

public class AxolotlFoodComponents {

    public static final FoodComponent FRIED_AXOLOTL = (new FoodComponent.Builder()).snack().hunger(10).saturationModifier(3).build();
}
