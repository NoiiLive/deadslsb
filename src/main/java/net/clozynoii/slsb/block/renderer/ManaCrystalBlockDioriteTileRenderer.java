package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockDioriteTileRenderer extends GeoBlockRenderer<ManaCrystalBlockDioriteTileEntity> {
	public ManaCrystalBlockDioriteTileRenderer() {
		super(new ManaCrystalBlockDioriteBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDioriteTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}