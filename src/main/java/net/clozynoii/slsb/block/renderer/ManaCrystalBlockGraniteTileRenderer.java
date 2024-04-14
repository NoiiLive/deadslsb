package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockGraniteBlockModel;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockGraniteTileEntity;

public class ManaCrystalBlockGraniteTileRenderer extends GeoBlockRenderer<ManaCrystalBlockGraniteTileEntity> {
	public ManaCrystalBlockGraniteTileRenderer() {
		super(new ManaCrystalBlockGraniteBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockGraniteTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
