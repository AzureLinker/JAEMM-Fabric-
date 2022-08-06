package net.azuremods.vanillaextended.block;

import net.azuremods.vanillaextended.VanillaExtended;
import net.azuremods.vanillaextended.block.custom.ModStairsBlock;
import net.azuremods.vanillaextended.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE_BRICKS = registerBlock("polished_calcite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block BAMBOO_FLOOR = registerBlock("bamboo_floor",
            new Block(FabricBlockSettings.of(Material.BAMBOO).strength(0.3f).sounds(BlockSoundGroup.BAMBOO)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block REINFORCED_BAMBOO_FLOOR = registerBlock("reinforced_bamboo_floor",
            new Block(FabricBlockSettings.of(Material.BAMBOO).strength(1.5f).requiresTool().sounds(BlockSoundGroup.BAMBOO)), ModItemGroup.VANILLA_EXTENDED);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(VanillaExtended.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaExtended.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerBlocks(){
        VanillaExtended.LOGGER.debug("Registering ModBlocks for " + VanillaExtended.MOD_ID);
    }
}
