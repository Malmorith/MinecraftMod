package com.kalaxi.elementalstones.objects.items;


import com.kalaxi.elementalstones.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FireStone extends Item
{

	public FireStone(Properties properties) 
	{
		super(properties);
	}
	@Override
	public ActionResultType onItemUse(ItemUseContext context) 
	{
		World worldIn = context.getWorld();
		BlockPos pos = context.getPos();
		PlayerEntity player = context.getPlayer();
		BlockState bs = BlockInit.potential_block_fire.getBlock().getDefaultState();
		ItemStack itemstack = context.getItem();
		
			if(!worldIn.isRemote) {
				if(worldIn.getBlockState(pos).getBlock()==BlockInit.potential_block) {
					worldIn.setBlockState(pos, bs, 3);
					if(!player.abilities.isCreativeMode) { 
						itemstack.shrink(1); 
					}
				}
			    player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
				return ActionResultType.SUCCESS;
			}
			
				if(worldIn.getBlockState(pos).getBlock()==BlockInit.potential_block_fire) {
					player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 12000));
				      player.getCooldownTracker().setCooldown(this, 12000); //12000=10min
						if (!player.abilities.isCreativeMode) {
							itemstack.shrink(1);
						}
				}
			    player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
				return ActionResultType.SUCCESS;
	}
}