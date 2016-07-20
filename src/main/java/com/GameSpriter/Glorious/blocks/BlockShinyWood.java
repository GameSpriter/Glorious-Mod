package com.GameSpriter.Glorious.blocks;

import javax.annotation.Nullable;

import com.GameSpriter.Glorious.Reference;
import com.GameSpriter.Glorious.init.GloriousBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Bootstrap;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockShinyWood extends BlockRotatedPillar {

	public static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.<EnumFacing.Axis>create("axis", EnumFacing.Axis.class);
	
	public BlockShinyWood() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.GloriousBlocks.SHINY_WOOD.getUnlocalizedName());
		setRegistryName(Reference.GloriousBlocks.SHINY_WOOD.getRegistryName());
		
		//Block Properties
		setHardness(2.0F);
		this.setHarvestLevel("ItemAxe", 2);
		this.setDefaultState(this.blockState.getBaseState());
	}
	
	@Override public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) { return true; }
	@Override public boolean canSustainLeaves(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos){ return true; }
    @Override public boolean isWood(net.minecraft.world.IBlockAccess world, BlockPos pos){ return true; }
    
}
