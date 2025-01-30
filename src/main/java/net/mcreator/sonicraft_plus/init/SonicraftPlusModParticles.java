
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sonicraft_plus.client.particle.YellowWispAuraParticle;
import net.mcreator.sonicraft_plus.client.particle.WhiteWispAuraParticle;
import net.mcreator.sonicraft_plus.client.particle.VoidWisponEffectParticle;
import net.mcreator.sonicraft_plus.client.particle.VioletWispAuraParticle;
import net.mcreator.sonicraft_plus.client.particle.RedWispAuraParticle;
import net.mcreator.sonicraft_plus.client.particle.OrangeWispAuraParticle;
import net.mcreator.sonicraft_plus.client.particle.JadeWispAuraParticle;
import net.mcreator.sonicraft_plus.client.particle.CyanWispTrailParticle;
import net.mcreator.sonicraft_plus.client.particle.CyanWispAuraParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SonicraftPlusModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(SonicraftPlusModParticleTypes.WHITE_WISP_AURA.get(), WhiteWispAuraParticle::provider);
		event.registerSpriteSet(SonicraftPlusModParticleTypes.CYAN_WISP_AURA.get(), CyanWispAuraParticle::provider);
		event.registerSpriteSet(SonicraftPlusModParticleTypes.YELLOW_WISP_AURA.get(), YellowWispAuraParticle::provider);
		event.registerSpriteSet(SonicraftPlusModParticleTypes.ORANGE_WISP_AURA.get(), OrangeWispAuraParticle::provider);
		event.registerSpriteSet(SonicraftPlusModParticleTypes.RED_WISP_AURA.get(), RedWispAuraParticle::provider);
		event.registerSpriteSet(SonicraftPlusModParticleTypes.VIOLET_WISP_AURA.get(), VioletWispAuraParticle::provider);
		event.registerSpriteSet(SonicraftPlusModParticleTypes.CYAN_WISP_TRAIL.get(), CyanWispTrailParticle::provider);
		event.registerSpriteSet(SonicraftPlusModParticleTypes.VOID_WISPON_EFFECT.get(), VoidWisponEffectParticle::provider);
		event.registerSpriteSet(SonicraftPlusModParticleTypes.JADE_WISP_AURA.get(), JadeWispAuraParticle::provider);
	}
}
