
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.clozynoii.slsb.entity.WindSliceProjectileEntity;
import net.clozynoii.slsb.entity.WindBarrierMobEntity;
import net.clozynoii.slsb.entity.GiantRatGreyEntity;
import net.clozynoii.slsb.entity.AfterImageEntity;
import net.clozynoii.slsb.SlsbMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlsbModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SlsbMod.MODID);
	public static final RegistryObject<EntityType<AfterImageEntity>> AFTER_IMAGE = register("after_image", EntityType.Builder.<AfterImageEntity>of(AfterImageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(AfterImageEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GiantRatGreyEntity>> GIANT_RAT_GREY = register("giant_rat_grey",
			EntityType.Builder.<GiantRatGreyEntity>of(GiantRatGreyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantRatGreyEntity::new)

					.sized(1.5f, 1f));
	public static final RegistryObject<EntityType<WindSliceProjectileEntity>> WIND_SLICE_PROJECTILE = register("projectile_wind_slice_projectile", EntityType.Builder.<WindSliceProjectileEntity>of(WindSliceProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WindSliceProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WindBarrierMobEntity>> WIND_BARRIER_MOB = register("wind_barrier_mob", EntityType.Builder.<WindBarrierMobEntity>of(WindBarrierMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WindBarrierMobEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AfterImageEntity.init();
			GiantRatGreyEntity.init();
			WindBarrierMobEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(AFTER_IMAGE.get(), AfterImageEntity.createAttributes().build());
		event.put(GIANT_RAT_GREY.get(), GiantRatGreyEntity.createAttributes().build());
		event.put(WIND_BARRIER_MOB.get(), WindBarrierMobEntity.createAttributes().build());
	}
}
