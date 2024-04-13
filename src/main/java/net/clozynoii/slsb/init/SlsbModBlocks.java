
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.clozynoii.slsb.block.RedGateSmallBlock;
import net.clozynoii.slsb.block.ManaCrystalBlockStoneBlock;
import net.clozynoii.slsb.block.ManaCrystalBlockPureBlock;
import net.clozynoii.slsb.block.ManaCrystalBlockGraniteBlock;
import net.clozynoii.slsb.block.ManaCrystalBlockDripstoneBlock;
import net.clozynoii.slsb.block.ManaCrystalBlockDioriteBlock;
import net.clozynoii.slsb.block.ManaCrystalBlockDeepslateBlock;
import net.clozynoii.slsb.block.BlueGateSmallBlock;
import net.clozynoii.slsb.block.BlueGateMediumBlock;
import net.clozynoii.slsb.block.AwakeningOrbBlock;
import net.clozynoii.slsb.SlsbMod;

public class SlsbModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SlsbMod.MODID);
	public static final RegistryObject<Block> BLUE_GATE_SMALL = REGISTRY.register("blue_gate_small", () -> new BlueGateSmallBlock());
	public static final RegistryObject<Block> RED_GATE_SMALL = REGISTRY.register("red_gate_small", () -> new RedGateSmallBlock());
	public static final RegistryObject<Block> BLUE_GATE_MEDIUM = REGISTRY.register("blue_gate_medium", () -> new BlueGateMediumBlock());
	public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK_STONE = REGISTRY.register("mana_crystal_block_stone", () -> new ManaCrystalBlockStoneBlock());
	public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK_PURE = REGISTRY.register("mana_crystal_block_pure", () -> new ManaCrystalBlockPureBlock());
	public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK_DEEPSLATE = REGISTRY.register("mana_crystal_block_deepslate", () -> new ManaCrystalBlockDeepslateBlock());
	public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK_DIORITE = REGISTRY.register("mana_crystal_block_diorite", () -> new ManaCrystalBlockDioriteBlock());
	public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK_GRANITE = REGISTRY.register("mana_crystal_block_granite", () -> new ManaCrystalBlockGraniteBlock());
	public static final RegistryObject<Block> MANA_CRYSTAL_BLOCK_DRIPSTONE = REGISTRY.register("mana_crystal_block_dripstone", () -> new ManaCrystalBlockDripstoneBlock());
	public static final RegistryObject<Block> AWAKENING_ORB = REGISTRY.register("awakening_orb", () -> new AwakeningOrbBlock());
}
