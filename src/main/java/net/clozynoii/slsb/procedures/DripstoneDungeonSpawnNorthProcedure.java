package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DripstoneDungeonSpawnNorthProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
double random = 0;
if (==0) {if ((world.getBlockState(BlockPos.containing(x,y,z-1))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false) {if ((world.getBlockState(BlockPos.containing(x,y,z-16))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x,y,z-18))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x,y,z-19))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x,y,z-23))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x,y,z-28))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x,y,z-37))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x,y-2,z-37))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x+16,y-2,z-37))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x-16,y-2,z-37))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false) {if (==true) {if (%5==0) {random = Mth.nextInt(RandomSource.create(), 3, 10);}else{random = Mth.nextInt(RandomSource.create(), 2, 10);}}else{if (>10) {random = 1;}else{random = Mth.nextInt(RandomSource.create(), 3, 10);}}if (random==1) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_bossroom"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-16,y-2,z-37),
BlockPos.containing(x-16,y-2,z-37),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
SlsbMod.LOGGER.debug("Boss Room Generated");}if (random==2) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_mobroom"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-12,y,z-28),
BlockPos.containing(x-12,y,z-28),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==3) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_fourway"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-9,y,z-23),
BlockPos.containing(x-9,y,z-23),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==4) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_hallway_1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-6,y,z-19),
BlockPos.containing(x-6,y,z-19),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==5) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_hallway_2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-6,y,z-19),
BlockPos.containing(x-6,y,z-19),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==6) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_threeway_dual"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-9,y,z-18),
BlockPos.containing(x-9,y,z-18),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==7) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_threeway_left"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-11,y,z-19),
BlockPos.containing(x-11,y,z-19),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==8) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_threeway_right"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-6,y,z-19),
BlockPos.containing(x-6,y,z-19),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==9) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_turn_left"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-9,y,z-18),
BlockPos.containing(x-9,y,z-18),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==10) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_turn_right"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-6,y,z-16),
BlockPos.containing(x-6,y,z-16),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}world.setBlock(BlockPos.containing(x,y,z), Blocks.BEDROCK.defaultBlockState(),3);}else{world.setBlock(BlockPos.containing(x,y,z), Blocks.BEDROCK.defaultBlockState(),3);if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_deadend"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-6,y,z-1),
BlockPos.containing(x-6,y,z-1),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}}else{if ((world.getBlockState(BlockPos.containing(x,y,z-2))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false||(world.getBlockState(BlockPos.containing(x,y+1,z-2))).getBlock() == Blocks.BEDROCK) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_north_deadend"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-6,y,z-1),
BlockPos.containing(x-6,y,z-1),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}world.setBlock(BlockPos.containing(x,y,z), Blocks.BEDROCK.defaultBlockState(),3);}}
}
}
