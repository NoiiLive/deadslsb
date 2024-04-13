package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockPureBlockModel;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockPureTileEntity;

public class ManaCrystalBlockPureTileRenderer extends GeoBlockRenderer<ManaCrystalBlockPureTileEntity> {
	public ManaCrystalBlockPureTileRenderer() {
		super(new ManaCrystalBlockPureBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockPureTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
