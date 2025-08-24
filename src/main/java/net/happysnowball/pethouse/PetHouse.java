package net.happysnowball.pethouse;

import net.fabricmc.api.ModInitializer;

import net.happysnowball.pethouse.register.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetHouse implements ModInitializer {
	public static final String MOD_ID = "pet_house";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}