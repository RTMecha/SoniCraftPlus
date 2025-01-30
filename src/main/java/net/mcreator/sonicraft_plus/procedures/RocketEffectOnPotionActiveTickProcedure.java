package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModParticleTypes;

public class RocketEffectOnPotionActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 0.8, 0));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 3, 0.2, 0.2, 0.2, 0);
		world.addParticle((SimpleParticleType) (SonicraftPlusModParticleTypes.ORANGE_WISP_AURA.get()), x, (y + 1), z, 0, 0, 0);
	}
}
