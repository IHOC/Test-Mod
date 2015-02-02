package com.example.examplemod.block.Sockets;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.example.examplemod.block.BlockEM;
import com.example.examplemod.containers.BlockContainerEM;
import com.example.examplemod.handler.ConfigurationHandler;
import com.example.examplemod.reference.Reference;
import com.example.examplemod.tileentity.InventorySingleFixture;
import com.example.examplemod.utility.LogHelper;

public class BlockSimpleLightSocket extends BlockContainerEM  {
	
	public static boolean status = false;
	
	public BlockSimpleLightSocket() {
		super();
		this.setBlockName("simpleLightSocket");
		//this.setBlockTextureName("simpleLightSocket");
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
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p1, float f1, float f2, float f3){
	
		if (world.isRemote){
			return true;
		}
		
		// User shift + right click, open fixture inventory
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			IInventory fixture = this.getFixture(world,x,y,z);
			
			if (fixture != null) {
				player.displayGUIChest(fixture);
			}
			
			return true;
		}
		
		// When right clicked, follow these procedures
		// 1.) Check for batteries / charge
		
		// 2.) toggle on / off state
		if (status){
			// Turn light level of item to 0
			this.setLightLevel(0);
			world.setBlock(x, y, z, this);
			status = false;
		} else {
			// Turn light level of item to 13 (Same as torch)
			this.setLightLevel(0.9375F);
			world.setBlock(x, y, z, this);
			status = true;
		}
		
		if (ConfigurationHandler.debug){
			LogHelper.info("User right clicked on Incandescent Bulb");
			LogHelper.info(String.format("Block status has been set to %s",status));
		}
		
		return true;
	}
	
	public IInventory getFixture(World world, int x, int y, int z) {
		Object object = (InventorySingleFixture)world.getTileEntity(x, y, z);
		return (IInventory)object; 
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return new InventorySingleFixture();
	}
}
