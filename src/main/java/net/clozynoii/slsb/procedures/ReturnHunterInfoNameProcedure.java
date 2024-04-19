package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnHunterInfoNameProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Name: \u00A78" + entity.getDisplayName().getString();
	}
}
