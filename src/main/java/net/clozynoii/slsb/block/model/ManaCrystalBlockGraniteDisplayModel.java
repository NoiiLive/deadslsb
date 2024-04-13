package net.clozynoii.slsb.block.model;

public class ManaCrystalBlockGraniteDisplayModel extends GeoModel<ManaCrystalBlockGraniteDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockGraniteDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockGraniteDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockGraniteDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_granite.png");
	}
}