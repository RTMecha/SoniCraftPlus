
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

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

import net.mcreator.sonicraft_plus.entity.YellowWisponProjectileEntity;
import net.mcreator.sonicraft_plus.entity.YellowWispEntity;
import net.mcreator.sonicraft_plus.entity.WisponCubeTrapEntity;
import net.mcreator.sonicraft_plus.entity.WhiteWisponProjectileEntity;
import net.mcreator.sonicraft_plus.entity.WhiteWispEntity;
import net.mcreator.sonicraft_plus.entity.VoidWisponProjectileEntity;
import net.mcreator.sonicraft_plus.entity.VioletWisponProjectileEntity;
import net.mcreator.sonicraft_plus.entity.VioletWispEntity;
import net.mcreator.sonicraft_plus.entity.SallyAcornEntity;
import net.mcreator.sonicraft_plus.entity.RedWisponProjectileEntity;
import net.mcreator.sonicraft_plus.entity.RedWispEntity;
import net.mcreator.sonicraft_plus.entity.RayGlidingEntity;
import net.mcreator.sonicraft_plus.entity.RayEntity;
import net.mcreator.sonicraft_plus.entity.PurpleWispEntity;
import net.mcreator.sonicraft_plus.entity.PinkWispEntity;
import net.mcreator.sonicraft_plus.entity.OrangeWispEntity;
import net.mcreator.sonicraft_plus.entity.NewtronblueEntity;
import net.mcreator.sonicraft_plus.entity.NewtronEntity;
import net.mcreator.sonicraft_plus.entity.MiningTowerEntity;
import net.mcreator.sonicraft_plus.entity.MightyHammerDropEntity;
import net.mcreator.sonicraft_plus.entity.MightyEntity;
import net.mcreator.sonicraft_plus.entity.MightyBallEntity;
import net.mcreator.sonicraft_plus.entity.JadeWispEntity;
import net.mcreator.sonicraft_plus.entity.GreenWisponProjectileEntity;
import net.mcreator.sonicraft_plus.entity.GreenWispEntity;
import net.mcreator.sonicraft_plus.entity.CyanWispEntity;
import net.mcreator.sonicraft_plus.entity.CosmoEntity;
import net.mcreator.sonicraft_plus.entity.BombEntity;
import net.mcreator.sonicraft_plus.entity.BlueWispEntity;
import net.mcreator.sonicraft_plus.entity.BlueWispChangeTriggerEntity;
import net.mcreator.sonicraft_plus.SonicraftPlusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SonicraftPlusModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SonicraftPlusMod.MODID);
	public static final RegistryObject<EntityType<CosmoEntity>> COSMO = register("cosmo",
			EntityType.Builder.<CosmoEntity>of(CosmoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CosmoEntity::new)

					.sized(0.6f, 1.1f));
	public static final RegistryObject<EntityType<SallyAcornEntity>> SALLY_ACORN = register("sally_acorn",
			EntityType.Builder.<SallyAcornEntity>of(SallyAcornEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SallyAcornEntity::new)

					.sized(0.6f, 1.1f));
	public static final RegistryObject<EntityType<WhiteWispEntity>> WHITE_WISP = register("white_wisp",
			EntityType.Builder.<WhiteWispEntity>of(WhiteWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<CyanWispEntity>> CYAN_WISP = register("cyan_wisp",
			EntityType.Builder.<CyanWispEntity>of(CyanWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CyanWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<YellowWispEntity>> YELLOW_WISP = register("yellow_wisp",
			EntityType.Builder.<YellowWispEntity>of(YellowWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YellowWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<OrangeWispEntity>> ORANGE_WISP = register("orange_wisp", EntityType.Builder.<OrangeWispEntity>of(OrangeWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(OrangeWispEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<RedWispEntity>> RED_WISP = register("red_wisp",
			EntityType.Builder.<RedWispEntity>of(RedWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedWispEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<VioletWispEntity>> VIOLET_WISP = register("violet_wisp",
			EntityType.Builder.<VioletWispEntity>of(VioletWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VioletWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<MiningTowerEntity>> MINING_TOWER = register("mining_tower", EntityType.Builder.<MiningTowerEntity>of(MiningTowerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MiningTowerEntity::new).fireImmune().sized(13.5f, 32f));
	public static final RegistryObject<EntityType<MightyEntity>> MIGHTY = register("mighty",
			EntityType.Builder.<MightyEntity>of(MightyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MightyEntity::new)

					.sized(0.5f, 0.9f));
	public static final RegistryObject<EntityType<MightyBallEntity>> MIGHTY_BALL = register("mighty_ball", EntityType.Builder.<MightyBallEntity>of(MightyBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(MightyBallEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<MightyHammerDropEntity>> MIGHTY_HAMMER_DROP = register("mighty_hammer_drop", EntityType.Builder.<MightyHammerDropEntity>of(MightyHammerDropEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MightyHammerDropEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<RayEntity>> RAY = register("ray",
			EntityType.Builder.<RayEntity>of(RayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RayEntity::new)

					.sized(0.5f, 0.9f));
	public static final RegistryObject<EntityType<RayGlidingEntity>> RAY_GLIDING = register("ray_gliding",
			EntityType.Builder.<RayGlidingEntity>of(RayGlidingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RayGlidingEntity::new)

					.sized(0.5f, 0.9f));
	public static final RegistryObject<EntityType<BlueWispChangeTriggerEntity>> BLUE_WISP_CHANGE_TRIGGER = register("blue_wisp_change_trigger", EntityType.Builder.<BlueWispChangeTriggerEntity>of(BlueWispChangeTriggerEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueWispChangeTriggerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlueWispEntity>> BLUE_WISP = register("blue_wisp",
			EntityType.Builder.<BlueWispEntity>of(BlueWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<GreenWispEntity>> GREEN_WISP = register("green_wisp",
			EntityType.Builder.<GreenWispEntity>of(GreenWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<PinkWispEntity>> PINK_WISP = register("pink_wisp",
			EntityType.Builder.<PinkWispEntity>of(PinkWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PinkWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<PurpleWispEntity>> PURPLE_WISP = register("purple_wisp",
			EntityType.Builder.<PurpleWispEntity>of(PurpleWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PurpleWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<VoidWisponProjectileEntity>> VOID_WISPON_PROJECTILE = register("void_wispon_projectile", EntityType.Builder.<VoidWisponProjectileEntity>of(VoidWisponProjectileEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VoidWisponProjectileEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<WisponCubeTrapEntity>> WISPON_CUBE_TRAP = register("wispon_cube_trap", EntityType.Builder.<WisponCubeTrapEntity>of(WisponCubeTrapEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WisponCubeTrapEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JadeWispEntity>> JADE_WISP = register("jade_wisp",
			EntityType.Builder.<JadeWispEntity>of(JadeWispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JadeWispEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<WhiteWisponProjectileEntity>> WHITE_WISPON_PROJECTILE = register("white_wispon_projectile", EntityType.Builder.<WhiteWisponProjectileEntity>of(WhiteWisponProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WhiteWisponProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RedWisponProjectileEntity>> RED_WISPON_PROJECTILE = register("red_wispon_projectile", EntityType.Builder.<RedWisponProjectileEntity>of(RedWisponProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RedWisponProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YellowWisponProjectileEntity>> YELLOW_WISPON_PROJECTILE = register("yellow_wispon_projectile", EntityType.Builder.<YellowWisponProjectileEntity>of(YellowWisponProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(YellowWisponProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GreenWisponProjectileEntity>> GREEN_WISPON_PROJECTILE = register("green_wispon_projectile", EntityType.Builder.<GreenWisponProjectileEntity>of(GreenWisponProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GreenWisponProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VioletWisponProjectileEntity>> VIOLET_WISPON_PROJECTILE = register("violet_wispon_projectile", EntityType.Builder.<VioletWisponProjectileEntity>of(VioletWisponProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(VioletWisponProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NewtronEntity>> NEWTRON = register("newtron",
			EntityType.Builder.<NewtronEntity>of(NewtronEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NewtronEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NewtronblueEntity>> NEWTRONBLUE = register("newtronblue",
			EntityType.Builder.<NewtronblueEntity>of(NewtronblueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NewtronblueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BombEntity>> BOMB = register("bomb",
			EntityType.Builder.<BombEntity>of(BombEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BombEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CosmoEntity.init();
			SallyAcornEntity.init();
			WhiteWispEntity.init();
			CyanWispEntity.init();
			YellowWispEntity.init();
			OrangeWispEntity.init();
			RedWispEntity.init();
			VioletWispEntity.init();
			MiningTowerEntity.init();
			MightyEntity.init();
			MightyBallEntity.init();
			MightyHammerDropEntity.init();
			RayEntity.init();
			RayGlidingEntity.init();
			BlueWispChangeTriggerEntity.init();
			BlueWispEntity.init();
			GreenWispEntity.init();
			PinkWispEntity.init();
			PurpleWispEntity.init();
			VoidWisponProjectileEntity.init();
			WisponCubeTrapEntity.init();
			JadeWispEntity.init();
			NewtronEntity.init();
			NewtronblueEntity.init();
			BombEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COSMO.get(), CosmoEntity.createAttributes().build());
		event.put(SALLY_ACORN.get(), SallyAcornEntity.createAttributes().build());
		event.put(WHITE_WISP.get(), WhiteWispEntity.createAttributes().build());
		event.put(CYAN_WISP.get(), CyanWispEntity.createAttributes().build());
		event.put(YELLOW_WISP.get(), YellowWispEntity.createAttributes().build());
		event.put(ORANGE_WISP.get(), OrangeWispEntity.createAttributes().build());
		event.put(RED_WISP.get(), RedWispEntity.createAttributes().build());
		event.put(VIOLET_WISP.get(), VioletWispEntity.createAttributes().build());
		event.put(MINING_TOWER.get(), MiningTowerEntity.createAttributes().build());
		event.put(MIGHTY.get(), MightyEntity.createAttributes().build());
		event.put(MIGHTY_BALL.get(), MightyBallEntity.createAttributes().build());
		event.put(MIGHTY_HAMMER_DROP.get(), MightyHammerDropEntity.createAttributes().build());
		event.put(RAY.get(), RayEntity.createAttributes().build());
		event.put(RAY_GLIDING.get(), RayGlidingEntity.createAttributes().build());
		event.put(BLUE_WISP_CHANGE_TRIGGER.get(), BlueWispChangeTriggerEntity.createAttributes().build());
		event.put(BLUE_WISP.get(), BlueWispEntity.createAttributes().build());
		event.put(GREEN_WISP.get(), GreenWispEntity.createAttributes().build());
		event.put(PINK_WISP.get(), PinkWispEntity.createAttributes().build());
		event.put(PURPLE_WISP.get(), PurpleWispEntity.createAttributes().build());
		event.put(VOID_WISPON_PROJECTILE.get(), VoidWisponProjectileEntity.createAttributes().build());
		event.put(WISPON_CUBE_TRAP.get(), WisponCubeTrapEntity.createAttributes().build());
		event.put(JADE_WISP.get(), JadeWispEntity.createAttributes().build());
		event.put(NEWTRON.get(), NewtronEntity.createAttributes().build());
		event.put(NEWTRONBLUE.get(), NewtronblueEntity.createAttributes().build());
		event.put(BOMB.get(), BombEntity.createAttributes().build());
	}
}
