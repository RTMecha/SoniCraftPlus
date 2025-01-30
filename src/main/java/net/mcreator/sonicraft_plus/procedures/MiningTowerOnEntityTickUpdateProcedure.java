package net.mcreator.sonicraft_plus.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class MiningTowerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("sonicraft_plus:wisps")))) {
					entityiterator.setDeltaMovement(new Vec3((x - entityiterator.getX()), (y - entityiterator.getY() + 1.25), (z - entityiterator.getZ())));
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(14 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("sonicraft_plus:wisps")))) {
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
				}
			}
		}
		if (entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().z() > 0 || entity.getDeltaMovement().x() < 0 || entity.getDeltaMovement().z() < 0) {
			entity.getPersistentData().putDouble("treadSound", (entity.getPersistentData().getDouble("treadSound") + 1));
			if (entity.getPersistentData().getDouble("treadSound") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.tanktreads")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft_plus:mob.tanktreads")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity.getPersistentData().getDouble("treadSound") >= 20) {
				entity.getPersistentData().putDouble("treadSound", 0);
			}
		}
	}
}
