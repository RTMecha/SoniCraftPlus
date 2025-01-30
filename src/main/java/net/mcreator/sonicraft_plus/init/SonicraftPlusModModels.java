
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sonicraft_plus.client.model.Modelwispon_cube_trap;
import net.mcreator.sonicraft_plus.client.model.Modelwisp;
import net.mcreator.sonicraft_plus.client.model.Modelsonic_ball_hammer_drop;
import net.mcreator.sonicraft_plus.client.model.Modelsonic_ball;
import net.mcreator.sonicraft_plus.client.model.Modelsally_acorn;
import net.mcreator.sonicraft_plus.client.model.Modelray_gliding;
import net.mcreator.sonicraft_plus.client.model.Modelray;
import net.mcreator.sonicraft_plus.client.model.Modelmining_tower;
import net.mcreator.sonicraft_plus.client.model.Modelmighty;
import net.mcreator.sonicraft_plus.client.model.Modeljade_wisp;
import net.mcreator.sonicraft_plus.client.model.Modelcosmo;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SonicraftPlusModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeljade_wisp.LAYER_LOCATION, Modeljade_wisp::createBodyLayer);
		event.registerLayerDefinition(Modelcosmo.LAYER_LOCATION, Modelcosmo::createBodyLayer);
		event.registerLayerDefinition(Modelwisp.LAYER_LOCATION, Modelwisp::createBodyLayer);
		event.registerLayerDefinition(Modelmining_tower.LAYER_LOCATION, Modelmining_tower::createBodyLayer);
		event.registerLayerDefinition(Modelwispon_cube_trap.LAYER_LOCATION, Modelwispon_cube_trap::createBodyLayer);
		event.registerLayerDefinition(Modelsonic_ball_hammer_drop.LAYER_LOCATION, Modelsonic_ball_hammer_drop::createBodyLayer);
		event.registerLayerDefinition(Modelray_gliding.LAYER_LOCATION, Modelray_gliding::createBodyLayer);
		event.registerLayerDefinition(Modelmighty.LAYER_LOCATION, Modelmighty::createBodyLayer);
		event.registerLayerDefinition(Modelsonic_ball.LAYER_LOCATION, Modelsonic_ball::createBodyLayer);
		event.registerLayerDefinition(Modelray.LAYER_LOCATION, Modelray::createBodyLayer);
		event.registerLayerDefinition(Modelsally_acorn.LAYER_LOCATION, Modelsally_acorn::createBodyLayer);
	}
}
