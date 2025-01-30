package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModParticleTypes;

public class LaserEffectOnPotionActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 3), Math.sin(Math.toRadians(0 - entity.getXRot())), (Math.cos(Math.toRadians(entity.getYRot())) * 3)));
		world.addParticle((SimpleParticleType) (SonicraftPlusModParticleTypes.CYAN_WISP_AURA.get()), x, (y + 1), z, 0, 0, 0);
		world.addParticle((SimpleParticleType) (SonicraftPlusModParticleTypes.CYAN_WISP_TRAIL.get()), x, (y + 1), z, 0, 0, 0);
	}
}
