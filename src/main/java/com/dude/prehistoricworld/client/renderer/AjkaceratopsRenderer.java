
package com.dude.prehistoricworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.dude.prehistoricworld.entity.AjkaceratopsEntity;
import com.dude.prehistoricworld.client.model.ModelAjkaceratops;

public class AjkaceratopsRenderer extends MobRenderer<AjkaceratopsEntity, ModelAjkaceratops<AjkaceratopsEntity>> {
	public AjkaceratopsRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAjkaceratops(context.bakeLayer(ModelAjkaceratops.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AjkaceratopsEntity entity) {
		return new ResourceLocation("prehistoric_world:textures/entities/ajkaceratops.png");
	}
}
