package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockStoneBlockModel;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockStoneTileEntity;

public class ManaCrystalBlockStoneTileRenderer extends GeoBlockRenderer<ManaCrystalBlockStoneTileEntity> {
	public ManaCrystalBlockStoneTileRenderer() {
		super(new ManaCrystalBlockStoneBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockStoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
