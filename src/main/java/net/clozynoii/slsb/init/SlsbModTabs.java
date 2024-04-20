
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.clozynoii.slsb.SlsbMod;

public class SlsbModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SlsbMod.MODID);
	public static final RegistryObject<CreativeModeTab> SOLO_LEVELING_ITEMS = REGISTRY.register("solo_leveling_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.slsb.solo_leveling_items")).icon(() -> new ItemStack(SlsbModItems.MANA_CRYSTAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SlsbModItems.MANA_CRYSTAL.get());
				tabData.accept(SlsbModItems.E_RANK_ESSENCE_STONE.get());
				tabData.accept(SlsbModItems.D_RANK_ESSENCE_STONE.get());
				tabData.accept(SlsbModItems.C_RANK_ESSENCE_STONE.get());
				tabData.accept(SlsbModItems.B_RANK_ESSENCE_STONE.get());
				tabData.accept(SlsbModItems.A_RANK_ESSENCE_STONE.get());
				tabData.accept(SlsbModItems.S_RANK_ESSENCE_STONE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SOLO_LEVELING_BLOCKS = REGISTRY.register("solo_leveling_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.slsb.solo_leveling_blocks")).icon(() -> new ItemStack(SlsbModBlocks.MANA_CRYSTAL_BLOCK_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SlsbModBlocks.MANA_CRYSTAL_BLOCK_STONE.get().asItem());
				tabData.accept(SlsbModBlocks.MANA_CRYSTAL_BLOCK_PURE.get().asItem());
				tabData.accept(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DEEPSLATE.get().asItem());
				tabData.accept(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DIORITE.get().asItem());
				tabData.accept(SlsbModBlocks.MANA_CRYSTAL_BLOCK_GRANITE.get().asItem());
				tabData.accept(SlsbModBlocks.MANA_CRYSTAL_BLOCK_DRIPSTONE.get().asItem());
				tabData.accept(SlsbModBlocks.AWAKENING_ORB.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SOLO_LEVELING_WEAPONS = REGISTRY.register("solo_leveling_weapons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.slsb.solo_leveling_weapons")).icon(() -> new ItemStack(SlsbModItems.KASAKAS_VENOM_FANG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SlsbModItems.KASAKAS_VENOM_FANG.get());
				tabData.accept(SlsbModItems.KNIGHT_KILLER.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SOLO_LEVELING_MAGIC_BEASTS = REGISTRY.register("solo_leveling_magic_beasts",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.slsb.solo_leveling_magic_beasts")).icon(() -> new ItemStack(SlsbModItems.GIANT_RAT_BOSS_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SlsbModItems.GIANT_RAT_SPAWN_EGG.get());
				tabData.accept(SlsbModItems.GIANT_RAT_BOSS_SPAWN_EGG.get());
			})

					.build());
}
