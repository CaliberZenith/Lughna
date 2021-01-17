package com.mishainah.lughna.core.init;

import com.mishainah.lughna.Lughna;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Lughna.MOD_ID);

    public static final RegistryObject<Block> NODE_TAP = BLOCKS.register
            ("node_tap", () -> new Block(AbstractBlock.Properties.create
                    (Material.IRON)
                    .sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)));

    public static final RegistryObject<Block> CONDENSER = BLOCKS.register
            ("condenser", () -> new Block(AbstractBlock.Properties.create
                    (Material.ROCK)
                    .sound(SoundType.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)));


}
