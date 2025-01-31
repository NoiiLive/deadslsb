
package net.clozynoii.slsb.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.clozynoii.slsb.procedures.AfterImagePurpleDisplayConditionProcedure;
import net.clozynoii.slsb.procedures.AfterImageBlueDisplayConditionProcedure;
import net.clozynoii.slsb.entity.AfterImageEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AfterImageRenderer extends HumanoidMobRenderer<AfterImageEntity, HumanoidModel<AfterImageEntity>> {
	public AfterImageRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<AfterImageEntity, HumanoidModel<AfterImageEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/blueimage.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AfterImageEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AfterImageBlueDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AfterImageEntity, HumanoidModel<AfterImageEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("slsb:textures/entities/purpleimage.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AfterImageEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AfterImagePurpleDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AfterImageEntity entity) {
		return new ResourceLocation("slsb:textures/entities/whiteimage.png");
	}

	@Override
	protected boolean isBodyVisible(AfterImageEntity entity) {
		return false;
	}
}
