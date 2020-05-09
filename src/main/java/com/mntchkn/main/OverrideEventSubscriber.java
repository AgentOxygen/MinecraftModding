package com.mntchkn.main;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.advancements.Advancement;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

/* Overrides Specific Vanilla features and aspects
 * Questing Base
 * Skills Base
 */

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.FORGE)
public class OverrideEventSubscriber {
	
	private final static Map<ResourceLocation, Advancement> advancements = Maps.newHashMap();
	
	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {
		Main.LOGGER.debug("Deleting vanilla advancements...");
		//event.getServer().advancementManager.field_223388_c.clear();
		event.getServer().advancementManager.field_223388_c.clear();
		for(int i = 0; i < event.getServer().advancementManager.field_223388_c.getAll().size(); i++) {
			Main.LOGGER.debug(event.getServer().advancementManager.field_223388_c.getAll().toArray()[i]);
		}
	}
}
