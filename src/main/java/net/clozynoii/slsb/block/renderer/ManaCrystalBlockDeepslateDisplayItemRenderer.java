package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockDeepslateDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockDeepslateDisplayItem> {
	public ManaCrystalBlockDeepslateDisplayItemRenderer() {
		super(new ManaCrystalBlockDeepslateDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDeepslateDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}