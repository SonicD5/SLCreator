package net.sonicd5.slcreator;

import net.fabricmc.api.ModInitializer;

import net.sonicd5.slcreator.init.ModBlocks;
import net.sonicd5.slcreator.init.ModItemGroups;
import net.sonicd5.slcreator.init.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SilentCreator implements ModInitializer {
	public static final String MOD_ID = "slcreator";
	public static final Logger LOGGER = LoggerFactory.getLogger("Silent Creator");

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModBlocks.initialize();
		ModItemGroups.initialize();
	}
}