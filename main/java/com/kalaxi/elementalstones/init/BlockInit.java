package com.kalaxi.elementalstones.init;

import com.kalaxi.elementalstones.ElementalStones;
import com.kalaxi.elementalstones.ElementalStones.ElementalStonesItemGroup;

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
	
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).harvestLevel(2).hardnessAndResistance(3.0f)).setRegistryName("potential_ore"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().register(new BlockItem(potential_ore, new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_ore"));
	}
}
