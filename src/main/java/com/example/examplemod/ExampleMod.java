package com.example.examplemod;

import com.example.examplemod.configuration.ConfigurationHandler;
import com.example.examplemod.proxy.IProxy;
import com.example.examplemod.reference.Reference;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ExampleMod
{
    @Instance(Reference.MOD_ID)
    public static ExampleMod instance;
    
    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
