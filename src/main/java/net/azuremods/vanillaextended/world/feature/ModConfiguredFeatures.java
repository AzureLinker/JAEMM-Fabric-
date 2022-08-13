package net.azuremods.vanillaextended.world.feature;

import net.azuremods.vanillaextended.VanillaExtended;
import net.azuremods.vanillaextended.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_MYTHRIL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MYTHRIL_DEEPSLATE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MYTHRIL_ORE =
            ConfiguredFeatures.register("mythril_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_MYTHRIL_ORES, 4));

    public static void registerConfiguredFeatures() {
        VanillaExtended.LOGGER.debug("Registering the ModConfiguredFeatures for " + VanillaExtended.MOD_ID);
    }
}
