
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.RayGlidingEntity;
import net.mcreator.sonicraft_plus.client.model.Modelray_gliding;

public class RayGlidingRenderer extends MobRenderer<RayGlidingEntity, Modelray_gliding<RayGlidingEntity>> {
	public RayGlidingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelray_gliding<RayGlidingEntity>(context.bakeLayer(Modelray_gliding.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RayGlidingEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/ray.png");
	}
}
