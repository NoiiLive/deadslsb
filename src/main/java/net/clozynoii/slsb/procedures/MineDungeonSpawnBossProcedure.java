package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MineDungeonSpawnBossProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = SlsbModEntities.GIANT_RAT_GREY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
