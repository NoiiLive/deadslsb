package net.clozynoii.slsb.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.clozynoii.slsb.network.SlsbModVariables;
import net.clozynoii.slsb.SlsbMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DungeonWorldGenerateProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getEntity().level(), event.getDimension(), event.getEntity());
	}

	public static void execute(LevelAccessor world, ResourceKey<Level> dimension, Entity entity) {
		execute(null, world, dimension, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, ResourceKey<Level> dimension, Entity entity) {
		if (dimension == null || entity == null)
			return;
		SlsbMod.queueServerWork(1, () -> {
			if (dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:rat_dungeon"))) || dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:mine_dungeon")))
					|| dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:forest_dungeon"))) || dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:hapjeong_dungeon")))
					|| dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:double_dungeon"))) || dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:catacomb_dungeon")))) {
				if ((entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SlsbModVariables.PlayerVariables())).DungeonGenerate == true) {
					entity.getPersistentData().putBoolean("GenerateDungeon", true);
					SlsbModVariables.MapVariables.get(world).DungeonEntranceTimer = 400;
					SlsbModVariables.MapVariables.get(world).syncData(world);
					{
						double _setval = 400;
						entity.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DungeonEnterTimerPlayer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				SlsbMod.LOGGER.debug("Dungeon Entered");
			}
		});
	}
}
