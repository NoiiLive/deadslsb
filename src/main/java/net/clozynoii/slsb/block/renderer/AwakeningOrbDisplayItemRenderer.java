package net.clozynoii.slsb.block.renderer;

public class AwakeningOrbDisplayItemRenderer extends GeoItemRenderer<AwakeningOrbDisplayItem> {
	public AwakeningOrbDisplayItemRenderer() {
		super(new AwakeningOrbDisplayModel());
	}

	@Override
	public RenderType getRenderType(AwakeningOrbDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}