package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class HoverEffectOnPotionActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1.2), (entity.getDeltaMovement().z())));
	}
}
