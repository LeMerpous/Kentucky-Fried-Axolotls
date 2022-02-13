package com.github.merpous.axolotl.item;


import com.github.merpous.axolotl.AxolotlFoodComponents;
import com.github.merpous.axolotl.FriedMod;
import com.github.merpous.axolotl.item.custom.FriedAxolotlItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
//wattup shawty
public class AxolotlItems {

    public static final Item FRIED_AXOLOTL = registerItem("fried_axolotl",
    new FriedAxolotlItem(new FabricItemSettings().maxCount(1).food(AxolotlFoodComponents.FRIED_AXOLOTL).group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FriedMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + FriedMod.MOD_ID);
    }
    }

