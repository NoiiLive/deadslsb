package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReturnHunterInfoApprovalProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A78Has Approved " + entity.getDisplayName().getString();
	}
}
