package com.mntchkn.cam;

import com.mntchkn.init.ModItemGroups;
import com.mntchkn.main.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * Holds registry methods for adding Cameron's items
 */
public class CamsItems {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);
	
	// Block/Crafting Items
	public static final RegistryObject<Item> steel_ingot = ITEMS.register("steel_ingot_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<Item> copper_ingot = ITEMS.register("copper_ingot_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<Item> zinc_ingot = ITEMS.register("zinc_ingot_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<Item> topaz = ITEMS.register("topaz_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<Item> corundum = ITEMS.register("corundum_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<Item> thorium_dust = ITEMS.register("thorium_dust_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<Item> sulfur_dust = ITEMS.register("sulfur_dust_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<Item> salt_dust = ITEMS.register("salt_dust_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	
	// Fuels
	public static final RegistryObject<Item> peat_fuel = ITEMS.register("peat_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)) {
		@Override
		public int getBurnTime(ItemStack itemStack) {
			return 800;
		}
	});
	public static final RegistryObject<Item> bituminous_coal_fuel = ITEMS.register("bituminous_coal_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)) {
		@Override
		public int getBurnTime(ItemStack itemStack) {
			return 800;
		}
	});
	public static final RegistryObject<Item> anthracite_coal_fuel = ITEMS.register("anthracite_item", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)) {
		@Override
		public int getBurnTime(ItemStack itemStack) {
			return 800;
		}
	});
}
