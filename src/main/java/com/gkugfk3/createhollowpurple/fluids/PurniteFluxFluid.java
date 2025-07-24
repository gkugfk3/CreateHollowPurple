package com.gkugfk3.createhollowpurple.fluids;

import net.minecraft.world.level.block.LiquidBlock;
import com.gkugfk3.createhollowpurple.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraft.sounds.SoundEvents;
import com.gkugfk3.createhollowpurple.item.ModItems;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.Flowing;

public abstract class PurniteFluxFluid extends ForgeFlowingFluid {

    public static final ForgeFlowingFluid.Properties PURNITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluids.PURNITE_SOURCE,
            ModFluids.PURNITE_FLOWING,
            FluidAttributes.builder(
                            new ResourceLocation("createhollowpurple", "fluid/purnite_still"),
                            new ResourceLocation("createhollowpurple", "fluid/purnite_flow")
                    )
                    .density(270)
                    .viscosity(620)
                    .temperature(1300)
                    .luminosity(8)
                    .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY)
    )
            .bucket(ModItems.PURNITE_BUCKET)
            .block(() -> (LiquidBlock) ModBlocks.PURNITE_FLUID_BLOCK.get());

    private PurniteFluxFluid() {
        super(PURNITE_PROPERTIES);
    }

    public static class Source extends PurniteFluxFluid {
        @Override
        public int getAmount(final FluidState state) {
            return 8; // Full source block
        }

        @Override
        public boolean isSource(final FluidState state) {
            return true;
        }
    }

    public static class Flowing extends PurniteFluxFluid {
        @Override
        protected void createFluidStateDefinition(final StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(Flowing.LEVEL); // Add the LEVEL property for flowing fluid
        }

        @Override
        public int getAmount(final FluidState state) {
            return state.getValue(Flowing.LEVEL); // Flow level 1-7
        }

        @Override
        public boolean isSource(final FluidState state) {
            return false;
        }
    }
}
