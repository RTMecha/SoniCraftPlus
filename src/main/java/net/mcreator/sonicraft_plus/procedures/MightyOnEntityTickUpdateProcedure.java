package net.mcreator.sonicraft_plus.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModEntities;

public class MightyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getDeltaMovement().y() <= -1.1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SonicraftPlusModEntities.MIGHTY_HAMMER_DROP.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			entity.getPersistentData().putDouble("dropSound", (entity.getPersistentData().getDouble("dropSound") + 1));
			if (entity.getPersistentData().getDouble("dropSound") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mighty.hammerdrop")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mighty.hammerdrop")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("forge:mighty_breakable_blocks")))) {
				world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
				world.destroyBlock(BlockPos.containing(x + 1, y - 1, z), false);
				world.destroyBlock(BlockPos.containing(x - 1, y - 1, z), false);
				world.destroyBlock(BlockPos.containing(x, y - 1, z + 1), false);
				world.destroyBlock(BlockPos.containing(x, y - 1, z - 1), false);
				world.destroyBlock(BlockPos.containing(x + 1, y - 1, z - 1), false);
				world.destroyBlock(BlockPos.containing(x - 1, y - 1, z - 1), false);
				world.destroyBlock(BlockPos.containing(x + 1, y - 1, z + 1), false);
				world.destroyBlock(BlockPos.containing(x - 1, y - 1, z + 1), false);
			}
		} else if (entity.getDeltaMovement().y() > -1.1 && entity.getDeltaMovement().y() < -0.15) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SonicraftPlusModEntities.MIGHTY_BALL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (entity.getDeltaMovement().y() > 0.15) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SonicraftPlusModEntities.MIGHTY_BALL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			entity.getPersistentData().putDouble("jumpSound", (entity.getPersistentData().getDouble("jumpSound") + 1));
			if (entity.getPersistentData().getDouble("jumpSound") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.jump")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.jump")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("jumpSound", 0);
			entity.getPersistentData().putDouble("dropSound", 0);
		}
	}
}
