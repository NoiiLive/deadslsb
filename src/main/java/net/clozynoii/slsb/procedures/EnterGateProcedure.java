package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EnterGateProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
String rank = "";
if ((entity.level().dimension()) == Level.OVERWORLD
) {for (Entity entityiterator : new ArrayList<>(world.players())) {
if (==false) {if (entity.getPersistentData().getDouble("PortalCooldown")==0) {entity.getPersistentData().putString("GateRank", (new Object(){
public String getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getPersistentData().getString(tag);
return "";
}
}.getValue(world, BlockPos.containing(x,y,z), "GateRank"))
);entity.getPersistentData().putDouble("PortalCooldown", 60);if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION,
new ResourceLocation("slsb:dungeon_world"));
if (_player.level().dimension() == destinationType) return;
ServerLevel nextLevel = _player.server.getLevel(destinationType);
if (nextLevel != null) {
_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
for (MobEffectInstance _effectinstance : _player.getActiveEffects())
_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
}
}
if ((new Object(){
public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getPersistentData().getBoolean(tag);
return false;
}
}.getValue(world, BlockPos.containing(x,y,z), "DungeonGenerated"))
==false) {if(!world.isClientSide()) {
BlockPos _bp = BlockPos.containing(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getPersistentData().putBoolean("DungeonGenerated", true);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}SlsbMod.LOGGER.debug("Creating New Dungeon");}}}else{if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("Must wait before generating a new dungeon!"), true);}
}}if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:dungeon_world")))
) {if (entity.getPersistentData().getDouble("PortalCooldown")==0) {entity.getPersistentData().putDouble("PortalCooldown", 60);if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
ResourceKey<Level> destinationType = Level.OVERWORLD;
if (_player.level().dimension() == destinationType) return;
ServerLevel nextLevel = _player.server.getLevel(destinationType);
if (nextLevel != null) {
_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
for (MobEffectInstance _effectinstance : _player.getActiveEffects())
_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
}
}
}}
}
}
