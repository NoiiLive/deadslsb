package net.clozynoii.slsb.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.entity.GiantRatBossEntity;

public class GiantRatBossModel extends GeoModel<GiantRatBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiantRatBossEntity entity) {
		return new ResourceLocation("slsb", "animations/kingrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiantRatBossEntity entity) {
		return new ResourceLocation("slsb", "geo/kingrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiantRatBossEntity entity) {
		return new ResourceLocation("slsb", "textures/entities/" + entity.getTexture() + ".png");
	}

}
