package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockGraniteDisplayModel;
import net.clozynoii.slsb.block.display.ManaCrystalBlockGraniteDisplayItem;

public class ManaCrystalBlockGraniteDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockGraniteDisplayItem> {
	public ManaCrystalBlockGraniteDisplayItemRenderer() {
		super(new ManaCrystalBlockGraniteDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockGraniteDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
