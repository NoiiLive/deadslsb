package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MarkProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.getPersistentData().putString("markedowner", (sourceentity.getDisplayName().getString()));
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7c\u00A7lMarked : " + entity.getDisplayName().getString())), true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.cast_spell")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker.cast_spell")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANTED_HIT, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 10, 1, 1, 1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANT, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 10, 1, 1, 1, 0.1);
	}
}
