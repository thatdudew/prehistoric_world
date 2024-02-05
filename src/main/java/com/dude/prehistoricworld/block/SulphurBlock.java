
package com.dude.prehistoricworld.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import com.dude.prehistoricworld.init.PrehistoricWorldModFluids;

public class SulphurBlock extends LiquidBlock {
	public SulphurBlock() {
		super(() -> PrehistoricWorldModFluids.SULPHUR.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).lightLevel(s -> 15).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
