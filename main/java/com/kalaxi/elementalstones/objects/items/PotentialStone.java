package com.kalaxi.elementalstones.objects.items;

import com.kalaxi.elementalstones.init.ItemInit;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PotentialStone extends Item
{

	public PotentialStone(Properties properties) 
	{
		super(properties);
	}
	
@Override
public ActionResultType onItemUse(ItemUseContext context) 
	{
	BlockPos pos = context.getPos();
	World world = context.getWorld();
	ItemStack itemStack = context.getItem();
	PlayerEntity player = context.getPlayer();
	
	//Fire stone
	if(
		(!world.isRemote) && 
		(!player.isInWater()) &&
		(world.getBlockState(pos).getBlock() == Blocks.MAGMA_BLOCK)
	  )
		{
			player.inventory.addItemStackToInventory(new ItemStack(ItemInit.fire_stone));
			if (!player.abilities.isCreativeMode)
			{
		         itemStack.shrink(1);
		    }
		}
	//Earth stone
	if(
	   (!world.isRemote) && 
	   (!player.isInWater()) &&
	   (world.getBlockState(pos).getBlock() == Blocks.BEDROCK)
	  )
		{
			player.inventory.addItemStackToInventory(new ItemStack(ItemInit.earth_stone));
			if (!player.abilities.isCreativeMode)
			{
		         itemStack.shrink(1);
		    }
		}	
	return super.onItemUse(context);
	
	}
	
}
