
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.DisguiseTickProcedure;

public class DisguiseMobEffect extends MobEffect {
	public DisguiseMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -2230563);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.disguise";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DisguiseTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
