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
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MYTHRIL_DEEPSLATE_ORE = registerBlock("mythril_deepslate_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE),
                    UniformIntProvider.create(0, 0)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block OSMITE_DEEPSLATE_ORE = registerBlock("osmite_deepslate_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE),
                    UniformIntProvider.create(0, 1)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block OSMITE_ORE = registerBlock("osmite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool().sounds(BlockSoundGroup.STONE),
                    UniformIntProvider.create(0, 0)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.VANILLA_EXTENDED);
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.75F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE_BRICKS = registerBlock("polished_calcite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.75F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(0.75F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE_BRICK_WALL = registerBlock("polished_calcite_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(0.75F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.75F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(0.75F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.75F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(0.75F).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_TUFF = registerBlock("polished_tuff",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.TUFF)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_TUFF_BRICKS = registerBlock("polished_tuff_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.TUFF)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.TUFF)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_TUFF_BRICK_WALL = registerBlock("polished_tuff_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.CALCITE)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.TUFF)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.TUFF)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.TUFF)), ModItemGroup.VANILLA_EXTENDED);
    public static final Block POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
            new ModStairsBlock(Blocks.CALCITE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(1.5f, 6.0f).requiresTool().sounds(BlockSoundGroup.TUFF)), ModItemGroup.VANILLA_EXTENDED);
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
