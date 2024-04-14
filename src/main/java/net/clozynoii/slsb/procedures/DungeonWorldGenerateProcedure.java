package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

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

private static void execute(
@Nullable Event event,
LevelAccessor world,
ResourceKey<Level> dimension,
Entity entity
) {
if(
dimension == null ||
entity == null
) return ;
SlsbMod.queueServerWork(1, () -> {
if (dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("slsb:dungeon_world")))
) {if (==true) {entity.getPersistentData().putBoolean("GenerateDungeon", true);SlsbMod.queueServerWork(200, () -> {
});
}SlsbMod.LOGGER.debug("Dungeon Entered");}
});
}
}
