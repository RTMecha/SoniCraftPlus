
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.RedWispEntity;
import net.mcreator.sonicraft_plus.client.model.Modelwisp;

public class RedWispRenderer extends MobRenderer<RedWispEntity, Modelwisp<RedWispEntity>> {
	public RedWispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisp<RedWispEntity>(context.bakeLayer(Modelwisp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedWispEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/wisp_red.png");
	}
}
