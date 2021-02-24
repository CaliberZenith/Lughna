package com.mishaiah.lughna.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class InfusedStone extends Block {

    public InfusedStone(Properties properties) {
        super(properties
                .notSolid()
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.5f, 6f)
                .setLightLevel((BlockState) -> 5));

    }

}
