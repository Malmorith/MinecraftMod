package com.kalaxi.elementalstones.objects.items;

import com.kalaxi.elementalstones.init.ItemInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class WandFire extends Item{
	
	public WandFire(Properties properties) 
	{
		super(properties);
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		if(!worldIn.isRemote) 
		{
            Vec3d vec3d = playerIn.getLook(1.0F);
            double d2 = playerIn.getPosX() + (vec3d.x * 4.0D);
            double d3 = playerIn.getPosYHeight(0.5D);
            double d4 = playerIn.getPosZ() + (vec3d.z * 4.0D);
            worldIn.playEvent((PlayerEntity)null, 1016, new BlockPos(playerIn), 0);
            FireballEntity fireballentity = new FireballEntity(worldIn, playerIn, d2, d3, d4);
            fireballentity.setPosition(playerIn.getPosX() + vec3d.x * 4.0D, playerIn.getPosYHeight(0.5D) + 0.5D, fireballentity.getPosZ() + vec3d.z * 4.0D);
            worldIn.addEntity(fireballentity);
				if(!playerIn.abilities.isCreativeMode){
			itemstack.damageItem(1, playerIn, consumer -> playerIn.addItemStackToInventory(new ItemStack(ItemInit.wand_base)));
		
				}
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
		
	}
}