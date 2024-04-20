
package net.clozynoii.slsb.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.procedures.ClearMindTickProcedure;

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
		ClearMindTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
