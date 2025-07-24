package com.gkugfk3.createhollowpurple.block.purnite;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.*;
import net.minecraft.core.*;

public class PurniteCasingBlock extends Block
{
    public PurniteCasingBlock() {
        super(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.METAL).strength(3.75f, 300.0f).lightLevel(state -> 6).noOcclusion().hasPostProcess((state, reader, pos) -> true).requiresCorrectToolForDrops()); // wtf are these mappings bro
    }
}
