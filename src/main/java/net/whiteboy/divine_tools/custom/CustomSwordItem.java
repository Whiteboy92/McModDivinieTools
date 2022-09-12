package net.whiteboy.divine_tools.custom;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomSwordItem extends PickaxeItem {
    private final float attackDamage = 11f;

    public CustomSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }
}

