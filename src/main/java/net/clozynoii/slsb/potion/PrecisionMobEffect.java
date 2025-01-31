
package net.clozynoii.slsb.potion;

public class PrecisionMobEffect extends MobEffect {
	public PrecisionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.precision";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PrecisionOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}