package com.GameSpriter.Glorious.blocks;

import java.util.Random;

import com.GameSpriter.Glorious.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockShinySapling extends BlockFlower {

	public BlockShinySapling() {
		setUnlocalizedName(Reference.GloriousBlocks.SHINY_SAPLING.getUnlocalizedName());
		setRegistryName(Reference.GloriousBlocks.SHINY_SAPLING.getRegistryName());
		
	}
	
	public static boolean growableOnBlock(Block block) {
		return block == net.minecraft.init.Blocks.DIRT || block == net.minecraft.init.Blocks.GRASS;
	}

	public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos))
			return;
		WorldGenerator worldgenerator = (WorldGenerator) (rand.nextInt(10) == 0 ? new WorldGenBigTree(true)
				: new WorldGenTrees(true));
		
		System.out.println("Tree Spawned(temp placeholder)");
	}

	@Override
	public EnumFlowerColor getBlockType() {
		return null;
	}

}
