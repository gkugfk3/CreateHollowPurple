package com.gkugfk3.createhollowpurple.fluids;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, "createhollowpurple");

    public static final RegistryObject<Fluid> PURNITE_SOURCE = FLUIDS.register("purnite_flux",
            () -> (Fluid) new PurniteFluxFluid.Source());

    public static final RegistryObject<Fluid> PURNITE_FLOWING = FLUIDS.register("flowing_purnite_flux",
            () -> (Fluid) new PurniteFluxFluid.Flowing());

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(PURNITE_SOURCE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(PURNITE_FLOWING.get(), RenderType.translucent());
    }
}
