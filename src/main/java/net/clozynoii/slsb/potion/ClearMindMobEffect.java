
package net.clozynoii.slsb.potion;

public class ClearMindMobEffect extends MobEffect {
	public ClearMindMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.clear_mind";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ClearMindTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}