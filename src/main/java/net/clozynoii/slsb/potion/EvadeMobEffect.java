
package net.clozynoii.slsb.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EvadeMobEffect extends MobEffect {
	public EvadeMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10092340);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.evade";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
