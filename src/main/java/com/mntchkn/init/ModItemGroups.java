package com.mntchkn.init;

import java.util.function.Supplier;

import com.mntchkn.main.Main;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
/**
 * Creates mod item groups (tabs for creative menu)
 */
public class ModItemGroups{
	public static class ModItemGroup extends ItemGroup{

		private final Supplier<ItemStack> iconSupplier;
		
		public ModItemGroup(String label, final Supplier<ItemStack> iconSupplier) {
			super(label);
			this.iconSupplier = iconSupplier;
		}

		@Override
		public ItemStack createIcon() {
			return iconSupplier.get();
		}
	}
	/**
	 * Default mod item group item (item to be displayed as icon for creative tab)
	 */
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Main.MODID, () -> new ItemStack(ModItems.CORUNDUM_ITEM));
}
