package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockDripstoneDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockDripstoneDisplayItem> {
	public ManaCrystalBlockDripstoneDisplayItemRenderer() {
		super(new ManaCrystalBlockDripstoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDripstoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}