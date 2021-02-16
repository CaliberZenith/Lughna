package com.mishaiah.lughna.setup;

import com.mishaiah.lughna.Lughna;
import com.mishaiah.lughna.client.util.CustomRenderStuff;
import com.mishaiah.lughna.core.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Lughna.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup
{

    public static void init(final FMLClientSetupEvent event) {

        BlockInit.BLOCKS.getEntries().forEach(blockRegistryObject -> {

            if (blockRegistryObject.get() instanceof CustomRenderStuff) {
                RenderTypeLookup.setRenderLayer(blockRegistryObject.get(), ((CustomRenderStuff)blockRegistryObject.get()).getRenderStuff());
            }
        });

        RenderTypeLookup.setRenderLayer(BlockInit.CONDENSER.get(), RenderType.getTranslucent());

    }
}
