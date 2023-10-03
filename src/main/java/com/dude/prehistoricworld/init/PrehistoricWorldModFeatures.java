
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import com.dude.prehistoricworld.world.features.ores.MicrobialorganicGroundFeature;
import com.dude.prehistoricworld.world.features.ores.MicrobialmatFeature;
import com.dude.prehistoricworld.world.features.ores.CoarsesandydirtFeature;
import com.dude.prehistoricworld.world.features.ores.CausticmudFeature;
import com.dude.prehistoricworld.world.features.ores.CambrianfossilFeature;
import com.dude.prehistoricworld.world.features.ores.BlacksandstoneFeature;
import com.dude.prehistoricworld.PrehistoricWorldMod;

@Mod.EventBusSubscriber
public class PrehistoricWorldModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PrehistoricWorldMod.MODID);
	public static final RegistryObject<Feature<?>> CAMBRIANFOSSIL = REGISTRY.register("cambrianfossil", CambrianfossilFeature::new);
	public static final RegistryObject<Feature<?>> COARSESANDYDIRT = REGISTRY.register("coarsesandydirt", CoarsesandydirtFeature::new);
	public static final RegistryObject<Feature<?>> BLACKSANDSTONE = REGISTRY.register("blacksandstone", BlacksandstoneFeature::new);
	public static final RegistryObject<Feature<?>> MICROBIALMAT = REGISTRY.register("microbialmat", MicrobialmatFeature::new);
	public static final RegistryObject<Feature<?>> MICROBIALORGANIC_GROUND = REGISTRY.register("microbialorganic_ground", MicrobialorganicGroundFeature::new);
	public static final RegistryObject<Feature<?>> CAUSTICMUD = REGISTRY.register("causticmud", CausticmudFeature::new);
}
