
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sonicraft_plus.SonicraftPlusMod;

public class SonicraftPlusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SonicraftPlusMod.MODID);
	public static final RegistryObject<CreativeModeTab> SONICRAFT_PLUS_ITEMS = REGISTRY.register("sonicraft_plus_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sonicraft_plus.sonicraft_plus_items")).icon(() -> new ItemStack(SonicraftPlusModItems.SONICRAFT_PLUS_SYMBOL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SonicraftPlusModBlocks.COSMO_FLOWER_POT.get().asItem());
				tabData.accept(SonicraftPlusModItems.SEEDRIAN_SEED.get());
				tabData.accept(SonicraftPlusModItems.COSMO_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModBlocks.BLUE_SPRING.get().asItem());
				tabData.accept(SonicraftPlusModItems.SALLY_ACORN_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.RED_IRON_INGOT.get());
				tabData.accept(SonicraftPlusModBlocks.RED_IRON_BLOCK.get().asItem());
				tabData.accept(SonicraftPlusModItems.RED_IRON_NUGGET.get());
				tabData.accept(SonicraftPlusModBlocks.WHITE_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.CYAN_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.YELLOW_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.ORANGE_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RED_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.VIOLET_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.LASER_PRISM.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPERITE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPERITE_GRASS_BLOCK.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.SPACE_BRIDGE_FRAME.get().asItem());
				tabData.accept(SonicraftPlusModItems.PLANET_WISP.get());
				tabData.accept(SonicraftPlusModItems.WHITE_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_WOOD.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_LOG.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_PLANKS.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_LEAVES.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_STAIRS.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_SLAB.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_FENCE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_FENCE_GATE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_DOOR.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPWOOD_TRAPDOOR.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RED_IRON_BLOCK_STAIRS.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RED_IRON_BLOCK_SLAB.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RED_IRON_BLOCK_PILLAR.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RED_IRON_BLOCK_FRAME.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RED_IRON_BLOCK_MESH_FLOOR.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RIVETED_IRON_BLOCK.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RED_IRON_BLOCK_ROBOT.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.RED_IRON_BLOCK_CAUTION.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.GLOWING_RED_IRON_BLOCK.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModItems.CYAN_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.YELLOW_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.ORANGE_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.RED_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.VIOLET_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModBlocks.DARK_IRON_BLOCK.get().asItem());
				tabData.accept(SonicraftPlusModItems.MINING_TOWER_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModBlocks.MINING_TOWER_INTERIOR_CABLE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.MINING_TOWER_INTERIOR_MOTORIZED_CABLE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.FAULTY_GLOWING_RED_IRON_BLOCK.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.SERVO_MOTOR_PART.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.MINING_TOWER_TRAPDOOR.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.CHARRED_RED_IRON_BLOCK.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.FRAGILE_CHAOSTONE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPERITE_BRICKS.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPERITE_BRICK_STAIRS.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPERITE_BRICK_SLAB.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPERITE_BRICK_WALL.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.WISPERITE_BRICK_PILLAR.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.CHISELED_WISPERITE_BRICKS.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.FRAGILE_WISPERITE.get().asItem());
				tabData.accept(SonicraftPlusModItems.MIGHTY_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.RAY_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModBlocks.IRON_INDUSTRIAL_FENCE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.BLUE_WISP_BLOCK.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.BLUE_WISP_RING.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.BLUE_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.GREEN_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.PINK_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModBlocks.PURPLE_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModItems.BLUE_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.GREEN_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.PINK_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.PURPLE_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModBlocks.WISPON_WORKBENCH.get().asItem());
				tabData.accept(SonicraftPlusModItems.WISPON_FRAME.get());
				tabData.accept(SonicraftPlusModItems.BLUE_WISPON.get());
				tabData.accept(SonicraftPlusModBlocks.JADE_WISP_CAPSULE.get().asItem());
				tabData.accept(SonicraftPlusModItems.JADE_WISP_SPAWN_EGG.get());
				tabData.accept(SonicraftPlusModItems.WHITE_WISPON.get());
				tabData.accept(SonicraftPlusModItems.RED_WISPON.get());
				tabData.accept(SonicraftPlusModItems.YELLOW_WISPON.get());
				tabData.accept(SonicraftPlusModItems.GREEN_WISPON.get());
				tabData.accept(SonicraftPlusModItems.VIOLET_WISPON.get());
			}).build());
}
