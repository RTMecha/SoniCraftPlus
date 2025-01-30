
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicraft_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sonicraft_plus.SonicraftPlusMod;

public class SonicraftPlusModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SonicraftPlusMod.MODID);
	public static final RegistryObject<SoundEvent> SPRING_USE = REGISTRY.register("spring.use", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "spring.use")));
	public static final RegistryObject<SoundEvent> BOOST_ACTIVE = REGISTRY.register("boost.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "boost.active")));
	public static final RegistryObject<SoundEvent> LASER_ACTIVE = REGISTRY.register("laser.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "laser.active")));
	public static final RegistryObject<SoundEvent> DRILL_ACTIVE = REGISTRY.register("drill.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "drill.active")));
	public static final RegistryObject<SoundEvent> ROCKET_ACTIVE = REGISTRY.register("rocket.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "rocket.active")));
	public static final RegistryObject<SoundEvent> VOID_ACTIVE = REGISTRY.register("void.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "void.active")));
	public static final RegistryObject<SoundEvent> BURST_ACTIVE = REGISTRY.register("burst.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "burst.active")));
	public static final RegistryObject<SoundEvent> WISP_OBTAIN = REGISTRY.register("wisp.obtain", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "wisp.obtain")));
	public static final RegistryObject<SoundEvent> MOB_WISPIDLE = REGISTRY.register("mob.wispidle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "mob.wispidle")));
	public static final RegistryObject<SoundEvent> MOB_WISPHURT = REGISTRY.register("mob.wisphurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "mob.wisphurt")));
	public static final RegistryObject<SoundEvent> MOB_WISPDIE = REGISTRY.register("mob.wispdie", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "mob.wispdie")));
	public static final RegistryObject<SoundEvent> MOB_TANKTREADS = REGISTRY.register("mob.tanktreads", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "mob.tanktreads")));
	public static final RegistryObject<SoundEvent> MOB_JUMP = REGISTRY.register("mob.jump", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "mob.jump")));
	public static final RegistryObject<SoundEvent> MIGHTY_HAMMERDROP = REGISTRY.register("mighty.hammerdrop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "mighty.hammerdrop")));
	public static final RegistryObject<SoundEvent> RING_COLLECT = REGISTRY.register("ring.collect", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "ring.collect")));
	public static final RegistryObject<SoundEvent> CUBE_ACTIVE = REGISTRY.register("cube.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "cube.active")));
	public static final RegistryObject<SoundEvent> HOVER_ACTIVE = REGISTRY.register("hover.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "hover.active")));
	public static final RegistryObject<SoundEvent> SPIKES_ACTIVE = REGISTRY.register("spikes.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "spikes.active")));
	public static final RegistryObject<SoundEvent> FRENZY_ACTIVE = REGISTRY.register("frenzy.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "frenzy.active")));
	public static final RegistryObject<SoundEvent> CUBE_FALL = REGISTRY.register("cube.fall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "cube.fall")));
	public static final RegistryObject<SoundEvent> CUBE_LAND = REGISTRY.register("cube.land", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "cube.land")));
	public static final RegistryObject<SoundEvent> CUBE_RING_COLLECT = REGISTRY.register("cube.ring.collect", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "cube.ring.collect")));
	public static final RegistryObject<SoundEvent> CUBE_ACTIVETICK = REGISTRY.register("cube.activetick", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "cube.activetick")));
	public static final RegistryObject<SoundEvent> BLASTER_SHOT = REGISTRY.register("blaster.shot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "blaster.shot")));
	public static final RegistryObject<SoundEvent> WISPON_BURST_ATTACK = REGISTRY.register("wispon.burst.attack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "wispon.burst.attack")));
	public static final RegistryObject<SoundEvent> WISPON_DRILL_ATTACK = REGISTRY.register("wispon.drill.attack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "wispon.drill.attack")));
	public static final RegistryObject<SoundEvent> WISPON_DRILL_CHARGE = REGISTRY.register("wispon.drill.charge", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "wispon.drill.charge")));
	public static final RegistryObject<SoundEvent> WISPON_HOVER_ATTACK = REGISTRY.register("wispon.hover.attack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "wispon.hover.attack")));
	public static final RegistryObject<SoundEvent> WISPON_VOID_ATTACK = REGISTRY.register("wispon.void.attack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "wispon.void.attack")));
	public static final RegistryObject<SoundEvent> WISPON_CUBE_ATTACK = REGISTRY.register("wispon.cube.attack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "wispon.cube.attack")));
	public static final RegistryObject<SoundEvent> JADE_ACTIVE = REGISTRY.register("jade.active", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("sonicraft_plus", "jade.active")));
}
