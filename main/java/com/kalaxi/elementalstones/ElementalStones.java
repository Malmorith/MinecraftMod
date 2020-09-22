package com.kalaxi.elementalstones;

import com.kalaxi.elementalstones.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("elementalstones")
public class ElementalStones

{
	public static final String MOD_ID = "elementalstones";
	public static ElementalStones instance;
	
    public ElementalStones() 
    {
    	final IEventBus modEventBus =  FMLJavaModLoadingContext.get().getModEventBus();
    		modEventBus.addListener(this::setup);
    		modEventBus.addListener(this::doClientStuff);
        
        instance = this;

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
        // do something that can only be done on the client
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
        // do something when the server starts
    }

    public static class ElementalStonesItemGroup extends ItemGroup 
    {
    	public static final ElementalStonesItemGroup instance = new ElementalStonesItemGroup(ItemGroup.GROUPS.length, "elementalstonestab");
    	private ElementalStonesItemGroup(int index, String label)
    	{
    		super (index,label);
    	}
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(ItemInit.potential_stone);
    	}
    }
    
    
    
}
