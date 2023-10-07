
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

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

import com.dude.prehistoricworld.entity.SyringocrinusEntity;
import com.dude.prehistoricworld.entity.ProconodontusEntity;
import com.dude.prehistoricworld.entity.AjkaceratopsEntity;
import com.dude.prehistoricworld.PrehistoricWorldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrehistoricWorldModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PrehistoricWorldMod.MODID);
	public static final RegistryObject<EntityType<ProconodontusEntity>> PROCONODONTUS = register("proconodontus",
			EntityType.Builder.<ProconodontusEntity>of(ProconodontusEntity::new, MobCategory.UNDERGROUND_WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProconodontusEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<SyringocrinusEntity>> SYRINGOCRINUS = register("syringocrinus",
			EntityType.Builder.<SyringocrinusEntity>of(SyringocrinusEntity::new, MobCategory.UNDERGROUND_WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SyringocrinusEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<AjkaceratopsEntity>> AJKACERATOPS = register("ajkaceratops",
			EntityType.Builder.<AjkaceratopsEntity>of(AjkaceratopsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AjkaceratopsEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ProconodontusEntity.init();
			SyringocrinusEntity.init();
			AjkaceratopsEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PROCONODONTUS.get(), ProconodontusEntity.createAttributes().build());
		event.put(SYRINGOCRINUS.get(), SyringocrinusEntity.createAttributes().build());
		event.put(AJKACERATOPS.get(), AjkaceratopsEntity.createAttributes().build());
	}
}
