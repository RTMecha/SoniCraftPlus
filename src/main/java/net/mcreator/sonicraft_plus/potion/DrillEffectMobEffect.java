
package net.mcreator.sonicraft_plus.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.sonicraft_plus.procedures.DrillEffectPotionStartedappliedProcedure;
import net.mcreator.sonicraft_plus.procedures.DrillEffectOnPotionActiveTickProcedure;

public class DrillEffectMobEffect extends MobEffect {
	public DrillEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -256);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		DrillEffectPotionStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DrillEffectOnPotionActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
