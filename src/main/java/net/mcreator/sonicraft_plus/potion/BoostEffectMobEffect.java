
package net.mcreator.sonicraft_plus.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.sonicraft_plus.procedures.BoostEffectPotionStartedappliedProcedure;
import net.mcreator.sonicraft_plus.procedures.BoostEffectOnPotionActiveTickProcedure;

public class BoostEffectMobEffect extends MobEffect {
	public BoostEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -4263451);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		BoostEffectPotionStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BoostEffectOnPotionActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
