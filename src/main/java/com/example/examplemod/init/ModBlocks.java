package com.example.examplemod.init;

import com.example.examplemod.block.*;
import com.example.examplemod.block.Sockets.*;
import com.example.examplemod.block.Bulbs.*;
import com.example.examplemod.containers.BlockContainerEM;
import com.example.examplemod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockContainerEM simpleLightSocket = new BlockSimpleLightSocket();
	public static final BlockEM incandescentBulb = new BlockIncandescentBulb();
	
	public static void init() {
		
		// Sockets
		GameRegistry.registerBlock(simpleLightSocket, "simpleLightSocket");
		
		// Bulbs
		GameRegistry.registerBlock(incandescentBulb, "incandescentBulb");
	}
}
