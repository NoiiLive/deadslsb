package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.entity.ManaCrystalBlockGraniteTileEntity;

public class ManaCrystalBlockGraniteBlockModel extends GeoModel<ManaCrystalBlockGraniteTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockGraniteTileEntity animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockGraniteTileEntity animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockGraniteTileEntity entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_granite.png");
	}
}
