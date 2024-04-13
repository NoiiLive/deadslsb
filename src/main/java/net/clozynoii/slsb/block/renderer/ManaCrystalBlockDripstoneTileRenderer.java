package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockDripstoneTileRenderer extends GeoBlockRenderer<ManaCrystalBlockDripstoneTileEntity> {
	public ManaCrystalBlockDripstoneTileRenderer() {
		super(new ManaCrystalBlockDripstoneBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDripstoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}