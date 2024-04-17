package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.clozynoii.slsb.network.SlsbModVariables;

import java.util.ArrayList;

public class DungeonBossKilledProcedure {
	public static void execute(LevelAccessor world) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			{
				boolean _setval = true;
				entityiterator.getCapability(SlsbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DefeatedBoss = _setval;
					capability.syncPlayerVariables(entityiterator);
				});
			}
			if (entityiterator instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7a\u00A7oDungeon Boss Has Been Defeated!"), true);
		}
	}
}
