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
public class Modelmining_tower<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sonicraft_plus", "modelmining_tower"), "main");
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart main;

	public Modelmining_tower(ModelPart root) {
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.main = root.getChild("main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-112.0F, -72.0F, 0.0F));
		PartDefinition right_arm_bend = right_arm.addOrReplaceChild("right_arm_bend", CubeListBuilder.create().texOffs(0, 1136).addBox(-133.0F, -16.0F, -16.0F, 160.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone = right_arm_bend.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(384, 1136).addBox(-22.5F, -100.5F, -16.0F, 32.0F, 96.0F, 32.0F, new CubeDeformation(-3.3F)),
				PartPose.offsetAndRotation(-112.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 1200).addBox(-151.75F, -19.75F, -16.0F, 160.0F, 32.0F, 32.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition buzzsaw = bone2.addOrReplaceChild("buzzsaw", CubeListBuilder.create(), PartPose.offset(-136.0F, -4.0F, 0.0F));
		PartDefinition buzzsaw_accelerator = buzzsaw.addOrReplaceChild("buzzsaw_accelerator", CubeListBuilder.create().texOffs(0, 1264).addBox(-64.0F, -64.0F, 0.0F, 128.0F, 128.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(112.0F, -72.0F, 0.0F));
		PartDefinition left_arm_bend = left_arm.addOrReplaceChild("left_arm_bend", CubeListBuilder.create().texOffs(0, 1136).mirror().addBox(-27.0F, -16.0F, -16.0F, 160.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone3 = left_arm_bend.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(384, 1136).mirror().addBox(-9.5F, -100.5F, -16.0F, 32.0F, 96.0F, 32.0F, new CubeDeformation(-3.3F)).mirror(false),
				PartPose.offsetAndRotation(112.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 1200).mirror().addBox(-8.25F, -19.75F, -16.0F, 160.0F, 32.0F, 32.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -96.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition buzzsaw2 = bone4.addOrReplaceChild("buzzsaw2", CubeListBuilder.create(), PartPose.offset(136.0F, -4.0F, 0.0F));
		PartDefinition buzzsaw_accelerator2 = buzzsaw2.addOrReplaceChild("buzzsaw_accelerator2", CubeListBuilder.create().texOffs(0, 1264).mirror().addBox(-64.0F, -64.0F, 0.0F, 128.0F, 128.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = main.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-96.0F, -224.0F, -96.0F, 192.0F, 128.0F, 192.0F, new CubeDeformation(0.0F)).texOffs(0, 1396).addBox(-96.0F, -92.0F, -96.0F, 192.0F, 92.0F, 192.0F, new CubeDeformation(0.0F))
						.texOffs(0, 816).addBox(-112.0F, -96.0F, -112.0F, 224.0F, 96.0F, 224.0F, new CubeDeformation(0.0F)).texOffs(0, 320).addBox(-80.0F, -432.0F, -80.0F, 160.0F, 192.0F, 160.0F, new CubeDeformation(0.0F)).texOffs(576, 0)
						.addBox(-80.0F, -448.0F, -80.0F, 160.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(64.0F, -576.0F, -80.0F, 16.0F, 128.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-80.0F, -576.0F, -80.0F, 16.0F, 128.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-80.0F, -576.0F, 64.0F, 16.0F, 128.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(64.0F, -576.0F, 64.0F, 16.0F, 128.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(576, 0).addBox(-80.0F, -448.0F, 64.0F, 160.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(576, 32)
						.addBox(-80.0F, -448.0F, -64.0F, 16.0F, 16.0F, 128.0F, new CubeDeformation(0.0F)).texOffs(576, 32).addBox(64.0F, -448.0F, -64.0F, 16.0F, 16.0F, 128.0F, new CubeDeformation(0.0F)).texOffs(0, 672)
						.addBox(-64.0F, -240.0F, -64.0F, 128.0F, 16.0F, 128.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -64.0F, 0.0F));
		PartDefinition waist = main.addOrReplaceChild("waist", CubeListBuilder.create().texOffs(928, 0).addBox(-32.0F, -80.0F, -48.0F, 64.0F, 64.0F, 96.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_tread = waist.addOrReplaceChild("right_tread", CubeListBuilder.create().texOffs(608, 192).addBox(-32.0F, -16.0F, -80.0F, 48.0F, 48.0F, 160.0F, new CubeDeformation(0.0F)), PartPose.offset(-48.0F, -32.0F, 0.0F));
		PartDefinition left_tread = waist.addOrReplaceChild("left_tread", CubeListBuilder.create().texOffs(608, 192).mirror().addBox(-16.0F, -16.0F, -80.0F, 48.0F, 48.0F, 160.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(48.0F, -32.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 2048, 2048);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.right_arm.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_arm.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
