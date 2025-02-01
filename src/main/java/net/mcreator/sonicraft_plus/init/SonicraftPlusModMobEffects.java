
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.sonicraft_plus.potion.WisponCubeEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.VoidEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.RocketRecoveryMobEffect;
import net.mcreator.sonicraft_plus.potion.RocketEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.LaserEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.HoverEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.GhostEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.FuseMobEffect;
import net.mcreator.sonicraft_plus.potion.DrillEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.CubeEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.BurstEffectMobEffect;
import net.mcreator.sonicraft_plus.potion.BoostEffectMobEffect;
import net.mcreator.sonicraft_plus.SonicraftPlusMod;

public class SonicraftPlusModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SonicraftPlusMod.MODID);
	public static final RegistryObject<MobEffect> BOOST_EFFECT = REGISTRY.register("boost_effect", () -> new BoostEffectMobEffect());
	public static final RegistryObject<MobEffect> LASER_EFFECT = REGISTRY.register("laser_effect", () -> new LaserEffectMobEffect());
	public static final RegistryObject<MobEffect> DRILL_EFFECT = REGISTRY.register("drill_effect", () -> new DrillEffectMobEffect());
	public static final RegistryObject<MobEffect> ROCKET_EFFECT = REGISTRY.register("rocket_effect", () -> new RocketEffectMobEffect());
	public static final RegistryObject<MobEffect> BURST_EFFECT = REGISTRY.register("burst_effect", () -> new BurstEffectMobEffect());
	public static final RegistryObject<MobEffect> VOID_EFFECT = REGISTRY.register("void_effect", () -> new VoidEffectMobEffect());
	public static final RegistryObject<MobEffect> ROCKET_RECOVERY = REGISTRY.register("rocket_recovery", () -> new RocketRecoveryMobEffect());
	public static final RegistryObject<MobEffect> CUBE_EFFECT = REGISTRY.register("cube_effect", () -> new CubeEffectMobEffect());
	public static final RegistryObject<MobEffect> HOVER_EFFECT = REGISTRY.register("hover_effect", () -> new HoverEffectMobEffect());
	public static final RegistryObject<MobEffect> WISPON_CUBE_EFFECT = REGISTRY.register("wispon_cube_effect", () -> new WisponCubeEffectMobEffect());
	public static final RegistryObject<MobEffect> GHOST_EFFECT = REGISTRY.register("ghost_effect", () -> new GhostEffectMobEffect());
	public static final RegistryObject<MobEffect> FUSE = REGISTRY.register("fuse", () -> new FuseMobEffect());
}
