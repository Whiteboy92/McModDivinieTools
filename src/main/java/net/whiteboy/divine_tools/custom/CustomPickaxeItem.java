package net.whiteboy.divine_tools.custom;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomPickaxeItem extends PickaxeItem {
    private final float attackDamage = 7f;

    public CustomPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }
}

