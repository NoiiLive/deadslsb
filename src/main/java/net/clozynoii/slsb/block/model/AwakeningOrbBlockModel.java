package net.clozynoii.slsb.block.model;

public class AwakeningOrbBlockModel extends GeoModel<AwakeningOrbTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AwakeningOrbTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/awakeningorb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AwakeningOrbTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/awakeningorb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AwakeningOrbTileEntity entity) {
		return new ResourceLocation("slsb", "textures/block/awakeningorbtexture.png");
	}
}