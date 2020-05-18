package com.mntchkn.init;

import com.mntchkn.entities.TestEntity;
import com.mntchkn.main.Main;
import com.mntchkn.main.ModEventSubscriber;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraftforge.event.RegistryEvent;



public class ModEntities {
	public static EntityType<?> TEST_ENTITY = EntityType.Builder.create(TestEntity::new, EntityClassification.CREATURE).build(Main.MODID + ":test_entity").setRegistryName(ModEventSubscriber.location);
	
	//World Spawning for Entities
	public static void registerEntityWorldSpawn(EntityType<?> entity,Biome...biomes) {
		for(Biome biome: biomes) {
			biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 50, 5, 15)); //entity, how often it will spawn, min spawned, max spawned
		}
	}
}
