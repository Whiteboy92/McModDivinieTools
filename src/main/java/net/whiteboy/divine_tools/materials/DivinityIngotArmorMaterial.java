package net.whiteboy.divine_tools.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.whiteboy.divine_tools.item.RegisterArmorItems;

public class DivinityIngotArmorMaterial implements ArmorMaterial {

        private static final int[] BASE_DURABILITY = new int[] {5, 5, 5, 5};
        private static final int[] PROTECTION_VALUES = new int[] {7, 11, 9, 7};

    public DivinityIngotArmorMaterial() {

    }

    @Override
        public int getDurability(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getEntitySlotId()] * 4274;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return PROTECTION_VALUES[slot.getEntitySlotId()];
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(RegisterArmorItems.DIVINITY_INGOT);
        }

        @Override
        public String getName() {
            return "divinity_armor";
        }

        @Override
        public float getToughness() {
            return 5.0F;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.3F;
        }
}
