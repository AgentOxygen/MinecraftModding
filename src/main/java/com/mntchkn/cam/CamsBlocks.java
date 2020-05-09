package com.mntchkn.cam;

import com.mntchkn.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
/*
 *  Holds all registry objects for blocks added by Cameron
 */
public class CamsBlocks {
	
	// Creates deferred register for registering all blocks under the mod
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);
	
	// List of blocks to be added, registry objects contain information necessary for producing block
	public static final RegistryObject<Block> peat_ore = BLOCKS.register("peat_ore_block", () -> new Block(Block.Properties.create(Material.EARTH).harvestTool(ToolType.SHOVEL).harvestLevel(0).hardnessAndResistance(0.5F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> anthracite_ore = BLOCKS.register("anthracite_coal_ore_block", () -> new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> bituminous_coal_ore = BLOCKS.register("bituminous_coal_ore_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> corundum_ore = BLOCKS.register("corundum_ore_block", () -> new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> cinnabar_ore = BLOCKS.register("cinnabar_ore_block", () -> new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> cuprite_ore = BLOCKS.register("cuprite_ore_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> hematite_ore = BLOCKS.register("hematite_ore_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> magnetite_ore = BLOCKS.register("magnetite_ore_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> malachite_ore = BLOCKS.register("malachite_ore_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> monazite_ore = BLOCKS.register("monazite_ore_block", () -> new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> siderite_ore = BLOCKS.register("siderite_ore_block", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> uraninite_ore = BLOCKS.register("uraninite_ore_block", () -> new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(3).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> cobalt_ore = BLOCKS.register("cobalt_ore_block", () -> new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(3).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> argentite_ore = BLOCKS.register("argentite_ore_block", () -> new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> topaz_ore = BLOCKS.register("topaz_ore_block", () -> new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(1).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> rock_salt = BLOCKS.register("rock_salt_block", () -> new Block(Block.Properties.create(Material.SAND).harvestTool(ToolType.SHOVEL).harvestLevel(0).hardnessAndResistance(0.5F).sound(SoundType.SAND)));
}
