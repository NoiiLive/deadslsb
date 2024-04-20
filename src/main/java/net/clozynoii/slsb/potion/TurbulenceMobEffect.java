
package net.clozynoii.slsb.potion;

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
		TurbulenceActiveProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}