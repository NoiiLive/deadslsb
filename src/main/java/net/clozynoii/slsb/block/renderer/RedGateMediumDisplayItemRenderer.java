package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.RedGateMediumDisplayModel;
import net.clozynoii.slsb.block.display.RedGateMediumDisplayItem;

public class RedGateMediumDisplayItemRenderer extends GeoItemRenderer<RedGateMediumDisplayItem> {
	public RedGateMediumDisplayItemRenderer() {
		super(new RedGateMediumDisplayModel());
	}

	@Override
	public RenderType getRenderType(RedGateMediumDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
