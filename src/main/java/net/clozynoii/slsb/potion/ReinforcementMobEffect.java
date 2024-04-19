
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.ReinforcementTickProcedure;

public class ReinforcementMobEffect extends MobEffect {
	public ReinforcementMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -854116);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.reinforcement";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ReinforcementTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
