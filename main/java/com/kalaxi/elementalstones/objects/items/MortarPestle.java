package com.kalaxi.elementalstones.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MortarPestle extends Item
{

	public MortarPestle(Properties properties) 
	{
		super(properties);
		
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) 
	{
		return true;
	}
	
	
	 @Override
	    public ItemStack getContainerItem(ItemStack itemStack)
	 {
	        ItemStack itemstack = new ItemStack(this);
	        
	        return itemstack;
	}
	
}
