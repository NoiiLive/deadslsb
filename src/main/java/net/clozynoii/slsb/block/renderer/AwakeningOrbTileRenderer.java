package net.clozynoii.slsb.block.renderer;

public class AwakeningOrbTileRenderer extends GeoBlockRenderer<AwakeningOrbTileEntity> {
	public AwakeningOrbTileRenderer() {
		super(new AwakeningOrbBlockModel());
	}

	@Override
	public RenderType getRenderType(AwakeningOrbTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}