package com.example.examplemod.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.*;

public class GuiFactory implements IModGuiFactory {

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(
			RuntimeOptionCategoryElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialize(Minecraft arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {
		// TODO Auto-generated method stub
		return ModGuiConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}