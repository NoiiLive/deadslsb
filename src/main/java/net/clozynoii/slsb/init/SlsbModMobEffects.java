
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.potion.StealthMobEffect;
import net.clozynoii.slsb.potion.HealingAuraMobEffect;
import net.clozynoii.slsb.SlsbMod;

public class SlsbModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SlsbMod.MODID);
	public static final RegistryObject<MobEffect> HEALING_AURA = REGISTRY.register("healing_aura", () -> new HealingAuraMobEffect());
	public static final RegistryObject<MobEffect> STEALTH = REGISTRY.register("stealth", () -> new StealthMobEffect());
}
