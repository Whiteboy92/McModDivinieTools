package net.whiteboy.divine_tools.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.whiteboy.divine_tools.item.RegisterArmorItems;

public class DivinityIngotToolsMaterial implements ToolMaterial {

    public static final DivinityIngotToolsMaterial INSTANCE = new DivinityIngotToolsMaterial();

    @Override
    public int getDurability() {
        return 5000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 100;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterArmorItems.DIVINITY_INGOT);
    }
}
