package net.whiteboy.divine_tools;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.damage.DamageSource;
import net.whiteboy.divine_tools.block.ModBlocks;
import net.whiteboy.divine_tools.item.ModItems;
import net.whiteboy.divine_tools.item.RegisterArmorItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class DivineToolsMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "divine_tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ArrayList<DamageSource> DAMAGE_SOURCES = Lists.newArrayList(
			// All the damage sources we should be immune to

			DamageSource.HOT_FLOOR,
			DamageSource.IN_FIRE,
			DamageSource.LAVA,
			DamageSource.LIGHTNING_BOLT,
			DamageSource.ON_FIRE
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		RegisterArmorItems.registerArmor();
	}
}
