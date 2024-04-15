package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.display.RedGateMediumDisplayItem;

public class RedGateMediumDisplayModel extends GeoModel<RedGateMediumDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RedGateMediumDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/bluegatemedium.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RedGateMediumDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/bluegatemedium.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RedGateMediumDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/mediumredgatetexture.png");
	}
}
