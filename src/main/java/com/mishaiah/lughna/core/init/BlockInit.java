package com.mishaiah.lughna.core.init;

import com.mishaiah.lughna.Lughna;
import com.mishaiah.lughna.common.blocks.Condenser;
import com.mishaiah.lughna.common.blocks.InfusedStone;
import com.mishaiah.lughna.common.blocks.NodeTap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Lughna.MOD_ID);

    public static final RegistryObject<Block> CONDENSER = BLOCKS.register
            ("condenser", () -> new Condenser(AbstractBlock.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> NODE_TAP = BLOCKS.register(
            "node_tap", () -> new NodeTap(AbstractBlock.Properties.create(Material.IRON)));

    public static final RegistryObject<Block> INFUSED_STONE = BLOCKS.register(
            "infused_stone", () -> new InfusedStone(AbstractBlock.Properties.create(Material.ROCK)));

}
