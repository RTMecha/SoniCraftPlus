
package net.mcreator.sonicraft_plus.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.sonicraft_plus.procedures.VoidEffectPotionStartedappliedProcedure;
import net.mcreator.sonicraft_plus.procedures.VoidEffectOnPotionActiveTickProcedure;

public class VoidEffectMobEffect extends MobEffect {
	public VoidEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -12184653);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		VoidEffectPotionStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		VoidEffectOnPotionActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
