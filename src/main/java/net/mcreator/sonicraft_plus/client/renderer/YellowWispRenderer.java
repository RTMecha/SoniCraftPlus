
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.YellowWispEntity;
import net.mcreator.sonicraft_plus.client.model.Modelwisp;

public class YellowWispRenderer extends MobRenderer<YellowWispEntity, Modelwisp<YellowWispEntity>> {
	public YellowWispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisp<YellowWispEntity>(context.bakeLayer(Modelwisp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(YellowWispEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/wisp_yellow.png");
	}
}
