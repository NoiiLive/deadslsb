package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReturnHunterInfoGuildProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Guild: " + (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterGuild;
	}
}
