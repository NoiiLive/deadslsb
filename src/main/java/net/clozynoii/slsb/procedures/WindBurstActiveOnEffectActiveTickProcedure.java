package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WindBurstActiveOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 100, (entity.getPersistentData().getDouble("bubbleexpand")), (entity.getPersistentData().getDouble("bubbleexpand")), (entity.getPersistentData().getDouble("bubbleexpand")), 0.01);
		entity.getPersistentData().putDouble("bubbleexpand", (entity.getPersistentData().getDouble("bubbleexpand") + 0.3));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("bubbleexpand") * 2) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.setDeltaMovement(new Vec3(1.5, 0.5, 1.5));
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK), entity), 5);
				}
			}
		}
	}
}
