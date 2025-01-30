package net.mcreator.sonicraft_plus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.sonicraft_plus.network.SonicraftPlusModVariables;
import net.mcreator.sonicraft_plus.init.SonicraftPlusModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RedBurstFloatDownProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SonicraftPlusModMobEffects.BURST_EFFECT.get())) {
			if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).burstJump == false) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.4), (entity.getDeltaMovement().z())));
			} else if ((entity.getCapability(SonicraftPlusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SonicraftPlusModVariables.PlayerVariables())).burstJump == true) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.8, (entity.getDeltaMovement().z())));
			}
		}
	}
}
