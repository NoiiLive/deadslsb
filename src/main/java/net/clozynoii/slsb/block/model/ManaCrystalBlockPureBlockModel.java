package net.clozynoii.slsb.block.model;

public class ManaCrystalBlockPureBlockModel extends GeoModel<ManaCrystalBlockPureTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockPureTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockPureTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockPureTileEntity entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystla_pure.png");
	}
}