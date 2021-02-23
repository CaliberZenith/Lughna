package com.mishaiah.lughna.core.init;

import com.mishaiah.lughna.Lughna;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lughna.MOD_ID);

    // Proper Items //
    public static final RegistryObject<Item> LEYMULETF = ITEMS.register("leymulet_full",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LEYMULETE = ITEMS.register("leymulet_empty",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CXOUSIA = ITEMS.register("condensed_exousia",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> RXOUSIA = ITEMS.register("raw_exousia",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));


    // Block Items //
    public static final RegistryObject<BlockItem> CONDENSER = ITEMS.register("condenser",
            () -> new BlockItem(BlockInit.CONDENSER.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> NODE_TAP = ITEMS.register("node_tap",
            () -> new BlockItem(BlockInit.NODE_TAP.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> INFUSED_STONE = ITEMS.register("infused_stone",
            () -> new BlockItem(BlockInit.INFUSED_STONE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

}

