package com.mntchkn.main;

import com.mntchkn.init.ModBlocks;
import com.mntchkn.init.ModItemGroups;
import com.mntchkn.world.gen.ModOreGen;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

/* Main event bus class
 * Handles registry
 */

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
	
	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {
		// Add Block Items
		ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(modblock ->{
			final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
			final BlockItem blockItem = new BlockItem(modblock, properties);
			blockItem.setRegistryName(modblock.getRegistryName());
			event.getRegistry().register(blockItem);
		});
		
		event.getRegistry().registerAll(
				
				// Register Items
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)) {
					@Override
					public int getBurnTime(ItemStack itemStack) {
						return 800;
					}
				}, "peat_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)) {
					@Override
					public int getBurnTime(ItemStack itemStack) {
						return 1600;
					}
				}, "bituminous_coal_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)){
					@Override
					public int getBurnTime(ItemStack itemStack) {
						return 12800;
					}
				}, "anthracite_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "steel_ingot_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "copper_ingot_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "zinc_ingot_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "topaz_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "corundum_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "thorium_dust_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "sulfur_dust_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "salt_dust_item")
				);
	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		ModOreGen.generateOre();
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(Main.MODID, name));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}
}