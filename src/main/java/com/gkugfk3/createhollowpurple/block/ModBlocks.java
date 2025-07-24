package com.gkugfk3.createhollowpurple.block;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraftforge.eventbus.api.*;
import com.gkugfk3.createhollowpurple.*;
import org.apache.logging.log4j.*;
import net.minecraftforge.registries.*;
import com.gkugfk3.createhollowpurple.block.purnite.*;
import java.util.function.*;
import com.gkugfk3.createhollowpurple.fluids.*;

public class ModBlocks
{
    private static final Logger LOGGER;
    public static final DeferredRegister<Block> BLOCKS;
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Block> PURNITE_CASING;
    public static final RegistryObject<Block> PURNITE_BLOCK;
    public static final RegistryObject<Block> REINFORCED_CASING;
    public static final RegistryObject<BlockItem> PURNITE_CASING_ITEM;
    public static final RegistryObject<BlockItem> PURNITE_BLOCK_ITEM;
    public static final RegistryObject<BlockItem> REINFORCED_CASING_ITEM;
    public static final RegistryObject<LiquidBlock> PURNITE_FLUID_BLOCK;
    
    public static void register(final IEventBus bus) {
        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
        ModBlocks.LOGGER.info("i think the blocks loaded");
    }
    
    static {
        LOGGER = LogManager.getLogger();
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "createhollowpurple");
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "createhollowpurple");
        PURNITE_CASING = ModBlocks.BLOCKS.register("purnite_casing", PurniteCasingBlock::new);
        PURNITE_BLOCK = ModBlocks.BLOCKS.register("purnite_block", PurniteCasingBlock::new);
        REINFORCED_CASING = ModBlocks.BLOCKS.register("reinforced_casing", ReinforcedCasing::new);
        PURNITE_CASING_ITEM = ModBlocks.ITEMS.register("purnite_casing", () ->
                new BlockItem(ModBlocks.PURNITE_CASING.get(), new Item.Properties().tab(CreativeTabs.TAB_HOLLOW_PURPLE).stacksTo(64))
        );

        PURNITE_BLOCK_ITEM = ModBlocks.ITEMS.register("purnite_block", () ->
                new BlockItem(ModBlocks.PURNITE_BLOCK.get(), new Item.Properties().tab(CreativeTabs.TAB_HOLLOW_PURPLE).stacksTo(64))
        );

        REINFORCED_CASING_ITEM = ModBlocks.ITEMS.register("reinforced_casing", () ->
                new BlockItem(ModBlocks.REINFORCED_CASING.get(), new Item.Properties().tab(CreativeTabs.TAB_HOLLOW_PURPLE).stacksTo(64))
        );

        PURNITE_FLUID_BLOCK = ModBlocks.BLOCKS.register("purnite_fluid_block", PurniteFluxFluidBlock::new);
    }
}
