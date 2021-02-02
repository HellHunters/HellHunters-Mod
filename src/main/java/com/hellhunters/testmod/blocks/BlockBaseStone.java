package com.hellhunters.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.xml.stream.Location;


public class BlockBaseStone extends Block
{
    public static final PropertyBool UPPER = PropertyBool.create("upper");

    public BlockBaseStone(String name)
    {
        super(Material.ROCK);

        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        System.out.println(this.getRegistryName());
        //this.setDefaultState(this.blockState.getBaseState().withProperty(UPPER,false));
    }

    /*
    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        Block block = worldIn.getBlockState(pos.up()).getBlock();
        return state.withProperty(UPPER, block != Blocks.AIR);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return 0;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {UPPER});
    }*/

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
}
