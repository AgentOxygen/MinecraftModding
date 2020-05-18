package com.mntchkn.init;

import com.mntchkn.entities.TestEntity;
import com.mntchkn.entities.TestRenderer;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;



public class ModEntities {
	public static EntityType<TestEntity> TEST_ENTITY = register("test_entity", EntityType.Builder.create(TestEntity::new, EntityClassification.CREATURE));
	
	//World Spawning for Entities
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		
		event.getRegistry().registerAll(
				ModEntities.TEST_ENTITY
		);
		
		
		registerEntityWorldSpawn(TEST_ENTITY, Biomes.BADLANDS, Biomes.MOUNTAINS);
	}
	
	//World Spawning for Entities
	public static void registerEntityWorldSpawn(EntityType<?> entity,Biome...biomes) {
		for(Biome biome: biomes) {
			biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 50, 5, 15)); //entity, how often it will spawn, min spawned, max spawned
		}
	}
	
	private static <T extends Entity> EntityType<T> register(String key, EntityType.Builder<T> builder) {
		return Registry.register(Registry.ENTITY_TYPE, key, builder.build(key));
	}
	
}
