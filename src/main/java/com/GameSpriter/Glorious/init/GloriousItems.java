package com.GameSpriter.Glorious.init;

import com.GameSpriter.Glorious.items.ItemGrinderBowl;
import com.GameSpriter.Glorious.items.ItemShinyStick;
import com.GameSpriter.Glorious.items.ItemSparklingPowder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GloriousItems {

	public static Item sparklingPowder;
	public static Item grinderBowl;
	public static Item shinyStick;
	
	public static void init(){
		sparklingPowder = new ItemSparklingPowder();
		grinderBowl = new ItemGrinderBowl();
		shinyStick = new ItemShinyStick();
	}
		
	public static void register() {
		GameRegistry.register(sparklingPowder);
		GameRegistry.register(grinderBowl);
		GameRegistry.register(shinyStick);
	}
	
	public static void registerRenders() {
		registerRender(sparklingPowder);
		registerRender(grinderBowl);
		registerRender(shinyStick);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
