
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.clozynoii.slsb.SlsbMod;

public class SlsbModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, SlsbMod.MODID);
	public static final RegistryObject<SimpleParticleType> HEAL_EFFECT = REGISTRY.register("heal_effect", () -> new SimpleParticleType(true));
}
