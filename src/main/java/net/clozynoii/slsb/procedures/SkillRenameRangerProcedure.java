package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class SkillRenameRangerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Ranger")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("MagicArrows")) {
				{
					String _setval = "Magic Arrows";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("MagicArrows")) {
				{
					String _setval = "Magic Arrows";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("MagicArrows")) {
				{
					String _setval = "Magic Arrows";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("MagicArrows")) {
				{
					String _setval = "Magic Arrows";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("MagicArrows")) {
				{
					String _setval = "Magic Arrows";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("MagicArrows")) {
				{
					String _setval = "Magic Arrows";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Ranger")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("RapidShot")) {
				{
					String _setval = "Rapid Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("RapidShot")) {
				{
					String _setval = "Rapid Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("RapidShot")) {
				{
					String _setval = "Rapid Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("RapidShot")) {
				{
					String _setval = "Rapid Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("RapidShot")) {
				{
					String _setval = "Rapid Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("RapidShot")) {
				{
					String _setval = "Rapid Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Ranger")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("ArrowRain")) {
				{
					String _setval = "Arrow Rain";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("ArrowRain")) {
				{
					String _setval = "Arrow Rain";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("ArrowRain")) {
				{
					String _setval = "Arrow Rain";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("ArrowRain")) {
				{
					String _setval = "Arrow Rain";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("ArrowRain")) {
				{
					String _setval = "Arrow Rain";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("ArrowRain")) {
				{
					String _setval = "Arrow Rain";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Ranger")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("PiercingShot")) {
				{
					String _setval = "Piercing Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("PiercingShot")) {
				{
					String _setval = "Piercing Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("PiercingShot")) {
				{
					String _setval = "Piercing Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("PiercingShot")) {
				{
					String _setval = "Piercing Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("PiercingShot")) {
				{
					String _setval = "Piercing Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("PiercingShot")) {
				{
					String _setval = "Piercing Shot";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Ranger")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("SnareTrap")) {
				{
					String _setval = "Snare Trap";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("SnareTrap")) {
				{
					String _setval = "Snare Trap";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("SnareTrap")) {
				{
					String _setval = "Snare Trap";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("SnareTrap")) {
				{
					String _setval = "Snare Trap";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("SnareTrap")) {
				{
					String _setval = "Snare Trap";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("SnareTrap")) {
				{
					String _setval = "Snare Trap";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Ranger")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("RotatingShots")) {
				{
					String _setval = "Rotating Shots";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("RotatingShots")) {
				{
					String _setval = "Rotating Shots";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("RotatingShots")) {
				{
					String _setval = "Rotating Shots";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("RotatingShots")) {
				{
					String _setval = "Rotating Shots";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("RotatingShots")) {
				{
					String _setval = "Rotating Shots";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("RotatingShots")) {
				{
					String _setval = "Rotating Shots";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
