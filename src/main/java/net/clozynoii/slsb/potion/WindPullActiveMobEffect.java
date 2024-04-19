
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.WindPullActiveOnEffectActiveTickProcedure;
import net.clozynoii.slsb.procedures.CollapseEffectExpiresProcedure;

public class WindPullActiveMobEffect extends MobEffect {
	public WindPullActiveMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.wind_pull_active";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		WindPullActiveOnEffectActiveTickProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CollapseEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
