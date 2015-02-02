package com.example.examplemod.item;

import com.example.examplemod.handler.ConfigurationHandler;
import com.example.examplemod.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class Maglite2D extends ItemEM {

	public static boolean status = false;
	
	public Maglite2D() {
		super();
		this.setUnlocalizedName("maglite2D");
		this.maxStackSize = 1;
	}
	
	// TODO - Need work and investigation. 
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
	
		// When right clicked, follow these procedures
		
		// 1.) Check for batteries / charge
		
		// 2.) toggle on / off state
		if (status){
			// Turn light level of item to 0
			status = false;
		} else {
			// Turn light level of item to 15
			world.updateLightByType(EnumSkyBlock.Block, player.chunkCoordX, player.chunkCoordY, player.chunkCoordZ);
			status = true;
		}
		
		if (ConfigurationHandler.debug){
			LogHelper.info("User right clicked on maglite2D");
			LogHelper.info(String.format("Item status has been set to %s",status));
		}
		
		return itemStack;
	}
	
}
