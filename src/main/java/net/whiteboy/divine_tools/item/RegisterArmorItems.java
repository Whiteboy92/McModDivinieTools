package net.whiteboy.divine_tools.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whiteboy.divine_tools.materials.DivinityIngotArmorMaterial;

public class RegisterArmorItems {

    public static final ArmorMaterial DivinityIngotArmorMaterial = new DivinityIngotArmorMaterial();
    public static final Item DIVINITY_INGOT = new DivinityIngotItem(new Settings().group(ModItemGroup.DIVINE_TOOLS));
    public static final Item DIVINITY_HELMET = new ArmorItem(DivinityIngotArmorMaterial, EquipmentSlot.HEAD, new Settings().group(ModItemGroup.DIVINE_TOOLS).fireproof());
    public static final Item DIVINITY_CHESTPLATE = new ArmorItem(DivinityIngotArmorMaterial, EquipmentSlot.CHEST, new Settings().group(ModItemGroup.DIVINE_TOOLS).fireproof());
    public static final Item DIVINITY_LEGGINGS = new ArmorItem(DivinityIngotArmorMaterial, EquipmentSlot.LEGS, new Settings().group(ModItemGroup.DIVINE_TOOLS).fireproof());
    public static final Item DIVINITY_BOOTS = new ArmorItem(DivinityIngotArmorMaterial, EquipmentSlot.FEET, new Settings().group(ModItemGroup.DIVINE_TOOLS).fireproof());

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier("divine_tools",
                "divinity_ingot"), DIVINITY_INGOT);

        Registry.register(Registry.ITEM, new Identifier("divine_tools",
                "divinity_helmet"), DIVINITY_HELMET);

        Registry.register(Registry.ITEM, new Identifier("divine_tools",
                "divinity_chestplate"), DIVINITY_CHESTPLATE);

        Registry.register(Registry.ITEM, new Identifier("divine_tools",
                "divinity_leggings"), DIVINITY_LEGGINGS);

        Registry.register(Registry.ITEM, new Identifier("divine_tools",
                "divinity_boots"), DIVINITY_BOOTS);
    }
}
