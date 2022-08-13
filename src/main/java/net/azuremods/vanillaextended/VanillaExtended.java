package net.azuremods.vanillaextended;

import net.azuremods.vanillaextended.block.ModBlocks;
import net.azuremods.vanillaextended.item.ModItems;
import net.azuremods.vanillaextended.world.feature.ModConfiguredFeatures;
import net.azuremods.vanillaextended.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaExtended implements ModInitializer {
	public static final String MOD_ID = "vanillaextended";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModBlocks.registerBlocks();
		ModItems.registerModItems();

		ModOreGeneration.generateOres();
	}
}
