
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.RayEntity;
import net.mcreator.sonicraft_plus.client.model.Modelray;

public class RayRenderer extends MobRenderer<RayEntity, Modelray<RayEntity>> {
	public RayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelray(context.bakeLayer(Modelray.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RayEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/ray.png");
	}
}
