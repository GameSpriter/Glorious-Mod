package com.GameSpriter.Glorious.blocks;

import java.util.Random;

import com.GameSpriter.Glorious.Reference;
import com.GameSpriter.Glorious.world.WorldGenShinyTree;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockShinySapling extends BlockSapling {

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
		
		worldgenerator = new WorldGenShinyTree(true, false);

        IBlockState iblockstate2 = Blocks.AIR.getDefaultState();

        if (flag)
        {
            worldIn.setBlockState(pos.add(i, 0, j), iblockstate2, 4);
            worldIn.setBlockState(pos.add(i + 1, 0, j), iblockstate2, 4);
            worldIn.setBlockState(pos.add(i, 0, j + 1), iblockstate2, 4);
            worldIn.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate2, 4);
        }
        else
        {
            worldIn.setBlockState(pos, iblockstate2, 4);
        }

        if (!worldgenerator.generate(worldIn, rand, pos.add(i, 0, j)))
        {
            if (flag)
            {
                worldIn.setBlockState(pos.add(i, 0, j), state, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j), state, 4);
                worldIn.setBlockState(pos.add(i, 0, j + 1), state, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j + 1), state, 4);
            }
            else
            {
                worldIn.setBlockState(pos, state, 4);
            }
        }
	}
}
