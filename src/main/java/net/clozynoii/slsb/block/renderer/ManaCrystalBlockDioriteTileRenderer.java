package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockDioriteBlockModel;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockDioriteTileEntity;

public class ManaCrystalBlockDioriteTileRenderer extends GeoBlockRenderer<ManaCrystalBlockDioriteTileEntity> {
	public ManaCrystalBlockDioriteTileRenderer() {
		super(new ManaCrystalBlockDioriteBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDioriteTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
