package com.gkugfk3.createhollowpurple.block;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.Explosion;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraftforge.fml.common.Mod;


public class ReinforcedCasing extends Block {
    public ReinforcedCasing() {
        super(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                .strength(8.0F, 6.0F)
                .lightLevel(state -> 11)
                .sound(SoundType.NETHERITE_BLOCK)
                .requiresCorrectToolForDrops()
                .hasPostProcess((state, reader, pos) -> true)
                .emissiveRendering((state, reader, pos) -> true)
                .noOcclusion()
        );
    }

    @Override
    public void wasExploded(Level world, BlockPos pos, Explosion explosion) {
        super.wasExploded(world, pos, explosion);
        world.setBlock(pos,ModBlocks.REINFORCED_CASING.get().defaultBlockState(), 3);
        world.playSound(null, pos, SoundEvents.TRIDENT_RETURN, SoundSource.BLOCKS, 1, 1);
        if (world.isClientSide) {
            ParticleUtils.spawnParticlesOnBlockFaces(world, pos, ParticleTypes.CRIT, UniformInt.of(10, 20));
        }
    }

    /*@Mod.EventBusSubscriber(modid = MyMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class ExplosionHandler {

        @SubscribeEvent
        public static void onExplosionStart(ExplosionEvent.Start event) {
            Explosion explosion = event.getExplosion();
            Level level = event.getLevel();

            // Skip client side — only handle on server
            if (level.isClientSide) return;

            // Loop through all blocks that are about to be affected by this explosion
            for (BlockPos pos : explosion.getToBlow()) {
                BlockState state = level.getBlockState(pos);

                // Check if it's our custom block
                if (state.getBlock() == MyModBlocks.SPECIAL_BLOCK.get()) {

                    // Trigger particles
                    ((ServerLevel) level).sendParticles(ParticleTypes.END_ROD,
                            pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                            10, 0.3, 0.3, 0.3, 0.0);

                    // Play a sound when it's about to explode
                    level.playSound(null, pos, SoundEvents.SHIELD_BLOCK, SoundSource.BLOCKS, 1.0f, 1.0f);

                    // Optional: cancel this block being destroyed
                    // Remove it from the explosion's affected block list
                    // (avoids block break and drops)
                    event.getExplosion().getToBlow().remove(pos);
                }
            }
        }
    }*/
}