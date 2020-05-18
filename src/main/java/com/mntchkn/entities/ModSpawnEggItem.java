package com.mntchkn.entities;



import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.common.util.NonNullSupplier;

/**
 * Created to work around spawn-egg issue with items being registered before entities.
 * Initially passes null value to spawn egg
 * 
 * @author Cadiboo
 */
public class ModSpawnEggItem extends SpawnEggItem{

	protected static final List<ModSpawnEggItem> null_eggs = new ArrayList<>();
	private final Lazy<? extends EntityType<?>> entityTypeSupplier;
	
	public ModSpawnEggItem(final NonNullSupplier<? extends EntityType<?>> entityTypeSupplier, int primaryColorIn, int secondaryColorIn, Properties builder) {
		super(null, primaryColorIn, secondaryColorIn, builder);
		this.entityTypeSupplier = Lazy.of(entityTypeSupplier::get);
		null_eggs.add(this);
	}
	
	public static void initializeNullEggs() {
		
	}
	
}
