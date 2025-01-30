package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.sonicraft_plus.network.SonicraftPlusModVariables;

public class GhostEffectPotionExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).savedGamemode == 0) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).savedGamemode == 1) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.CREATIVE);
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).savedGamemode == 2) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.ADVENTURE);
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).savedGamemode == 3) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SPECTATOR);
		}
	}
}
