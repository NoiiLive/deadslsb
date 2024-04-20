package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnHunterInfoApprovalProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A78Has Approved " + entity.getDisplayName().getString();
	}
}
