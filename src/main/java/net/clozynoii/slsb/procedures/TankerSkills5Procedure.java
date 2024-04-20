package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.clozynoii.slsb.network.SlsbModVariables;

public class TankerSkills5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCooldown5 == 0) {
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Taunt")) {
				{
					double _setval = 50;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					TauntSkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Provocation")) {
				{
					double _setval = 60;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					ProvocationSkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Reinforcement")) {
				{
					double _setval = 150;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ActiveSkills).contains("Reinforcement") == false) {
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						ReinforcementSkillUseProcedure.execute(world, x, y, z, entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				} else {
					ReinforcementSkillUseProcedure.execute(world, x, y, z, entity);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Collapse")) {
				{
					double _setval = 300;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					CollapseSkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Charged Smash")) {
				{
					double _setval = 500;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					ChargedSmashSkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Bash")) {
				{
					double _setval = 200;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					BashSkillUseProcedure.execute(entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Rally")) {
				{
					double _setval = 100;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					RallySkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Final Stand")) {
				{
					double _setval = 100;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) * 100 <= 30) {
					if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
						FinalStandSkillUseProcedure.execute(world, x, y, z, entity);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
									+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
									true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7f\u00A7oHealth Not Low Enough..."), true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Guardian")) {
				{
					double _setval = 100;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					GuardianSkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Clear Mind")) {
				{
					double _setval = 100;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					ClearMindSkillUseProcedure.execute(world, x, y, z, entity);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7fYou Need \u00A7b\u00A7l"
										+ new java.text.DecimalFormat("##").format((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) + " \u00A7fMana to Use This")),
								true);
				}
			}
			if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySelected).equals("Overwhelm")) {
				{
					double _setval = 100;
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCost5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana >= (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SlsbModVariables.PlayerVariables())).AbilityCost5) {
					OverwhelmSkillUseProcedure.execute(world, x, y, z, entity);
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
