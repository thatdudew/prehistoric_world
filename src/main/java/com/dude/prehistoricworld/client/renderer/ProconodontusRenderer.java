
package com.dude.prehistoricworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.dude.prehistoricworld.entity.ProconodontusEntity;
import com.dude.prehistoricworld.client.model.Modelproconodontus;

public class ProconodontusRenderer extends MobRenderer<ProconodontusEntity, Modelproconodontus<ProconodontusEntity>> {
	public ProconodontusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelproconodontus(context.bakeLayer(Modelproconodontus.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProconodontusEntity entity) {
		return new ResourceLocation("prehistoric_world:textures/entities/proconodontus.png");
	}
}
