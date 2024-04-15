package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.GiantRatGreyEntity;

public class GiantRatGreyModel extends GeoModel<GiantRatGreyEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiantRatGreyEntity entity) {
		return new ResourceLocation("slsb", "animations/largerat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiantRatGreyEntity entity) {
		return new ResourceLocation("slsb", "geo/largerat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiantRatGreyEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
