package com.mntchkn.cam;

import com.mntchkn.init.ModItemGroups;
import com.mntchkn.main.ModEventSubscriber;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;

/*
 * Holds registry methods for adding Cameron's items
 */
public class CamsItems {
	
	/**
	 * Registers included items to provided Registry Event
	 */
	public static void registerItems(RegistryEvent.Register<Item> event) {
		
		// Add Block Items (blocks do not have items by default)
		CamsBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(modblock ->{
			final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
			final BlockItem blockItem = new BlockItem(modblock, properties);
			blockItem.setRegistryName(modblock.getRegistryName());
			event.getRegistry().register(blockItem);
		});
		
		event.getRegistry().registerAll(
				
				// Create and register new items
				// The ones with burn times are fuels
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)) {
					@Override
					public int getBurnTime(ItemStack itemStack) {
						return 800;
					}
				}, "peat_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)) {
					@Override
					public int getBurnTime(ItemStack itemStack) {
						return 1600;
					}
				}, "bituminous_coal_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)){
					@Override
					public int getBurnTime(ItemStack itemStack) {
						return 12800;
					}
				}, "anthracite_item"),
				// Standard, non-fuel items
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "steel_ingot_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "copper_ingot_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "zinc_ingot_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "topaz_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "corundum_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "thorium_dust_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "sulfur_dust_item"),
				ModEventSubscriber.setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "salt_dust_item")
				);
	}
	
}
