package net.sonicd5.slcreator;

import net.fabricmc.api.ModInitializer;

import net.sonicd5.slcreator.init.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLCreator implements ModInitializer {
	public static final String MOD_ID = "slcreator";
	public static final Logger LOGGER = LoggerFactory.getLogger("SLCreator");

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModBlocks.initialize();
		ModItemGroups.initialize();
		ModEntities.initialize();
		ModSounds.initialize();
	}
}