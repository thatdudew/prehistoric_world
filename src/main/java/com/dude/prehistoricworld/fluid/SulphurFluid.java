
package com.dude.prehistoricworld.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import com.dude.prehistoricworld.init.PrehistoricWorldModItems;
import com.dude.prehistoricworld.init.PrehistoricWorldModFluids;
import com.dude.prehistoricworld.init.PrehistoricWorldModFluidTypes;
import com.dude.prehistoricworld.init.PrehistoricWorldModBlocks;

public abstract class SulphurFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PrehistoricWorldModFluidTypes.SULPHUR_TYPE.get(), () -> PrehistoricWorldModFluids.SULPHUR.get(),
			() -> PrehistoricWorldModFluids.FLOWING_SULPHUR.get()).explosionResistance(100f).bucket(() -> PrehistoricWorldModItems.SULPHUR_BUCKET.get()).block(() -> (LiquidBlock) PrehistoricWorldModBlocks.SULPHUR.get());

	private SulphurFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SulphurFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SulphurFluid {
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
