
package net.clozynoii.slsb.potion;

public class WindBurstActiveMobEffect extends MobEffect {
	public WindBurstActiveMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.wind_burst_active";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		WindBurstActiveOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}