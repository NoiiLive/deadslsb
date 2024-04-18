
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.TurbulenceActiveProcedure;

public class TurbulenceMobEffect extends MobEffect {
	public TurbulenceMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.turbulence";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TurbulenceActiveProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
