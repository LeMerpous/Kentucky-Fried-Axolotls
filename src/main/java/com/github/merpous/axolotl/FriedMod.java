package com.github.merpous.axolotl;

import net.fabricmc.api.ModInitializer;

import com.github.merpous.axolotl.item.AxolotlItems;

public class FriedMod implements ModInitializer {

	public static final String MOD_ID = "kfa";

	@Override
	public void onInitialize() {



		AxolotlItems.registerModItems();


		System.out.println("Hello Log Reader!");
	}
}
