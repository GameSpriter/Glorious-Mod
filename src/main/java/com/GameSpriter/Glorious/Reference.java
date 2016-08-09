package com.GameSpriter.Glorious;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Reference {
	public static final String MOD_ID = "glorious";
	public static final String NAME = "Glorious Mod";
	public static final String VERSION = "0.1";
	
	public static final String CLIENT_PROXY_CLASS = "com.GameSpriter.Glorious.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.GameSpriter.Glorious.proxy.ServerProxy";
	
	/*
	 * In the event I inevitably forget how to do it:
	 * @SideOnly(Side.CLIENT)
	 * 
	 */
	
	
	public static enum GloriousItems {
		SPARKLING_POWDER("sparklingPowder", "ItemSparklingPowder"),
		GRINDER_BOWL("grinderBowl", "ItemGrinderBowl"),
		SHINY_STICK("shinyStick", "ItemShinyStick");
		
		private String unlocalizedName;
		private String registryName;

		GloriousItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum GloriousBlocks {
		SHINY_WOOD("shinyWood", "BlockShinyWood"),
		SHINY_PLANKS("shinyPlanks", "BlockShinyPlanks"),
		SHINY_SAPLING("shinySapling", "BlockShinySapling");
		
		private String unlocalizedName;
		private String registryName;

		GloriousBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
