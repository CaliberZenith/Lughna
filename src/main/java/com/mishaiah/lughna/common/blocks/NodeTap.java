package com.mishaiah.lughna.common.blocks;

import net.minecraft.block.Block;
import com.mishaiah.lughna.client.util.CustomRenderStuff;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.ToolType;

public class NodeTap extends Block implements CustomRenderStuff {

    public NodeTap(Properties properties) {
        super(properties
                .sound(SoundType.METAL)
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
    public boolean isTransparent(BlockState state) {
        return true;
    }
}
