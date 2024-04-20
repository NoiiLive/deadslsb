package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.entity.BlueGateMediumTileEntity;

public class BlueGateMediumBlockModel extends GeoModel<BlueGateMediumTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlueGateMediumTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/bluegatemedium.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlueGateMediumTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/bluegatemedium.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlueGateMediumTileEntity animatable) {
		return new ResourceLocation("slsb", "textures/block/mediumbluegatetexture.png");
	}
}
