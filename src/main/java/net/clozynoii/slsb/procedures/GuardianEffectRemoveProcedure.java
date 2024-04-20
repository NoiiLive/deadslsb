package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;

public class GuardianEffectRemoveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("Guardian", "");
	}
}
