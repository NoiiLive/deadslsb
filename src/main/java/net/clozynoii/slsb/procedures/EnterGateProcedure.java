package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.clozynoii.slsb.network.SlsbModVariables;
import net.clozynoii.slsb.init.SlsbModBlocks;
import net.clozynoii.slsb.SlsbMod;

import java.util.ArrayList;

public class EnterGateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String rank = "";
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entityiterator.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).DungeonGenerate == false) {
					if (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered") < 8 || (new Object() {
						public String getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getString(tag);
							return "";
						}
					}.getValue(world, BlockPos.containing(x, y, z), "AllowedPlayers")).contains(entity.getDisplayName().getString())) {
						if (entity.getPersistentData().getDouble("PortalCooldown") == 0) {
							if (!(new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, BlockPos.containing(x, y, z), "AllowedPlayers")).contains(entity.getDisplayName().getString())) {
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("AllowedPlayers", ((new Object() {
											public String getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getString(tag);
												return "";
											}
										}.getValue(world, BlockPos.containing(x, y, z), "AllowedPlayers")) + "" + entity.getDisplayName().getString() + " "));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("PlayersEntered", (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered") + 1));
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								SlsbMod.LOGGER.debug((new Object() {
									public String getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getString(tag);
										return "";
									}
								}.getValue(world, BlockPos.containing(x, y, z), "AllowedPlayers")));
								SlsbMod.LOGGER.debug((new java.text.DecimalFormat("##").format(new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getPersistentData().getDouble(tag);
										return -1;
									}
								}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered"))));
							}
							entity.getPersistentData().putString("GateRank", (new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, BlockPos.containing(x, y, z), "GateRank")));
							entity.getPersistentData().putBoolean("RedGate", (new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getBoolean(tag);
									return false;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "RedGate")));
							entity.getPersistentData().putDouble("PortalCooldown", 100);
							if ((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getBoolean(tag);
									return false;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "DungeonGenerated")) == false) {
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putBoolean("DungeonGenerated", true);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
								{
									boolean _setval = true;
									entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.DungeonGenerate = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								SlsbMod.LOGGER.debug("Creating New Dungeon");
								entity.getPersistentData().putDouble("PortalCooldown", 200);
							}
							if ((new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("E-Rank")) {
								if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
									ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:e_rank_dungeon"));
									if (_player.level().dimension() == destinationType)
										return;
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
							}
							if ((new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("D-Rank")) {
								if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
									ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:d_rank_dungeon"));
									if (_player.level().dimension() == destinationType)
										return;
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
							}
							if ((new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("C-Rank")) {
								if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
									ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:c_rank_dungeon"));
									if (_player.level().dimension() == destinationType)
										return;
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
							}
							if ((new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("B-Rank")) {
								if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
									ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:b_rank_dungeon"));
									if (_player.level().dimension() == destinationType)
										return;
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
							}
							if ((new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("A-Rank")) {
								if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
									ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:a_rank_dungeon"));
									if (_player.level().dimension() == destinationType)
										return;
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
							}
							if ((new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getString(tag);
									return "";
								}
							}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("S-Rank")) {
								if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
									ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:s_rank_dungeon"));
									if (_player.level().dimension() == destinationType)
										return;
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
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Maximum amount of players have entered this dungeon!"), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Must wait before generating a new dungeon!"), true);
				}
			}
		}
		if (!((entity.level().dimension()) == Level.OVERWORLD)) {
			if (entity.getPersistentData().getDouble("PortalCooldown") == 0) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_SMALL.get()) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Must clear the dungeon boss to leave!"), true);
				} else {
					entity.getPersistentData().putDouble("PortalCooldown", 100);
					if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = Level.OVERWORLD;
						if (_player.level().dimension() == destinationType)
							return;
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
				}
			}
		}
	}
}
