package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModMobEffects;

public class RocketRecoveryOnPotionActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 5, 0, true, false));
		if (entity.onGround()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(SonicraftPlusModMobEffects.ROCKET_RECOVERY.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SLOW_FALLING);
		}
	}
}
