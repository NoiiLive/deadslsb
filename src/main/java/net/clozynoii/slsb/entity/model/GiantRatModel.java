package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.GiantRatEntity;

public class GiantRatModel extends GeoModel<GiantRatEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiantRatEntity entity) {
		return new ResourceLocation("slsb", "animations/largerat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiantRatEntity entity) {
		return new ResourceLocation("slsb", "geo/largerat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiantRatEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
