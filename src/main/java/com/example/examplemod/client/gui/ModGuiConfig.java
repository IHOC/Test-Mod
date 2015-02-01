package com.example.examplemod.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.*;
import com.example.examplemod.handler.ConfigurationHandler;
import com.example.examplemod.reference.Reference;
import cpw.mods.fml.client.config.*;

public class ModGuiConfig extends GuiConfig {
	
	public ModGuiConfig(GuiScreen guiScreen) {
		super(guiScreen,
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}
}
