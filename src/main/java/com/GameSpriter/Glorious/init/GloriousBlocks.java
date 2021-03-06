package com.GameSpriter.Glorious.init;

import com.GameSpriter.Glorious.Glorious;
import com.GameSpriter.Glorious.Reference;
import com.GameSpriter.Glorious.blocks.BlockShinyPlanks;
import com.GameSpriter.Glorious.blocks.BlockShinySapling;
import com.GameSpriter.Glorious.blocks.BlockShinyWood;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.block.statemap.StateMap.Builder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GloriousBlocks {

	static Builder GLBuilder;
	
	public static Block shinyWood;
	public static Block shinyPlanks;
	public static Block shinySapling;
	
	public static void init(){
		shinyWood = new BlockShinyWood().setCreativeTab(Glorious.tabGlorious);
		shinyPlanks = new BlockShinyPlanks().setCreativeTab(Glorious.tabGlorious);
		shinySapling = new BlockShinySapling().setCreativeTab(Glorious.tabGlorious);
	}
		
	public static void register() {// 
		registerBlock(shinyWood);
		registerBlock(shinyPlanks);
		registerBlock(shinySapling);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(shinyWood);
		registerRender(shinyPlanks);
		registerRender(shinySapling);
	}
	
	private static void registerRender(Block block) {
		
		GLBuilder = new StateMap.Builder();
		GLBuilder.ignore();
		ModelLoader.setCustomStateMapper(block, GLBuilder.build());
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
	
}
