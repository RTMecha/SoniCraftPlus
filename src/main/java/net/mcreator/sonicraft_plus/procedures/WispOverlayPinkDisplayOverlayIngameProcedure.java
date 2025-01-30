package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.sonicraft_plus.network.SonicraftPlusModVariables;

public class WispOverlayPinkDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).pinkWispActive == true) {
			return true;
		}
		return false;
	}
}
