
package net.clozynoii.slsb.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.clozynoii.slsb.procedures.SkillDisplayProcedure;
import net.clozynoii.slsb.procedures.SkillDisplayConditionProcedure;
import net.clozynoii.slsb.procedures.ManaOverlayProcedure;
import net.clozynoii.slsb.procedures.ManaDisplayConditionProcedure;
import net.clozynoii.slsb.procedures.CostOverlayProcedure;
import net.clozynoii.slsb.procedures.CostDisplayConditionProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SkillOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (SkillDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						SkillDisplayProcedure.execute(entity), 23, h - 29, -1, false);
			if (ManaDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						ManaOverlayProcedure.execute(entity), 23, h - 43, -1, false);
			if (CostDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						CostOverlayProcedure.execute(entity), 23, h - 15, -1, false);
		}
	}
}
