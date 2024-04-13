package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockPureTileRenderer extends GeoBlockRenderer<ManaCrystalBlockPureTileEntity> {
	public ManaCrystalBlockPureTileRenderer() {
		super(new ManaCrystalBlockPureBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockPureTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}