
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import com.dude.prehistoricworld.fluid.types.SulphurFluidType;
import com.dude.prehistoricworld.PrehistoricWorldMod;

public class PrehistoricWorldModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PrehistoricWorldMod.MODID);
	public static final RegistryObject<FluidType> SULPHUR_TYPE = REGISTRY.register("sulphur", () -> new SulphurFluidType());
}
