package com.example.examplemod.init;

import com.example.examplemod.item.*;
import cpw.mods.fml.common.registry.*;

public class ModItems {
	
	public static final ItemEM oakLeaf = new ItemOakLeaf();
	
	public static void init() {
		GameRegistry.registerItem(oakLeaf, "Oak Leaf");
	}
}