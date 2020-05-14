package com.mntchkn.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mntchkn.cam.CamsBlocks;
import com.mntchkn.cam.CamsItems;
import com.mntchkn.max.MaxsBlocks;
import com.mntchkn.will.WillsBlocks;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
	
	// Global mod identifier, use for all requests of "MODID"
	public static final String MODID = "mntchkn";
	// Console output logger, use instead of system output
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public Main() {
		LOGGER.debug(">>>>>>>>>> Initiating Mountain Chicken <<<<<<<<<<<");
		
		// Obtains mod's main event bus
		final IEventBus meb = FMLJavaModLoadingContext.get().getModEventBus();
		
		// Register all deferred block registers
		CamsBlocks.BLOCKS.register(meb);
		WillsBlocks.BLOCKS.register(meb);
		MaxsBlocks.BLOCKS.register(meb);
		
		// Register all deferred item registers
		CamsItems.ITEMS.register(meb);
	}
}