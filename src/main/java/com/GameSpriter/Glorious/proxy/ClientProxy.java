package com.GameSpriter.Glorious.proxy;

import com.GameSpriter.Glorious.Reference;
import com.GameSpriter.Glorious.blocks.BlockShinySapling;
import com.GameSpriter.Glorious.init.GloriousBlocks;
import com.GameSpriter.Glorious.init.GloriousItems;

import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.block.statemap.StateMap.Builder;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy implements CommonProxy{
	
	@Override
	public void preInit() {
		
	}	
	
	@Override
	public void init() { 
		GloriousItems.registerRenders();
		GloriousBlocks.registerRenders();

	}

	@Override
	public void postInit() {
		
	}

}
