package net.mcreator.sonicraft_plus.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelmighty<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sonicraft_plus", "modelmighty"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart hipR;
	public final ModelPart hipL;
	public final ModelPart shoulderR;
	public final ModelPart shoulderL;

	public Modelmighty(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.hipR = root.getChild("hipR");
		this.hipL = root.getChild("hipL");
		this.shoulderR = root.getChild("shoulderR");
		this.shoulderL = root.getChild("shoulderL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -3.0F, -5.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 1).addBox(-4.5F, -9.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(3.5F, -9.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -4.0F, -1.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 14.0F, 0.0F));
		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(49, 21).addBox(-2.0F, -3.0341F, -1.2412F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.5F, -2.5F, 1.25F, -0.2618F, 0.0F, 0.0F));
		PartDefinition hipR = partdefinition.addOrReplaceChild("hipR", CubeListBuilder.create().texOffs(22, 16).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(16, 26)
				.addBox(-2.0F, 4.25F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).texOffs(34, 24).addBox(-2.0F, 6.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 16.0F, 0.0F));
		PartDefinition hipL = partdefinition.addOrReplaceChild("hipL",
				CubeListBuilder.create().texOffs(22, 16).mirror().addBox(-1.0F, -1.25F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(16, 26).mirror()
						.addBox(-2.0F, 4.25F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(34, 24).mirror().addBox(-2.0F, 6.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.0F, 16.0F, 0.0F));
		PartDefinition shoulderR = partdefinition.addOrReplaceChild("shoulderR",
				CubeListBuilder.create().texOffs(14, 16).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 16).addBox(-3.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition shoulderL = partdefinition.addOrReplaceChild("shoulderL", CubeListBuilder.create().texOffs(14, 16).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 16).mirror()
				.addBox(-1.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 11.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hipR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hipL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shoulderR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shoulderL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.shoulderR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.hipR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.hipL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.shoulderL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
