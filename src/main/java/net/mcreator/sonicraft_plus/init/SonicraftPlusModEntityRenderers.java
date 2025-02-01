
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.sonicraft_plus.client.renderer.YellowWisponProjectileRenderer;
import net.mcreator.sonicraft_plus.client.renderer.YellowWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.WisponCubeTrapRenderer;
import net.mcreator.sonicraft_plus.client.renderer.WhiteWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.VoidWisponProjectileRenderer;
import net.mcreator.sonicraft_plus.client.renderer.VioletWisponProjectileRenderer;
import net.mcreator.sonicraft_plus.client.renderer.VioletWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.SallyAcornRenderer;
import net.mcreator.sonicraft_plus.client.renderer.RedWisponProjectileRenderer;
import net.mcreator.sonicraft_plus.client.renderer.RedWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.RayRenderer;
import net.mcreator.sonicraft_plus.client.renderer.RayGlidingRenderer;
import net.mcreator.sonicraft_plus.client.renderer.PurpleWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.PinkWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.OrangeWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.NewtronblueRenderer;
import net.mcreator.sonicraft_plus.client.renderer.NewtronRenderer;
import net.mcreator.sonicraft_plus.client.renderer.MiningTowerRenderer;
import net.mcreator.sonicraft_plus.client.renderer.MightyRenderer;
import net.mcreator.sonicraft_plus.client.renderer.MightyHammerDropRenderer;
import net.mcreator.sonicraft_plus.client.renderer.MightyBallRenderer;
import net.mcreator.sonicraft_plus.client.renderer.JadeWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.GreenWisponProjectileRenderer;
import net.mcreator.sonicraft_plus.client.renderer.GreenWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.CyanWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.CosmoRenderer;
import net.mcreator.sonicraft_plus.client.renderer.BombRenderer;
import net.mcreator.sonicraft_plus.client.renderer.BlueWispRenderer;
import net.mcreator.sonicraft_plus.client.renderer.BlueWispChangeTriggerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SonicraftPlusModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SonicraftPlusModEntities.COSMO.get(), CosmoRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.SALLY_ACORN.get(), SallyAcornRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.WHITE_WISP.get(), WhiteWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.CYAN_WISP.get(), CyanWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.YELLOW_WISP.get(), YellowWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.ORANGE_WISP.get(), OrangeWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.RED_WISP.get(), RedWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.VIOLET_WISP.get(), VioletWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.MINING_TOWER.get(), MiningTowerRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.MIGHTY.get(), MightyRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.MIGHTY_BALL.get(), MightyBallRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.MIGHTY_HAMMER_DROP.get(), MightyHammerDropRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.RAY.get(), RayRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.RAY_GLIDING.get(), RayGlidingRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.BLUE_WISP_CHANGE_TRIGGER.get(), BlueWispChangeTriggerRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.BLUE_WISP.get(), BlueWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.GREEN_WISP.get(), GreenWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.PINK_WISP.get(), PinkWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.PURPLE_WISP.get(), PurpleWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.VOID_WISPON_PROJECTILE.get(), VoidWisponProjectileRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.WISPON_CUBE_TRAP.get(), WisponCubeTrapRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.JADE_WISP.get(), JadeWispRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.WHITE_WISPON_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.RED_WISPON_PROJECTILE.get(), RedWisponProjectileRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.YELLOW_WISPON_PROJECTILE.get(), YellowWisponProjectileRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.GREEN_WISPON_PROJECTILE.get(), GreenWisponProjectileRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.VIOLET_WISPON_PROJECTILE.get(), VioletWisponProjectileRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.NEWTRON.get(), NewtronRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.NEWTRONBLUE.get(), NewtronblueRenderer::new);
		event.registerEntityRenderer(SonicraftPlusModEntities.BOMB.get(), BombRenderer::new);
	}
}
