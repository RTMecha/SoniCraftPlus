
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.PinkWispEntity;
import net.mcreator.sonicraft_plus.client.model.Modelwisp;

public class PinkWispRenderer extends MobRenderer<PinkWispEntity, Modelwisp<PinkWispEntity>> {
	public PinkWispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisp<PinkWispEntity>(context.bakeLayer(Modelwisp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PinkWispEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/wisp_pink.png");
	}
}
