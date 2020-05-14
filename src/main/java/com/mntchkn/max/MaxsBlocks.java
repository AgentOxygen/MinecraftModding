package com.mntchkn.max;

import com.mntchkn.main.Main;

import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 *  Holds all registry objects for blocks added by Max
 */
public class MaxsBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);
}
