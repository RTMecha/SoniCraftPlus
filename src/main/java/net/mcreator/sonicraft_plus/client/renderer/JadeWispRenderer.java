
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.JadeWispEntity;
import net.mcreator.sonicraft_plus.client.model.Modeljade_wisp;

public class JadeWispRenderer extends MobRenderer<JadeWispEntity, Modeljade_wisp<JadeWispEntity>> {
	public JadeWispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljade_wisp(context.bakeLayer(Modeljade_wisp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JadeWispEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/wisp_jade.png");
	}
}
