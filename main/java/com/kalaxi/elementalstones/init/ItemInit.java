package com.kalaxi.elementalstones.init;

import com.kalaxi.elementalstones.ElementalStones;
import com.kalaxi.elementalstones.ElementalStones.ElementalStonesItemGroup;
import com.kalaxi.elementalstones.objects.items.PotentialStone;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ElementalStones.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ElementalStones.MOD_ID)
public class ItemInit
{
	//For new item copy this and rename it VVV + Register it
	public static final Item fire_stone = null;
	public static final Item earth_stone = null;
	public static final Item water_stone = null;
	public static final Item air_stone = null;
	
	
	public static final Item potential_stone = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		//Register items here VVV
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("fire_stone"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("earth_stone"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("water_stone"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("air_stone"));
		
		event.getRegistry().register(new PotentialStone(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_stone"));
	}
}