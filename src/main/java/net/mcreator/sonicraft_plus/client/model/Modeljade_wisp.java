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
public class Modeljade_wisp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sonicraft_plus", "modeljade_wisp"), "main");
	public final ModelPart main;

	public Modeljade_wisp(ModelPart root) {
		this.main = root.getChild("main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition body = main.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 17).addBox(-1.0F, 0.0F, -1.25F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, 0.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition head_yellow = main.addOrReplaceChild("head_yellow",
				CubeListBuilder.create().texOffs(0, 7).addBox(-3.0F, -3.5F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 2.5F, -3.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 7)
						.addBox(-2.0F, -4.5F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 11).addBox(-1.0F, -4.5F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_arm = main.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(8, 17).addBox(-2.0F, 2.5F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition left_arm = main.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, 2.5F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
