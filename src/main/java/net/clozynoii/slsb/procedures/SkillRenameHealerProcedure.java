package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.network.SlsbModVariables;

public class SkillRenameHealerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Healer")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("HasteBuff")) {
				{
					String _setval = "Haste Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("HasteBuff")) {
				{
					String _setval = "Haste Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("HasteBuff")) {
				{
					String _setval = "Haste Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("HasteBuff")) {
				{
					String _setval = "Haste Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("HasteBuff")) {
				{
					String _setval = "Haste Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("HasteBuff")) {
				{
					String _setval = "Haste Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Healer")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("StrengthBuff")) {
				{
					String _setval = "Strength Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("StrengthBuff")) {
				{
					String _setval = "Strength Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("StrengthBuff")) {
				{
					String _setval = "Strength Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("StrengthBuff")) {
				{
					String _setval = "Strength Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("StrengthBuff")) {
				{
					String _setval = "Strength Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("StrengthBuff")) {
				{
					String _setval = "Strength Buff";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Healer")) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("SacredBarrier")) {
				{
					String _setval = "Sacred Barrier";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1).equals("SacredBarrier")) {
				{
					String _setval = "Sacred Barrier";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot2).equals("SacredBarrier")) {
				{
					String _setval = "Sacred Barrier";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot3).equals("SacredBarrier")) {
				{
					String _setval = "Sacred Barrier";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot4).equals("SacredBarrier")) {
				{
					String _setval = "Sacred Barrier";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot5).equals("SacredBarrier")) {
				{
					String _setval = "Sacred Barrier";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySlot5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
