package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.entity.RedGateMediumTileEntity;

public class RedGateMediumBlockModel extends GeoModel<RedGateMediumTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RedGateMediumTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/bluegatemedium.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RedGateMediumTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/bluegatemedium.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RedGateMediumTileEntity animatable) {
		return new ResourceLocation("slsb", "textures/block/mediumredgatetexture.png");
	}
}
