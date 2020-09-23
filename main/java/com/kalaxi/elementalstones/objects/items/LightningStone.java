package com.kalaxi.elementalstones.objects.items;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LightningStone extends Item
{

	public LightningStone(Properties properties) 
	{
		super(properties);
	}
	
	@SuppressWarnings("resource")
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) 
	{
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		RayTraceResult look = Minecraft.getInstance().objectMouseOver;
		
		double x = look.getHitVec().getX();
		double y = look.getHitVec().getY();
		double z = look.getHitVec().getZ();
		
		if(!worldIn.isRemote) {
		
		ServerWorld world = (ServerWorld) worldIn;
		
        LightningBoltEntity lightning = new LightningBoltEntity(worldIn,(x) , (y), (z), false);
        world.addLightningBolt(lightning);
        
		}
        	if (!playerIn.abilities.isCreativeMode)
			{
        		itemstack.shrink(1);
			}
		return ActionResult.resultSuccess(itemstack);
		}
}