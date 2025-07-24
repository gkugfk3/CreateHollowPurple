package com.gkugfk3.createhollowpurple;

import com.gkugfk3.createhollowpurple.block.ModBlocks;
import com.gkugfk3.createhollowpurple.fluids.ModFluids;
import com.gkugfk3.createhollowpurple.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(CreateHollowPurpleMod.MODID)
public class CreateHollowPurpleMod {
    public static final String MODID = "createhollowpurple";
    private static final Logger LOGGER = LogManager.getLogger();

    public CreateHollowPurpleMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModFluids.FLUIDS.register(bus);
        CreativeTabs.Init();

        LOGGER.info("Here i am!");
    }
}
