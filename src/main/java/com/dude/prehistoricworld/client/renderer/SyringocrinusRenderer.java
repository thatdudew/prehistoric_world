
package com.dude.prehistoricworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.dude.prehistoricworld.entity.SyringocrinusEntity;
import com.dude.prehistoricworld.client.model.Modelsyringocrinus;

public class SyringocrinusRenderer extends MobRenderer<SyringocrinusEntity, Modelsyringocrinus<SyringocrinusEntity>> {
	public SyringocrinusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsyringocrinus(context.bakeLayer(Modelsyringocrinus.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(SyringocrinusEntity entity) {
		return new ResourceLocation("prehistoric_world:textures/entities/syringocrinus.png");
	}
}
