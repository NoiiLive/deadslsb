package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class SkillRenameFighterProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Fighter")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("SwordSlash")) {
				{
					String _setval = "Sword Slash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("SwordSlash")) {
				{
					String _setval = "Sword Slash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("SwordSlash")) {
				{
					String _setval = "Sword Slash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("SwordSlash")) {
				{
					String _setval = "Sword Slash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("SwordSlash")) {
				{
					String _setval = "Sword Slash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("SwordSlash")) {
				{
					String _setval = "Sword Slash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Fighter")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("SwordDance")) {
				{
					String _setval = "Sword Dance";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("SwordDance")) {
				{
					String _setval = "Sword Dance";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("SwordDance")) {
				{
					String _setval = "Sword Dance";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("SwordDance")) {
				{
					String _setval = "Sword Dance";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("SwordDance")) {
				{
					String _setval = "Sword Dance";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("SwordDance")) {
				{
					String _setval = "Sword Dance";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Fighter")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("ManaBlade")) {
				{
					String _setval = "Mana Blade";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("ManaBlade")) {
				{
					String _setval = "Mana Blade";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("ManaBlade")) {
				{
					String _setval = "Mana Blade";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("ManaBlade")) {
				{
					String _setval = "Mana Blade";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("ManaBlade")) {
				{
					String _setval = "Mana Blade";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("ManaBlade")) {
				{
					String _setval = "Mana Blade";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
