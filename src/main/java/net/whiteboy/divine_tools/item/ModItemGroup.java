package net.whiteboy.divine_tools.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.whiteboy.divine_tools.DivineToolsMod;
import net.whiteboy.divine_tools.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup DIVINE_TOOLS = FabricItemGroupBuilder.build(
            new Identifier(DivineToolsMod.MOD_ID, "divine_tools"),
            () -> new ItemStack(ModBlocks.DIVINE_BLOCK));
}
