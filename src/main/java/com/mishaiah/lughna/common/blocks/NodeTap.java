package com.mishaiah.lughna.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class NodeTap extends Block {

    public NodeTap(Properties properties) {
        super(properties
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .notSolid());
    }
}
