package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GuardianAttackedProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, double amount) {
		execute(null, world, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, double amount) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SlsbModMobEffects.GUARDIAN.get())) {
			if (!(entity.getPersistentData().getString("Guardian")).isEmpty()) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if ((entity.getPersistentData().getString("Guardian")).equals(entityiterator.getDisplayName().getString())) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), (float) 0.1);
						if (entityiterator instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - amount));
					}
				}
			}
		}
	}
}
