package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DripstoneDungeonSpawnEastProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
double random = 0;
if (==0) {if ((world.getBlockState(BlockPos.containing(x+1,y,z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false) {if ((world.getBlockState(BlockPos.containing(x+18,y,z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x+19,y,z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x+28,y,z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x+37,y,z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x+37,y-2,z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x+37,y-2,z+16))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false&&(world.getBlockState(BlockPos.containing(x+37,y-2,z-16))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false) {if (==true) {if (%5==0) {random = Mth.nextInt(RandomSource.create(), 3, 10);}else{random = Mth.nextInt(RandomSource.create(), 2, 10);}}else{if (>10) {random = 1;}else{random = Mth.nextInt(RandomSource.create(), 3, 10);}}if (random==1) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_bossroom"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y-2,z-16),
BlockPos.containing(x+1,y-2,z-16),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
SlsbMod.LOGGER.debug("Boss Room Generated");}if (random==2) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_mobroom"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-12),
BlockPos.containing(x+1,y,z-12),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==3) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_fourway"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-11),
BlockPos.containing(x+1,y,z-11),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==4) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_hallway_1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-6),
BlockPos.containing(x+1,y,z-6),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==5) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_hallway_2"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-6),
BlockPos.containing(x+1,y,z-6),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==6) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_threeway_dual"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-9),
BlockPos.containing(x+1,y,z-9),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==7) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_threeway_left"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-11),
BlockPos.containing(x+1,y,z-11),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==8) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_threeway_right"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-6),
BlockPos.containing(x+1,y,z-6),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==9) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_turn_left"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-9),
BlockPos.containing(x+1,y,z-9),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}if (random==10) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_turn_right"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+1,y,z-6),
BlockPos.containing(x+1,y,z-6),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}world.setBlock(BlockPos.containing(x,y,z), Blocks.BEDROCK.defaultBlockState(),3);}else{world.setBlock(BlockPos.containing(x,y,z), Blocks.BEDROCK.defaultBlockState(),3);if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_deadend"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+0,y,z-6),
BlockPos.containing(x+0,y,z-6),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}}else{if ((world.getBlockState(BlockPos.containing(x+2,y,z))).is(BlockTags.create(new ResourceLocation("slsb:dungeon_unplaceable")))==false||(world.getBlockState(BlockPos.containing(x+2,y+1,z))).getBlock() == Blocks.BEDROCK) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("slsb", "dripstonedungeon_east_deadend"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x+0,y,z-6),
BlockPos.containing(x+0,y,z-6),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}world.setBlock(BlockPos.containing(x,y,z), Blocks.BEDROCK.defaultBlockState(),3);}}
}
}
