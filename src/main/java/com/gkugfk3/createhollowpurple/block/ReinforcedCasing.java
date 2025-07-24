package com.gkugfk3.createhollowpurple.block;

import net.minecraft.world.level.material.*;
import net.minecraft.world.level.block.*;
import net.minecraft.core.*;
import net.minecraft.sounds.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.util.valueproviders.*;
import net.minecraft.util.*;
import net.minecraft.core.particles.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.*;

public class ReinforcedCasing extends Block
{
    public ReinforcedCasing() {
        super(BlockBehaviour.Properties
                .of(Material.METAL, MaterialColor.METAL)                   // m_60944_
                .strength(8.0f, 8.0f)                                       // m_60913_
                .lightLevel(state -> 11)                                    // m_60953_
                .sound(SoundType.METAL)                                     // m_60918_
                .noOcclusion()                                              // m_60999_
                .isRedstoneConductor((state, reader, pos) -> true)          // m_60982_
                .isSuffocating((state, reader, pos) -> true)                // m_60991_
                .requiresCorrectToolForDrops()                              // m_60955_
        );
    }


    public void wasExploded(final Level world, final BlockPos pos, final Explosion explosion) {
        super.wasExploded(world, pos, explosion);
        world.setBlock(pos, ((Block)ModBlocks.REINFORCED_CASING.get()).defaultBlockState(), 3);
        world.playSound((Player)null, pos, SoundEvents.TRIDENT_RETURN, SoundSource.BLOCKS, 1.0f, 0.7f);
        world.playSound((Player)null, pos, SoundEvents.TRIDENT_THUNDER, SoundSource.BLOCKS, 1.0f, 1.0f);
        if (world.isClientSide) {
            ParticleUtils.spawnParticlesOnBlockFaces(world, pos, (ParticleOptions)ParticleTypes.CRIT, UniformInt.of(10, 20));
        }
    }
}
