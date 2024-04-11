package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.CommandSourceStack;

import net.clozynoii.slsb.network.SlsbModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetMoveProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 1) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 2) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 3) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 4) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot4 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 5) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 6) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot6 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 7) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot7 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 8) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot8 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (DoubleArgumentType.getDouble(arguments, "movenumber") == 9) {
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "skill").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySlot9 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
