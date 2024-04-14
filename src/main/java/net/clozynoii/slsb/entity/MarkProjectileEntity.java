
package net.clozynoii.slsb.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class MarkProjectileEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public MarkProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(SlsbModEntities.MARK_PROJECTILE.get(), world);
	}

	public MarkProjectileEntity(EntityType<? extends MarkProjectileEntity> type, Level world) {
		super(type, world);
	}

	public MarkProjectileEntity(EntityType<? extends MarkProjectileEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public MarkProjectileEntity(EntityType<? extends MarkProjectileEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		MarkProjectileProjectileHitsLivingEntityProcedure.execute(this.level(), entityHitResult.getEntity(), this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static MarkProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 2f, 0, 0);
	}

	public static MarkProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		MarkProjectileEntity entityarrow = new MarkProjectileEntity(SlsbModEntities.MARK_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static MarkProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		MarkProjectileEntity entityarrow = new MarkProjectileEntity(SlsbModEntities.MARK_PROJECTILE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
