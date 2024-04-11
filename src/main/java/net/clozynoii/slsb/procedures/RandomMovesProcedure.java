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
			abilitylist = "EnergyBlast,Berserker,SwordDance,Shatter,5,";
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Mage")) {
			magemagic = Mth.nextInt(RandomSource.create(), 1, 5);
			if (magemagic == 1) {
				abilitylist = "FlameSpear,FlamePrison,FlameDragon,4,5,";
			}
			if (magemagic == 2) {
				abilitylist = "Telekinesis,2,3,4,5,";
			}
			if (magemagic == 3) {
				abilitylist = "Barrier,2,3,4,5,";
			}
			if (magemagic == 4) {
				abilitylist = "Summon,2,3,4,5,";
			}
			if (magemagic == 5) {
				abilitylist = "ItemSummon,ItemStorage,3,4,5,";
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Assassin")) {
			abilitylist = "Stealth,2,3,4,5,";
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Ranger")) {
			abilitylist = "MagicArrows,2,3,4,5,";
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Tanker")) {
			abilitylist = "Taunt,Reinforcement,Collapse,PowerSmash,5,";
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HunterClass).equals("Healer")) {
			abilitylist = "Healing,HasteBuff,StrengthBuff,Disguise,SacredShield,";
		}
		for (int index0 = 0; index0 < (int) totalabilities; index0++) {
			if (!(abilitylist).isEmpty()) {
				SlsbMod.LOGGER.debug(("Slot: " + new java.text.DecimalFormat("##").format(abilitiesselected)));
				selectedability = (abilitylist).split(",")[(Mth.nextInt(RandomSource.create(), 0, (int) (5 - abilitiesselected)))];
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
