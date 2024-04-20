
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.CollapseEffectExpiresProcedure;
import net.clozynoii.slsb.procedures.CollapseActiveTickProcedure;

public class CollapseMobEffect extends MobEffect {
	public CollapseMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -12171706);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.collapse";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CollapseActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
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
