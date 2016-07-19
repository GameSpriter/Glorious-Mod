package com.GameSpriter.Glorious;

import com.GameSpriter.Glorious.init.GloriousBlocks;
import com.GameSpriter.Glorious.init.GloriousItems;
import com.GameSpriter.Glorious.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class Glorious {

	@Instance
	public static Glorious instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//System.out.println("Pre Init Start");
		
		GloriousBlocks.init();
		GloriousBlocks.register();
		
		GloriousItems.init();
		GloriousItems.register();
		
		//System.out.println("Pre Init End");
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		//System.out.println("Init Start");
		proxy.init();
		//System.out.println("Init End");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		//System.out.println("PostInit");
	}









}
