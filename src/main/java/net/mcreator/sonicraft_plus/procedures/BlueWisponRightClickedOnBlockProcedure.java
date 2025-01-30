package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.registries.Registries;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModMobEffects;
import net.mcreator.sonicraft_plus.entity.WisponCubeTrapEntity;

import java.util.List;
import java.util.Comparator;

public class BlueWisponRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player == false) {
					if (entityiterator instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(SonicraftPlusModMobEffects.WISPON_CUBE_EFFECT.get())) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 50);
					} else {
						if (entityiterator instanceof WisponCubeTrapEntity == false) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(SonicraftPlusModMobEffects.WISPON_CUBE_EFFECT.get(), 999999, 0, false, false));
						}
					}
				}
			}
		}
	}
}
