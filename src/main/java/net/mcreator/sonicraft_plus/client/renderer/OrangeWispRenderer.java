
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.OrangeWispEntity;
import net.mcreator.sonicraft_plus.client.model.Modelwisp;

public class OrangeWispRenderer extends MobRenderer<OrangeWispEntity, Modelwisp<OrangeWispEntity>> {
	public OrangeWispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisp(context.bakeLayer(Modelwisp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrangeWispEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/wisp_orange.png");
	}
}
