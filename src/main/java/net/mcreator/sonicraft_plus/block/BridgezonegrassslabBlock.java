
package net.mcreator.sonicraft_plus.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class BridgezonegrassslabBlock extends SlabBlock {
	public BridgezonegrassslabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f));
	}
}
