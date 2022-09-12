package net.whiteboy.divine_tools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whiteboy.divine_tools.DivineToolsMod;

public class ModItems {

    public static final Item RAW_DIVINITY_ORE = registerItem("raw_divinity_ore",
            new Item(new FabricItemSettings().group(ModItemGroup.DIVINE_TOOLS)));


    public static void registerModItems(){
        DivineToolsMod.LOGGER.debug("Registering Mod Items for " + DivineToolsMod.MOD_ID);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(DivineToolsMod.MOD_ID, name), item);
    }
}
