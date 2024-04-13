package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockGraniteDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockGraniteDisplayItem> {
	public ManaCrystalBlockGraniteDisplayItemRenderer() {
		super(new ManaCrystalBlockGraniteDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockGraniteDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}