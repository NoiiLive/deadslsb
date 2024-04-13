package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockStoneDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockStoneDisplayItem> {
	public ManaCrystalBlockStoneDisplayItemRenderer() {
		super(new ManaCrystalBlockStoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockStoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}