package com.kalaxi.elementalstones.objects.items;

import com.kalaxi.elementalstones.init.ItemInit;

import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
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
		(!player.isInWater()) &&
		(world.getBlockState(pos).getBlock() == Blocks.MAGMA_BLOCK)
	  )
		{
			player.inventory.addItemStackToInventory(new ItemStack(ItemInit.fire_stone));
			if (!player.abilities.isCreativeMode)
			{
		         itemStack.shrink(1);
		    }
			return ActionResultType.SUCCESS;
		}
	//Earth stone
	if(
	   (!player.isInWater()) &&
	   (world.getBlockState(pos).getBlock() == Blocks.BEDROCK)
	  )
		{
			player.inventory.addItemStackToInventory(new ItemStack(ItemInit.earth_stone));
			if (!player.abilities.isCreativeMode)
			{
		         itemStack.shrink(1);
		    }
			return ActionResultType.SUCCESS;
		}
	if(
		(!player.isInWater()) &&
		(world.getBlockState(pos).getBlock() == Blocks.SUNFLOWER)
	  )
		{
			player.inventory.addItemStackToInventory(new ItemStack(ItemInit.light_stone));
			if (!player.abilities.isCreativeMode)
			{
				 itemStack.shrink(1);
			}
				return ActionResultType.SUCCESS;
		}
		return super.onItemUse(context);
	}

@Override
public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) 
	{
		ItemStack itemStack = playerIn.getHeldItem(handIn);
		
		if(
			(playerIn.getSubmergedHeight() > 0)	
		  )
		{
			playerIn.inventory.addItemStackToInventory(new ItemStack(ItemInit.water_stone));
			if (!playerIn.abilities.isCreativeMode)
			{
		         itemStack.shrink(1);
		    }
		}
		
		if(
			(playerIn.getPosY() >= 120) &&
			(!playerIn.isInWater())
		  )
			{
				playerIn.inventory.addItemStackToInventory(new ItemStack(ItemInit.air_stone));
				if (!playerIn.abilities.isCreativeMode)
				{
			         itemStack.shrink(1);
			    }
			}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
@Override
public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) 
	{ 
		if((entity instanceof EndermanEntity) == true) 
			{
				player.inventory.addItemStackToInventory(new ItemStack(ItemInit.void_stone));
				if (!player.abilities.isCreativeMode)
					{
						stack.shrink(1);
					}
			}
		return super.onLeftClickEntity(stack, player, entity);
	}

}
