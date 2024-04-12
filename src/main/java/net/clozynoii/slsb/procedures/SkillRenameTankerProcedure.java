package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class SkillRenameTankerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Tanker")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("ChargedSmash")) {
				{
					String _setval = "Charged Smash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("ChargedSmash")) {
				{
					String _setval = "Charged Smash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("ChargedSmash")) {
				{
					String _setval = "Charged Smash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("ChargedSmash")) {
				{
					String _setval = "Charged Smash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("ChargedSmash")) {
				{
					String _setval = "Charged Smash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("ChargedSmash")) {
				{
					String _setval = "Charged Smash";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Tanker")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("FinalStand")) {
				{
					String _setval = "Final Stand";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("FinalStand")) {
				{
					String _setval = "Final Stand";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("FinalStand")) {
				{
					String _setval = "Final Stand";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("FinalStand")) {
				{
					String _setval = "Final Stand";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("FinalStand")) {
				{
					String _setval = "Final Stand";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("FinalStand")) {
				{
					String _setval = "Final Stand";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Tanker")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("ClearMind")) {
				{
					String _setval = "Clear Mind";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("ClearMind")) {
				{
					String _setval = "Clear Mind";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("ClearMind")) {
				{
					String _setval = "Clear Mind";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("ClearMind")) {
				{
					String _setval = "Clear Mind";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("ClearMind")) {
				{
					String _setval = "Clear Mind";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("ClearMind")) {
				{
					String _setval = "Clear Mind";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
