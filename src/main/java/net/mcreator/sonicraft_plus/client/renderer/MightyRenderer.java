
package net.mcreator.sonicraft_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sonicraft_plus.entity.MightyEntity;
import net.mcreator.sonicraft_plus.client.model.Modelmighty;

public class MightyRenderer extends MobRenderer<MightyEntity, Modelmighty<MightyEntity>> {
	public MightyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmighty<MightyEntity>(context.bakeLayer(Modelmighty.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MightyEntity entity) {
		return new ResourceLocation("sonicraft_plus:textures/entities/mighty.png");
	}
}
