package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.display.ManaCrystalBlockDioriteDisplayItem;

public class ManaCrystalBlockDioriteDisplayModel extends GeoModel<ManaCrystalBlockDioriteDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockDioriteDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockDioriteDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockDioriteDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystal_diorite.png");
	}
}
