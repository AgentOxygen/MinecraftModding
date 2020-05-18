package com.mntchkn.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.world.World;

public class CamelEntity extends HorseEntity{

	public CamelEntity(EntityType<? extends HorseEntity> horseEntityType, World world) {
		super(horseEntityType, world);
		
	}
	
	
}
