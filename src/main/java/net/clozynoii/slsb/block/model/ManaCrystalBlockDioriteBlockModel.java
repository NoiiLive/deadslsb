package net.clozynoii.slsb.block.model;

public class ManaCrystalBlockDioriteBlockModel extends GeoModel<ManaCrystalBlockDioriteTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockDioriteTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockDioriteTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockDioriteTileEntity entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_diorite.png");
	}
}