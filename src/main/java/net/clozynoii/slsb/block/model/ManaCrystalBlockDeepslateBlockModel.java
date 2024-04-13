package net.clozynoii.slsb.block.model;

public class ManaCrystalBlockDeepslateBlockModel extends GeoModel<ManaCrystalBlockDeepslateTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockDeepslateTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockDeepslateTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockDeepslateTileEntity entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_deepslate.png");
	}
}