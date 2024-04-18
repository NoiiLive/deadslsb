package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
