package com.GameSpriter.Glorious.blocks;

import java.util.Random;

import com.GameSpriter.Glorious.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockShinySapling extends BlockSapling {

	public static final PropertyEnum<BlockPlanks.EnumType> TYPE = PropertyEnum.<BlockPlanks.EnumType>create("type", BlockPlanks.EnumType.class);
    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    
	
	public BlockShinySapling() {
		setUnlocalizedName(Reference.GloriousBlocks.SHINY_SAPLING.getUnlocalizedName());
		setRegistryName(Reference.GloriousBlocks.SHINY_SAPLING.getRegistryName());
		
	}

	@Override
	public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos))
			return;
		WorldGenerator worldgenerator = (WorldGenerator) (rand.nextInt(10) == 0 ? new WorldGenBigTree(true)
				: new WorldGenTrees(true));
		int i = 0;
		int j = 0;
		boolean flag = false;

		switch ((BlockPlanks.EnumType) state.getValue(TYPE)) {
		case SPRUCE:
			label114:

			for (i = 0; i >= -1; --i) {
				for (j = 0; j >= -1; --j) {
					if (this.IsTwoByTwoOfType(worldIn, pos, i, j, BlockPlanks.EnumType.SPRUCE)) {
						worldgenerator = new WorldGenMegaPineTree(false, rand.nextBoolean());
						flag = true;
						break label114;
					}
				}
			}

			if (!flag) {
				i = 0;
				j = 0;
				worldgenerator = new WorldGenTaiga2(true);
			}

			break;
		case BIRCH:
			worldgenerator = new WorldGenBirchTree(true, false);
			break;
		case JUNGLE:
			IBlockState iblockstate = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT,
					BlockPlanks.EnumType.JUNGLE);
			IBlockState iblockstate1 = Blocks.LEAVES.getDefaultState()
					.withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE)
					.withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			label269:

			for (i = 0; i >= -1; --i) {
				for (j = 0; j >= -1; --j) {
					if (this.IsTwoByTwoOfType(worldIn, pos, i, j, BlockPlanks.EnumType.JUNGLE)) {
						worldgenerator = new WorldGenMegaJungle(true, 10, 20, iblockstate, iblockstate1);
						flag = true;
						break label269;
					}
				}
			}

			if (!flag) {
				i = 0;
				j = 0;
				worldgenerator = new WorldGenTrees(true, 4 + rand.nextInt(7), iblockstate, iblockstate1, false);
			}

			break;
		case ACACIA:
			worldgenerator = new WorldGenSavannaTree(true);
			break;
		case DARK_OAK:
			label390:

			for (i = 0; i >= -1; --i) {
				for (j = 0; j >= -1; --j) {
					if (this.IsTwoByTwoOfType(worldIn, pos, i, j, BlockPlanks.EnumType.DARK_OAK)) {
						worldgenerator = new WorldGenCanopyTree(true);
						flag = true;
						break label390;
					}
				}
			}

			if (!flag) {
				return;
			}

		case OAK:
		}
	}

	private boolean IsTwoByTwoOfType(World worldIn, BlockPos pos, int p_181624_3_, int p_181624_4_,
			BlockPlanks.EnumType type) {
		return this.isTypeAt(worldIn, pos.add(p_181624_3_, 0, p_181624_4_), type)
				&& this.isTypeAt(worldIn, pos.add(p_181624_3_ + 1, 0, p_181624_4_), type)
				&& this.isTypeAt(worldIn, pos.add(p_181624_3_, 0, p_181624_4_ + 1), type)
				&& this.isTypeAt(worldIn, pos.add(p_181624_3_ + 1, 0, p_181624_4_ + 1), type);
	}

}
