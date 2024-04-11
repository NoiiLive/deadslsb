package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.display.BlueGateMediumDisplayItem;

public class BlueGateMediumDisplayModel extends GeoModel<BlueGateMediumDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlueGateMediumDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/bluegatemedium.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlueGateMediumDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/bluegatemedium.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlueGateMediumDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/mediumbluegatetexture.png");
	}
}
