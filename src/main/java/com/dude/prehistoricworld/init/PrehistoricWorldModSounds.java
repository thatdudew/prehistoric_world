
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.dude.prehistoricworld.PrehistoricWorldMod;

public class PrehistoricWorldModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PrehistoricWorldMod.MODID);
	public static final RegistryObject<SoundEvent> AIR = REGISTRY.register("air", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("prehistoric_world", "air")));
}
