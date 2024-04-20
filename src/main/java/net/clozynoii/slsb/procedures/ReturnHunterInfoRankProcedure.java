package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReturnHunterInfoRankProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Rank: \u00A78" + (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank;
	}
}
