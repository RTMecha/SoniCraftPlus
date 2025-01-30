
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.BlueWispChangeTriggerEntity;
import net.mcreator.sonicraft_plus.client.model.Modelsonic_ball;

public class BlueWispChangeTriggerRenderer extends MobRenderer<BlueWispChangeTriggerEntity, Modelsonic_ball<BlueWispChangeTriggerEntity>> {
	public BlueWispChangeTriggerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsonic_ball(context.bakeLayer(Modelsonic_ball.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueWispChangeTriggerEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/equals_p_cube.png");
	}
}
