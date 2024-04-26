
package net.clozynoii.slsb.potion;

public class BerserkerMobEffect extends MobEffect {
	public BerserkerMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.berserker";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BerserkerOnEffectActiveTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}