package net.mcreator.sonicraft_plus.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sonicraft_plus.entity.NewtronEntity;

public class NewtronModel extends GeoModel<NewtronEntity> {
	@Override
	public ResourceLocation getAnimationResource(NewtronEntity entity) {
		return new ResourceLocation("sonicraft_plus", "animations/newtron.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NewtronEntity entity) {
		return new ResourceLocation("sonicraft_plus", "geo/newtron.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NewtronEntity entity) {
		return new ResourceLocation("sonicraft_plus", "textures/entities/" + entity.getTexture() + ".png");
	}

}
