package com.dude.prehistoricworld.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelAjkaceratops<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("prehistoric_world", "model_ajkaceratops"), "main");
	public final ModelPart bone;
	public final ModelPart bb_main;

	public ModelAjkaceratops(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(20, 14).addBox(-2.5F, -10.3F, -2.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -11.0F, -1.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition stuff1 = bone.addOrReplaceChild("stuff1", CubeListBuilder.create().texOffs(27, 25).addBox(-1.5F, -2.0431F, -0.0496F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.2F, -4.8F, -0.182F, 0.0F, 0.0F));
		PartDefinition stuff2 = stuff1.addOrReplaceChild("stuff2", CubeListBuilder.create().texOffs(26, 21).addBox(-0.5F, -2.9402F, 0.6317F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.6F, -0.6F, -0.3187F, 0.0F, 0.0F));
		PartDefinition stuff3 = stuff1.addOrReplaceChild("stuff3", CubeListBuilder.create().texOffs(34, 4).addBox(-0.5F, -0.5431F, 1.9504F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.8F, -2.7F));
		PartDefinition stuff4 = stuff3.addOrReplaceChild("stuff4", CubeListBuilder.create().texOffs(16, 21).addBox(-1.5F, -0.3047F, -1.2484F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, 0.5918F, 0.0F, 0.0F));
		PartDefinition stuff5 = stuff4.addOrReplaceChild("stuff5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, -0.5F, -0.5F, -1.1383F, -0.1367F, -0.8652F));
		PartDefinition stuff6 = stuff4.addOrReplaceChild("stuff6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -0.7F, -0.6F, -1.1839F, 0.0456F, 0.7741F));
		PartDefinition stuff7 = stuff4.addOrReplaceChild("stuff7", CubeListBuilder.create().texOffs(6, 32).addBox(-0.5F, 2.0271F, 0.1168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, -4.1F, 0.5918F, 0.0F, 0.0F));
		PartDefinition stuff8 = stuff4.addOrReplaceChild("stuff8", CubeListBuilder.create().texOffs(8, 25).addBox(-1.0F, -4.8971F, 1.4452F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.9F, -0.6F, -1.1839F, 0.0F, 0.0F));
		PartDefinition stuff9 = stuff4.addOrReplaceChild("stuff9", CubeListBuilder.create().texOffs(18, 14).addBox(-0.5F, -3.3269F, -2.5044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.8F, -3.7F, -2.322F, 0.0F, 0.0F));
		PartDefinition stuff10 = stuff4.addOrReplaceChild("stuff10", CubeListBuilder.create().texOffs(32, 31).addBox(-0.5F, 0.44F, 1.3489F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.6F, -3.7F, -0.0911F, 0.0F, 0.0F));
		PartDefinition bone2 = stuff10.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 8.1F, 11.0F));
		PartDefinition Body_r1 = bone2.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -7.5F, 1.5F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Bod_r1 = bone3.addOrReplaceChild("Bod_r1", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -7.2F, 7.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bo_r1 = bone4.addOrReplaceChild("bo_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -6.9F, 10.7F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bo_r2 = bone5.addOrReplaceChild("bo_r2", CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, -6.6F, 14.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(12, 28).addBox(2.7F, -8.1F, 5.9F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 31).addBox(2.7F, -4.2F, 6.4F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 8)
						.addBox(2.6F, -3.3F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.7F, -8.1F, 5.9F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(-3.7F, -4.2F, 6.4F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-3.6F, -3.3F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rig3_r1 = bb_main.addOrReplaceChild("rig3_r1",
				CubeListBuilder.create().texOffs(34, 7).addBox(-3.6F, -1.0F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 14).addBox(2.6F, -1.0F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition rigf1_r1 = bb_main.addOrReplaceChild("rigf1_r1",
				CubeListBuilder.create().texOffs(0, 14).addBox(-3.6F, -8.2F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 28).addBox(2.6F, -8.2F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition rig3_r2 = bb_main.addOrReplaceChild("rig3_r2",
				CubeListBuilder.create().texOffs(0, 25).addBox(-3.7F, 4.9F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 20).addBox(2.7F, 4.9F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
