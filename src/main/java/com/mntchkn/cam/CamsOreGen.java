package com.mntchkn.cam;

import com.google.common.collect.Lists;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class CamsOreGen {
	// Configs for each ore's generation (number of attempts to spawn per chunk, range, offset)
	private static ConfiguredPlacement<CountRangeConfig> anthracite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 0, 0, 24));
	private static ConfiguredPlacement<DepthAverageConfig> bituminous_config_default = Placement.COUNT_DEPTH_AVERAGE.func_227446_a_(new DepthAverageConfig(2,50,25));
	private static ConfiguredPlacement<DepthAverageConfig> bituminous_config_swamp = Placement.COUNT_DEPTH_AVERAGE.func_227446_a_(new DepthAverageConfig(12,50,40));
	private static ConfiguredPlacement<CountRangeConfig> argentite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(2, 0, 0, 24));
	private static ConfiguredPlacement<CountRangeConfig> cinnabar_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(5, 0, 0, 48));
	private static ConfiguredPlacement<CountRangeConfig> cobalt_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(1, 0, 0, 48));
	private static ConfiguredPlacement<CountRangeConfig> corundum_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(1, 0, 0, 16));
	private static ConfiguredPlacement<CountRangeConfig> cuprite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(6, 0, 0, 48));
	private static ConfiguredPlacement<CountRangeConfig> hematite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(12, 0, 0, 64));
	private static ConfiguredPlacement<CountRangeConfig> magnetite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 0, 0, 50));
	private static ConfiguredPlacement<CountRangeConfig> malachite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(15, 0, 0, 90));
	private static ConfiguredPlacement<CountRangeConfig> monazite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(1, 0, 0, 48));
	private static ConfiguredPlacement<CountRangeConfig> siderite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(12, 0, 0, 70));
	private static ConfiguredPlacement<CountRangeConfig> topaz_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4, 0, 0, 24));
	private static ConfiguredPlacement<CountRangeConfig> uraninite_config = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 0, 0, 256));

	// Method for modifying world biome ore generation
	public static void generateOre() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			// Clear Vanilla Ores
			biome.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).clear();
			
			// Add Accepted Vanilla Ores (the number is the size of veins I think)
		    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
		    		Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
		    				Blocks.GOLD_ORE.getDefaultState(), 9)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(2, 0, 0, 32))));
		    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
		    		Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
		    				Blocks.REDSTONE_ORE.getDefaultState(), 8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(8, 0, 0, 16))));
		    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
		    		Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
		    				Blocks.DIAMOND_ORE.getDefaultState(), 8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(1, 0, 0, 16))));
		    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
		    		Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
		    				Blocks.LAPIS_ORE.getDefaultState(), 7)).func_227228_a_(Placement.COUNT_DEPTH_AVERAGE.func_227446_a_(new DepthAverageConfig(1, 16, 16))));

			
			// Non-Specific Ores
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.bituminous_coal_ore.get().getDefaultState(), 5)).func_227228_a_(bituminous_config_default));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.argentite_ore.get().getDefaultState(), 2)).func_227228_a_(argentite_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.cinnabar_ore.get().getDefaultState(), 3)).func_227228_a_(cinnabar_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.cobalt_ore.get().getDefaultState(), 5)).func_227228_a_(cobalt_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.corundum_ore.get().getDefaultState(), 3)).func_227228_a_(corundum_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.cuprite_ore.get().getDefaultState(), 2)).func_227228_a_(cuprite_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.hematite_ore.get().getDefaultState(), 8)).func_227228_a_(hematite_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.malachite_ore.get().getDefaultState(), 8)).func_227228_a_(malachite_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.monazite_ore.get().getDefaultState(), 1)).func_227228_a_(monazite_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.siderite_ore.get().getDefaultState(), 8)).func_227228_a_(siderite_config));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							CamsBlocks.topaz_ore.get().getDefaultState(), 4)).func_227228_a_(topaz_config));
			
			// Add Peat to Dirt
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
					Feature.DISK.func_225566_b_(new SphereReplaceConfig(CamsBlocks.peat_ore.get().getDefaultState(), 4, 1, Lists.newArrayList(Blocks.DIRT.getDefaultState(), CamsBlocks.peat_ore.get().getDefaultState())))
					.func_227228_a_(Placement.COUNT_TOP_SOLID.func_227446_a_(new FrequencyConfig(1))));
			
			// Specific Ores
			if(biome == Biomes.SWAMP || biome == Biomes.SWAMP_HILLS) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
						Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								CamsBlocks.anthracite_ore.get().getDefaultState(), 4)).func_227228_a_(anthracite_config));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
						Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								CamsBlocks.bituminous_coal_ore.get().getDefaultState(), 10)).func_227228_a_(bituminous_config_swamp));
			}
			if(biome == Biomes.MOUNTAINS || biome == Biomes.TAIGA_MOUNTAINS || biome == Biomes.MOUNTAIN_EDGE) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
						Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								CamsBlocks.magnetite_ore.get().getDefaultState(), 5)).func_227228_a_(magnetite_config));
			}
			if(biome == Biomes.BEACH || biome == Biomes.DEEP_COLD_OCEAN || biome == Biomes.DEEP_FROZEN_OCEAN 
					|| biome == Biomes.DEEP_LUKEWARM_OCEAN || biome == Biomes.DEEP_WARM_OCEAN || biome == Biomes.DEEP_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
						Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
								CamsBlocks.uraninite_ore.get().getDefaultState(), 3)).func_227228_a_(uraninite_config));
			}
			// Spawns Salt Beds
			if(biome == Biomes.DESERT || biome == Biomes.DESERT_HILLS || biome == Biomes.DESERT_LAKES) {
				biome.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.func_225566_b_(new BlockStateFeatureConfig(CamsBlocks.rock_salt.get().getDefaultState())).func_227228_a_(Placement.LAVA_LAKE.func_227446_a_(new ChanceConfig(40))));
			}
		}
	}
}
