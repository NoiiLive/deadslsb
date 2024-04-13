package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockStoneTileRenderer extends GeoBlockRenderer<ManaCrystalBlockStoneTileEntity> {
	public ManaCrystalBlockStoneTileRenderer() {
		super(new ManaCrystalBlockStoneBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockStoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}