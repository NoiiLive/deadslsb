package net.clozynoii.slsb.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.clozynoii.slsb.SlsbMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlsbModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		SlsbMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		SlsbMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.AbilitySlot1 = original.AbilitySlot1;
			clone.AbilitySlot2 = original.AbilitySlot2;
			clone.AbilitySlot3 = original.AbilitySlot3;
			clone.AbilitySlot4 = original.AbilitySlot4;
			clone.AbilitySlot5 = original.AbilitySlot5;
			clone.AbilitySlot6 = original.AbilitySlot6;
			clone.AbilitySlot7 = original.AbilitySlot7;
			clone.AbilitySlot8 = original.AbilitySlot8;
			clone.AbilitySlot9 = original.AbilitySlot9;
			clone.Aura = original.Aura;
			clone.ColorCode = original.ColorCode;
			clone.HunterClass = original.HunterClass;
			clone.Rank = original.Rank;
			clone.UseAbilityType = original.UseAbilityType;
			clone.MageType = original.MageType;
			clone.Mana = original.Mana;
			clone.ManaMax = original.ManaMax;
			clone.Mastery = original.Mastery;
			clone.PlayerTimer = original.PlayerTimer;
			clone.AbilityCost1 = original.AbilityCost1;
			clone.AbilityCost2 = original.AbilityCost2;
			clone.AbilityCost3 = original.AbilityCost3;
			clone.AbilityCost4 = original.AbilityCost4;
			clone.AbilityCost5 = original.AbilityCost5;
			clone.AbilityCost6 = original.AbilityCost6;
			clone.AbilityCost7 = original.AbilityCost7;
			clone.AbilityCost8 = original.AbilityCost8;
			clone.AbilityCost9 = original.AbilityCost9;
			clone.JoinedWorld = original.JoinedWorld;
			clone.SystemPlayer = original.SystemPlayer;
			clone.RulerVessel = original.RulerVessel;
			clone.BootsSave = original.BootsSave;
			clone.ChestplateSave = original.ChestplateSave;
			clone.HelmetSave = original.HelmetSave;
			clone.LeggingsSave = original.LeggingsSave;
			clone.SkillsRenamed = original.SkillsRenamed;
			clone.Awakened = original.Awakened;
			clone.DungeonGenerate = original.DungeonGenerate;
			clone.DungeonEnterTimerPlayer = original.DungeonEnterTimerPlayer;
			clone.MaxStrength = original.MaxStrength;
			clone.Intelligence = original.Intelligence;
			clone.MaxAgility = original.MaxAgility;
			clone.MaxVitality = original.MaxVitality;
			clone.Agility = original.Agility;
			clone.MaxSense = original.MaxSense;
			clone.MaxIntelligence = original.MaxIntelligence;
			clone.Vitality = original.Vitality;
			clone.Strength = original.Strength;
			clone.Sense = original.Sense;
			clone.Money = original.Money;
			clone.HunterGuild = original.HunterGuild;
			clone.DungeonLeaveTimer = original.DungeonLeaveTimer;
			if (!event.isWasDeath()) {
				clone.AbilitySelected = original.AbilitySelected;
				clone.ActiveSkills = original.ActiveSkills;
				clone.SwitcherSlot = original.SwitcherSlot;
				clone.AbilityCooldown1 = original.AbilityCooldown1;
				clone.AbilityCooldown2 = original.AbilityCooldown2;
				clone.AbilityCooldown3 = original.AbilityCooldown3;
				clone.AbilityCooldown4 = original.AbilityCooldown4;
				clone.AbilityCooldown5 = original.AbilityCooldown5;
				clone.AbilityCooldown6 = original.AbilityCooldown6;
				clone.AbilityCooldown7 = original.AbilityCooldown7;
				clone.AbilityCooldown8 = original.AbilityCooldown8;
				clone.AbilityCooldown9 = original.AbilityCooldown9;
				clone.DefeatedBoss = original.DefeatedBoss;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					SlsbMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					SlsbMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					SlsbMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "slsb_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				SlsbMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "slsb_mapvars";
		public double GateTimer = 0;
		public boolean WorldCreated = false;
		public boolean DungeonBossRoom = false;
		public double DungeonRoomCount = 0;
		public double DungeonRoomTimer = 0.0;
		public double DungeonEntranceTimer = 0.0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			GateTimer = nbt.getDouble("GateTimer");
			WorldCreated = nbt.getBoolean("WorldCreated");
			DungeonBossRoom = nbt.getBoolean("DungeonBossRoom");
			DungeonRoomCount = nbt.getDouble("DungeonRoomCount");
			DungeonRoomTimer = nbt.getDouble("DungeonRoomTimer");
			DungeonEntranceTimer = nbt.getDouble("DungeonEntranceTimer");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("GateTimer", GateTimer);
			nbt.putBoolean("WorldCreated", WorldCreated);
			nbt.putBoolean("DungeonBossRoom", DungeonBossRoom);
			nbt.putDouble("DungeonRoomCount", DungeonRoomCount);
			nbt.putDouble("DungeonRoomTimer", DungeonRoomTimer);
			nbt.putDouble("DungeonEntranceTimer", DungeonEntranceTimer);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				SlsbMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("slsb", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String AbilitySelected = "None";
		public String AbilitySlot1 = "None";
		public String AbilitySlot2 = "None";
		public String AbilitySlot3 = "None";
		public String AbilitySlot4 = "None";
		public String AbilitySlot5 = "None";
		public String AbilitySlot6 = "None";
		public String AbilitySlot7 = "None";
		public String AbilitySlot8 = "None";
		public String AbilitySlot9 = "None";
		public String Aura = "";
		public String ColorCode = "";
		public String HunterClass = "";
		public String Rank = "";
		public String UseAbilityType = "Switcher";
		public String ActiveSkills = "";
		public String MageType = "";
		public double Mana = 0;
		public double ManaMax = 0;
		public double Mastery = 0;
		public double PlayerTimer = 0.0;
		public double SwitcherSlot = 1.0;
		public double AbilityCooldown1 = 0;
		public double AbilityCooldown2 = 0;
		public double AbilityCooldown3 = 0;
		public double AbilityCooldown4 = 0;
		public double AbilityCooldown5 = 0;
		public double AbilityCooldown6 = 0;
		public double AbilityCooldown7 = 0;
		public double AbilityCooldown8 = 0;
		public double AbilityCooldown9 = 0.0;
		public double AbilityCost1 = 0;
		public double AbilityCost2 = 0;
		public double AbilityCost3 = 0;
		public double AbilityCost4 = 0;
		public double AbilityCost5 = 0;
		public double AbilityCost6 = 0;
		public double AbilityCost7 = 0;
		public double AbilityCost8 = 0;
		public double AbilityCost9 = 0;
		public boolean JoinedWorld = false;
		public boolean SystemPlayer = false;
		public boolean RulerVessel = false;
		public ItemStack BootsSave = ItemStack.EMPTY;
		public ItemStack ChestplateSave = ItemStack.EMPTY;
		public ItemStack HelmetSave = ItemStack.EMPTY;
		public ItemStack LeggingsSave = ItemStack.EMPTY;
		public boolean SkillsRenamed = false;
		public boolean Awakened = false;
		public boolean DungeonGenerate = false;
		public double DungeonEnterTimerPlayer = 0;
		public boolean DefeatedBoss = false;
		public double MaxStrength = 0.0;
		public double Intelligence = 0.0;
		public double MaxAgility = 0.0;
		public double MaxVitality = 0.0;
		public double Agility = 0.0;
		public double MaxSense = 0.0;
		public double MaxIntelligence = 0.0;
		public double Vitality = 0.0;
		public double Strength = 0.0;
		public double Sense = 0.0;
		public double Money = 100.0;
		public String HunterGuild = "None";
		public double DungeonLeaveTimer = 0.0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				SlsbMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("AbilitySelected", AbilitySelected);
			nbt.putString("AbilitySlot1", AbilitySlot1);
			nbt.putString("AbilitySlot2", AbilitySlot2);
			nbt.putString("AbilitySlot3", AbilitySlot3);
			nbt.putString("AbilitySlot4", AbilitySlot4);
			nbt.putString("AbilitySlot5", AbilitySlot5);
			nbt.putString("AbilitySlot6", AbilitySlot6);
			nbt.putString("AbilitySlot7", AbilitySlot7);
			nbt.putString("AbilitySlot8", AbilitySlot8);
			nbt.putString("AbilitySlot9", AbilitySlot9);
			nbt.putString("Aura", Aura);
			nbt.putString("ColorCode", ColorCode);
			nbt.putString("HunterClass", HunterClass);
			nbt.putString("Rank", Rank);
			nbt.putString("UseAbilityType", UseAbilityType);
			nbt.putString("ActiveSkills", ActiveSkills);
			nbt.putString("MageType", MageType);
			nbt.putDouble("Mana", Mana);
			nbt.putDouble("ManaMax", ManaMax);
			nbt.putDouble("Mastery", Mastery);
			nbt.putDouble("PlayerTimer", PlayerTimer);
			nbt.putDouble("SwitcherSlot", SwitcherSlot);
			nbt.putDouble("AbilityCooldown1", AbilityCooldown1);
			nbt.putDouble("AbilityCooldown2", AbilityCooldown2);
			nbt.putDouble("AbilityCooldown3", AbilityCooldown3);
			nbt.putDouble("AbilityCooldown4", AbilityCooldown4);
			nbt.putDouble("AbilityCooldown5", AbilityCooldown5);
			nbt.putDouble("AbilityCooldown6", AbilityCooldown6);
			nbt.putDouble("AbilityCooldown7", AbilityCooldown7);
			nbt.putDouble("AbilityCooldown8", AbilityCooldown8);
			nbt.putDouble("AbilityCooldown9", AbilityCooldown9);
			nbt.putDouble("AbilityCost1", AbilityCost1);
			nbt.putDouble("AbilityCost2", AbilityCost2);
			nbt.putDouble("AbilityCost3", AbilityCost3);
			nbt.putDouble("AbilityCost4", AbilityCost4);
			nbt.putDouble("AbilityCost5", AbilityCost5);
			nbt.putDouble("AbilityCost6", AbilityCost6);
			nbt.putDouble("AbilityCost7", AbilityCost7);
			nbt.putDouble("AbilityCost8", AbilityCost8);
			nbt.putDouble("AbilityCost9", AbilityCost9);
			nbt.putBoolean("JoinedWorld", JoinedWorld);
			nbt.putBoolean("SystemPlayer", SystemPlayer);
			nbt.putBoolean("RulerVessel", RulerVessel);
			nbt.put("BootsSave", BootsSave.save(new CompoundTag()));
			nbt.put("ChestplateSave", ChestplateSave.save(new CompoundTag()));
			nbt.put("HelmetSave", HelmetSave.save(new CompoundTag()));
			nbt.put("LeggingsSave", LeggingsSave.save(new CompoundTag()));
			nbt.putBoolean("SkillsRenamed", SkillsRenamed);
			nbt.putBoolean("Awakened", Awakened);
			nbt.putBoolean("DungeonGenerate", DungeonGenerate);
			nbt.putDouble("DungeonEnterTimerPlayer", DungeonEnterTimerPlayer);
			nbt.putBoolean("DefeatedBoss", DefeatedBoss);
			nbt.putDouble("MaxStrength", MaxStrength);
			nbt.putDouble("Intelligence", Intelligence);
			nbt.putDouble("MaxAgility", MaxAgility);
			nbt.putDouble("MaxVitality", MaxVitality);
			nbt.putDouble("Agility", Agility);
			nbt.putDouble("MaxSense", MaxSense);
			nbt.putDouble("MaxIntelligence", MaxIntelligence);
			nbt.putDouble("Vitality", Vitality);
			nbt.putDouble("Strength", Strength);
			nbt.putDouble("Sense", Sense);
			nbt.putDouble("Money", Money);
			nbt.putString("HunterGuild", HunterGuild);
			nbt.putDouble("DungeonLeaveTimer", DungeonLeaveTimer);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			AbilitySelected = nbt.getString("AbilitySelected");
			AbilitySlot1 = nbt.getString("AbilitySlot1");
			AbilitySlot2 = nbt.getString("AbilitySlot2");
			AbilitySlot3 = nbt.getString("AbilitySlot3");
			AbilitySlot4 = nbt.getString("AbilitySlot4");
			AbilitySlot5 = nbt.getString("AbilitySlot5");
			AbilitySlot6 = nbt.getString("AbilitySlot6");
			AbilitySlot7 = nbt.getString("AbilitySlot7");
			AbilitySlot8 = nbt.getString("AbilitySlot8");
			AbilitySlot9 = nbt.getString("AbilitySlot9");
			Aura = nbt.getString("Aura");
			ColorCode = nbt.getString("ColorCode");
			HunterClass = nbt.getString("HunterClass");
			Rank = nbt.getString("Rank");
			UseAbilityType = nbt.getString("UseAbilityType");
			ActiveSkills = nbt.getString("ActiveSkills");
			MageType = nbt.getString("MageType");
			Mana = nbt.getDouble("Mana");
			ManaMax = nbt.getDouble("ManaMax");
			Mastery = nbt.getDouble("Mastery");
			PlayerTimer = nbt.getDouble("PlayerTimer");
			SwitcherSlot = nbt.getDouble("SwitcherSlot");
			AbilityCooldown1 = nbt.getDouble("AbilityCooldown1");
			AbilityCooldown2 = nbt.getDouble("AbilityCooldown2");
			AbilityCooldown3 = nbt.getDouble("AbilityCooldown3");
			AbilityCooldown4 = nbt.getDouble("AbilityCooldown4");
			AbilityCooldown5 = nbt.getDouble("AbilityCooldown5");
			AbilityCooldown6 = nbt.getDouble("AbilityCooldown6");
			AbilityCooldown7 = nbt.getDouble("AbilityCooldown7");
			AbilityCooldown8 = nbt.getDouble("AbilityCooldown8");
			AbilityCooldown9 = nbt.getDouble("AbilityCooldown9");
			AbilityCost1 = nbt.getDouble("AbilityCost1");
			AbilityCost2 = nbt.getDouble("AbilityCost2");
			AbilityCost3 = nbt.getDouble("AbilityCost3");
			AbilityCost4 = nbt.getDouble("AbilityCost4");
			AbilityCost5 = nbt.getDouble("AbilityCost5");
			AbilityCost6 = nbt.getDouble("AbilityCost6");
			AbilityCost7 = nbt.getDouble("AbilityCost7");
			AbilityCost8 = nbt.getDouble("AbilityCost8");
			AbilityCost9 = nbt.getDouble("AbilityCost9");
			JoinedWorld = nbt.getBoolean("JoinedWorld");
			SystemPlayer = nbt.getBoolean("SystemPlayer");
			RulerVessel = nbt.getBoolean("RulerVessel");
			BootsSave = ItemStack.of(nbt.getCompound("BootsSave"));
			ChestplateSave = ItemStack.of(nbt.getCompound("ChestplateSave"));
			HelmetSave = ItemStack.of(nbt.getCompound("HelmetSave"));
			LeggingsSave = ItemStack.of(nbt.getCompound("LeggingsSave"));
			SkillsRenamed = nbt.getBoolean("SkillsRenamed");
			Awakened = nbt.getBoolean("Awakened");
			DungeonGenerate = nbt.getBoolean("DungeonGenerate");
			DungeonEnterTimerPlayer = nbt.getDouble("DungeonEnterTimerPlayer");
			DefeatedBoss = nbt.getBoolean("DefeatedBoss");
			MaxStrength = nbt.getDouble("MaxStrength");
			Intelligence = nbt.getDouble("Intelligence");
			MaxAgility = nbt.getDouble("MaxAgility");
			MaxVitality = nbt.getDouble("MaxVitality");
			Agility = nbt.getDouble("Agility");
			MaxSense = nbt.getDouble("MaxSense");
			MaxIntelligence = nbt.getDouble("MaxIntelligence");
			Vitality = nbt.getDouble("Vitality");
			Strength = nbt.getDouble("Strength");
			Sense = nbt.getDouble("Sense");
			Money = nbt.getDouble("Money");
			HunterGuild = nbt.getString("HunterGuild");
			DungeonLeaveTimer = nbt.getDouble("DungeonLeaveTimer");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SlsbMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.AbilitySelected = message.data.AbilitySelected;
					variables.AbilitySlot1 = message.data.AbilitySlot1;
					variables.AbilitySlot2 = message.data.AbilitySlot2;
					variables.AbilitySlot3 = message.data.AbilitySlot3;
					variables.AbilitySlot4 = message.data.AbilitySlot4;
					variables.AbilitySlot5 = message.data.AbilitySlot5;
					variables.AbilitySlot6 = message.data.AbilitySlot6;
					variables.AbilitySlot7 = message.data.AbilitySlot7;
					variables.AbilitySlot8 = message.data.AbilitySlot8;
					variables.AbilitySlot9 = message.data.AbilitySlot9;
					variables.Aura = message.data.Aura;
					variables.ColorCode = message.data.ColorCode;
					variables.HunterClass = message.data.HunterClass;
					variables.Rank = message.data.Rank;
					variables.UseAbilityType = message.data.UseAbilityType;
					variables.ActiveSkills = message.data.ActiveSkills;
					variables.MageType = message.data.MageType;
					variables.Mana = message.data.Mana;
					variables.ManaMax = message.data.ManaMax;
					variables.Mastery = message.data.Mastery;
					variables.PlayerTimer = message.data.PlayerTimer;
					variables.SwitcherSlot = message.data.SwitcherSlot;
					variables.AbilityCooldown1 = message.data.AbilityCooldown1;
					variables.AbilityCooldown2 = message.data.AbilityCooldown2;
					variables.AbilityCooldown3 = message.data.AbilityCooldown3;
					variables.AbilityCooldown4 = message.data.AbilityCooldown4;
					variables.AbilityCooldown5 = message.data.AbilityCooldown5;
					variables.AbilityCooldown6 = message.data.AbilityCooldown6;
					variables.AbilityCooldown7 = message.data.AbilityCooldown7;
					variables.AbilityCooldown8 = message.data.AbilityCooldown8;
					variables.AbilityCooldown9 = message.data.AbilityCooldown9;
					variables.AbilityCost1 = message.data.AbilityCost1;
					variables.AbilityCost2 = message.data.AbilityCost2;
					variables.AbilityCost3 = message.data.AbilityCost3;
					variables.AbilityCost4 = message.data.AbilityCost4;
					variables.AbilityCost5 = message.data.AbilityCost5;
					variables.AbilityCost6 = message.data.AbilityCost6;
					variables.AbilityCost7 = message.data.AbilityCost7;
					variables.AbilityCost8 = message.data.AbilityCost8;
					variables.AbilityCost9 = message.data.AbilityCost9;
					variables.JoinedWorld = message.data.JoinedWorld;
					variables.SystemPlayer = message.data.SystemPlayer;
					variables.RulerVessel = message.data.RulerVessel;
					variables.BootsSave = message.data.BootsSave;
					variables.ChestplateSave = message.data.ChestplateSave;
					variables.HelmetSave = message.data.HelmetSave;
					variables.LeggingsSave = message.data.LeggingsSave;
					variables.SkillsRenamed = message.data.SkillsRenamed;
					variables.Awakened = message.data.Awakened;
					variables.DungeonGenerate = message.data.DungeonGenerate;
					variables.DungeonEnterTimerPlayer = message.data.DungeonEnterTimerPlayer;
					variables.DefeatedBoss = message.data.DefeatedBoss;
					variables.MaxStrength = message.data.MaxStrength;
					variables.Intelligence = message.data.Intelligence;
					variables.MaxAgility = message.data.MaxAgility;
					variables.MaxVitality = message.data.MaxVitality;
					variables.Agility = message.data.Agility;
					variables.MaxSense = message.data.MaxSense;
					variables.MaxIntelligence = message.data.MaxIntelligence;
					variables.Vitality = message.data.Vitality;
					variables.Strength = message.data.Strength;
					variables.Sense = message.data.Sense;
					variables.Money = message.data.Money;
					variables.HunterGuild = message.data.HunterGuild;
					variables.DungeonLeaveTimer = message.data.DungeonLeaveTimer;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
