
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.MightyHammerDropEntity;
import net.mcreator.sonicraft_plus.client.model.Modelsonic_ball_hammer_drop;

public class MightyHammerDropRenderer extends MobRenderer<MightyHammerDropEntity, Modelsonic_ball_hammer_drop<MightyHammerDropEntity>> {
	public MightyHammerDropRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsonic_ball_hammer_drop(context.bakeLayer(Modelsonic_ball_hammer_drop.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MightyHammerDropEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/mighty_ball_hammer_drop.png");
	}
}
