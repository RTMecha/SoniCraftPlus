
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.MightyBallEntity;
import net.mcreator.sonicraft_plus.client.model.Modelsonic_ball;

public class MightyBallRenderer extends MobRenderer<MightyBallEntity, Modelsonic_ball<MightyBallEntity>> {
	public MightyBallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsonic_ball<MightyBallEntity>(context.bakeLayer(Modelsonic_ball.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MightyBallEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/mighty_ball.png");
	}
}
