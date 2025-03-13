
package net.mcreator.sonicraft_plus.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class GreengrovegrassslabBlock extends SlabBlock {
	public GreengrovegrassslabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WET_GRASS).strength(1f, 10f));
	}
}
