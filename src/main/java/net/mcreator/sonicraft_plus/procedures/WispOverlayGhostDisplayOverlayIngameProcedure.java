package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModMobEffects;

public class WispOverlayGhostDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SonicraftPlusModMobEffects.GHOST_EFFECT.get())) == true) {
			return true;
		}
		return false;
	}
}
