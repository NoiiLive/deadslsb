package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockDripstoneDisplayModel;
import net.clozynoii.slsb.block.display.ManaCrystalBlockDripstoneDisplayItem;

public class ManaCrystalBlockDripstoneDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockDripstoneDisplayItem> {
	public ManaCrystalBlockDripstoneDisplayItemRenderer() {
		super(new ManaCrystalBlockDripstoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDripstoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
