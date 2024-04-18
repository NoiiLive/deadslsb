package net.clozynoii.slsb.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.clozynoii.slsb.network.SlsbModVariables;
import net.clozynoii.slsb.init.SlsbModMobEffects;
import net.clozynoii.slsb.SlsbMod;

public class StealthActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana <= 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(SlsbModMobEffects.STEALTH.get());
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.nearby_closer")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.nearby_closer")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 0.1, 0.1, 0.1, 0.1);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cMana Depleted!"), true);
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HelmetSave));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).HelmetSave));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(2, ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ChestplateSave));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.CHEST, ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ChestplateSave));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).LeggingsSave));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).LeggingsSave));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(0, ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).BootsSave));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.FEET, ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).BootsSave));
				}
			}
			{
				String _setval = ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ActiveSkills).replace("Stealth ", "");
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ActiveSkills = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			SlsbMod.LOGGER.debug(((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).ActiveSkills));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SlsbModMobEffects.STEALTH.get(), 2, 0, false, false));
		}
		if (entity.getPersistentData().getDouble("RegenCD") > 0) {
			entity.getPersistentData().putDouble("RegenCD", (entity.getPersistentData().getDouble("RegenCD") - 1));
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("D-Rank")) {
			{
				double _setval = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana - 1;
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("C-Rank")) {
			{
				double _setval = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana - 2;
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("B-Rank")) {
			{
				double _setval = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana - 3;
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("A-Rank")) {
			{
				double _setval = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana - 5;
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Rank).equals("S-Rank")) {
			{
				double _setval = (entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).Mana - 15;
				entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, false, false));
	}
}
