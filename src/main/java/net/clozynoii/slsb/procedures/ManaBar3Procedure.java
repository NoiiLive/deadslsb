package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ManaBar3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana
				/ (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ManaMax) * 100 <= 19.5
				&& ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana
						/ (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ManaMax) * 100 > 13) {
			return true;
		}
		return false;
	}
}
