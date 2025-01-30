package net.mcreator.sonicraft_plus.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.sonicraft_plus.network.SonicraftPlusModVariables;
import net.mcreator.sonicraft_plus.init.SonicraftPlusModMobEffects;
import net.mcreator.sonicraft_plus.init.SonicraftPlusModEntities;
import net.mcreator.sonicraft_plus.SonicraftPlusMod;

import java.util.List;
import java.util.Comparator;

public class WispPowerActivateOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).whiteWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.BOOST_EFFECT.get(), 800, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.whiteWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).cyanWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.LASER_EFFECT.get(), 200, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cyanWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).yellowWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.DRILL_EFFECT.get(), 400, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.yellowWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).orangeWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.ROCKET_EFFECT.get(), 100, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.orangeWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			SonicraftPlusMod.queueServerWork(100, () -> {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.ROCKET_RECOVERY.get(), 600, 0, false, false));
			});
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).redWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.BURST_EFFECT.get(), 400, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.redWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).violetWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.VOID_EFFECT.get(), 400, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.violetWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).blueWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.CUBE_EFFECT.get(), 400, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blueWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).greenWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.HOVER_EFFECT.get(), 400, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.greenWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).jadeWispActive == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.GHOST_EFFECT.get(), 400, 0, true, false));
			{
				boolean _setval = false;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jadeWispActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(SonicraftPlusModMobEffects.BURST_EFFECT.get())
				&& (entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).burstJump == false) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					entityiterator.setSecondsOnFire(5);
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.burstJump = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			SonicraftPlusMod.queueServerWork(15, () -> {
				{
					boolean _setval = false;
					entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.burstJump = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 3, 3, 3, 1);
		}
		if (entity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(SonicraftPlusModMobEffects.CUBE_EFFECT.get())
				&& (entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).cubeCooldown == 0) {
			{
				double _setval = 1;
				entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cubeCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.setDeltaMovement(new Vec3(0, (-1.2), 0));
			SonicraftPlusMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = SonicraftPlusModEntities.BLUE_WISP_CHANGE_TRIGGER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
			SonicraftPlusMod.queueServerWork(20, () -> {
				{
					double _setval = 0;
					entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.cubeCooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
