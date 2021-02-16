package com.mishaiah.lughna.setup;

import com.mishaiah.lughna.Lughna;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod.EventBusSubscriber(modid = Lughna.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup
{
    @SubscribeEvent
    public static void serverLoad(FMLServerStartingEvent event) {

    }

    @SubscribeEvent
    public static void init(final FMLCommonSetupEvent event) {

    }
}
