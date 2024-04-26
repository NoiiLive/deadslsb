
package net.clozynoii.slsb.potion;

public class WhirlwindMobEffect extends MobEffect {
	public WhirlwindMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.whirlwind";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		WhirlwindOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}