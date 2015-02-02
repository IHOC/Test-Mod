package com.example.examplemod.init;

import com.example.examplemod.item.*;
import com.example.examplemod.reference.Reference;
import cpw.mods.fml.common.registry.*;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	public static final ItemEM oakLeaf = new ItemOakLeaf();
	public static final ItemEM maglite2D = new Maglite2D();
	
	public static void init() {
		GameRegistry.registerItem(oakLeaf, "oakLeaf");
		GameRegistry.registerItem(maglite2D, "maglite2D");
	}
}
