package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockDioriteDisplayItemRenderer extends GeoItemRenderer<ManaCrystalBlockDioriteDisplayItem> {
	public ManaCrystalBlockDioriteDisplayItemRenderer() {
		super(new ManaCrystalBlockDioriteDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDioriteDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}