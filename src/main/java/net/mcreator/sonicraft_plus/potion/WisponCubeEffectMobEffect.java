
package net.mcreator.sonicraft_plus.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.sonicraft_plus.procedures.WisponCubeEffectPotionStartedappliedProcedure;
import net.mcreator.sonicraft_plus.procedures.WisponCubeEffectOnPotionActiveTickProcedure;

public class WisponCubeEffectMobEffect extends MobEffect {
	public WisponCubeEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -15660950);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		WisponCubeEffectPotionStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		WisponCubeEffectOnPotionActiveTickProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
