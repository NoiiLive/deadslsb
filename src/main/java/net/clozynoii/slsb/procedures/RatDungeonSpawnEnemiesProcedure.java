package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.clozynoii.slsb.init.SlsbModEntities;

public class RatDungeonSpawnEnemiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Mth.nextInt(RandomSource.create(), 1, 3);
		for (int index0 = 0; index0 < (int) random; index0++) {
			if (Math.random() >= 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = SlsbModEntities.GIANT_RAT_BLACK.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else {
				if (Math.random() >= 0.5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = SlsbModEntities.GIANT_RAT_BROWN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = SlsbModEntities.GIANT_RAT_GREY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
