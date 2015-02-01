package com.example.examplemod.init;

import com.example.examplemod.item.*;
import cpw.mods.fml.common.registry.*;

public class ModItems {
	
	public static final ItemEM oakLeaf = new ItemOakLeaf();
	public static final ItemEM maglite2D = new Maglite2D();
	
	public static void init() {
		GameRegistry.registerItem(oakLeaf, "oakLeaf");
		GameRegistry.registerItem(maglite2D, "maglite2D");
	}
}
