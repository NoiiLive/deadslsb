package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockStoneDisplayModel;
import net.clozynoii.slsb.block.display.ManaCrystalBlockStoneDisplayItem;

public class ManaCrystalBlockStoneDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockStoneDisplayItem> {
	public ManaCrystalBlockStoneDisplayItemRenderer() {
		super(new ManaCrystalBlockStoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockStoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
