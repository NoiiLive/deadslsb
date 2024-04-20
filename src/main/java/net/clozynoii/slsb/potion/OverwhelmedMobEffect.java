
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.OverwhelmedTickProcedure;

public class OverwhelmedMobEffect extends MobEffect {
	public OverwhelmedMobEffect() {
		super(MobEffectCategory.HARMFUL, -50887);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.overwhelmed";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OverwhelmedTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
