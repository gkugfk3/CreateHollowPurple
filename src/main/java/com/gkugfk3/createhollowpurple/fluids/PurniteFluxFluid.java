
package com.gkugfk3.createhollowpurple.fluids;

import com.gkugfk3.createhollowpurple.CreateHollowPurpleMod;
import com.gkugfk3.createhollowpurple.block.ModBlocks;
import com.gkugfk3.createhollowpurple.item.ModItems;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.resources.ResourceLocation;

import static com.gkugfk3.createhollowpurple.fluids.ModFluids.PURNITE_FLOWING;
import static com.gkugfk3.createhollowpurple.fluids.ModFluids.PURNITE_SOURCE;

public abstract class PurniteFluxFluid extends ForgeFlowingFluid {


	public static final ForgeFlowingFluid.Properties PURNITE_PROPERTIES = new ForgeFlowingFluid.Properties(

			PURNITE_SOURCE,
			PURNITE_FLOWING,
			FluidAttributes.builder(new ResourceLocation(
							CreateHollowPurpleMod.MODID + ":fluid/purnite_still"),
							new ResourceLocation(CreateHollowPurpleMod.MODID + ":fluid/purnite_flow")
					)
					.density(270)
					.viscosity(620)
					.temperature(1300)
					.luminosity(8)
					.sound(net.minecraft.sounds.SoundEvents.BUCKET_FILL_LAVA, net.minecraft.sounds.SoundEvents.BUCKET_EMPTY_LAVA)

	).bucket(ModItems.PURNITE_BUCKET).block(() -> ModBlocks.PURNITE_FLUID_BLOCK.get());

	private PurniteFluxFluid() {
		super(PURNITE_PROPERTIES);
	}

	public static class Source extends PurniteFluxFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PurniteFluxFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
