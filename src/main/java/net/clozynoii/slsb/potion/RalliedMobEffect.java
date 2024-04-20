
package net.clozynoii.slsb.potion;

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
		RalliedEffectTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}