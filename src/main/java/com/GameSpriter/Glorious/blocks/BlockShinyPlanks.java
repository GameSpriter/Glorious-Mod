package com.GameSpriter.Glorious.blocks;

import com.GameSpriter.Glorious.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockShinyPlanks extends Block {

	public BlockShinyPlanks() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.GloriousBlocks.SHINY_PLANKS.getUnlocalizedName());
		setRegistryName(Reference.GloriousBlocks.SHINY_PLANKS.getRegistryName());
	}

}
