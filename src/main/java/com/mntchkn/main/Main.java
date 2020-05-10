package com.mntchkn.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mntchkn.cam.CamsBlocks;
import com.mntchkn.max.MaxsBlocks;
import com.mntchkn.will.WillsBlocks;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
	
	public static final String MODID = "mntchkn";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public Main() {
		LOGGER.debug(">>>>>>>>>> Initiating Mountain Chicken <<<<<<<<<<<");
		
		final IEventBus meb = FMLJavaModLoadingContext.get().getModEventBus();
		
		CamsBlocks.BLOCKS.register(meb);
		WillsBlocks.BLOCKS.register(meb);
		MaxsBlocks.BLOCKS.register(meb);
	}
}