package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockPureDisplayModel;
import net.clozynoii.slsb.block.display.ManaCrystalBlockPureDisplayItem;

public class ManaCrystalBlockPureDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockPureDisplayItem> {
	public ManaCrystalBlockPureDisplayItemRenderer() {
		super(new ManaCrystalBlockPureDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockPureDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
