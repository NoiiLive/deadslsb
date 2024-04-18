
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.clozynoii.slsb.item.TestItem;
import net.clozynoii.slsb.item.ManaCrystalItem;
import net.clozynoii.slsb.item.KnightKillerItem;
import net.clozynoii.slsb.item.KasakasVenomFangItem;
import net.clozynoii.slsb.block.display.RedGateSmallDisplayItem;
import net.clozynoii.slsb.block.display.RedGateMediumDisplayItem;
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
	public static final RegistryObject<Item> RAT_DUNGEON_NORTH = block(SlsbModBlocks.RAT_DUNGEON_NORTH);
	public static final RegistryObject<Item> RAT_DUNGEON_EAST = block(SlsbModBlocks.RAT_DUNGEON_EAST);
	public static final RegistryObject<Item> RAT_DUNGEON_SOUTH = block(SlsbModBlocks.RAT_DUNGEON_SOUTH);
	public static final RegistryObject<Item> RAT_DUNGEON_WEST = block(SlsbModBlocks.RAT_DUNGEON_WEST);
	public static final RegistryObject<Item> MINE_DUNGEON_NORTH = block(SlsbModBlocks.MINE_DUNGEON_NORTH);
	public static final RegistryObject<Item> MINE_DUNGEON_EAST = block(SlsbModBlocks.MINE_DUNGEON_EAST);
	public static final RegistryObject<Item> MINE_DUNGEON_SOUTH = block(SlsbModBlocks.MINE_DUNGEON_SOUTH);
	public static final RegistryObject<Item> MINE_DUNGEON_WEST = block(SlsbModBlocks.MINE_DUNGEON_WEST);
	public static final RegistryObject<Item> FOREST_DUNGEON_NORTH = block(SlsbModBlocks.FOREST_DUNGEON_NORTH);
	public static final RegistryObject<Item> FOREST_DUNGEON_EAST = block(SlsbModBlocks.FOREST_DUNGEON_EAST);
	public static final RegistryObject<Item> FOREST_DUNGEON_SOUTH = block(SlsbModBlocks.FOREST_DUNGEON_SOUTH);
	public static final RegistryObject<Item> FOREST_DUNGEON_WEST = block(SlsbModBlocks.FOREST_DUNGEON_WEST);
	public static final RegistryObject<Item> SUBWAY_DUNGEON_NORTH = block(SlsbModBlocks.SUBWAY_DUNGEON_NORTH);
	public static final RegistryObject<Item> SUBWAY_DUNGEON_EAST = block(SlsbModBlocks.SUBWAY_DUNGEON_EAST);
	public static final RegistryObject<Item> SUBWAY_DUNGEON_SOUTH = block(SlsbModBlocks.SUBWAY_DUNGEON_SOUTH);
	public static final RegistryObject<Item> SUBWAY_DUNGEON_WEST = block(SlsbModBlocks.SUBWAY_DUNGEON_WEST);
	public static final RegistryObject<Item> RAT_DUNGEON_ENEMIES = block(SlsbModBlocks.RAT_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> RAT_DUNGEON_BOSS = block(SlsbModBlocks.RAT_DUNGEON_BOSS);
	public static final RegistryObject<Item> MINE_DUNGEON_ENEMIES = block(SlsbModBlocks.MINE_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> MINE_DUNGEON_BOSS = block(SlsbModBlocks.MINE_DUNGEON_BOSS);
	public static final RegistryObject<Item> FOREST_DUNGEON_ENEMIES = block(SlsbModBlocks.FOREST_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> FOREST_DUNGEON_BOSS = block(SlsbModBlocks.FOREST_DUNGEON_BOSS);
	public static final RegistryObject<Item> SUBWAY_DUNGEON_ENEMIES = block(SlsbModBlocks.SUBWAY_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> SUBWAY_DUNGEON_BOSS = block(SlsbModBlocks.SUBWAY_DUNGEON_BOSS);
	public static final RegistryObject<Item> CATACOMB_DUNGEON_NORTH = block(SlsbModBlocks.CATACOMB_DUNGEON_NORTH);
	public static final RegistryObject<Item> CATACOMB_DUNGEON_EAST = block(SlsbModBlocks.CATACOMB_DUNGEON_EAST);
	public static final RegistryObject<Item> CATACOMB_DUNGEON_SOUTH = block(SlsbModBlocks.CATACOMB_DUNGEON_SOUTH);
	public static final RegistryObject<Item> CATACOMB_DUNGEON_WEST = block(SlsbModBlocks.CATACOMB_DUNGEON_WEST);
	public static final RegistryObject<Item> CATACOMB_DUNGEON_ENEMIES = block(SlsbModBlocks.CATACOMB_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> CATACOMB_DUNGEON_BOSS = block(SlsbModBlocks.CATACOMB_DUNGEON_BOSS);
	public static final RegistryObject<Item> SPIDER_DUNGEON_NORTH = block(SlsbModBlocks.SPIDER_DUNGEON_NORTH);
	public static final RegistryObject<Item> SPIDER_DUNGEON_EAST = block(SlsbModBlocks.SPIDER_DUNGEON_EAST);
	public static final RegistryObject<Item> SPIDER_DUNGEON_SOUTH = block(SlsbModBlocks.SPIDER_DUNGEON_SOUTH);
	public static final RegistryObject<Item> SPIDER_DUNGEON_WEST = block(SlsbModBlocks.SPIDER_DUNGEON_WEST);
	public static final RegistryObject<Item> SPIDER_DUNGEON_ENEMIES = block(SlsbModBlocks.SPIDER_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> SPIDER_DUNGEON_BOSS = block(SlsbModBlocks.SPIDER_DUNGEON_BOSS);
	public static final RegistryObject<Item> SUNKEN_DUNGEON_NORTH = block(SlsbModBlocks.SUNKEN_DUNGEON_NORTH);
	public static final RegistryObject<Item> SUNKEN_DUNGEON_EAST = block(SlsbModBlocks.SUNKEN_DUNGEON_EAST);
	public static final RegistryObject<Item> SUNKEN_DUNGEON_SOUTH = block(SlsbModBlocks.SUNKEN_DUNGEON_SOUTH);
	public static final RegistryObject<Item> SUNKEN_DUNGEON_WEST = block(SlsbModBlocks.SUNKEN_DUNGEON_WEST);
	public static final RegistryObject<Item> SUNKEN_DUNGEON_ENEMIES = block(SlsbModBlocks.SUNKEN_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> SUNKEN_DUNGEON_BOSS = block(SlsbModBlocks.SUNKEN_DUNGEON_BOSS);
	public static final RegistryObject<Item> ICE_DUNGEON_NORTH = block(SlsbModBlocks.ICE_DUNGEON_NORTH);
	public static final RegistryObject<Item> ICE_DUNGEON_EAST = block(SlsbModBlocks.ICE_DUNGEON_EAST);
	public static final RegistryObject<Item> ICE_DUNGEON_SOUTH = block(SlsbModBlocks.ICE_DUNGEON_SOUTH);
	public static final RegistryObject<Item> ICE_DUNGEON_WEST = block(SlsbModBlocks.ICE_DUNGEON_WEST);
	public static final RegistryObject<Item> ICE_DUNGEON_ENEMIES = block(SlsbModBlocks.ICE_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> ICE_DUNGEON_BOSS = block(SlsbModBlocks.ICE_DUNGEON_BOSS);
	public static final RegistryObject<Item> DOUBLE_DUNGEON_NORTH = block(SlsbModBlocks.DOUBLE_DUNGEON_NORTH);
	public static final RegistryObject<Item> DOUBLE_DUNGEON_EAST = block(SlsbModBlocks.DOUBLE_DUNGEON_EAST);
	public static final RegistryObject<Item> DOUBLE_DUNGEON_SOUTH = block(SlsbModBlocks.DOUBLE_DUNGEON_SOUTH);
	public static final RegistryObject<Item> DOUBLE_DUNGEON_WEST = block(SlsbModBlocks.DOUBLE_DUNGEON_WEST);
	public static final RegistryObject<Item> DOUBLE_DUNGEON_ENEMIES = block(SlsbModBlocks.DOUBLE_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> DOUBLE_DUNGEON_BOSS = block(SlsbModBlocks.DOUBLE_DUNGEON_BOSS);
	public static final RegistryObject<Item> LIBRARY_DUNGEON_NORTH = block(SlsbModBlocks.LIBRARY_DUNGEON_NORTH);
	public static final RegistryObject<Item> LIBRARY_DUNGEON_EAST = block(SlsbModBlocks.LIBRARY_DUNGEON_EAST);
	public static final RegistryObject<Item> LIBRARY_DUNGEON_SOUTH = block(SlsbModBlocks.LIBRARY_DUNGEON_SOUTH);
	public static final RegistryObject<Item> LIBRARY_DUNGEON_WEST = block(SlsbModBlocks.LIBRARY_DUNGEON_WEST);
	public static final RegistryObject<Item> LIBRARY_DUNGEON_ENEMIES = block(SlsbModBlocks.LIBRARY_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> LIBRARY_DUNGEON_BOSS = block(SlsbModBlocks.LIBRARY_DUNGEON_BOSS);
	public static final RegistryObject<Item> MAZE_DUNGEON_NORTH = block(SlsbModBlocks.MAZE_DUNGEON_NORTH);
	public static final RegistryObject<Item> MAZE_DUNGEON_EAST = block(SlsbModBlocks.MAZE_DUNGEON_EAST);
	public static final RegistryObject<Item> MAZE_DUNGEON_SOUTH = block(SlsbModBlocks.MAZE_DUNGEON_SOUTH);
	public static final RegistryObject<Item> MAZE_DUNGEON_WEST = block(SlsbModBlocks.MAZE_DUNGEON_WEST);
	public static final RegistryObject<Item> MAZE_DUNGEON_ENEMIES = block(SlsbModBlocks.MAZE_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> MAZE_DUNGEON_BOSS = block(SlsbModBlocks.MAZE_DUNGEON_BOSS);
	public static final RegistryObject<Item> GOBLIN_DUNGEON_NORTH = block(SlsbModBlocks.GOBLIN_DUNGEON_NORTH);
	public static final RegistryObject<Item> GOBLIN_DUNGEON_EAST = block(SlsbModBlocks.GOBLIN_DUNGEON_EAST);
	public static final RegistryObject<Item> GOBLIN_DUNGEON_SOUTH = block(SlsbModBlocks.GOBLIN_DUNGEON_SOUTH);
	public static final RegistryObject<Item> GOBLIN_DUNGEON_WEST = block(SlsbModBlocks.GOBLIN_DUNGEON_WEST);
	public static final RegistryObject<Item> GOBLIN_DUNGEON_ENEMIES = block(SlsbModBlocks.GOBLIN_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> GOBLIN_DUNGEON_BOSS = block(SlsbModBlocks.GOBLIN_DUNGEON_BOSS);
	public static final RegistryObject<Item> SAND_DUNGEON_NORTH = block(SlsbModBlocks.SAND_DUNGEON_NORTH);
	public static final RegistryObject<Item> SAND_DUNGEON_EAST = block(SlsbModBlocks.SAND_DUNGEON_EAST);
	public static final RegistryObject<Item> SAND_DUNGEON_SOUTH = block(SlsbModBlocks.SAND_DUNGEON_SOUTH);
	public static final RegistryObject<Item> SAND_DUNGEON_WEST = block(SlsbModBlocks.SAND_DUNGEON_WEST);
	public static final RegistryObject<Item> SAND_DUNGEON_ENEMIES = block(SlsbModBlocks.SAND_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> SAND_DUNGEON_BOSS = block(SlsbModBlocks.SAND_DUNGEON_BOSS);
	public static final RegistryObject<Item> CRYSTAL_DUNGEON_NORTH = block(SlsbModBlocks.CRYSTAL_DUNGEON_NORTH);
	public static final RegistryObject<Item> CRYSTAL_DUNGEON_EAST = block(SlsbModBlocks.CRYSTAL_DUNGEON_EAST);
	public static final RegistryObject<Item> CRYSTAL_DUNGEON_SOUTH = block(SlsbModBlocks.CRYSTAL_DUNGEON_SOUTH);
	public static final RegistryObject<Item> CRYSTAL_DUNGEON_WEST = block(SlsbModBlocks.CRYSTAL_DUNGEON_WEST);
	public static final RegistryObject<Item> CRYSTAL_DUNGEON_ENEMIES = block(SlsbModBlocks.CRYSTAL_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> CRYSTAL_DUNGEON_BOSS = block(SlsbModBlocks.CRYSTAL_DUNGEON_BOSS);
	public static final RegistryObject<Item> COLISEUM_DUNGEON_NORTH = block(SlsbModBlocks.COLISEUM_DUNGEON_NORTH);
	public static final RegistryObject<Item> COLISEUM_DUNGEON_EAST = block(SlsbModBlocks.COLISEUM_DUNGEON_EAST);
	public static final RegistryObject<Item> COLISEUM_DUNGEON_SOUTH = block(SlsbModBlocks.COLISEUM_DUNGEON_SOUTH);
	public static final RegistryObject<Item> COLISEUM_DUNGEON_WEST = block(SlsbModBlocks.COLISEUM_DUNGEON_WEST);
	public static final RegistryObject<Item> COLISEUM_DUNGEON_ENEMIES = block(SlsbModBlocks.COLISEUM_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> COLISEUM_DUNGEON_BOSS = block(SlsbModBlocks.COLISEUM_DUNGEON_BOSS);
	public static final RegistryObject<Item> ORC_DUNGEON_NORTH = block(SlsbModBlocks.ORC_DUNGEON_NORTH);
	public static final RegistryObject<Item> ORC_DUNGEON_EAST = block(SlsbModBlocks.ORC_DUNGEON_EAST);
	public static final RegistryObject<Item> ORC_DUNGEON_SOUTH = block(SlsbModBlocks.ORC_DUNGEON_SOUTH);
	public static final RegistryObject<Item> ORC_DUNGEON_WEST = block(SlsbModBlocks.ORC_DUNGEON_WEST);
	public static final RegistryObject<Item> ORC_DUNGEON_ENEMIES = block(SlsbModBlocks.ORC_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> ORC_DUNGEON_BOSS = block(SlsbModBlocks.ORC_DUNGEON_BOSS);
	public static final RegistryObject<Item> LICH_DUNGEON_NORTH = block(SlsbModBlocks.LICH_DUNGEON_NORTH);
	public static final RegistryObject<Item> LICH_DUNGEON_EAST = block(SlsbModBlocks.LICH_DUNGEON_EAST);
	public static final RegistryObject<Item> LICH_DUNGEON_SOUTH = block(SlsbModBlocks.LICH_DUNGEON_SOUTH);
	public static final RegistryObject<Item> LICH_DUNGEON_WEST = block(SlsbModBlocks.LICH_DUNGEON_WEST);
	public static final RegistryObject<Item> LICH_DUNGEON_ENEMIES = block(SlsbModBlocks.LICH_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> LICH_DUNGEON_BOSS = block(SlsbModBlocks.LICH_DUNGEON_BOSS);
	public static final RegistryObject<Item> NAGA_DUNGEON_NORTH = block(SlsbModBlocks.NAGA_DUNGEON_NORTH);
	public static final RegistryObject<Item> NAGA_DUNGEON_EAST = block(SlsbModBlocks.NAGA_DUNGEON_EAST);
	public static final RegistryObject<Item> NAGA_DUNGEON_SOUTH = block(SlsbModBlocks.NAGA_DUNGEON_SOUTH);
	public static final RegistryObject<Item> NAGA_DUNGEON_WEST = block(SlsbModBlocks.NAGA_DUNGEON_WEST);
	public static final RegistryObject<Item> NAGA_DUNGEON_ENEMIES = block(SlsbModBlocks.NAGA_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> NAGA_DUNGEON_BOSS = block(SlsbModBlocks.NAGA_DUNGEON_BOSS);
	public static final RegistryObject<Item> DRAGON_DUNGEON_NORTH = block(SlsbModBlocks.DRAGON_DUNGEON_NORTH);
	public static final RegistryObject<Item> DRAGON_DUNGEON_EAST = block(SlsbModBlocks.DRAGON_DUNGEON_EAST);
	public static final RegistryObject<Item> DRAGON_DUNGEON_SOUTH = block(SlsbModBlocks.DRAGON_DUNGEON_SOUTH);
	public static final RegistryObject<Item> DRAGON_DUNGEON_WEST = block(SlsbModBlocks.DRAGON_DUNGEON_WEST);
	public static final RegistryObject<Item> DRAGON_DUNGEON_ENEMIES = block(SlsbModBlocks.DRAGON_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> DRAGON_DUNGEON_BOSS = block(SlsbModBlocks.DRAGON_DUNGEON_BOSS);
	public static final RegistryObject<Item> GIANT_DUNGEON_NORTH = block(SlsbModBlocks.GIANT_DUNGEON_NORTH);
	public static final RegistryObject<Item> GIANT_DUNGEON_EAST = block(SlsbModBlocks.GIANT_DUNGEON_EAST);
	public static final RegistryObject<Item> GIANT_DUNGEON_SOUTH = block(SlsbModBlocks.GIANT_DUNGEON_SOUTH);
	public static final RegistryObject<Item> GIANT_DUNGEON_WEST = block(SlsbModBlocks.GIANT_DUNGEON_WEST);
	public static final RegistryObject<Item> GIANT_DUNGEON_ENEMIES = block(SlsbModBlocks.GIANT_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> GIANT_DUNGEON_BOSS = block(SlsbModBlocks.GIANT_DUNGEON_BOSS);
	public static final RegistryObject<Item> CATHEDRAL_DUNGEON_NORTH = block(SlsbModBlocks.CATHEDRAL_DUNGEON_NORTH);
	public static final RegistryObject<Item> CATHEDRAL_DUNGEON_EAST = block(SlsbModBlocks.CATHEDRAL_DUNGEON_EAST);
	public static final RegistryObject<Item> CATHEDRAL_DUNGEON_SOUTH = block(SlsbModBlocks.CATHEDRAL_DUNGEON_SOUTH);
	public static final RegistryObject<Item> CATHEDRAL_DUNGEON_WEST = block(SlsbModBlocks.CATHEDRAL_DUNGEON_WEST);
	public static final RegistryObject<Item> CATHEDRAL_DUNGEON_ENEMIES = block(SlsbModBlocks.CATHEDRAL_DUNGEON_ENEMIES);
	public static final RegistryObject<Item> CATHEDRAL_DUNGEON_BOSS = block(SlsbModBlocks.CATHEDRAL_DUNGEON_BOSS);
	public static final RegistryObject<Item> RED_GATE_MEDIUM = REGISTRY.register(SlsbModBlocks.RED_GATE_MEDIUM.getId().getPath(), () -> new RedGateMediumDisplayItem(SlsbModBlocks.RED_GATE_MEDIUM.get(), new Item.Properties()));
	public static final RegistryObject<Item> GIANT_RAT_GREY_SPAWN_EGG = REGISTRY.register("giant_rat_grey_spawn_egg", () -> new ForgeSpawnEggItem(SlsbModEntities.GIANT_RAT_GREY, -6710887, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> GIANT_RAT_BROWN_SPAWN_EGG = REGISTRY.register("giant_rat_brown_spawn_egg", () -> new ForgeSpawnEggItem(SlsbModEntities.GIANT_RAT_BROWN, -9024463, -11849172, new Item.Properties()));
	public static final RegistryObject<Item> GIANT_RAT_BLACK_SPAWN_EGG = REGISTRY.register("giant_rat_black_spawn_egg", () -> new ForgeSpawnEggItem(SlsbModEntities.GIANT_RAT_BLACK, -13223612, -15000545, new Item.Properties()));
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
