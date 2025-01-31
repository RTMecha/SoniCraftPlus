
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sonicraft_plus.entity.WisponCubeTrapEntity;
import net.mcreator.sonicraft_plus.client.model.Modelwispon_cube_trap;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WisponCubeTrapRenderer extends MobRenderer<WisponCubeTrapEntity, Modelwispon_cube_trap<WisponCubeTrapEntity>> {
	public WisponCubeTrapRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwispon_cube_trap<WisponCubeTrapEntity>(context.bakeLayer(Modelwispon_cube_trap.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<WisponCubeTrapEntity, Modelwispon_cube_trap<WisponCubeTrapEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("sonicraft_plus:textures/entities/wispon_cube_trap.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WisponCubeTrapEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(WisponCubeTrapEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/wispon_cube_trap.png");
	}
}
