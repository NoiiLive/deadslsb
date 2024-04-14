package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class ChangeSkillKeybindProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).UseAbilityType).equals("Switcher")) {
			gate = false;
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 1 && gate == false) {
				AbilitySwitcher1Procedure.execute(entity);
				gate = true;
			}
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 2 && gate == false) {
				AbilitySwitcher2Procedure.execute(entity);
				gate = true;
			}
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 3 && gate == false) {
				AbilitySwitcher3Procedure.execute(entity);
				gate = true;
			}
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 4 && gate == false) {
				AbilitySwitcher4Procedure.execute(entity);
				gate = true;
			}
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 5 && gate == false) {
				AbilitySwitcher5Procedure.execute(entity);
				gate = true;
			}
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 6 && gate == false) {
				AbilitySwitcher6Procedure.execute(entity);
				gate = true;
			}
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 7 && gate == false) {
				AbilitySwitcher7Procedure.execute(entity);
				gate = true;
			}
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 8 && gate == false) {
				AbilitySwitcher8Procedure.execute(entity);
				gate = true;
			}
			if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).SwitcherSlot == 9 && gate == false) {
				AbilitySwitcher9Procedure.execute(entity);
				gate = true;
			}
		}
	}
}
