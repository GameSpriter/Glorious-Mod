package com.GameSpriter.Glorious;

import com.GameSpriter.Glorious.init.GloriousBlocks;
import com.GameSpriter.Glorious.init.GloriousItems;
import com.GameSpriter.Glorious.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.9.4, 1.10.2]")
public class Glorious {

	@Instance
	public static Glorious instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static final GloriousTab tabGlorious = new GloriousTab("tabGlorious");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
				
		GloriousBlocks.init();
		GloriousBlocks.register();
		
		GloriousItems.init();
		GloriousItems.register();
		
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit();
	}
}	