package com.mishaiah.lughna;

import com.mishaiah.lughna.core.init.BlockInit;
import com.mishaiah.lughna.core.init.ItemInit;
import com.mishaiah.lughna.setup.ClientSetup;
import com.mishaiah.lughna.setup.ModSetup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("lughna")
public class Lughna
{

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "lughna";

    public Lughna() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

}
