package com.kalaxi.elementalstones.objects.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;

public class WandLightning extends Item {
	
	private int charge = 0;
	
	
	public WandLightning(Properties properties)
	{
		super(properties);
	}
	
	
	@Override
	public void setDamage(ItemStack stack, int damage) 
	{
		super.setDamage(stack, (this.charge));
	}
	
	public static void onStrike(EntityStruckByLightningEvent event, PlayerEntity player, ItemStack stack)
	{
		World worldIn = player.getEntityWorld();
		if(!worldIn.isRemote) {
			player.inventory.getItemStack();
			
		}
	}

}
