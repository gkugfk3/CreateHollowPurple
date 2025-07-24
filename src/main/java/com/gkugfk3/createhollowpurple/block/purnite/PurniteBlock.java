package com.gkugfk3.createhollowpurple.block.purnite;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.block.SoundType;

public class PurniteBlock extends Block {
    public PurniteBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                .strength(4.0F, 400.0F)
                .lightLevel(state -> 11)
                .sound(SoundType.NETHERITE_BLOCK)
                .requiresCorrectToolForDrops()
                .hasPostProcess((state, reader, pos) -> true)
                .emissiveRendering((state, reader, pos) -> true)
                .noOcclusion()
        );
    }
}
