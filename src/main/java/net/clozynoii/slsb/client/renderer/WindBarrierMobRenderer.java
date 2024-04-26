
package net.clozynoii.slsb.client.renderer;

public class WindBarrierMobRenderer extends HumanoidMobRenderer<WindBarrierMobEntity, HumanoidModel<WindBarrierMobEntity>> {

	public WindBarrierMobRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(WindBarrierMobEntity entity) {
		return new ResourceLocation("slsb:textures/entities/a2i2e_layer_2.png");
	}

}
