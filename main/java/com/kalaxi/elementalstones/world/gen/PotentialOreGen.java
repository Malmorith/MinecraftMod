package com.kalaxi.elementalstones.world.gen;

import com.kalaxi.elementalstones.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class PotentialOreGen {
	public static void generateOre() 
	{
		for (Biome biome : ForgeRegistries.BIOMES) 
		{
			// if(biome == Biomes.PLAINS){}
			ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 5, 5, 25));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE
			.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockInit.potential_ore
			.getDefaultState(), 5)).withPlacement(customConfig));
		}
	}
}