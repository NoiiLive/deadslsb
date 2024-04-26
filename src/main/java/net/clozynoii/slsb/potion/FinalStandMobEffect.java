
package net.clozynoii.slsb.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FinalStandMobEffect extends MobEffect {
	public FinalStandMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -36795);
	}

	@Override
	public String getDescriptionId() {
		return "effect.slsb.final_stand";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
