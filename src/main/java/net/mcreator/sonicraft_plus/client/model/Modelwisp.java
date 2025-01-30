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
public class Modelwisp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sonicraft_plus", "modelwisp"), "main");
	public final ModelPart main;

	public Modelwisp(ModelPart root) {
		this.main = root.getChild("main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition body = main.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, 0.0F, -1.25F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 12).addBox(-1.0F, 0.0F, -1.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 28)
						.addBox(-0.5F, 0.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 33).addBox(-0.5F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition head_white = main.addOrReplaceChild("head_white",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 16).addBox(-5.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_orange = main.addOrReplaceChild("head_orange",
				CubeListBuilder.create().texOffs(0, 43).addBox(-3.0F, -5.5F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 37).addBox(-2.0F, -7.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_yellow = main.addOrReplaceChild("head_yellow",
				CubeListBuilder.create().texOffs(0, 20).addBox(-3.0F, -1.5F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-1.0F, -4.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 33).addBox(-1.0F, -4.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_blue = main.addOrReplaceChild("head_blue", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -5.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_arm = main.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 12).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition left_arm = main.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 12).mirror()
				.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition right_leg = main.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.5F, -1.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition left_leg = main.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 39).mirror()
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 3.5F, -1.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition back_leg = main.addOrReplaceChild("back_leg", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 39).mirror()
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5F, 3.0F, 0.6981F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
