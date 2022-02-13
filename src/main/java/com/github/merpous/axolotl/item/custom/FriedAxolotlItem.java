package com.github.merpous.axolotl.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

    public class FriedAxolotlItem
    extends Item { public FriedAxolotlItem(Item.Settings settings) { super(settings); }
    
        @Override
        public ItemStack finishUsing(ItemStack FRIED_AXOLOTL, World world, LivingEntity user) {
            ItemStack itemStack = super.finishUsing(FRIED_AXOLOTL, world, user);
            if (user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode) {
                return itemStack;
            }
            return new ItemStack(Items.BUCKET);
        }
    }

