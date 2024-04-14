package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.clozynoii.slsb.network.SlsbModVariables;
import net.clozynoii.slsb.SlsbMod;

public class RandomMovesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String abilitylist = "";
		String selectedability = "";
		double totalabilities = 0;
		double abilitiesselected = 0;
		double magemagic = 0;
		double abilitycount = 0;
		abilitiesselected = 1;
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("D-Rank")) {
			totalabilities = 1;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("C-Rank")) {
			totalabilities = 2;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("B-Rank")) {
			totalabilities = 3;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("A-Rank")) {
			totalabilities = 4;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("S-Rank")) {
			totalabilities = 5;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Fighter")) {
			abilitylist = "SwordSlash,Berserker,SwordDance,Shatter,Adrenaline,Whirlwind,Precision,ManaBlade,Zone,Prediction,";
			abilitycount = 10;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Mage")) {
			magemagic = Mth.nextInt(RandomSource.create(), 1, 10);
			if (magemagic == 1) {
				{
					String _setval = "Flame";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "FlameSpear,FlamePrison,FlameDragon,FlameBlast,Firestorm,FlameBarrage,MagmaSurge,Ignite,";
				abilitycount = 8;
			}
			if (magemagic == 2) {
				{
					String _setval = "Earth";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "EarthWall,Earthquake,StoneShard,BoulderCrash,Quicksand,StonePrison,StoneBarrage,Sandstorm,";
				abilitycount = 8;
			}
			if (magemagic == 3) {
				{
					String _setval = "Wind";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "WindSlice,Turbulence,WindBurst,WindPull,Suffocation,Tornado,WindBarrier,";
				abilitycount = 7;
			}
			if (magemagic == 4) {
				{
					String _setval = "Water";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "AquaSpears,Whirlpool,WaterBlast,TidalWave,AquaShield,Torrent,Drown,";
				abilitycount = 7;
			}
			if (magemagic == 5) {
				{
					String _setval = "Ice";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "IceShard,IceBurst,Blizzard,Glacier,FrostBreath,Avalanche,IceWall,";
				abilitycount = 7;
			}
			if (magemagic == 6) {
				{
					String _setval = "Lightning";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "Thunderbolt,ChainShock,StaticField,Thunderstorm,Overload,Thunderclap,";
				abilitycount = 6;
			}
			if (magemagic == 7) {
				{
					String _setval = "Curse";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "Weakness,Agony,Plague,Confusion,Blindness,Draining,Petrification,";
				abilitycount = 7;
			}
			if (magemagic == 8) {
				{
					String _setval = "Summoning";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "SummonBeast,SummonGolem,SummonUndead,";
				abilitycount = 3;
			}
			if (magemagic == 9) {
				{
					String _setval = "Spatial";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "ItemSummon,ItemStorage,Teleportation,";
				abilitycount = 3;
			}
			if (magemagic == 10) {
				{
					String _setval = "Barrier";
					entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MageType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				abilitylist = "Barrier,ReflectiveShield,Encasement,";
				abilitycount = 3;
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Assassin")) {
			abilitylist = "Stealth,Quickstep,Backstab,Evasion,Mark,Smokescreen,Clone,Flurry,";
			abilitycount = 8;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Ranger")) {
			abilitylist = "MagicArrows,RapidShot,ArrowRain,PiercingShot,Tracking,SnareTrap,RotatingShots,";
			abilitycount = 7;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Tanker")) {
			abilitylist = "Taunt,Reinforcement,Collapse,ChargedSmash,Bash,Rally,FinalStand,Guardian,ClearMind,Overwhelm,";
			abilitycount = 10;
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Healer")) {
			abilitylist = "Healing,HasteBuff,StrengthBuff,Disguise,SacredBarrier,Purify,Fortify,";
			abilitycount = 7;
		}
		for (int index0 = 0; index0 < (int) totalabilities; index0++) {
			if (!(abilitylist).isEmpty()) {
				SlsbMod.LOGGER.debug(("Slot: " + new java.text.DecimalFormat("##").format(abilitiesselected)));
				selectedability = (abilitylist).split(",")[(Mth.nextInt(RandomSource.create(), 0, (int) (abilitycount - abilitiesselected)))];
				abilitylist = abilitylist.replace(selectedability + ",", "");
				SlsbMod.LOGGER.debug(("Ability Selected: " + selectedability));
				SlsbMod.LOGGER.debug(("Abilities Left: " + abilitylist));
				if ((selectedability).equals("Taunt")) {
					if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("A-Rank")
							|| ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("S-Rank")) {
						selectedability = "Provocation";
					}
				}
				if (abilitiesselected == 1) {
					{
						String _setval = selectedability;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilitySlot1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (abilitiesselected == 2) {
					{
						String _setval = selectedability;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilitySlot2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (abilitiesselected == 3) {
					{
						String _setval = selectedability;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilitySlot3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (abilitiesselected == 4) {
					{
						String _setval = selectedability;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilitySlot4 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (abilitiesselected == 5) {
					{
						String _setval = selectedability;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilitySlot5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				abilitiesselected = abilitiesselected + 1;
			}
		}
		SlsbMod.queueServerWork(5, () -> {
			{
				String _setval = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).AbilitySlot1;
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilitySelected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		});
	}
}
