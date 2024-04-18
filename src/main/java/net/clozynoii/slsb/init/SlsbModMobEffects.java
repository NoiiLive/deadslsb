
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.clozynoii.slsb.potion.WindPullActiveMobEffect;
import net.clozynoii.slsb.potion.WindBurstActiveMobEffect;
import net.clozynoii.slsb.potion.TornadoActiveMobEffect;
import net.clozynoii.slsb.potion.SuffocationActiveMobEffect;
import net.clozynoii.slsb.potion.StealthMobEffect;
import net.clozynoii.slsb.potion.ReinforcementMobEffect;
import net.clozynoii.slsb.potion.HealingAuraMobEffect;
import net.clozynoii.slsb.potion.EvadeMobEffect;
import net.clozynoii.slsb.potion.DisguiseMobEffect;
import net.clozynoii.slsb.potion.CollapseMobEffect;
import net.clozynoii.slsb.potion.ChargedMobEffect;
import net.clozynoii.slsb.potion.BashMobEffect;
import net.clozynoii.slsb.SlsbMod;

public class SlsbModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SlsbMod.MODID);
	public static final RegistryObject<MobEffect> HEALING_AURA = REGISTRY.register("healing_aura", () -> new HealingAuraMobEffect());
	public static final RegistryObject<MobEffect> STEALTH = REGISTRY.register("stealth", () -> new StealthMobEffect());
	public static final RegistryObject<MobEffect> EVADE = REGISTRY.register("evade", () -> new EvadeMobEffect());
	public static final RegistryObject<MobEffect> DISGUISE = REGISTRY.register("disguise", () -> new DisguiseMobEffect());
	public static final RegistryObject<MobEffect> REINFORCEMENT = REGISTRY.register("reinforcement", () -> new ReinforcementMobEffect());
	public static final RegistryObject<MobEffect> COLLAPSE = REGISTRY.register("collapse", () -> new CollapseMobEffect());
	public static final RegistryObject<MobEffect> CHARGED = REGISTRY.register("charged", () -> new ChargedMobEffect());
	public static final RegistryObject<MobEffect> BASH = REGISTRY.register("bash", () -> new BashMobEffect());
	public static final RegistryObject<MobEffect> WIND_PULL_ACTIVE = REGISTRY.register("wind_pull_active", () -> new WindPullActiveMobEffect());
	public static final RegistryObject<MobEffect> WIND_BURST_ACTIVE = REGISTRY.register("wind_burst_active", () -> new WindBurstActiveMobEffect());
	public static final RegistryObject<MobEffect> SUFFOCATION_ACTIVE = REGISTRY.register("suffocation_active", () -> new SuffocationActiveMobEffect());
	public static final RegistryObject<MobEffect> TORNADO_ACTIVE = REGISTRY.register("tornado_active", () -> new TornadoActiveMobEffect());
}
