package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.sonicraft_plus.SonicraftPlusMod;

public class BlueWispChangeTriggerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		SonicraftPlusMod.queueServerWork(1, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
