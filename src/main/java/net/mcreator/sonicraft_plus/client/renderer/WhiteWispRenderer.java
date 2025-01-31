
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.WhiteWispEntity;
import net.mcreator.sonicraft_plus.client.model.Modelwisp;

public class WhiteWispRenderer extends MobRenderer<WhiteWispEntity, Modelwisp<WhiteWispEntity>> {
	public WhiteWispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisp<WhiteWispEntity>(context.bakeLayer(Modelwisp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteWispEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/wisp_white.png");
	}
}
