package com.mntchkn.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.minecraft.advancements.Advancement;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent.LoggedInEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

/* Overrides Specific Vanilla features and aspects
 * Questing Base
 * Skills Base
 */

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.FORGE)
public class OverrideEventSubscriber {
	
	public static ArrayList<PlayerStats> player_stats = new ArrayList<PlayerStats>();
	
	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {
		removeVanillaAdvancements(event);
	}
	
	// Removes all non-mod advancements (advancements without Main.MODID modid)
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
	
	@SubscribeEvent
	public static void onPlayerLogin(LoggedInEvent event) {
		boolean new_player = true;
		for(int i = 0; i < player_stats.size(); i++) {
			if(event.getPlayer().getName().toString() == player_stats.get(i).getPlayerName()) {
				new_player = false;
			}
		}
		if(new_player) {
			player_stats.add(new PlayerStats(event.getPlayer().getName().toString()));
		}
	}
	
	//Check guis
	
}
