package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockDioriteDisplayModel;
import net.clozynoii.slsb.block.display.ManaCrystalBlockDioriteDisplayItem;

public class ManaCrystalBlockDioriteDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockDioriteDisplayItem> {
	public ManaCrystalBlockDioriteDisplayItemRenderer() {
		super(new ManaCrystalBlockDioriteDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDioriteDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
