package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.entity.ManaCrystalBlockDripstoneTileEntity;

public class ManaCrystalBlockDripstoneBlockModel extends GeoModel<ManaCrystalBlockDripstoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockDripstoneTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockDripstoneTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockDripstoneTileEntity animatable) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_dripstone.png");
	}
}
