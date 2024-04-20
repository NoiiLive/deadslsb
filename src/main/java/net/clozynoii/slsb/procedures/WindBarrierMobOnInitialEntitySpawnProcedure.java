package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.SlsbMod;

public class WindBarrierMobOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		SlsbMod.queueServerWork(100, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
			entity.getPersistentData().putDouble("windbarriertick", 0);
		});
	}
}
