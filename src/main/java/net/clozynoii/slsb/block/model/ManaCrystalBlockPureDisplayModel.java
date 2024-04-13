package net.clozynoii.slsb.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.clozynoii.slsb.block.display.ManaCrystalBlockPureDisplayItem;

public class ManaCrystalBlockPureDisplayModel extends GeoModel<ManaCrystalBlockPureDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ManaCrystalBlockPureDisplayItem animatable) {
		return new ResourceLocation("slsb", "animations/manacrystal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManaCrystalBlockPureDisplayItem animatable) {
		return new ResourceLocation("slsb", "geo/manacrystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManaCrystalBlockPureDisplayItem entity) {
		return new ResourceLocation("slsb", "textures/block/manacrystla_pure.png");
	}
}
