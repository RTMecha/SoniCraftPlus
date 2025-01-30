package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModParticleTypes;

public class GhostEffectOnPotionActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player)
			_player.setGameMode(GameType.SPECTATOR);
		world.addParticle((SimpleParticleType) (SonicraftPlusModParticleTypes.JADE_WISP_AURA.get()), x, (y + 1), z, 0, 0, 0);
	}
}
