
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.sonicraft_plus.SonicraftPlusMod;

public class SonicraftPlusModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, SonicraftPlusMod.MODID);
	public static final RegistryObject<SimpleParticleType> WHITE_WISP_AURA = REGISTRY.register("white_wisp_aura", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> CYAN_WISP_AURA = REGISTRY.register("cyan_wisp_aura", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> YELLOW_WISP_AURA = REGISTRY.register("yellow_wisp_aura", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> ORANGE_WISP_AURA = REGISTRY.register("orange_wisp_aura", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> RED_WISP_AURA = REGISTRY.register("red_wisp_aura", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> VIOLET_WISP_AURA = REGISTRY.register("violet_wisp_aura", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> CYAN_WISP_TRAIL = REGISTRY.register("cyan_wisp_trail", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> VOID_WISPON_EFFECT = REGISTRY.register("void_wispon_effect", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> JADE_WISP_AURA = REGISTRY.register("jade_wisp_aura", () -> new SimpleParticleType(true));
}
