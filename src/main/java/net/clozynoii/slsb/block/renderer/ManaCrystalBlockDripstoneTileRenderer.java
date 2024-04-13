package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockDripstoneBlockModel;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockDripstoneTileEntity;

public class ManaCrystalBlockDripstoneTileRenderer extends GeoBlockRenderer<ManaCrystalBlockDripstoneTileEntity> {
	public ManaCrystalBlockDripstoneTileRenderer() {
		super(new ManaCrystalBlockDripstoneBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDripstoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
