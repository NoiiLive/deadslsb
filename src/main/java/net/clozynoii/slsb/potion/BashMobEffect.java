
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.BashOnEffectActiveTickProcedure;

public class BashMobEffect extends MobEffect {
	public BashMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -5722961);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.bash";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BashOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
