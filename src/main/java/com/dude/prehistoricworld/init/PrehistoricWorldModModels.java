
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.dude.prehistoricworld.client.model.Modelsyringocrinus;
import com.dude.prehistoricworld.client.model.Modelproconodontus;
import com.dude.prehistoricworld.client.model.Modelanomalocaris;
import com.dude.prehistoricworld.client.model.ModelAjkaceratops;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PrehistoricWorldModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelproconodontus.LAYER_LOCATION, Modelproconodontus::createBodyLayer);
		event.registerLayerDefinition(ModelAjkaceratops.LAYER_LOCATION, ModelAjkaceratops::createBodyLayer);
		event.registerLayerDefinition(Modelanomalocaris.LAYER_LOCATION, Modelanomalocaris::createBodyLayer);
		event.registerLayerDefinition(Modelsyringocrinus.LAYER_LOCATION, Modelsyringocrinus::createBodyLayer);
	}
}
