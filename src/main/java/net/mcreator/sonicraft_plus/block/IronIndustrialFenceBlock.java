
package net.mcreator.sonicraft_plus.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class IronIndustrialFenceBlock extends IronBarsBlock {
	public IronIndustrialFenceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.LANTERN).strength(0.8f, 4f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
