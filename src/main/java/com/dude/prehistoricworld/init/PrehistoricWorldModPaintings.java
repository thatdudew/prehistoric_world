
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import com.dude.prehistoricworld.PrehistoricWorldMod;

public class PrehistoricWorldModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, PrehistoricWorldMod.MODID);
	public static final RegistryObject<PaintingVariant> STGO = REGISTRY.register("stgo", () -> new PaintingVariant(16, 16));
}
