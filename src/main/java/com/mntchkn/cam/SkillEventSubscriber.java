package com.mntchkn.cam;

import java.util.ArrayList;

import com.mntchkn.main.Main;

import net.minecraftforge.client.event.ClientPlayerNetworkEvent.LoggedInEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

/* 
 * Main class for player skills.
 */
@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.FORGE)
public class SkillEventSubscriber {
	
	// Global Player Stats list
	public static ArrayList<PlayerDataPackage> player_stats = new ArrayList<PlayerDataPackage>();
	
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
}
