
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.clozynoii.slsb.block.entity.RedGateSmallTileEntity;
import net.clozynoii.slsb.block.entity.RedGateMediumTileEntity;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockStoneTileEntity;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockPureTileEntity;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockGraniteTileEntity;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockDripstoneTileEntity;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockDioriteTileEntity;
import net.clozynoii.slsb.block.entity.ManaCrystalBlockDeepslateTileEntity;
import net.clozynoii.slsb.block.entity.BlueGateSmallTileEntity;
import net.clozynoii.slsb.block.entity.BlueGateMediumTileEntity;
import net.clozynoii.slsb.block.entity.AwakeningOrbTileEntity;
import net.clozynoii.slsb.SlsbMod;

public class SlsbModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SlsbMod.MODID);
	public static final RegistryObject<BlockEntityType<BlueGateSmallTileEntity>> BLUE_GATE_SMALL = REGISTRY.register("blue_gate_small", () -> BlockEntityType.Builder.of(BlueGateSmallTileEntity::new, SlsbModBlocks.BLUE_GATE_SMALL.get()).build(null));
	public static final RegistryObject<BlockEntityType<RedGateSmallTileEntity>> RED_GATE_SMALL = REGISTRY.register("red_gate_small", () -> BlockEntityType.Builder.of(RedGateSmallTileEntity::new, SlsbModBlocks.RED_GATE_SMALL.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlueGateMediumTileEntity>> BLUE_GATE_MEDIUM = REGISTRY.register("blue_gate_medium",
			() -> BlockEntityType.Builder.of(BlueGateMediumTileEntity::new, SlsbModBlocks.BLUE_GATE_MEDIUM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ManaCrystalBlockStoneTileEntity>> MANA_CRYSTAL_BLOCK_STONE = REGISTRY.register("mana_crystal_block_stone",
			() -> BlockEntityType.Builder.of(ManaCrystalBlockStoneTileEntity::new, SlsbModBlocks.MANA_CRYSTAL_BLOCK_STONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ManaCrystalBlockPureTileEntity>> MANA_CRYSTAL_BLOCK_PURE = REGISTRY.register("mana_crystal_block_pure",
			() -> BlockEntityType.Builder.of(ManaCrystalBlockPureTileEntity::new, SlsbModBlocks.MANA_CRYSTAL_BLOCK_PURE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ManaCrystalBlockDeepslateTileEntity>> MANA_CRYSTAL_BLOCK_DEEPSLATE = REGISTRY.register("mana_crystal_block_deepslate",
			() -> BlockEntityType.Builder.of(ManaCrystalBlockDeepslateTileEntity::new, SlsbModBlocks.MANA_CRYSTAL_BLOCK_DEEPSLATE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ManaCrystalBlockDioriteTileEntity>> MANA_CRYSTAL_BLOCK_DIORITE = REGISTRY.register("mana_crystal_block_diorite",
			() -> BlockEntityType.Builder.of(ManaCrystalBlockDioriteTileEntity::new, SlsbModBlocks.MANA_CRYSTAL_BLOCK_DIORITE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ManaCrystalBlockGraniteTileEntity>> MANA_CRYSTAL_BLOCK_GRANITE = REGISTRY.register("mana_crystal_block_granite",
			() -> BlockEntityType.Builder.of(ManaCrystalBlockGraniteTileEntity::new, SlsbModBlocks.MANA_CRYSTAL_BLOCK_GRANITE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ManaCrystalBlockDripstoneTileEntity>> MANA_CRYSTAL_BLOCK_DRIPSTONE = REGISTRY.register("mana_crystal_block_dripstone",
			() -> BlockEntityType.Builder.of(ManaCrystalBlockDripstoneTileEntity::new, SlsbModBlocks.MANA_CRYSTAL_BLOCK_DRIPSTONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AwakeningOrbTileEntity>> AWAKENING_ORB = REGISTRY.register("awakening_orb", () -> BlockEntityType.Builder.of(AwakeningOrbTileEntity::new, SlsbModBlocks.AWAKENING_ORB.get()).build(null));
	public static final RegistryObject<BlockEntityType<RedGateMediumTileEntity>> RED_GATE_MEDIUM = REGISTRY.register("red_gate_medium", () -> BlockEntityType.Builder.of(RedGateMediumTileEntity::new, SlsbModBlocks.RED_GATE_MEDIUM.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
