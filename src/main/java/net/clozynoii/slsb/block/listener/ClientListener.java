package net.clozynoii.slsb.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.clozynoii.slsb.init.SlsbModBlockEntities;
import net.clozynoii.slsb.block.renderer.RedGateSmallTileRenderer;
import net.clozynoii.slsb.block.renderer.RedGateMediumTileRenderer;
import net.clozynoii.slsb.block.renderer.ManaCrystalBlockStoneTileRenderer;
import net.clozynoii.slsb.block.renderer.ManaCrystalBlockPureTileRenderer;
import net.clozynoii.slsb.block.renderer.ManaCrystalBlockGraniteTileRenderer;
import net.clozynoii.slsb.block.renderer.ManaCrystalBlockDripstoneTileRenderer;
import net.clozynoii.slsb.block.renderer.ManaCrystalBlockDioriteTileRenderer;
import net.clozynoii.slsb.block.renderer.ManaCrystalBlockDeepslateTileRenderer;
import net.clozynoii.slsb.block.renderer.BlueGateSmallTileRenderer;
import net.clozynoii.slsb.block.renderer.BlueGateMediumTileRenderer;
import net.clozynoii.slsb.block.renderer.AwakeningOrbTileRenderer;
import net.clozynoii.slsb.SlsbMod;

@Mod.EventBusSubscriber(modid = SlsbMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(SlsbModBlockEntities.BLUE_GATE_SMALL.get(), context -> new BlueGateSmallTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.RED_GATE_SMALL.get(), context -> new RedGateSmallTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.BLUE_GATE_MEDIUM.get(), context -> new BlueGateMediumTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.MANA_CRYSTAL_BLOCK_STONE.get(), context -> new ManaCrystalBlockStoneTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.MANA_CRYSTAL_BLOCK_PURE.get(), context -> new ManaCrystalBlockPureTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.MANA_CRYSTAL_BLOCK_DEEPSLATE.get(), context -> new ManaCrystalBlockDeepslateTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.MANA_CRYSTAL_BLOCK_DIORITE.get(), context -> new ManaCrystalBlockDioriteTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.MANA_CRYSTAL_BLOCK_GRANITE.get(), context -> new ManaCrystalBlockGraniteTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.MANA_CRYSTAL_BLOCK_DRIPSTONE.get(), context -> new ManaCrystalBlockDripstoneTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.AWAKENING_ORB.get(), context -> new AwakeningOrbTileRenderer());
		event.registerBlockEntityRenderer(SlsbModBlockEntities.RED_GATE_MEDIUM.get(), context -> new RedGateMediumTileRenderer());
	}
}
