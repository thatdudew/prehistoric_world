
package com.dude.prehistoricworld.block;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Collections;

import com.dude.prehistoricworld.init.PrehistoricWorldModBlocks;

public class LepidodendronPressureplateBlock extends PressurePlateBlock {
	public LepidodendronPressureplateBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.WOOD).strength(1f, 10f).dynamicShape().forceSolidOn(), BlockSetType.IRON);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(PrehistoricWorldModBlocks.LEPIDODENDRON_PRESSUREPLATE.get()));
	}
}
