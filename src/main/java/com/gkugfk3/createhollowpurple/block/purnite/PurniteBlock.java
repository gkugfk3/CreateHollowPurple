package com.gkugfk3.createhollowpurple.block.purnite;

import net.minecraft.world.level.material.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.*;
import net.minecraft.core.*;

public class PurniteBlock extends Block
{
    public PurniteBlock() {
        super(BlockBehaviour.Properties.m_60944_(Material.f_76279_, MaterialColor.f_76404_).m_60913_(4.0f, 400.0f).m_60953_(state -> 11).m_60918_(SoundType.f_56725_).m_60999_().m_60982_((state, reader, pos) -> true).m_60991_((state, reader, pos) -> true).m_60955_());
    }
}
