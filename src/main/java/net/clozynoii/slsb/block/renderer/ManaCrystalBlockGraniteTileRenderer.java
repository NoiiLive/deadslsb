package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockGraniteTileRenderer extends GeoBlockRenderer<ManaCrystalBlockGraniteTileEntity> {
	public ManaCrystalBlockGraniteTileRenderer() {
		super(new ManaCrystalBlockGraniteBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockGraniteTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}