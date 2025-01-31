
package net.mcreator.sonicraft_plus.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.sonicraft_plus.procedures.BurstEffectPotionStartedappliedProcedure;
import net.mcreator.sonicraft_plus.procedures.BurstEffectOnPotionActiveTickProcedure;

public class BurstEffectMobEffect extends MobEffect {
	public BurstEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1769472);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		BurstEffectPotionStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BurstEffectOnPotionActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
