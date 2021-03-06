package com.mntchkn.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.minecraft.advancements.Advancement;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

/**
 * Main class for handling quests.
 * Removes vanilla advancements.
 */
@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.FORGE)
public class QuestingEventSubscriber {
	
	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {
		removeVanillaAdvancements(event);
	}
	
	/** 
	 * Removes all non-mod advancements (advancements without Main.MODID modid)
	 */
	public static void removeVanillaAdvancements(FMLServerStartingEvent event) {
		Main.LOGGER.debug("Removing vanilla advancements...");
		Iterator<Advancement> iteration = event.getServer().advancementManager.field_223388_c.getAll().iterator();
		Set<ResourceLocation> ids = new HashSet<>();
		
		for(int i = 0; i< event.getServer().advancementManager.field_223388_c.getAll().size(); i++) {
			
			Advancement advancement = iteration.next();
			
			if(!advancement.getId().toString().contains(Main.MODID) && advancement.getId().toString() != null) {
				ids.add(advancement.getId());
			}
		}
		
		event.getServer().advancementManager.field_223388_c.removeAll(ids);
	}
}
