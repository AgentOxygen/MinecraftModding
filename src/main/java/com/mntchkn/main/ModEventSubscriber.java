package com.mntchkn.main;

import com.mntchkn.cam.CamsBlocks;
import com.mntchkn.cam.CamsOreGen;
import com.mntchkn.init.ModItemGroups;
import com.mntchkn.will.WillsBlocks;
import com.mntchkn.will.WillsOreGen;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

/** 
 * Main event bus class.
 * Handles common registry objects
 */
@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
	
	// Registers block items for all registered blocks
	@SubscribeEvent
	public static void onRegisterBlockItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		// Creates and registers block items from specified registers
		CamsBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
			});
		WillsBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
			});

	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		// Modifies world gen configurations, needs to happen before world gen is called.
		CamsOreGen.generateOre();
		WillsOreGen.generateOre();
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
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(Main.MODID, name);
	}
}