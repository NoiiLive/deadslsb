package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockDeepslateDisplayModel;
import net.clozynoii.slsb.block.display.ManaCrystalBlockDeepslateDisplayItem;

public class ManaCrystalBlockDeepslateDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockDeepslateDisplayItem> {
	public ManaCrystalBlockDeepslateDisplayItemRenderer() {
		super(new ManaCrystalBlockDeepslateDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDeepslateDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
