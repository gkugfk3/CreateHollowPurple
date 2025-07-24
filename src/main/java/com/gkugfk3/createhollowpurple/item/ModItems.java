package com.gkugfk3.createhollowpurple.item;

import com.gkugfk3.createhollowpurple.block.ModBlocks;
import com.gkugfk3.createhollowpurple.fluids.ModFluids;
import com.gkugfk3.createhollowpurple.CreativeTabs;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModItems {
    private static final Logger LOGGER = LogManager.getLogger();

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "createhollowpurple");

    public static final RegistryObject<Item> PURNITE_INGOT = ITEMS.register("purnite_ingot",
            () -> new Item(new Item.Properties()
                    .tab(CreativeTabs.TAB_HOLLOW_PURPLE)
                    .stacksTo(64)));

    public static final RegistryObject<Item> PURNITE_BUCKET = ITEMS.register("purnite_bucket",
            () -> new BucketItem(ModFluids.PURNITE_SOURCE,
                    new Item.Properties()
                            .craftRemainder(Items.BUCKET)
                            .tab(CreativeTabs.TAB_HOLLOW_PURPLE)
                            .stacksTo(1)));

    public static final RegistryObject<Item> PURNITE_BLOCK = ITEMS.register("purnite_block",
            () -> new BlockItem(ModBlocks.PURNITE_BLOCK.get(),
                    new Item.Properties()
                            .tab(CreativeTabs.TAB_HOLLOW_PURPLE)
                            .stacksTo(64)));

    public static final RegistryObject<Item> PURNITE_CASING = ITEMS.register("purnite_casing",
            () -> new BlockItem(ModBlocks.PURNITE_CASING.get(),
                    new Item.Properties()
                            .tab(CreativeTabs.TAB_HOLLOW_PURPLE)
                            .stacksTo(64)));

    public static final RegistryObject<Item> REINFORCED_CASING = ITEMS.register("reinforced_casing",
            () -> new BlockItem(ModBlocks.REINFORCED_CASING.get(),
                    new Item.Properties()
                            .tab(CreativeTabs.TAB_HOLLOW_PURPLE)
                            .stacksTo(64)));

    public static void register(IEventBus eventBus) {
        LOGGER.info("Registering mod items.");
        ITEMS.register(eventBus);
    }
}
