package net.azuremods.vanillaextended.item;

import net.azuremods.vanillaextended.VanillaExtended;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item OAK_BARK = registerItem("oak_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item BIRCH_BARK = registerItem("birch_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VanillaExtended.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VanillaExtended.LOGGER.debug("Registering Mod Items for " + VanillaExtended.MOD_ID);
    }
}