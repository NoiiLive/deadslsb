package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CatacombDungeonSpawnWestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if (SlsbModVariables.MapVariables.get(world).DungeonRoomTimer == 0) {
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable"))) == false
					&& (world.getBlockState(BlockPos.containing(x - 43, y, z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable"))) == false
					&& (world.getBlockState(BlockPos.containing(x - 43, y, z + 21))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable"))) == false
					&& (world.getBlockState(BlockPos.containing(x - 43, y, z - 21))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable"))) == false) {
				if (SlsbModVariables.MapVariables.get(world).DungeonBossRoom == true) {
					if (SlsbModVariables.MapVariables.get(world).DungeonRoomCount >= 15) {
						random = 2;
						SlsbMod.LOGGER.debug("Dungeon End");
					} else {
						random = Mth.nextInt(RandomSource.create(), 3, 10);
					}
				} else {
					if (SlsbModVariables.MapVariables.get(world).DungeonRoomCount > 10) {
						random = 1;
					} else {
						random = Mth.nextInt(RandomSource.create(), 3, 10);
					}
				}
				if (random == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_bossroom"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					SlsbModVariables.MapVariables.get(world).DungeonBossRoom = true;
					SlsbModVariables.MapVariables.get(world).syncData(world);
					SlsbMod.LOGGER.debug("Boss Room Generated");
				}
				if (random == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_mobroom"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (random == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_fourway"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (random == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_hallway_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (random == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_hallway_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (random == 6) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_threeway_dual"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (random == 7) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_threeway_left"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (random == 8) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_threeway_right"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (random == 9) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_turn_left"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (random == 10) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_turn_right"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 43, y, z - 21), BlockPos.containing(x - 43, y, z - 21), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
				SlsbModVariables.MapVariables.get(world).DungeonRoomCount = SlsbModVariables.MapVariables.get(world).DungeonRoomCount + 1;
				SlsbModVariables.MapVariables.get(world).syncData(world);
				SlsbModVariables.MapVariables.get(world).DungeonRoomTimer = 1;
				SlsbModVariables.MapVariables.get(world).syncData(world);
			} else {
				if ((world.getBlockState(BlockPos.containing(x - 2, y, z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable"))) == false || (world.getBlockState(BlockPos.containing(x - 2, y + 5, z))).getBlock() == Blocks.BEDROCK) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "catacomb_dungeon_west_deadend"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y + 0, z - 7), BlockPos.containing(x - 3, y + 0, z - 7),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
			}
		}
	}
}
