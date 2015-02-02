package com.example.examplemod.creativetab;

import com.example.examplemod.init.ModItems;
import com.example.examplemod.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEM {
	public static final CreativeTabs ExampleMod = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return ModItems.maglite2D;
		}
	};
}
