package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.clozynoii.slsb.init.SlsbModMobEffects;

public class OverwhelmedTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SlsbModMobEffects.OVERWHELMED.get()) ? _livEnt.getEffect(SlsbModMobEffects.OVERWHELMED.get()).getAmplifier() : 0) == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20, 0, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 0, false, false));
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SlsbModMobEffects.OVERWHELMED.get()) ? _livEnt.getEffect(SlsbModMobEffects.OVERWHELMED.get()).getAmplifier() : 0) == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, false, false));
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SlsbModMobEffects.OVERWHELMED.get()) ? _livEnt.getEffect(SlsbModMobEffects.OVERWHELMED.get()).getAmplifier() : 0) == 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20, 2, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, false, false));
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SlsbModMobEffects.OVERWHELMED.get()) ? _livEnt.getEffect(SlsbModMobEffects.OVERWHELMED.get()).getAmplifier() : 0) == 3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20, 3, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 3, false, false));
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SlsbModMobEffects.OVERWHELMED.get()) ? _livEnt.getEffect(SlsbModMobEffects.OVERWHELMED.get()).getAmplifier() : 0) == 4) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20, 4, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 4, false, false));
		}
	}
}
