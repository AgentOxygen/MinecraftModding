package com.mntchkn.init;

import com.mntchkn.entities.CamelEntity;
import com.mntchkn.main.Main;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntities {
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Main.MODID);
	
	private static final String camel_name = "camel";
	public static final RegistryObject<EntityType<CamelEntity>> camel = ENTITIES.register(camel_name, 
			() -> EntityType.Builder.<CamelEntity>create(CamelEntity::new, EntityClassification.CREATURE)
				.size(EntityType.HORSE.getWidth(), EntityType.HORSE.getHeight())
				.build(new ResourceLocation(Main.MODID, camel_name).toString()));
	
	//World Spawning for Entities
	public static void registerEntityWorldSpawn(EntityType<?> entity,Biome...biomes) {
		for(Biome biome: biomes) {
			biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 50, 5, 15)); //entity, how often it will spawn, min spawned, max spawned
		}
	}
}
