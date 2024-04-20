package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.entity.ManaCrystalBlockDioriteTileEntity;

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
	public ResourceLocation getTextureResource(ManaCrystalBlockDioriteTileEntity animatable) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_diorite.png");
	}
}
