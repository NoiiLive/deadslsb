package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.clozynoii.slsb.init.SlsbModEntities;

public class MineDungeonSpawnBossProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = SlsbModEntities.GIANT_RAT_BOSS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
