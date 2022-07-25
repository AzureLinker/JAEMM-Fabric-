package net.azuremods.vanillaextended.item;

import net.azuremods.vanillaextended.VanillaExtended;
import net.azuremods.vanillaextended.item.custom.ModAxeItem;
import net.azuremods.vanillaextended.item.custom.ModHoeItem;
import net.azuremods.vanillaextended.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item RAW_STEEL = registerItem("raw_steel",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item OAK_BARK = registerItem("oak_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item BIRCH_BARK = registerItem("birch_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item ACACIA_BARK = registerItem("acacia_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item DARK_OAK_BARK = registerItem("dark_oak_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item JUNGLE_BARK = registerItem("jungle_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item MANGROVE_BARK = registerItem("mangrove_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item SPRUCE_BARK = registerItem("spruce_bark",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item TWINE = registerItem("twine",
            new Item(new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL, 3, -2.3f,
                    new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new ModAxeItem(ModToolMaterials.STEEL, 6, -2.9f,
                    new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new ModHoeItem(ModToolMaterials.STEEL, -2, 0f,
                    new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, -2, -3f,
                    new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new ModPickaxeItem(ModToolMaterials.STEEL, -1, -3f,
                    new FabricItemSettings().group(ModItemGroup.VANILLA_EXTENDED)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VanillaExtended.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VanillaExtended.LOGGER.debug("Registering Mod Items for " + VanillaExtended.MOD_ID);
    }
}
