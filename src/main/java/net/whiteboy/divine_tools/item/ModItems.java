package net.whiteboy.divine_tools.item;

import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whiteboy.divine_tools.DivineToolsMod;
import net.whiteboy.divine_tools.custom.CustomAxeItem;
import net.whiteboy.divine_tools.custom.CustomHoeItem;
import net.whiteboy.divine_tools.custom.CustomPickaxeItem;
import net.whiteboy.divine_tools.custom.CustomSwordItem;
import net.whiteboy.divine_tools.materials.DivinityIngotToolsMaterial;

public class ModItems {

    public static final Item RAW_DIVINITY_ORE = registerItem("raw_divinity_ore",
            new Item(new FabricItemSettings().group(ModItemGroup.DIVINE_TOOLS)));

    public static final ToolItem DIVINITY_SHOVEL = registerItem("divinity_shovel", new ShovelItem(DivinityIngotToolsMaterial.INSTANCE,
            1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.DIVINE_TOOLS)));

    public static final ToolItem DIVINITY_SWORD = registerItem("divinity_sword", new CustomSwordItem(DivinityIngotToolsMaterial.INSTANCE,
            10, -2.0F, new FabricItemSettings().group(ModItemGroup.DIVINE_TOOLS)));

    public static final ToolItem DIVINITY_PICKAXE = registerItem("divinity_pickaxe", new CustomPickaxeItem(DivinityIngotToolsMaterial.INSTANCE,
            1, -2.4F, new FabricItemSettings().group(ModItemGroup.DIVINE_TOOLS)));

    public static final ToolItem DIVINITY_AXE = registerItem("divinity_axe", new CustomAxeItem(DivinityIngotToolsMaterial.INSTANCE,
            12, -2.4F, new FabricItemSettings().group(ModItemGroup.DIVINE_TOOLS)));

    public static final ToolItem DIVINITY_HOE = registerItem("divinity_hoe", new CustomHoeItem(DivinityIngotToolsMaterial.INSTANCE,
            7, -3.2F, new FabricItemSettings().group(ModItemGroup.DIVINE_TOOLS)));


    public static void registerModItems(){
        DivineToolsMod.LOGGER.debug("Registering Mod Items for " + DivineToolsMod.MOD_ID);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(DivineToolsMod.MOD_ID, name), item);
    }

    private static ToolItem registerItem(String name, ToolItem toolItem){
        return Registry.register(Registry.ITEM, new Identifier(DivineToolsMod.MOD_ID, name), toolItem);
    }
}
