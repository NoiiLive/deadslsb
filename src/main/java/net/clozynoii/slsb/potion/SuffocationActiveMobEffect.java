
package net.clozynoii.slsb.potion;

public class SuffocationActiveMobEffect extends MobEffect {
	public SuffocationActiveMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.suffocation_active";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SuffocationActiveOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}