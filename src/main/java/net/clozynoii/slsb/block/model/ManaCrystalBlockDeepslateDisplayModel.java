package net.clozynoii.slsb.block.model;

public class ManaCrystalBlockDeepslateDisplayModel extends GeoModel<ManaCrystalBlockDeepslateDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockDeepslateDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockDeepslateDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockDeepslateDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_deepslate.png");
	}
}