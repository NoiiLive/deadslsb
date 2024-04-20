package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReturnBalanceProcedure {
	public static String execute() {
		return new java.text.DecimalFormat("##").format() + " \u20A9";
	}
}
