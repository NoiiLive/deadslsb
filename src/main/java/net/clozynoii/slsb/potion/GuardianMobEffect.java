
package net.clozynoii.slsb.potion;

public class GuardianMobEffect extends MobEffect {
	public GuardianMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3877670);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.guardian";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GuardianEffectRemoveProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}