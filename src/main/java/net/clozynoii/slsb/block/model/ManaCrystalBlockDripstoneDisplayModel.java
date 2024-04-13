package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.display.ManaCrystalBlockDripstoneDisplayItem;

public class ManaCrystalBlockDripstoneDisplayModel extends GeoModel<ManaCrystalBlockDripstoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockDripstoneDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockDripstoneDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockDripstoneDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_dripstone.png");
	}
}
