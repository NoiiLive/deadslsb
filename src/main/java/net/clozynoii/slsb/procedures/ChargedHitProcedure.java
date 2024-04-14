package net.clozynoii.slsb.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.clozynoii.slsb.init.SlsbModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChargedHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SlsbModMobEffects.CHARGED.get())) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.removeEffect(SlsbModMobEffects.CHARGED.get());
			if (sourceentity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DAMAGE_BOOST);
		}
	}
}
