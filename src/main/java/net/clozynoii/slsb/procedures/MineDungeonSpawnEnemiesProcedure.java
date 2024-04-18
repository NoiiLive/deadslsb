package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MineDungeonSpawnEnemiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:rat_dungeon")))) {
			world.setBlock(BlockPos.containing(x, y, z), SlsbModBlocks.RAT_DUNGEON_ENEMIES.get().defaultBlockState(), 3);
		} else {
			random = Mth.nextInt(RandomSource.create(), 1, 5);
			for (int index0 = 0; index0 < (int) random; index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
