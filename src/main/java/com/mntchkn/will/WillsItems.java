package com.mntchkn.will;

import com.mntchkn.init.ModItemGroups;
import com.mntchkn.main.Main;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Holds registry methods for adding Will's items
 */
public class WillsItems {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);
	
	//Spawn Eggs
	public static final RegistryObject<Item> Wills_Spawn_Egg = ITEMS.register("wills_spawn_egg", () -> new SpawnEggItem(EntityType.HORSE, 12623485, 15656192, (new Item.Properties()).group(ItemGroup.MISC)));

	
}
