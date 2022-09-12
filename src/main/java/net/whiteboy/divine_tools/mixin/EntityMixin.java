package net.whiteboy.divine_tools.mixin;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.whiteboy.divine_tools.DivineToolsMod;
import net.whiteboy.divine_tools.item.RegisterArmorItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

@Mixin(Entity.class)
public abstract class EntityMixin {

    @Shadow
    public abstract Iterable<ItemStack> getArmorItems();

    @Inject(cancellable = true, method = "isInvulnerableTo", at = @At(value = "HEAD",
            target = "net/minecraft/entity/Entity.isInvulnerableTo(Lnet/minecraft/entity/damage/DamageSource;)Z"))
    private void injectInvulnerability(DamageSource damage, CallbackInfoReturnable<Boolean> cir) {
        ArrayList<ItemStack> items = Lists.newArrayList(this.getArmorItems());

        // Not simply booleans, for the sake of thread-safety (the compiler enforces this)
        AtomicReference<Boolean> hasHelmet = new AtomicReference<>(false);
        AtomicReference<Boolean> hasChestplate = new AtomicReference<>(false);
        AtomicReference<Boolean> hasLeggings = new AtomicReference<>(false);
        AtomicReference<Boolean> hasBoots = new AtomicReference<>(false);

        items.forEach((item) -> {
                    // Check each item and see if it's a piece of our armour. Note that we don't want to just check
                    // if it's just "a piece of our armour" and increment a counter since we don't want people
                    // just breaking the game to make this work

                    if (item.getItem() == RegisterArmorItems.DIVINITY_HELMET) {
                        hasHelmet.set(true);
                    }

                    if (item.getItem() == RegisterArmorItems.DIVINITY_CHESTPLATE) {
                        hasChestplate.set(true);
                    }

                    if (item.getItem() == RegisterArmorItems.DIVINITY_LEGGINGS) {
                        hasLeggings.set(true);
                    }

                    if (item.getItem() == RegisterArmorItems.DIVINITY_BOOTS) {
                        hasBoots.set(true);
                    }
                }
        );

        if (hasHelmet.get() && hasChestplate.get() && hasLeggings.get() && hasBoots.get()) {
            // If we have all the pieces of armour, check damage types.

            if (DivineToolsMod.DAMAGE_SOURCES.contains(damage)) {
                cir.setReturnValue(true);
            }
        }
    }
}
