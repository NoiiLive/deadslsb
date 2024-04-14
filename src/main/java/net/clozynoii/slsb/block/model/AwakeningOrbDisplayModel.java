package net.clozynoii.slsb.block.model;

public class AwakeningOrbDisplayModel extends GeoModel<AwakeningOrbDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AwakeningOrbDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/awakeningorb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AwakeningOrbDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/awakeningorb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AwakeningOrbDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/awakeningorbtexture.png");
	}
}