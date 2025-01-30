package net.mcreator.sonicraft_plus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.sonicraft_plus.init.SonicraftPlusModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class VoidEffectOnPotionActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (Math.sin(Math.toRadians(0 - entity.getXRot())) * 1.2), (entity.getDeltaMovement().z())));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player == false) {
					entityiterator.setDeltaMovement(new Vec3((x - entityiterator.getX()), (y - entityiterator.getY() + 1.25), (z - entityiterator.getZ())));
				}
			}
		}
		world.addParticle((SimpleParticleType) (SonicraftPlusModParticleTypes.VIOLET_WISP_AURA.get()), x, (y + 1), z, 0, 0, 0);
	}
}
