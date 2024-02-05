
package com.dude.prehistoricworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.dude.prehistoricworld.entity.AnomalocarisEntity;
import com.dude.prehistoricworld.client.model.Modelanomalocaris;

public class AnomalocarisRenderer extends MobRenderer<AnomalocarisEntity, Modelanomalocaris<AnomalocarisEntity>> {
	public AnomalocarisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanomalocaris(context.bakeLayer(Modelanomalocaris.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnomalocarisEntity entity) {
		return new ResourceLocation("prehistoric_world:textures/entities/anomalocaris.png");
	}
}
