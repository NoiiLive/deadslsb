package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.GiantRatBrownEntity;

public class GiantRatBrownModel extends GeoModel<GiantRatBrownEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiantRatBrownEntity entity) {
		return new ResourceLocation("slsb", "animations/largerat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiantRatBrownEntity entity) {
		return new ResourceLocation("slsb", "geo/largerat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiantRatBrownEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
