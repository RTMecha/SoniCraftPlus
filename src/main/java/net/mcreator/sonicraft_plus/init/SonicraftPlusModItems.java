
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sonicraft_plus.item.YellowWisponItem;
import net.mcreator.sonicraft_plus.item.WisponFrameItem;
import net.mcreator.sonicraft_plus.item.WisponBulletItem;
import net.mcreator.sonicraft_plus.item.WhiteWisponItem;
import net.mcreator.sonicraft_plus.item.VioletWisponItem;
import net.mcreator.sonicraft_plus.item.SonicraftPlusSymbolItem;
import net.mcreator.sonicraft_plus.item.SeedrianSeedItem;
import net.mcreator.sonicraft_plus.item.RedWisponItem;
import net.mcreator.sonicraft_plus.item.RedIronNuggetItem;
import net.mcreator.sonicraft_plus.item.RedIronIngotItem;
import net.mcreator.sonicraft_plus.item.PlanetWispItem;
import net.mcreator.sonicraft_plus.item.GreenWisponItem;
import net.mcreator.sonicraft_plus.item.BlueWisponItem;
import net.mcreator.sonicraft_plus.SonicraftPlusMod;

public class SonicraftPlusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SonicraftPlusMod.MODID);
	public static final RegistryObject<Item> COSMO_FLOWER_POT = block(SonicraftPlusModBlocks.COSMO_FLOWER_POT);
	public static final RegistryObject<Item> SEEDRIAN_SEED = REGISTRY.register("seedrian_seed", () -> new SeedrianSeedItem());
	public static final RegistryObject<Item> COSMO_SPAWN_EGG = REGISTRY.register("cosmo_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.COSMO, -16724992, -39271, new Item.Properties()));
	public static final RegistryObject<Item> SONICRAFT_PLUS_SYMBOL = REGISTRY.register("sonicraft_plus_symbol", () -> new SonicraftPlusSymbolItem());
	public static final RegistryObject<Item> BLUE_SPRING = block(SonicraftPlusModBlocks.BLUE_SPRING);
	public static final RegistryObject<Item> USED_BLUE_SPRING = block(SonicraftPlusModBlocks.USED_BLUE_SPRING);
	public static final RegistryObject<Item> SALLY_ACORN_SPAWN_EGG = REGISTRY.register("sally_acorn_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.SALLY_ACORN, -6266350, -3266006, new Item.Properties()));
	public static final RegistryObject<Item> RED_IRON_INGOT = REGISTRY.register("red_iron_ingot", () -> new RedIronIngotItem());
	public static final RegistryObject<Item> RED_IRON_BLOCK = block(SonicraftPlusModBlocks.RED_IRON_BLOCK);
	public static final RegistryObject<Item> RED_IRON_NUGGET = REGISTRY.register("red_iron_nugget", () -> new RedIronNuggetItem());
	public static final RegistryObject<Item> WHITE_WISP_CAPSULE = block(SonicraftPlusModBlocks.WHITE_WISP_CAPSULE);
	public static final RegistryObject<Item> CYAN_WISP_CAPSULE = block(SonicraftPlusModBlocks.CYAN_WISP_CAPSULE);
	public static final RegistryObject<Item> YELLOW_WISP_CAPSULE = block(SonicraftPlusModBlocks.YELLOW_WISP_CAPSULE);
	public static final RegistryObject<Item> ORANGE_WISP_CAPSULE = block(SonicraftPlusModBlocks.ORANGE_WISP_CAPSULE);
	public static final RegistryObject<Item> RED_WISP_CAPSULE = block(SonicraftPlusModBlocks.RED_WISP_CAPSULE);
	public static final RegistryObject<Item> VIOLET_WISP_CAPSULE = block(SonicraftPlusModBlocks.VIOLET_WISP_CAPSULE);
	public static final RegistryObject<Item> LASER_PRISM = block(SonicraftPlusModBlocks.LASER_PRISM);
	public static final RegistryObject<Item> WISPERITE = block(SonicraftPlusModBlocks.WISPERITE);
	public static final RegistryObject<Item> WISPERITE_GRASS_BLOCK = block(SonicraftPlusModBlocks.WISPERITE_GRASS_BLOCK);
	public static final RegistryObject<Item> SPACE_BRIDGE_FRAME = block(SonicraftPlusModBlocks.SPACE_BRIDGE_FRAME);
	public static final RegistryObject<Item> PLANET_WISP = REGISTRY.register("planet_wisp", () -> new PlanetWispItem());
	public static final RegistryObject<Item> WHITE_WISP_SPAWN_EGG = REGISTRY.register("white_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.WHITE_WISP, -6558238, -5571075, new Item.Properties()));
	public static final RegistryObject<Item> WISPWOOD_WOOD = block(SonicraftPlusModBlocks.WISPWOOD_WOOD);
	public static final RegistryObject<Item> WISPWOOD_LOG = block(SonicraftPlusModBlocks.WISPWOOD_LOG);
	public static final RegistryObject<Item> WISPWOOD_PLANKS = block(SonicraftPlusModBlocks.WISPWOOD_PLANKS);
	public static final RegistryObject<Item> WISPWOOD_LEAVES = block(SonicraftPlusModBlocks.WISPWOOD_LEAVES);
	public static final RegistryObject<Item> WISPWOOD_STAIRS = block(SonicraftPlusModBlocks.WISPWOOD_STAIRS);
	public static final RegistryObject<Item> WISPWOOD_SLAB = block(SonicraftPlusModBlocks.WISPWOOD_SLAB);
	public static final RegistryObject<Item> WISPWOOD_FENCE = block(SonicraftPlusModBlocks.WISPWOOD_FENCE);
	public static final RegistryObject<Item> WISPWOOD_FENCE_GATE = block(SonicraftPlusModBlocks.WISPWOOD_FENCE_GATE);
	public static final RegistryObject<Item> WISPWOOD_DOOR = doubleBlock(SonicraftPlusModBlocks.WISPWOOD_DOOR);
	public static final RegistryObject<Item> WISPWOOD_TRAPDOOR = block(SonicraftPlusModBlocks.WISPWOOD_TRAPDOOR);
	public static final RegistryObject<Item> RED_IRON_BLOCK_STAIRS = block(SonicraftPlusModBlocks.RED_IRON_BLOCK_STAIRS);
	public static final RegistryObject<Item> RED_IRON_BLOCK_SLAB = block(SonicraftPlusModBlocks.RED_IRON_BLOCK_SLAB);
	public static final RegistryObject<Item> RED_IRON_BLOCK_PILLAR = block(SonicraftPlusModBlocks.RED_IRON_BLOCK_PILLAR);
	public static final RegistryObject<Item> RED_IRON_BLOCK_FRAME = block(SonicraftPlusModBlocks.RED_IRON_BLOCK_FRAME);
	public static final RegistryObject<Item> RED_IRON_BLOCK_MESH_FLOOR = block(SonicraftPlusModBlocks.RED_IRON_BLOCK_MESH_FLOOR);
	public static final RegistryObject<Item> RIVETED_IRON_BLOCK = block(SonicraftPlusModBlocks.RIVETED_IRON_BLOCK);
	public static final RegistryObject<Item> RED_IRON_BLOCK_ROBOT = block(SonicraftPlusModBlocks.RED_IRON_BLOCK_ROBOT);
	public static final RegistryObject<Item> RED_IRON_BLOCK_CAUTION = block(SonicraftPlusModBlocks.RED_IRON_BLOCK_CAUTION);
	public static final RegistryObject<Item> GLOWING_RED_IRON_BLOCK = block(SonicraftPlusModBlocks.GLOWING_RED_IRON_BLOCK);
	public static final RegistryObject<Item> WISP_CAPSULE = block(SonicraftPlusModBlocks.WISP_CAPSULE);
	public static final RegistryObject<Item> CYAN_WISP_SPAWN_EGG = REGISTRY.register("cyan_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.CYAN_WISP, -16715631, -13041829, new Item.Properties()));
	public static final RegistryObject<Item> YELLOW_WISP_SPAWN_EGG = REGISTRY.register("yellow_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.YELLOW_WISP, -7154, -617984, new Item.Properties()));
	public static final RegistryObject<Item> ORANGE_WISP_SPAWN_EGG = REGISTRY.register("orange_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.ORANGE_WISP, -234496, -26070, new Item.Properties()));
	public static final RegistryObject<Item> RED_WISP_SPAWN_EGG = REGISTRY.register("red_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.RED_WISP, -59882, -1016064, new Item.Properties()));
	public static final RegistryObject<Item> VIOLET_WISP_SPAWN_EGG = REGISTRY.register("violet_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.VIOLET_WISP, -11665235, -12779383, new Item.Properties()));
	public static final RegistryObject<Item> DARK_IRON_BLOCK = block(SonicraftPlusModBlocks.DARK_IRON_BLOCK);
	public static final RegistryObject<Item> MINING_TOWER_SPAWN_EGG = REGISTRY.register("mining_tower_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.MINING_TOWER, -5234399, -14013910, new Item.Properties()));
	public static final RegistryObject<Item> MINING_TOWER_INTERIOR_CABLE = block(SonicraftPlusModBlocks.MINING_TOWER_INTERIOR_CABLE);
	public static final RegistryObject<Item> MINING_TOWER_INTERIOR_MOTORIZED_CABLE = block(SonicraftPlusModBlocks.MINING_TOWER_INTERIOR_MOTORIZED_CABLE);
	public static final RegistryObject<Item> FAULTY_GLOWING_RED_IRON_BLOCK = block(SonicraftPlusModBlocks.FAULTY_GLOWING_RED_IRON_BLOCK);
	public static final RegistryObject<Item> SERVO_MOTOR_PART = block(SonicraftPlusModBlocks.SERVO_MOTOR_PART);
	public static final RegistryObject<Item> MINING_TOWER_TRAPDOOR = block(SonicraftPlusModBlocks.MINING_TOWER_TRAPDOOR);
	public static final RegistryObject<Item> CHARRED_RED_IRON_BLOCK = block(SonicraftPlusModBlocks.CHARRED_RED_IRON_BLOCK);
	public static final RegistryObject<Item> FRAGILE_CHAOSTONE = block(SonicraftPlusModBlocks.FRAGILE_CHAOSTONE);
	public static final RegistryObject<Item> WISPERITE_BRICKS = block(SonicraftPlusModBlocks.WISPERITE_BRICKS);
	public static final RegistryObject<Item> WISPERITE_BRICK_STAIRS = block(SonicraftPlusModBlocks.WISPERITE_BRICK_STAIRS);
	public static final RegistryObject<Item> WISPERITE_BRICK_SLAB = block(SonicraftPlusModBlocks.WISPERITE_BRICK_SLAB);
	public static final RegistryObject<Item> WISPERITE_BRICK_WALL = block(SonicraftPlusModBlocks.WISPERITE_BRICK_WALL);
	public static final RegistryObject<Item> WISPERITE_BRICK_PILLAR = block(SonicraftPlusModBlocks.WISPERITE_BRICK_PILLAR);
	public static final RegistryObject<Item> CHISELED_WISPERITE_BRICKS = block(SonicraftPlusModBlocks.CHISELED_WISPERITE_BRICKS);
	public static final RegistryObject<Item> FRAGILE_WISPERITE = block(SonicraftPlusModBlocks.FRAGILE_WISPERITE);
	public static final RegistryObject<Item> MIGHTY_SPAWN_EGG = REGISTRY.register("mighty_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.MIGHTY, -5954010, -11579569, new Item.Properties()));
	public static final RegistryObject<Item> RAY_SPAWN_EGG = REGISTRY.register("ray_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.RAY, -668365, -11958043, new Item.Properties()));
	public static final RegistryObject<Item> IRON_INDUSTRIAL_FENCE = block(SonicraftPlusModBlocks.IRON_INDUSTRIAL_FENCE);
	public static final RegistryObject<Item> BLUE_WISP_BLOCK = block(SonicraftPlusModBlocks.BLUE_WISP_BLOCK);
	public static final RegistryObject<Item> BLUE_WISP_RING = block(SonicraftPlusModBlocks.BLUE_WISP_RING);
	public static final RegistryObject<Item> BLUE_WISP_CAPSULE = block(SonicraftPlusModBlocks.BLUE_WISP_CAPSULE);
	public static final RegistryObject<Item> GREEN_WISP_CAPSULE = block(SonicraftPlusModBlocks.GREEN_WISP_CAPSULE);
	public static final RegistryObject<Item> PINK_WISP_CAPSULE = block(SonicraftPlusModBlocks.PINK_WISP_CAPSULE);
	public static final RegistryObject<Item> PURPLE_WISP_CAPSULE = block(SonicraftPlusModBlocks.PURPLE_WISP_CAPSULE);
	public static final RegistryObject<Item> BLUE_WISP_SPAWN_EGG = REGISTRY.register("blue_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.BLUE_WISP, -16768274, -6188803, new Item.Properties()));
	public static final RegistryObject<Item> GREEN_WISP_SPAWN_EGG = REGISTRY.register("green_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.GREEN_WISP, -7869840, -8653217, new Item.Properties()));
	public static final RegistryObject<Item> PINK_WISP_SPAWN_EGG = REGISTRY.register("pink_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.PINK_WISP, -950043, -891207, new Item.Properties()));
	public static final RegistryObject<Item> PURPLE_WISP_SPAWN_EGG = REGISTRY.register("purple_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.PURPLE_WISP, -6475040, -8773709, new Item.Properties()));
	public static final RegistryObject<Item> WISPON_WORKBENCH = block(SonicraftPlusModBlocks.WISPON_WORKBENCH);
	public static final RegistryObject<Item> WISPON_BULLET = REGISTRY.register("wispon_bullet", () -> new WisponBulletItem());
	public static final RegistryObject<Item> WISPON_FRAME = REGISTRY.register("wispon_frame", () -> new WisponFrameItem());
	public static final RegistryObject<Item> BLUE_WISPON = REGISTRY.register("blue_wispon", () -> new BlueWisponItem());
	public static final RegistryObject<Item> JADE_WISP_CAPSULE = block(SonicraftPlusModBlocks.JADE_WISP_CAPSULE);
	public static final RegistryObject<Item> JADE_WISP_SPAWN_EGG = REGISTRY.register("jade_wisp_spawn_egg", () -> new ForgeSpawnEggItem(SonicraftPlusModEntities.JADE_WISP, -16737946, -16711783, new Item.Properties()));
	public static final RegistryObject<Item> WHITE_WISPON = REGISTRY.register("white_wispon", () -> new WhiteWisponItem());
	public static final RegistryObject<Item> RED_WISPON = REGISTRY.register("red_wispon", () -> new RedWisponItem());
	public static final RegistryObject<Item> YELLOW_WISPON = REGISTRY.register("yellow_wispon", () -> new YellowWisponItem());
	public static final RegistryObject<Item> GREEN_WISPON = REGISTRY.register("green_wispon", () -> new GreenWisponItem());
	public static final RegistryObject<Item> VIOLET_WISPON = REGISTRY.register("violet_wispon", () -> new VioletWisponItem());
	public static final RegistryObject<Item> BRIDGEZONE_GRASS = block(SonicraftPlusModBlocks.BRIDGEZONE_GRASS);
	public static final RegistryObject<Item> BRIDGEZONEGRASSBLOCK = block(SonicraftPlusModBlocks.BRIDGEZONEGRASSBLOCK);
	public static final RegistryObject<Item> BRIDGEZONEGRASS_STAIRS = block(SonicraftPlusModBlocks.BRIDGEZONEGRASS_STAIRS);
	public static final RegistryObject<Item> BRIDGEZONEGRASSSLAB = block(SonicraftPlusModBlocks.BRIDGEZONEGRASSSLAB);
	public static final RegistryObject<Item> BRIDGEZONEDIRT = block(SonicraftPlusModBlocks.BRIDGEZONEDIRT);
	public static final RegistryObject<Item> BRIDGEZONEDIRTSTAIRS = block(SonicraftPlusModBlocks.BRIDGEZONEDIRTSTAIRS);
	public static final RegistryObject<Item> BRIDGEZONEDIRTSLAB = block(SonicraftPlusModBlocks.BRIDGEZONEDIRTSLAB);
	public static final RegistryObject<Item> JUNGLEZONEGRASS = block(SonicraftPlusModBlocks.JUNGLEZONEGRASS);
	public static final RegistryObject<Item> JUNGLEZONEGRASSTOP = block(SonicraftPlusModBlocks.JUNGLEZONEGRASSTOP);
	public static final RegistryObject<Item> JUNGLEZONEGRASSSTAIRS = block(SonicraftPlusModBlocks.JUNGLEZONEGRASSSTAIRS);
	public static final RegistryObject<Item> JUNGLEZONEGRASSSLAB = block(SonicraftPlusModBlocks.JUNGLEZONEGRASSSLAB);
	public static final RegistryObject<Item> JUNGLEZONEDIRT = block(SonicraftPlusModBlocks.JUNGLEZONEDIRT);
	public static final RegistryObject<Item> JUNGLEZONEDIRTSTAIRS = block(SonicraftPlusModBlocks.JUNGLEZONEDIRTSTAIRS);
	public static final RegistryObject<Item> JUNGLEZONEDIRTSLAB = block(SonicraftPlusModBlocks.JUNGLEZONEDIRTSLAB);
	public static final RegistryObject<Item> JUNGLEZONELOG = block(SonicraftPlusModBlocks.JUNGLEZONELOG);
	public static final RegistryObject<Item> JUNGLEZONESPIKEDLOG = block(SonicraftPlusModBlocks.JUNGLEZONESPIKEDLOG);
	public static final RegistryObject<Item> GREENGROVEDIRT = block(SonicraftPlusModBlocks.GREENGROVEDIRT);
	public static final RegistryObject<Item> GREENGROUNDDIRTSTAIRS = block(SonicraftPlusModBlocks.GREENGROUNDDIRTSTAIRS);
	public static final RegistryObject<Item> GREENGROVEDIRTSLAB = block(SonicraftPlusModBlocks.GREENGROVEDIRTSLAB);
	public static final RegistryObject<Item> GREENGROVEGRASS = block(SonicraftPlusModBlocks.GREENGROVEGRASS);
	public static final RegistryObject<Item> GREENGROVEGRASSSLAB = block(SonicraftPlusModBlocks.GREENGROVEGRASSSLAB);
	public static final RegistryObject<Item> GREENGROVEGRASSSTAIRS = block(SonicraftPlusModBlocks.GREENGROVEGRASSSTAIRS);
	public static final RegistryObject<Item> GREENGROVEGRASSTOP = block(SonicraftPlusModBlocks.GREENGROVEGRASSTOP);
	public static final RegistryObject<Item> SKYBASEHULLMIDDLE = block(SonicraftPlusModBlocks.SKYBASEHULLMIDDLE);
	public static final RegistryObject<Item> SKYBASEHULLMIDDLESCREW = block(SonicraftPlusModBlocks.SKYBASEHULLMIDDLESCREW);
	public static final RegistryObject<Item> SKYBASEHULLMIDDLE = block(SonicraftPlusModBlocks.SKYBASEHULLMIDDLE);
	public static final RegistryObject<Item> SKYBASEHULLMIDDLEBOLTS = block(SonicraftPlusModBlocks.SKYBASEHULLMIDDLEBOLTS);
	public static final RegistryObject<Item> SKYBASEHULLBOTTEMBOLTS = block(SonicraftPlusModBlocks.SKYBASEHULLBOTTEMBOLTS);
	public static final RegistryObject<Item> SKYASEHULLTOPSCREW = block(SonicraftPlusModBlocks.SKYASEHULLTOPSCREW);
	public static final RegistryObject<Item> SKYBASEHULLTOP = block(SonicraftPlusModBlocks.SKYBASEHULLTOP);
	public static final RegistryObject<Item> SKYBASEHULLTOPSTAIRS = block(SonicraftPlusModBlocks.SKYBASEHULLTOPSTAIRS);
	public static final RegistryObject<Item> SKYBASEHULLTOPSLAB = block(SonicraftPlusModBlocks.SKYBASEHULLTOPSLAB);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
