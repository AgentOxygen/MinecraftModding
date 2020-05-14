package com.mntchkn.main;

import com.mntchkn.cam.CamsItems;
import com.mntchkn.cam.CamsOreGen;
import com.mntchkn.max.MaxsItems;
import com.mntchkn.max.MaxsOreGen;
import com.mntchkn.will.WillsItems;
import com.mntchkn.will.WillsOreGen;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

/** 
 * Main event bus class.
 * Handles common registry objects
 */
@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
	
	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {	
		// Registers all items by passing registry event to multiple classes
		// Allows for better modularity (less github conflicts)
		CamsItems.registerItems(event);
		WillsItems.registerItems(event);
		MaxsItems.registerItems(event);
	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		// Modifies world gen configurations, needs to happen before world gen is called.
		CamsOreGen.generateOre();
		WillsOreGen.generateOre();
		MaxsOreGen.generateOre();
	}
	
	/**
	 * Method for properly returning a registered object (formats resource location and registry name automatically)
	 */ 
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(Main.MODID, name));
	}

	/**
	 * Part two of the setup method
	 */ 
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}
}