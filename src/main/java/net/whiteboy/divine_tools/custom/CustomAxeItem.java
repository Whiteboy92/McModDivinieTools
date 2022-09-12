package net.whiteboy.divine_tools.custom;

import net.minecraft.item.AxeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomAxeItem extends AxeItem {
    private final float attackDamage = 13;

    public CustomAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }
}
