package com.gkugfk3.createhollowpurple.block.purnite;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.*;
import net.minecraft.core.*;

public class PurniteCasingBlock extends Block
{
    public PurniteCasingBlock() {
        super(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.METAL).strength(3.75f, 300.0f).lightLevel(state -> 6).noOcclusion().m_60982_((state, reader, pos) -> true).m_60991_((state, reader, pos) -> true).m_60955_()); // wtf are these mappings bro
    }
}
