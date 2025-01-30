package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModParticleTypes;
import net.mcreator.sonicraft_plus.init.SonicraftPlusModMobEffects;
import net.mcreator.sonicraft_plus.SonicraftPlusMod;

public class DrillEffectOnPotionActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 5, 99, false, false));
		entity.setDeltaMovement(new Vec3((Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1.5), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1.5), (Math.cos(Math.toRadians(entity.getYRot())) * 1.5)));
		entity.getPersistentData().putDouble("antiLagTimer", (entity.getPersistentData().getDouble("antiLagTimer") + 1));
		if (entity.getPersistentData().getDouble("antiLagTimer") >= 5) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.BLOCK);
			entity.getPersistentData().putDouble("antiLagTimer", 0);
		}
		SonicraftPlusMod.queueServerWork(5, () -> {
			if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && ((world.getFluidState(BlockPos.containing(x, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER) == false && world.isEmptyBlock(BlockPos.containing(x, y - 3, z))
					&& world.isEmptyBlock(BlockPos.containing(x, y - 4, z)) && entity.getY() <= world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 2
					&& ((world.getFluidState(BlockPos.containing(x, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER) == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(SonicraftPlusModMobEffects.DRILL_EFFECT.get());
			}
		});
		world.addParticle((SimpleParticleType) (SonicraftPlusModParticleTypes.YELLOW_WISP_AURA.get()), x, (y + 1), z, 0, 0, 0);
	}
}
