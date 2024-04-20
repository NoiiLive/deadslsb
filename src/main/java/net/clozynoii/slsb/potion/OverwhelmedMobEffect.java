
package net.clozynoii.slsb.potion;

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
		OverwhelmedTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}