
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.dude.prehistoricworld.client.renderer.SyringocrinusRenderer;
import com.dude.prehistoricworld.client.renderer.ProconodontusRenderer;
import com.dude.prehistoricworld.client.renderer.AnomalocarisRenderer;
import com.dude.prehistoricworld.client.renderer.AjkaceratopsRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PrehistoricWorldModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PrehistoricWorldModEntities.PROCONODONTUS.get(), ProconodontusRenderer::new);
		event.registerEntityRenderer(PrehistoricWorldModEntities.SYRINGOCRINUS.get(), SyringocrinusRenderer::new);
		event.registerEntityRenderer(PrehistoricWorldModEntities.AJKACERATOPS.get(), AjkaceratopsRenderer::new);
		event.registerEntityRenderer(PrehistoricWorldModEntities.ANOMALOCARIS.get(), AnomalocarisRenderer::new);
	}
}
