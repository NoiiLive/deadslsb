package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CollapseActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		degree = Math.toRadians(entity.getYRot());
		xRadius = entity.getPersistentData().getDouble("xincrease");
		zRadius = entity.getPersistentData().getDouble("zincrease");
		for (int index0 = 0; index0 < 36; index0++) {
			x_pos = x + Math.cos(degree) * xRadius;
			y_pos = y + 0.1;
			z_pos = z + Math.sin(degree) * zRadius;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x_pos, y_pos, z_pos, 1, 0.1, 0.1, 0.1, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x_pos, y_pos, z_pos, 1, 0.1, 0.1, 0.1, 0.3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x_pos, y_pos, z_pos, 1, 0.1, 0.1, 0.1, 0.3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.attack_impact")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.attack_impact")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				final Vec3 _center = new Vec3(x_pos, y_pos, z_pos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.EXPLOSION), entity), 10);
						entityiterator.setDeltaMovement(new Vec3(((entity.getX() + entityiterator.getX()) / 19), ((entity.getY() + entityiterator.getY()) / 19), ((entity.getZ() + entityiterator.getZ()) / 19)));
					}
				}
			}
			degree = degree + Math.toRadians(5);
		}
		degree = Math.toRadians(entity.getYRot());
		xRadius = entity.getPersistentData().getDouble("xdecrease");
		zRadius = entity.getPersistentData().getDouble("zdecrease");
		for (int index1 = 0; index1 < 36; index1++) {
			x_pos = x + Math.cos(degree) * xRadius;
			y_pos = y + 0.1;
			z_pos = z + Math.sin(degree) * zRadius;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x_pos, y_pos, z_pos, 1, 0.1, 0.1, 0.1, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x_pos, y_pos, z_pos, 1, 0.1, 0.1, 0.1, 0.3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x_pos, y_pos, z_pos, 1, 0.1, 0.1, 0.1, 0.3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.attack_impact")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.attack_impact")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				final Vec3 _center = new Vec3(x_pos, y_pos, z_pos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.EXPLOSION), entity), 10);
						entityiterator.setDeltaMovement(new Vec3(((entity.getX() + entityiterator.getX()) / 19), ((entity.getY() + entityiterator.getY()) / 19), ((entity.getZ() + entityiterator.getZ()) / 19)));
					}
				}
			}
			degree = degree + Math.toRadians(5);
		}
		entity.getPersistentData().putDouble("xincrease", (entity.getPersistentData().getDouble("xincrease") + 0.3));
		entity.getPersistentData().putDouble("zincrease", (entity.getPersistentData().getDouble("zincrease") + 0.3));
		entity.getPersistentData().putDouble("zdecrease", (entity.getPersistentData().getDouble("zdecrease") - 0.3));
		entity.getPersistentData().putDouble("xdecrease", (entity.getPersistentData().getDouble("xdecrease") - 0.3));
	}
}
