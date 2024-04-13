package net.clozynoii.slsb.block.model;

public class ManaCrystalBlockStoneDisplayModel extends GeoModel<ManaCrystalBlockStoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockStoneDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockStoneDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockStoneDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_stone.png");
	}
}