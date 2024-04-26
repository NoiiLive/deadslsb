
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.RalliedEffectTickProcedure;

public class RalliedMobEffect extends MobEffect {
	public RalliedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -17887);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.rallied";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RalliedEffectTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
