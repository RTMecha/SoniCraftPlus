
package net.mcreator.sonicraft_plus.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SkybasehullmuddlescreewBlock extends Block {
	public SkybasehullmuddlescreewBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.EMPTY).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
