package com.gkugfk3.createhollowpurple;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.javafmlmod.*;
import com.gkugfk3.createhollowpurple.item.*;
import com.gkugfk3.createhollowpurple.block.*;
import com.gkugfk3.createhollowpurple.fluids.*;
import net.minecraftforge.eventbus.api.*;
import org.apache.logging.log4j.*;

@Mod("createhollowpurple")
public class CreateHollowPurpleMod
{
    public static final String MODID = "createhollowpurple";
    private static final Logger LOGGER;
    
    public CreateHollowPurpleMod() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModFluids.FLUIDS.register(bus);
        CreativeTabs.Init();
        CreateHollowPurpleMod.LOGGER.info("Here i am!");
    }
    
    static {
        LOGGER = LogManager.getLogger();
    }
}
