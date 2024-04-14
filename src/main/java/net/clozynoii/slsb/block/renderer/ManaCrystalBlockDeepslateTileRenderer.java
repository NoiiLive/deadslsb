package net.clozynoii.slsb.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.clozynoii.slsb.block.model.ManaCrystalBlockDeepslateBlockModel;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockDeepslateTileEntity;

public class ManaCrystalBlockDeepslateTileRenderer extends GeoBlockRenderer<ManaCrystalBlockDeepslateTileEntity> {
	public ManaCrystalBlockDeepslateTileRenderer() {
		super(new ManaCrystalBlockDeepslateBlockModel());
	}

	@Override
	public RenderType getRenderType(ManaCrystalBlockDeepslateTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
