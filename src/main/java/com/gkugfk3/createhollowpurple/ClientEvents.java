package com.gkugfk3.createhollowpurple;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.eventbus.api.*;

@Mod.EventBusSubscriber(modid = "createhollowpurple", bus = Mod.EventBusSubscriber.Bus.MOD, value = { Dist.CLIENT })
public class ClientEvents
{
    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
    }
}
