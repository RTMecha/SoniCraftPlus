package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.sonicraft_plus.entity.MightyEntity;
import net.mcreator.sonicraft_plus.SonicraftPlusMod;

public class FragileChaostoneEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MightyEntity) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.8, (entity.getDeltaMovement().z())));
			SonicraftPlusMod.queueServerWork(10, () -> {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-1.2), (entity.getDeltaMovement().z())));
			});
		}
	}
}
