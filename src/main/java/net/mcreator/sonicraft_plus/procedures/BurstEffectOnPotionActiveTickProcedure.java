package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModParticleTypes;

public class BurstEffectOnPotionActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 2, 0.5, 0.8, 0.5, 1);
		world.addParticle((SimpleParticleType) (SonicraftPlusModParticleTypes.RED_WISP_AURA.get()), x, (y + 1), z, 0, 1, 0);
	}
}
