package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.clozynoii.slsb.network.SlsbModVariables;

public class AssassinSkills5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCooldown5 == 0) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Stealth")) {
				{
					double _setval = 100;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ActiveSkills).contains("Stealth") == false) {
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						StealthSkillUseProcedure.execute(world, x, y, z, entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				} else {
					StealthSkillUseProcedure.execute(world, x, y, z, entity);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Quickstep")) {
				{
					double _setval = 50;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					QuickStepSkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Evasion")) {
				{
					double _setval = 150;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					EvadeSkillUseProcedure.execute(entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Backstab")) {
				{
					double _setval = 350;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					BackstabSkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Mark")) {
				{
					double _setval = 200;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					MarkSkillUseProcedure.execute(entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7fAbility on Cooldown For \u00A7c\u00A7l"
						+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCooldown5 / 20) + " \u00A7fSeconds")), true);
		}
	}
}
