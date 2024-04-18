package net.clozynoii.slsb.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.arguments.EntityAnchorArgument;

public class WindBarrierMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if (entity.getPersistentData().getDouble("windbarriertick") < 4) {
				entity.getPersistentData().putDouble("windbarriertick", (entity.getPersistentData().getDouble("windbarriertick") + 0.2));
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 80, 3, (entity.getPersistentData().getDouble("windbarriertick")), 0.01, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 5, 3, (entity.getPersistentData().getDouble("windbarriertick")), 0.01, 0);
			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX()), ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY()),
					((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ())));
		}
	}
}
