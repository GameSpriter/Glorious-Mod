package com.GameSpriter.Glorious.blocks;

import com.GameSpriter.Glorious.Reference;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockShinyWood extends BlockRotatedPillar {

	public BlockShinyWood() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.GloriousBlocks.SHINY_WOOD.getUnlocalizedName());
		setRegistryName(Reference.GloriousBlocks.SHINY_WOOD.getRegistryName());
		
		//Block Properties
		setHardness(2.0F);
		this.setHarvestLevel("ItemAxe", 2);
	}
	
	@Override public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) { return true; }
	@Override public boolean canSustainLeaves(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos){ return true; }
    @Override public boolean isWood(net.minecraft.world.IBlockAccess world, BlockPos pos){ return true; }

}
