
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.clozynoii.slsb.item.ManaCrystalItem;
import net.clozynoii.slsb.item.KnightKillerItem;
import net.clozynoii.slsb.item.KasakasVenomFangItem;
import net.clozynoii.slsb.block.display.RedGateSmallDisplayItem;
import net.clozynoii.slsb.block.display.ManaCrystalBlockStoneDisplayItem;
import net.clozynoii.slsb.block.display.ManaCrystalBlockPureDisplayItem;
import net.clozynoii.slsb.block.display.ManaCrystalBlockGraniteDisplayItem;
import net.clozynoii.slsb.block.display.ManaCrystalBlockDripstoneDisplayItem;
import net.clozynoii.slsb.block.display.ManaCrystalBlockDioriteDisplayItem;
import net.clozynoii.slsb.block.display.ManaCrystalBlockDeepslateDisplayItem;
import net.clozynoii.slsb.block.display.BlueGateSmallDisplayItem;
import net.clozynoii.slsb.block.display.BlueGateMediumDisplayItem;
import net.clozynoii.slsb.block.display.AwakeningOrbDisplayItem;
import net.clozynoii.slsb.SlsbMod;

public class SlsbModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlsbMod.MODID);
	public static final RegistryObject<Item> KASAKAS_VENOM_FANG = REGISTRY.register("kasakas_venom_fang", () -> new KasakasVenomFangItem());
	public static final RegistryObject<Item> BLUE_GATE_SMALL = REGISTRY.register(SlsbModBlocks.BLUE_GATE_SMALL.getId().getPath(), () -> new BlueGateSmallDisplayItem(SlsbModBlocks.BLUE_GATE_SMALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_GATE_SMALL = REGISTRY.register(SlsbModBlocks.RED_GATE_SMALL.getId().getPath(), () -> new RedGateSmallDisplayItem(SlsbModBlocks.RED_GATE_SMALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLUE_GATE_MEDIUM = REGISTRY.register(SlsbModBlocks.BLUE_GATE_MEDIUM.getId().getPath(), () -> new BlueGateMediumDisplayItem(SlsbModBlocks.BLUE_GATE_MEDIUM.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANA_CRYSTAL = REGISTRY.register("mana_crystal", () -> new ManaCrystalItem());
	public static final RegistryObject<Item> MANA_CRYSTAL_BLOCK_STONE = REGISTRY.register(SlsbModBlocks.MANA_CRYSTAL_BLOCK_STONE.getId().getPath(),
			() -> new ManaCrystalBlockStoneDisplayItem(SlsbModBlocks.MANA_CRYSTAL_BLOCK_STONE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANA_CRYSTAL_BLOCK_PURE = REGISTRY.register(SlsbModBlocks.MANA_CRYSTAL_BLOCK_PURE.getId().getPath(),
			() -> new ManaCrystalBlockPureDisplayItem(SlsbModBlocks.MANA_CRYSTAL_BLOCK_PURE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANA_CRYSTAL_BLOCK_DEEPSLATE = REGISTRY.register(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DEEPSLATE.getId().getPath(),
			() -> new ManaCrystalBlockDeepslateDisplayItem(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DEEPSLATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANA_CRYSTAL_BLOCK_DIORITE = REGISTRY.register(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DIORITE.getId().getPath(),
			() -> new ManaCrystalBlockDioriteDisplayItem(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DIORITE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANA_CRYSTAL_BLOCK_GRANITE = REGISTRY.register(SlsbModBlocks.MANA_CRYSTAL_BLOCK_GRANITE.getId().getPath(),
			() -> new ManaCrystalBlockGraniteDisplayItem(SlsbModBlocks.MANA_CRYSTAL_BLOCK_GRANITE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANA_CRYSTAL_BLOCK_DRIPSTONE = REGISTRY.register(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DRIPSTONE.getId().getPath(),
			() -> new ManaCrystalBlockDripstoneDisplayItem(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DRIPSTONE.get(), new Item.Properties()));
	public static final RegistryObject<Item> KNIGHT_KILLER = REGISTRY.register("knight_killer", () -> new KnightKillerItem());
	public static final RegistryObject<Item> AWAKENING_ORB = REGISTRY.register(SlsbModBlocks.AWAKENING_ORB.getId().getPath(), () -> new AwakeningOrbDisplayItem(SlsbModBlocks.AWAKENING_ORB.get(), new Item.Properties()));
	public static final RegistryObject<Item> DRIPSTONE_DUNGEON_NORTH = block(SlsbModBlocks.DRIPSTONE_DUNGEON_NORTH);
	public static final RegistryObject<Item> DRIPSTONE_DUNGEON_SOUTH = block(SlsbModBlocks.DRIPSTONE_DUNGEON_SOUTH);
	public static final RegistryObject<Item> DRIPSTONE_DUNGEON_EAST = block(SlsbModBlocks.DRIPSTONE_DUNGEON_EAST);
	public static final RegistryObject<Item> DRIPSTONE_DUNGEON_WEST = block(SlsbModBlocks.DRIPSTONE_DUNGEON_WEST);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
