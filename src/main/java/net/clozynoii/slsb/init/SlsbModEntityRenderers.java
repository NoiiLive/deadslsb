
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.clozynoii.slsb.client.renderer.WindBarrierMobRenderer;
import net.clozynoii.slsb.client.renderer.GiantRatGreyRenderer;
import net.clozynoii.slsb.client.renderer.AfterImageRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlsbModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SlsbModEntities.AFTER_IMAGE.get(), AfterImageRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.GIANT_RAT_GREY.get(), GiantRatGreyRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.WIND_SLICE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SlsbModEntities.WIND_BARRIER_MOB.get(), WindBarrierMobRenderer::new);
	}
}
