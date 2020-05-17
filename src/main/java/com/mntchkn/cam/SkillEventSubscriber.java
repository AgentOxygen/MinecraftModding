package com.mntchkn.cam;

import java.util.ArrayList;

import com.mntchkn.main.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.advancements.AdvancementsScreen;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent.LoggedInEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

/** 
 * Main class for player skills.
 */
@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.FORGE)
public class SkillEventSubscriber {
	
	/** 
	 * Global player stats list, contains all player data packages.
	 */
	public static ArrayList<PlayerDataPackage> player_stats = new ArrayList<PlayerDataPackage>();
	
	/**
	 * Creates player data package for new players.
	 */
	@SubscribeEvent
	public static void onPlayerLogin(LoggedInEvent event) {
		boolean new_player = true;
		for(int i = 0; i < player_stats.size(); i++) {
			if(event.getPlayer().getName().toString() == player_stats.get(i).getPlayerName()) {
				new_player = false;
			}
		}
		if(new_player) {
			player_stats.add(new PlayerDataPackage(event.getPlayer().getName().toString()));
		}
	}
	
	/**
	 * Adds Skill GUI
	 */
	@SubscribeEvent
	public static void onGuiOpen(GuiOpenEvent event) {
		if(event.getGui().getClass().equals(AdvancementsScreen.class)) {
			Main.LOGGER.debug("Opened advancements!");
		}
	}
}
