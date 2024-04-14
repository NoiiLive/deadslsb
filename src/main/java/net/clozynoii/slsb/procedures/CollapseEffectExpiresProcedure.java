package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CollapseEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("xincrease", 0);
		entity.getPersistentData().putDouble("yincrease", 0);
		entity.getPersistentData().putDouble("zdecrease", 0);
		entity.getPersistentData().putDouble("zincrease", 0);
	}
}
