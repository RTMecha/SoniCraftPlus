package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModParticleTypes;

public class BoostEffectOnPotionActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 5, false, false));
		if (entity.isSprinting()) {
			world.addParticle((SimpleParticleType) (SonicraftPlusModParticleTypes.WHITE_WISP_AURA.get()), x, (y + 1), z, 0, 0, 0);
		}
	}
}
