package com.gkugfk3.createhollowpurple.block.purnite;

import net.minecraft.world.level.material.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.*;
import net.minecraft.core.*;

public class PurniteBlock extends Block
{
    public PurniteBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).strength(4.0f, 400.0f).lightLevel(state -> 11).sound(SoundType.METAL).noOcclusion().hasPostProcess((state, reader, pos) -> true).requiresCorrectToolForDrops());
    }
}
