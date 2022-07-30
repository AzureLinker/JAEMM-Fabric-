package net.azuremods.vanillaextended;

import net.azuremods.vanillaextended.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class VanillaExtendedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModModelPredicateProvider.registerModModels();

    }
}
