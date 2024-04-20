package net.clozynoii.slsb.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class TurbulenceActiveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("TurbulentCD") > 0) {
			entity.getPersistentData().putDouble("TurbulentCD", (entity.getPersistentData().getDouble("TurbulentCD") - 1));
		}
		if (entity.getPersistentData().getDouble("TurbulentCD") == 0) {
			entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -1.5, 1.5)), 0, (Mth.nextDouble(RandomSource.create(), -1.5, 1.5))));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, 0.5, 0.5, 0.5, 0.1);
			entity.getPersistentData().putDouble("TurbulentCD", 10);
		}
	}
}
