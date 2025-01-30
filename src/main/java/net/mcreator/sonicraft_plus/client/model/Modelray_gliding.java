package net.mcreator.sonicraft_plus.client.model;

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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelray_gliding<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sonicraft_plus", "modelray_gliding"), "main");
	public final ModelPart sonic;

	public Modelray_gliding(ModelPart root) {
		this.sonic = root.getChild("sonic");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition sonic = partdefinition.addOrReplaceChild("sonic", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 1.6581F, 0.0F, 0.0F));
		PartDefinition head = sonic.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -3.0F, -4.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-4.0F, -10.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(2.0F, -10.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -1.2217F, 0.0F, 0.0F));
		PartDefinition hair = head.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.5F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body = sonic.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -4.0F, -1.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
				.addBox(-5.4F, -3.5F, -0.5F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 7).addBox(0.4F, -3.5F, -0.5F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 0.0F, 0.0F));
		PartDefinition tail1 = body.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(46, 6).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition hipR = sonic.addOrReplaceChild("hipR", CubeListBuilder.create().texOffs(22, 16).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(16, 26)
				.addBox(-2.0F, 3.25F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).texOffs(34, 24).addBox(-2.0F, 5.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition hipL = sonic.addOrReplaceChild("hipL",
				CubeListBuilder.create().texOffs(22, 16).mirror().addBox(-1.0F, -0.25F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(16, 26).mirror()
						.addBox(-2.0F, 3.25F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(34, 24).mirror().addBox(-2.0F, 5.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition shoulderR = sonic.addOrReplaceChild("shoulderR",
				CubeListBuilder.create().texOffs(14, 16).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 16).addBox(-3.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition shoulderL = sonic.addOrReplaceChild("shoulderL", CubeListBuilder.create().texOffs(14, 16).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 16).mirror()
				.addBox(-1.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		sonic.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
