package net.clozynoii.slsb.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import java.util.ArrayList;

public class SuffocationActiveOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entity.getPersistentData().getString("Attacker")).equals(entityiterator.getDisplayName().getString())) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DRY_OUT), entityiterator), 5);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 20, 1, 1, 1, 0.01);
	}
}
