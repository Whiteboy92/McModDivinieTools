package net.whiteboy.divine_tools.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whiteboy.divine_tools.DivineToolsMod;
import net.whiteboy.divine_tools.item.ModItemGroup;

public class ModBlocks {

    public static final Block DIVINITY_BLOCK = registerBlock("divinity_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1f).requiresTool()),
            ModItemGroup.MYTHICTOOLSARMOR);

    public static final Block DIVINITY_ORE_BLOCK = registerBlock("divinity_ore_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1f).requiresTool()),
            ModItemGroup.MYTHICTOOLSARMOR);

    public static final Block DEEPSLATE_DIVINITY_ORE_BLOCK = registerBlock("deepslate_divinity_ore_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1f).requiresTool()),
            ModItemGroup.MYTHICTOOLSARMOR);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(DivineToolsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(DivineToolsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        DivineToolsMod.LOGGER.debug("Registering ModBlocks for " + DivineToolsMod.MOD_ID);
    }
}
