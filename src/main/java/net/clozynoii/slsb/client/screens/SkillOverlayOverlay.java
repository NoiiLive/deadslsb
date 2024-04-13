
package net.clozynoii.slsb.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.clozynoii.slsb.procedures.SkillDisplayProcedure;
import net.clozynoii.slsb.procedures.SkillDisplayConditionProcedure;
import net.clozynoii.slsb.procedures.ReturnOverlayActivateProcedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots5Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots4Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots3Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots2Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySlots1Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected5Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected4Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected3Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected2Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilitySelected1Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown5Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown4Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown3Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown2Procedure;
import net.clozynoii.slsb.procedures.ReturnAbilityCooldown1Procedure;
import net.clozynoii.slsb.procedures.ManaOverlayProcedure;
import net.clozynoii.slsb.procedures.ManaDisplayConditionProcedure;
import net.clozynoii.slsb.procedures.ManaBar9Procedure;
import net.clozynoii.slsb.procedures.ManaBar8Procedure;
import net.clozynoii.slsb.procedures.ManaBar7Procedure;
import net.clozynoii.slsb.procedures.ManaBar6Procedure;
import net.clozynoii.slsb.procedures.ManaBar5Procedure;
import net.clozynoii.slsb.procedures.ManaBar4Procedure;
import net.clozynoii.slsb.procedures.ManaBar3Procedure;
import net.clozynoii.slsb.procedures.ManaBar2Procedure;
import net.clozynoii.slsb.procedures.ManaBar1Procedure;
import net.clozynoii.slsb.procedures.ManaBar15Procedure;
import net.clozynoii.slsb.procedures.ManaBar14Procedure;
import net.clozynoii.slsb.procedures.ManaBar13Procedure;
import net.clozynoii.slsb.procedures.ManaBar12Procedure;
import net.clozynoii.slsb.procedures.ManaBar11Procedure;
import net.clozynoii.slsb.procedures.ManaBar10Procedure;
import net.clozynoii.slsb.procedures.CostOverlayProcedure;
import net.clozynoii.slsb.procedures.CostDisplayConditionProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (ReturnOverlayActivateProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_1.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_2.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_3.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_4.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySlots5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_slots_5.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_1.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_2.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_3.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_4.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_5.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_6.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_7.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_8.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_9.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_10.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_11.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_12.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_13.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_14.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ManaBar15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoveerlay_mana_15.png"), 4, 4, 0, 0, 140, 36, 140, 36);
			}
			if (ReturnAbilitySelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_1.png"), 32, 12, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilitySelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_other.png"), 51, 12, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilitySelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_other.png"), 70, 12, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilitySelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_other.png"), 89, 12, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilitySelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_select_other.png"), 108, 12, 0, 0, 26, 26, 26, 26);
			}
			if (ReturnAbilityCooldown1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 37, 16, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityCooldown2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 56, 16, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityCooldown3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 75, 16, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityCooldown4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 94, 16, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityCooldown5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("slsb:textures/screens/abilityoverlay_lock.png"), 113, 16, 0, 0, 16, 16, 16, 16);
			}
			if (SkillDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						SkillDisplayProcedure.execute(entity), 8, 40, -1, false);
			if (ManaDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						ManaOverlayProcedure.execute(entity), 143, 9, -1, false);
			if (CostDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						CostOverlayProcedure.execute(entity), 8, 52, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
