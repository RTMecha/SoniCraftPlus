package net.mcreator.sonicraft_plus.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sonicraft_plus.entity.NewtronblueEntity;

public class NewtronblueModel extends GeoModel<NewtronblueEntity> {
	@Override
	public ResourceLocation getAnimationResource(NewtronblueEntity entity) {
		return new ResourceLocation("sonicraft_plus", "animations/newtron(blue).animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NewtronblueEntity entity) {
		return new ResourceLocation("sonicraft_plus", "geo/newtron(blue).geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NewtronblueEntity entity) {
		return new ResourceLocation("sonicraft_plus", "textures/entities/" + entity.getTexture() + ".png");
	}

}
