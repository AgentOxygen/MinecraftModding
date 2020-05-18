package com.mntchkn.client;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mntchkn.init.ModEntities;
import com.mntchkn.main.Main;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventSubscriber {
	private static final Logger LOGGER = LogManager.getLogger(Main.MODID + " CLIENT-SIDE");
	
	/**
	 * Outputs to client logger.
	 */
	public static void out(String output) {
		LOGGER.debug(output);
	}
	
	/**
	 * Registers render stuff
	 */
	@SubscribeEvent
	public static void onFMLClientSetup(final FMLClientSetupEvent event) {
		
		// Register Entity Renderers
		RenderingRegistry.registerEntityRenderingHandler(ModEntities.camel.get(), CamelEntityRenderer::new);
		
	}
}
