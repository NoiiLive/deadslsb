package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockPureDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockPureDisplayItem> {
	public ManaCrystalBlockPureDisplayItemRenderer() {
		super(new ManaCrystalBlockPureDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockPureDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}