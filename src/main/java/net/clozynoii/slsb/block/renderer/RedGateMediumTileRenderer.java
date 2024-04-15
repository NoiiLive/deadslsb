package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.RedGateMediumBlockModel;
import net.clozynoii.slsb.block.entity.RedGateMediumTileEntity;

public class RedGateMediumTileRenderer extends GeoBlockRenderer<RedGateMediumTileEntity> {
	public RedGateMediumTileRenderer() {
		super(new RedGateMediumBlockModel());
	}

	@Override
	public RenderType getRenderType(RedGateMediumTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
