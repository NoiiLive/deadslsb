package net.clozynoii.slsb.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;
import java.util.Comparator;

public class CollapseActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("bubbleexpand", (entity.getPersistentData().getDouble("bubbleexpand") + 0.5));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("bubbleexpand") * 2) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.setDeltaMovement(new Vec3(1.5, 0, 1.5));
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.EXPLOSION), entity), 10);
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 100, (entity.getPersistentData().getDouble("bubbleexpand")), 0.1, (entity.getPersistentData().getDouble("bubbleexpand")), 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, y, z, 100, (entity.getPersistentData().getDouble("bubbleexpand")), 0.1, (entity.getPersistentData().getDouble("bubbleexpand")), 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 50, (entity.getPersistentData().getDouble("bubbleexpand")), 0.1, (entity.getPersistentData().getDouble("bubbleexpand")), 0.01);
	}
}
