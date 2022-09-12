package net.whiteboy.divine_tools.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomPickaxeItem extends PickaxeItem {

    private final TagKey<Block> effectiveBlocks = TagKey.of(Registry.BLOCK_KEY, new Identifier("divine_tools", "divine_tools_ores"));

    public CustomPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }


    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return state.isIn(this.effectiveBlocks) ? this.miningSpeed : 20.0F;
    }
}

