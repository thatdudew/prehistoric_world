
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import com.dude.prehistoricworld.fluid.SulphurFluid;
import com.dude.prehistoricworld.PrehistoricWorldMod;

public class PrehistoricWorldModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, PrehistoricWorldMod.MODID);
	public static final RegistryObject<FlowingFluid> SULPHUR = REGISTRY.register("sulphur", () -> new SulphurFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SULPHUR = REGISTRY.register("flowing_sulphur", () -> new SulphurFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SULPHUR.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SULPHUR.get(), RenderType.translucent());
		}
	}
}
