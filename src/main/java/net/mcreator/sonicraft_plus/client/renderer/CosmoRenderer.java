
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.CosmoEntity;
import net.mcreator.sonicraft_plus.client.model.Modelcosmo;

public class CosmoRenderer extends MobRenderer<CosmoEntity, Modelcosmo<CosmoEntity>> {
	public CosmoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcosmo<CosmoEntity>(context.bakeLayer(Modelcosmo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CosmoEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/cosmo.png");
	}
}
