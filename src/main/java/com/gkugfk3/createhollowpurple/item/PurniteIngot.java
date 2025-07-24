package com.gkugfk3.createhollowpurple.item;

import com.gkugfk3.createhollowpurple.CreativeTabs;
import net.minecraftforge.event.entity.*;
import net.minecraft.world.entity.item.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.*;
import org.apache.logging.log4j.*;

public class PurniteIngot extends Item
{
    private static final Logger LOGGER;
    
    public PurniteIngot(final Item.Properties properties) {
        super(properties.stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON).tab(CreativeTabs.TAB_HOLLOW_PURPLE));
    }
    
    @SubscribeEvent
    public static void onItemEntitySpawn(final EntityJoinWorldEvent event) {
        final Entity entity = event.getEntity();
        if (entity instanceof ItemEntity) {
            final ItemEntity itemEntity = (ItemEntity)entity;
            final ItemStack stack = itemEntity.getItem();
            if (stack.getItem() instanceof PurniteIngot) {
                itemEntity.setNoGravity(true);
            }
        }
    }
    
    public boolean isFoil(final ItemStack stack) {
        return true;
    }
    
    static {
        LOGGER = LogManager.getLogger();
    }
}
