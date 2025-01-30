package net.mcreator.sonicraft_plus.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModBlocks;
import net.mcreator.sonicraft_plus.entity.YellowWispEntity;
import net.mcreator.sonicraft_plus.entity.WhiteWispEntity;
import net.mcreator.sonicraft_plus.entity.VioletWispEntity;
import net.mcreator.sonicraft_plus.entity.RedWispEntity;
import net.mcreator.sonicraft_plus.entity.PurpleWispEntity;
import net.mcreator.sonicraft_plus.entity.PinkWispEntity;
import net.mcreator.sonicraft_plus.entity.OrangeWispEntity;
import net.mcreator.sonicraft_plus.entity.JadeWispEntity;
import net.mcreator.sonicraft_plus.entity.GreenWispEntity;
import net.mcreator.sonicraft_plus.entity.CyanWispEntity;
import net.mcreator.sonicraft_plus.entity.BlueWispEntity;

public class WispRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SonicraftPlusModBlocks.WISP_CAPSULE.get().asItem()) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(SonicraftPlusModBlocks.WISP_CAPSULE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof WhiteWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.WHITE_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof CyanWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.CYAN_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof YellowWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.YELLOW_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof OrangeWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.ORANGE_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof RedWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.RED_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof VioletWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.VIOLET_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof BlueWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.BLUE_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof GreenWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.GREEN_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof PinkWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.PINK_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof PurpleWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.PURPLE_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if (entity instanceof JadeWispEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SonicraftPlusModBlocks.JADE_WISP_CAPSULE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.wispdie")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
