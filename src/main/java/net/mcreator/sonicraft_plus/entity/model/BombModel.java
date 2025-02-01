package net.mcreator.sonicraft_plus.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sonicraft_plus.entity.BombEntity;

public class BombModel extends GeoModel<BombEntity> {
	@Override
	public ResourceLocation getAnimationResource(BombEntity entity) {
		return new ResourceLocation("sonicraft_plus", "animations/bomb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BombEntity entity) {
		return new ResourceLocation("sonicraft_plus", "geo/bomb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BombEntity entity) {
		return new ResourceLocation("sonicraft_plus", "textures/entities/" + entity.getTexture() + ".png");
	}

}
