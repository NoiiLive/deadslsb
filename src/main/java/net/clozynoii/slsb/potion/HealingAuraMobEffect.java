
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.HealingAuraTickProcedure;

public class HealingAuraMobEffect extends MobEffect {
	public HealingAuraMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -12588513);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.healing_aura";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HealingAuraTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
