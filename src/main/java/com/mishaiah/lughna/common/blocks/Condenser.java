package com.mishaiah.lughna.common.blocks;

import com.mishaiah.lughna.client.util.CustomRenderStuff;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class Condenser extends Block implements CustomRenderStuff {

    private VoxelShape Shape = Block.makeCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 14.0D, 12.0D);


    public Condenser(Properties properties) {
        super(properties
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .hardnessAndResistance(1.5f, 6f)
                .notSolid());
    }

    @Override
    public RenderType getRenderStuff() {
        return RenderType.getCutout();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return Shape;
    }

    @Override
    public boolean isTransparent(BlockState state) {
        return true;
    }


}
