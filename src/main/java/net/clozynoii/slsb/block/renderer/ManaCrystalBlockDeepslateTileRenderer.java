package net.clozynoii.slsb.block.renderer;

public class ManaCrystalBlockDeepslateTileRenderer extends GeoBlockRenderer<ManaCrystalBlockDeepslateTileEntity> {
	public ManaCrystalBlockDeepslateTileRenderer() {
		super(new ManaCrystalBlockDeepslateBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDeepslateTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}