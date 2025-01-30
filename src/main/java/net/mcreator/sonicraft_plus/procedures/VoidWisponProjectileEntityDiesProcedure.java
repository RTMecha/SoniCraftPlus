package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.entity.Entity;

public class VoidWisponProjectileEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
