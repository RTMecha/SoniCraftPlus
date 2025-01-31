
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.BlueWispEntity;
import net.mcreator.sonicraft_plus.client.model.Modelwisp;

public class BlueWispRenderer extends MobRenderer<BlueWispEntity, Modelwisp<BlueWispEntity>> {
	public BlueWispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisp<BlueWispEntity>(context.bakeLayer(Modelwisp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueWispEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/wisp_blue.png");
	}
}
