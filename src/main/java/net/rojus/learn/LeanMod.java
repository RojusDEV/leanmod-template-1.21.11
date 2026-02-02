package net.rojus.learn;

import net.fabricmc.api.ModInitializer;

import net.rojus.learn.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeanMod implements ModInitializer {
	public static final String MOD_ID = "leanmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}