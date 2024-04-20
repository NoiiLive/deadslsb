package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ClearMindTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(SlsbModMobEffects.OVERWHELMED.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(SlsbModMobEffects.SUFFOCATION_ACTIVE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(SlsbModMobEffects.TURBULENCE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.BAD_OMEN);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.BLINDNESS);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HUNGER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.LEVITATION);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.CONFUSION);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.POISON);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.UNLUCK);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WEAKNESS);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WITHER);
	}
}
