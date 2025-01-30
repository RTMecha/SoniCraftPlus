
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sonicraft_plus.entity.MiningTowerEntity;
import net.mcreator.sonicraft_plus.client.model.Modelmining_tower;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MiningTowerRenderer extends MobRenderer<MiningTowerEntity, Modelmining_tower<MiningTowerEntity>> {
	public MiningTowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmining_tower(context.bakeLayer(Modelmining_tower.LAYER_LOCATION)), 15f);
		this.addLayer(new RenderLayer<MiningTowerEntity, Modelmining_tower<MiningTowerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("sonicraft_plus:textures/entities/mining_tower_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MiningTowerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MiningTowerEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/mining_tower.png");
	}
}
