package com.example.examplemod.block.Bulbs;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

import com.example.examplemod.block.*;
import com.example.examplemod.handler.ConfigurationHandler;
import com.example.examplemod.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIncandescentBulb extends BlockEM {
	
	public static boolean status = false;
	
	public BlockIncandescentBulb() {
		super(Material.circuits);
		this.setBlockName("incandescentBulb");
		this.setHardness(0.0F);
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public int getRenderType()
    {
        return 2;
    }
	
	
}
