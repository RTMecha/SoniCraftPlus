package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModEntities;

public class RayOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR || world.isEmptyBlock(BlockPos.containing(x, y - 1, z)))
				&& ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.AIR || world.isEmptyBlock(BlockPos.containing(x, y - 2, z)))
				&& ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == Blocks.AIR || world.isEmptyBlock(BlockPos.containing(x, y - 3, z)))
				&& ((world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == Blocks.AIR || world.isEmptyBlock(BlockPos.containing(x, y - 4, z)))) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SonicraftPlusModEntities.RAY_GLIDING.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
