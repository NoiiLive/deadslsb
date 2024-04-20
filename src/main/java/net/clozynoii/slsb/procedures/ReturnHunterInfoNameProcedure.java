package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReturnHunterInfoNameProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Name: \u00A78" + entity.getDisplayName().getString();
	}
}
