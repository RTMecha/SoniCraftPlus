
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.VoidWisponProjectileEntity;
import net.mcreator.sonicraft_plus.client.model.Modelsonic_ball;

public class VoidWisponProjectileRenderer extends MobRenderer<VoidWisponProjectileEntity, Modelsonic_ball<VoidWisponProjectileEntity>> {
	public VoidWisponProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsonic_ball<VoidWisponProjectileEntity>(context.bakeLayer(Modelsonic_ball.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VoidWisponProjectileEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/equals_p_cube.png");
	}
}
