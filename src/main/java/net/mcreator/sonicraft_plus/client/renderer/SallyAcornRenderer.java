
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.SallyAcornEntity;
import net.mcreator.sonicraft_plus.client.model.Modelsally_acorn;

public class SallyAcornRenderer extends MobRenderer<SallyAcornEntity, Modelsally_acorn<SallyAcornEntity>> {
	public SallyAcornRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsally_acorn<SallyAcornEntity>(context.bakeLayer(Modelsally_acorn.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SallyAcornEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/sally_acorn.png");
	}
}
