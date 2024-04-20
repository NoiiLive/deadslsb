
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.GuardianEffectRemoveProcedure;

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
