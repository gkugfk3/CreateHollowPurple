package com.gkugfk3.createhollowpurple.block.purnite;

/*import com.simibubi.create.foundation.block.connected.ConnectedTextureBehaviour;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import com.simibubi.create.foundation.block.connected.CTContext;*/

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.block.state.BlockState;

public class PurniteCasingBlock extends Block {

    //public final ConnectedTextureBehaviour ctBehaviour;

    public PurniteCasingBlock() {
        super(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
            .strength(3.75F, 300.0F)
            .lightLevel(state -> 6)
            .requiresCorrectToolForDrops()
            .hasPostProcess((state, reader, pos) -> true)
            .emissiveRendering((state, reader, pos) -> true)
            .noOcclusion()
        );

        /*CTSpriteShiftEntry shift = CTSpriteShifter.getCT("block/purnite_casing", "block/purnite_casing_connected");
        ctBehaviour = new ConnectedTextureBehaviour(shift) {
            @Override
            public CTContext getContext(BlockState state, Direction face) {
                return CTContext.BOX;
            }
        };*/
    }

     /*public ConnectedTextureBehaviour getCTBehaviour() {
        return ctBehaviour;
    }*/
}
