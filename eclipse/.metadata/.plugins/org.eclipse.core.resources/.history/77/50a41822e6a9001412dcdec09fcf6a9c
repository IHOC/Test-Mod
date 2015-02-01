package com.example.examplemod.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static void init(File configFile){
		
		// Create the configuration object from the given configuration file
		Configuration configuration = new Configuration(configFile);
		
		boolean configValue = false;
		
		try {
			// Load the configuration file
			configuration.load();
			
			// Read in properties from the configuration file
			configValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, true, "This is an example config value");
		}
		catch (Exception e) {
			// Log the exception
		}
		finally {
			// Save the configuration file
			configuration.save();
		}
		
		System.out.println("Configuration Test: " + configValue);
	}
}
