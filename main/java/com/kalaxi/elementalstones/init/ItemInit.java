package com.kalaxi.elementalstones.init;

import com.kalaxi.elementalstones.ElementalStones;
import com.kalaxi.elementalstones.ElementalStones.ElementalStonesItemGroup;
import com.kalaxi.elementalstones.objects.items.AirStone;
import com.kalaxi.elementalstones.objects.items.EarthStone;
import com.kalaxi.elementalstones.objects.items.FireStone;
import com.kalaxi.elementalstones.objects.items.LightningStone;
import com.kalaxi.elementalstones.objects.items.MortarPestle;
import com.kalaxi.elementalstones.objects.items.PotentialStone;
import com.kalaxi.elementalstones.objects.items.WandFire;
import com.kalaxi.elementalstones.objects.items.WandLightning;
import com.kalaxi.elementalstones.objects.items.WaterStone;

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
	
	//Stones
	public static final Item fire_stone = null;
	public static final Item earth_stone = null;
	public static final Item water_stone = null;
	public static final Item air_stone = null;
	public static final Item lightning_stone = null;
	public static final Item light_stone = null;
	public static final Item void_stone = null;
	public static final Item nature_stone = null;
	//Potential stone
	public static final Item potential_stone = null;
	
	//Dusts
	public static final Item fire_dust = null;
	public static final Item earth_dust = null;
	public static final Item water_dust = null;
	public static final Item air_dust = null;
	public static final Item lightning_dust = null;
	public static final Item light_dust = null;
	public static final Item void_dust = null;
	public static final Item nature_dust = null;
	
	//Other
	public static final Item mortar_pestle = null;
	public static final Item wand_fire = null;
	public static final Item wand_lightning = null;
	public static final Item wand_base = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		//Register items here VVV
		
		//Stones
		event.getRegistry().register(new FireStone(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("fire_stone"));
		event.getRegistry().register(new EarthStone(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("earth_stone"));
		event.getRegistry().register(new WaterStone(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("water_stone"));
		event.getRegistry().register(new AirStone(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("air_stone"));
		event.getRegistry().register(new LightningStone(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("lightning_stone"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("light_stone"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("void_stone"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("nature_stone"));
		//Potential stone
		event.getRegistry().register(new PotentialStone(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("potential_stone"));
		
		//Dusts
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("fire_dust"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("earth_dust"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("water_dust"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("air_dust"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("lightning_dust"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("light_dust"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("void_dust"));
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("nature_dust"));
		
		//Other
		event.getRegistry().register(new MortarPestle(new Item.Properties().group(ElementalStonesItemGroup.instance)).setRegistryName("mortar_pestle"));
		//Wands
		event.getRegistry().register(new Item(new Item.Properties().group(ElementalStonesItemGroup.instance).maxStackSize(1)).setRegistryName("wand_base"));
		event.getRegistry().register(new WandFire(new Item.Properties().group(ElementalStonesItemGroup.instance).maxDamage(5)).setRegistryName("wand_fire"));
		event.getRegistry().register(new WandLightning(new Item.Properties().group(ElementalStonesItemGroup.instance).maxDamage(5)).setRegistryName("wand_lightning"));
		
	}
}