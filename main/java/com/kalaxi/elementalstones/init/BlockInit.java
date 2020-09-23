package com.kalaxi.elementalstones.init;

import com.kalaxi.elementalstones.ElementalStones;
import com.kalaxi.elementalstones.ElementalStones.ElementalStonesItemGroup;
import com.kalaxi.elementalstones.objects.blocks.PotentialBlock;
import com.kalaxi.elementalstones.objects.blocks.PotentialBlockAir;
import com.kalaxi.elementalstones.objects.blocks.PotentialBlockEarth;
import com.kalaxi.elementalstones.objects.blocks.PotentialBlockFire;
import com.kalaxi.elementalstones.objects.blocks.PotentialBlockWater;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ElementalStones.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ElementalStones.MOD_ID)
public class BlockInit 
{
	public static final Block potential_ore = null;
	public static final Block potential_block = null;
	public static final Block potential_block_fire = null;
	public static final Block potential_block_water = null;
	public static final Block potential_block_earth = null;
	public static final Block potential_block_air = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(3.0f)).setRegistryName("potential_ore"));
		event.getRegistry().register(new PotentialBlock(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(3.0f)).setRegistryName("potential_block"));
		event.getRegistry().register(new PotentialBlockFire(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(3.0f)).setRegistryName("potential_block_fire"));
		event.getRegistry().register(new PotentialBlockEarth(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(3.0f)).setRegistryName("potential_block_earth"));
		event.getRegistry().register(new PotentialBlockWater(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(3.0f)).setRegistryName("potential_block_water"));
		event.getRegistry().register(new PotentialBlockAir(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(3.0f)).setRegistryName("potential_block_air"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().register(new BlockItem(potential_ore, new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_ore"));
		event.getRegistry().register(new BlockItem(potential_block, new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_block"));
		event.getRegistry().register(new BlockItem(potential_block_fire, new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_block_fire"));
		event.getRegistry().register(new BlockItem(potential_block_earth, new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_block_earth"));
		event.getRegistry().register(new BlockItem(potential_block_water, new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_block_water"));
		event.getRegistry().register(new BlockItem(potential_block_air, new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_block_air"));
	}
}