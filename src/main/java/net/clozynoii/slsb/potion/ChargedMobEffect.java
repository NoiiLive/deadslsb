
package net.clozynoii.slsb.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ChargedMobEffect extends MobEffect {
	public ChargedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -42969);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.charged";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
