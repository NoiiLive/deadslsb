package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.entity.ManaCrystalBlockStoneTileEntity;

public class ManaCrystalBlockStoneBlockModel extends GeoModel<ManaCrystalBlockStoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockStoneTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockStoneTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockStoneTileEntity entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_stone.png");
	}
}
