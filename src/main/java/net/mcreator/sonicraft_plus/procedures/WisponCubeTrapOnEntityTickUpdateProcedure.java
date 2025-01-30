package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModMobEffects;

public class WisponCubeTrapOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.WISPON_CUBE_EFFECT.get(), 5, 0, false, false));
	}
}
