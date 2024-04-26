package net.clozynoii.slsb.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.clozynoii.slsb.network.SlsbModVariables;
import net.clozynoii.slsb.init.SlsbModBlocks;
import net.clozynoii.slsb.SlsbMod;

import java.util.Map;
import java.util.ArrayList;

public class EnterGateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String rank = "";
		double random = 0;
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if ((entity.level().dimension()) == Level.OVERWORLD) {
				if ((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "GateCompleted")) == false) {
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
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.portal.travel")), SoundSource.BLOCKS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.portal.travel")), SoundSource.BLOCKS, 1, 1, false);
										}
									}
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
										if ((new Object() {
											public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getBoolean(tag);
												return false;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "DungeonGenerated")) == false) {
											SlsbModVariables.MapVariables.get(world).DungeonRoomCount = 0;
											SlsbModVariables.MapVariables.get(world).syncData(world);
											if ((new Object() {
												public String getValue(LevelAccessor world, BlockPos pos, String tag) {
													BlockEntity blockEntity = world.getBlockEntity(pos);
													if (blockEntity != null)
														return blockEntity.getPersistentData().getString(tag);
													return "";
												}
											}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("E-Rank")) {
												random = Mth.nextInt(RandomSource.create(), 1, 1);
												if (random == 1) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "RatDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 2) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "MineDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 3) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "ForestDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
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
												random = Mth.nextInt(RandomSource.create(), 1, 4);
												if (random < 5) {
													random = Mth.nextInt(RandomSource.create(), 1, 1);
													if (random == 1) {
														if (!world.isClientSide()) {
															BlockPos _bp = BlockPos.containing(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getPersistentData().putString("GateDungeon", "CatacombDungeon");
															if (world instanceof Level _level)
																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
														}
													}
													if (random == 2) {
														if (!world.isClientSide()) {
															BlockPos _bp = BlockPos.containing(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getPersistentData().putString("GateDungeon", "LibraryDungeon");
															if (world instanceof Level _level)
																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
														}
													}
													if (random == 3) {
														if (!world.isClientSide()) {
															BlockPos _bp = BlockPos.containing(x, y, z);
															BlockEntity _blockEntity = world.getBlockEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_blockEntity != null)
																_blockEntity.getPersistentData().putString("GateDungeon", "MazeDungeon");
															if (world instanceof Level _level)
																_level.sendBlockUpdated(_bp, _bs, _bs, 3);
														}
													}
												} else {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "DoubleDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
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
												random = Mth.nextInt(RandomSource.create(), 1, 3);
												if (random == 1) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "InsectDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 2) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "GoblinDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 3) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "SandyDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
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
												random = Mth.nextInt(RandomSource.create(), 1, 3);
												if (random == 1) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "SunkenDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 2) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "CrystalDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 3) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "ColiseumDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
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
												random = Mth.nextInt(RandomSource.create(), 1, 4);
												if (random == 1) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "IceDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 2) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "OrcDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 3) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "LichDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 4) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "NagaDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
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
												random = Mth.nextInt(RandomSource.create(), 1, 3);
												if (random == 1) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "DragonDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 2) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "GiantDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
												if (random == 3) {
													if (!world.isClientSide()) {
														BlockPos _bp = BlockPos.containing(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getPersistentData().putString("GateDungeon", "CitadelDungeon");
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
												}
											}
										}
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
										entity.getPersistentData().putDouble("PortalCooldown", 200);
										SlsbMod.LOGGER.debug(("Creating " + (new Object() {
											public String getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getString(tag);
												return "";
											}
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")) + " Dungeon"));
									}
									if ((new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("E-Rank")) {
										if (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered") >= 1 && (new Object() {
											public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getBoolean(tag);
												return false;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "RedGate")) == true) {
											if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_SMALL.get())) {
												{
													BlockPos _bp = BlockPos.containing(x, y, z);
													BlockState _bs = SlsbModBlocks.RED_GATE_SMALL.get().defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													BlockEntity _be = world.getBlockEntity(_bp);
													CompoundTag _bnbt = null;
													if (_be != null) {
														_bnbt = _be.saveWithFullMetadata();
														_be.setRemoved();
													}
													world.setBlock(_bp, _bs, 3);
													if (_bnbt != null) {
														_be = world.getBlockEntity(_bp);
														if (_be != null) {
															try {
																_be.load(_bnbt);
															} catch (Exception ignored) {
															}
														}
													}
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1, false);
													}
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("RatDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:rat_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("MineDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:mine_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("ForestDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:forest_dungeon"));
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
									if ((new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("D-Rank")) {
										if (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered") >= 1 && (new Object() {
											public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getBoolean(tag);
												return false;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "RedGate")) == true) {
											if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_SMALL.get())) {
												{
													BlockPos _bp = BlockPos.containing(x, y, z);
													BlockState _bs = SlsbModBlocks.RED_GATE_SMALL.get().defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													BlockEntity _be = world.getBlockEntity(_bp);
													CompoundTag _bnbt = null;
													if (_be != null) {
														_bnbt = _be.saveWithFullMetadata();
														_be.setRemoved();
													}
													world.setBlock(_bp, _bs, 3);
													if (_bnbt != null) {
														_be = world.getBlockEntity(_bp);
														if (_be != null) {
															try {
																_be.load(_bnbt);
															} catch (Exception ignored) {
															}
														}
													}
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1, false);
													}
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("DoubleDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:double_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("CatacombDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:catacomb_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("LibraryDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:library_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("MazeDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:maze_dungeon"));
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
									if ((new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("C-Rank")) {
										if (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered") >= 1 && (new Object() {
											public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getBoolean(tag);
												return false;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "RedGate")) == true) {
											if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_MEDIUM.get())) {
												{
													BlockPos _bp = BlockPos.containing(x, y, z);
													BlockState _bs = SlsbModBlocks.RED_GATE_MEDIUM.get().defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													BlockEntity _be = world.getBlockEntity(_bp);
													CompoundTag _bnbt = null;
													if (_be != null) {
														_bnbt = _be.saveWithFullMetadata();
														_be.setRemoved();
													}
													world.setBlock(_bp, _bs, 3);
													if (_bnbt != null) {
														_be = world.getBlockEntity(_bp);
														if (_be != null) {
															try {
																_be.load(_bnbt);
															} catch (Exception ignored) {
															}
														}
													}
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1, false);
													}
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("InsectDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:insect_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("GoblinDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:goblin_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("SandyDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:sandy_dungeon"));
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
									if ((new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("B-Rank")) {
										if (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered") >= 1 && (new Object() {
											public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getBoolean(tag);
												return false;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "RedGate")) == true) {
											if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_MEDIUM.get())) {
												{
													BlockPos _bp = BlockPos.containing(x, y, z);
													BlockState _bs = SlsbModBlocks.RED_GATE_MEDIUM.get().defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													BlockEntity _be = world.getBlockEntity(_bp);
													CompoundTag _bnbt = null;
													if (_be != null) {
														_bnbt = _be.saveWithFullMetadata();
														_be.setRemoved();
													}
													world.setBlock(_bp, _bs, 3);
													if (_bnbt != null) {
														_be = world.getBlockEntity(_bp);
														if (_be != null) {
															try {
																_be.load(_bnbt);
															} catch (Exception ignored) {
															}
														}
													}
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1, false);
													}
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("SunkenDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:sunken_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("CrystalDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:crystal_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("ColiseumDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:coliseum_dungeon"));
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
									if ((new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("A-Rank")) {
										if (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered") >= 1 && (new Object() {
											public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getBoolean(tag);
												return false;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "RedGate")) == true) {
											if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_MEDIUM.get())) {
												{
													BlockPos _bp = BlockPos.containing(x, y, z);
													BlockState _bs = SlsbModBlocks.RED_GATE_MEDIUM.get().defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													BlockEntity _be = world.getBlockEntity(_bp);
													CompoundTag _bnbt = null;
													if (_be != null) {
														_bnbt = _be.saveWithFullMetadata();
														_be.setRemoved();
													}
													world.setBlock(_bp, _bs, 3);
													if (_bnbt != null) {
														_be = world.getBlockEntity(_bp);
														if (_be != null) {
															try {
																_be.load(_bnbt);
															} catch (Exception ignored) {
															}
														}
													}
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1, false);
													}
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("IceDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:ice_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("OrcDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:orc_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("LichDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:lich_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("NagaDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:naga_dungeon"));
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
									if ((new Object() {
										public String getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getPersistentData().getString(tag);
											return "";
										}
									}.getValue(world, BlockPos.containing(x, y, z), "GateRank")).equals("S-Rank")) {
										if (new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "PlayersEntered") >= 1 && (new Object() {
											public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getBoolean(tag);
												return false;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "RedGate")) == true) {
											if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_MEDIUM.get())) {
												{
													BlockPos _bp = BlockPos.containing(x, y, z);
													BlockState _bs = SlsbModBlocks.RED_GATE_MEDIUM.get().defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													BlockEntity _be = world.getBlockEntity(_bp);
													CompoundTag _bnbt = null;
													if (_be != null) {
														_bnbt = _be.saveWithFullMetadata();
														_be.setRemoved();
													}
													world.setBlock(_bp, _bs, 3);
													if (_bnbt != null) {
														_be = world.getBlockEntity(_bp);
														if (_be != null) {
															try {
																_be.load(_bnbt);
															} catch (Exception ignored) {
															}
														}
													}
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.BLOCKS, 1, 1, false);
													}
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("DragonDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:dragon_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("GiantDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:giant_dungeon"));
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
										}.getValue(world, BlockPos.containing(x, y, z), "GateDungeon")).equals("CitadelDungeon")) {
											if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
												ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:citadel_dungeon"));
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
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Maximum amount of players have entered this dungeon!"), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Please wait for current dungeon to generate!"), true);
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("This dungeon has been cleared!"), true);
				}
			}
			if (!((entity.level().dimension()) == Level.OVERWORLD)) {
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).DefeatedBoss == true) {
					int horizontalRadiusSphere = (int) 5 - 1;
					int verticalRadiusSphere = (int) 5 - 1;
					int yIterationsSphere = verticalRadiusSphere;
					for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
						for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
							for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
								double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
										+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
								if (distanceSq <= 1.0) {
									if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == SlsbModBlocks.BLUE_GATE_MEDIUM.get()
											|| (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == SlsbModBlocks.BLUE_GATE_SMALL.get()
											|| (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == SlsbModBlocks.RED_GATE_SMALL.get()
											|| (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == SlsbModBlocks.RED_GATE_MEDIUM.get()) {
										if ((new Object() {
											public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getBoolean(tag);
												return false;
											}
										}.getValue(world, BlockPos.containing(x, y, z), "GateCompleted")) == false) {
											if (!world.isClientSide()) {
												BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getPersistentData().putBoolean("GateCompleted", true);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
											entity.getPersistentData().putDouble("PortalCooldown", 20);
										}
									}
								}
							}
						}
					}
				}
				if (entity.getPersistentData().getDouble("PortalCooldown") == 0) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_SMALL.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SlsbModBlocks.RED_GATE_MEDIUM.get()) {
						if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).DefeatedBoss == true || (new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getBoolean(tag);
								return false;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "GateCompleted")) == true) {
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
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Must clear the dungeon boss to leave!"), true);
						}
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
}
