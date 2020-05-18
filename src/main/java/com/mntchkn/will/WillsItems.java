package com.mntchkn.will;

import com.mntchkn.init.ModEntities;
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
	
	//Spawn Eggs <- entities are registered AFTER items, so you get a null pointer. Check ModSpawnEggItem for work around later
	//public static final RegistryObject<Item> Wills_Spawn_Egg = ITEMS.register("wills_spawn_egg_item", () -> new SpawnEggItem(ModEntities.camel.get(), 16733525, 16733525, (new Item.Properties()).group(ModItemGroups.MOD_ITEM_GROUP)));

	
}
