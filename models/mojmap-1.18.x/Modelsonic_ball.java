// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsonic_ball<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sonic_ball"), "main");
	private final ModelPart spinegroup3;
	private final ModelPart spinegroup2;
	private final ModelPart spinegroup1;
	private final ModelPart cube;

	public Modelsonic_ball(ModelPart root) {
		this.spinegroup3 = root.getChild("spinegroup3");
		this.spinegroup2 = root.getChild("spinegroup2");
		this.spinegroup1 = root.getChild("spinegroup1");
		this.cube = root.getChild("cube");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition spinegroup3 = partdefinition.addOrReplaceChild("spinegroup3", CubeListBuilder.create(),
				PartPose.offset(3.0F, 17.0F, 0.0F));

		PartDefinition spine17 = spinegroup3.addOrReplaceChild("spine17", CubeListBuilder.create().texOffs(0, 12)
				.addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spine18 = spinegroup3
				.addOrReplaceChild("spine18",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition spine19 = spinegroup3
				.addOrReplaceChild("spine19",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition spine20 = spinegroup3
				.addOrReplaceChild("spine20",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition spine21 = spinegroup3
				.addOrReplaceChild("spine21",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition spine22 = spinegroup3
				.addOrReplaceChild("spine22",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));

		PartDefinition spine23 = spinegroup3
				.addOrReplaceChild("spine23",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition spine24 = spinegroup3
				.addOrReplaceChild("spine24",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition spinegroup2 = partdefinition.addOrReplaceChild("spinegroup2", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 17.0F, 0.0F));

		PartDefinition spine9 = spinegroup2.addOrReplaceChild("spine9", CubeListBuilder.create().texOffs(0, 12).addBox(
				0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spine10 = spinegroup2
				.addOrReplaceChild("spine10",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition spine11 = spinegroup2
				.addOrReplaceChild("spine11",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition spine12 = spinegroup2
				.addOrReplaceChild("spine12",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition spine13 = spinegroup2
				.addOrReplaceChild("spine13",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition spine14 = spinegroup2
				.addOrReplaceChild("spine14",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));

		PartDefinition spine15 = spinegroup2
				.addOrReplaceChild("spine15",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition spine16 = spinegroup2
				.addOrReplaceChild("spine16",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition spinegroup1 = partdefinition.addOrReplaceChild("spinegroup1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition spine1 = spinegroup1.addOrReplaceChild("spine1", CubeListBuilder.create().texOffs(0, 12).addBox(
				0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spine2 = spinegroup1
				.addOrReplaceChild("spine2",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition spine3 = spinegroup1
				.addOrReplaceChild("spine3",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition spine4 = spinegroup1
				.addOrReplaceChild("spine4",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition spine5 = spinegroup1
				.addOrReplaceChild("spine5",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition spine6 = spinegroup1
				.addOrReplaceChild("spine6",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));

		PartDefinition spine7 = spinegroup1
				.addOrReplaceChild("spine7",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition spine8 = spinegroup1
				.addOrReplaceChild("spine8",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube = partdefinition.addOrReplaceChild("cube", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		spinegroup3.render(poseStack, buffer, packedLight, packedOverlay);
		spinegroup2.render(poseStack, buffer, packedLight, packedOverlay);
		spinegroup1.render(poseStack, buffer, packedLight, packedOverlay);
		cube.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}