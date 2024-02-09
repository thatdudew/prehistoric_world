
package com.dude.prehistoricworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.dude.prehistoricworld.entity.DickinsoniaEntity;
import com.dude.prehistoricworld.client.model.ModelDickinsonia;

public class DickinsoniaRenderer extends MobRenderer<DickinsoniaEntity, ModelDickinsonia<DickinsoniaEntity>> {
	public DickinsoniaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDickinsonia(context.bakeLayer(ModelDickinsonia.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(DickinsoniaEntity entity) {
		return new ResourceLocation("prehistoric_world:textures/entities/dickinsonia_.png");
	}
}
