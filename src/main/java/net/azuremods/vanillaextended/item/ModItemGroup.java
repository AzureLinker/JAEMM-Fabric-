package net.azuremods.vanillaextended.item;

import net.azuremods.vanillaextended.VanillaExtended;
import net.azuremods.vanillaextended.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup VANILLA_EXTENDED = FabricItemGroupBuilder.build(
            new Identifier(VanillaExtended.MOD_ID, "vanilla_extended"), () -> new ItemStack(ModBlocks.POLISHED_ANDESITE_BRICKS));
}
