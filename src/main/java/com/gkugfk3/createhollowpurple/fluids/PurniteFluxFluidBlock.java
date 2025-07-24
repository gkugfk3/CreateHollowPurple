package com.gkugfk3.createhollowpurple.fluids;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.Random;

public class PurniteFluxFluidBlock extends LiquidBlock {

    public PurniteFluxFluidBlock() {
        super(() -> ModFluids.PURNITE_FLOWING.get(), BlockBehaviour.Properties
                .of(Material.WATER, MaterialColor.COLOR_PURPLE)
                .strength(100.0F));
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, net.minecraft.world.level.pathfinder.PathComputationType type) {
        return true;
    }

    @Override
    public void onPlace(BlockState newState, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(newState, level, pos, oldState, isMoving);
        level.scheduleTick(pos, this, 10);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
        super.tick(state, level, pos, random);
        level.scheduleTick(pos, this, 10);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        super.stepOn(level, pos, state, entity);
    }
}
