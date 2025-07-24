package com.gkugfk3.createhollowpurple.item;

import com.gkugfk3.createhollowpurple.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Set;

public class PurniteIngot extends Item {
    private static final Logger LOGGER = LogManager.getLogger();


    public PurniteIngot(Properties properties) {
        super(properties.stacksTo(64)
            .fireResistant()
            .rarity(Rarity.UNCOMMON)
            .tab(CreativeModeTab.TAB_MATERIALS)
        );
    }

    @SubscribeEvent
    public static void onItemEntitySpawn(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof ItemEntity itemEntity) {
            ItemStack stack = itemEntity.getItem();
            if (stack.getItem() instanceof PurniteIngot) {
                itemEntity.setNoGravity(true);
            }
        }
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
