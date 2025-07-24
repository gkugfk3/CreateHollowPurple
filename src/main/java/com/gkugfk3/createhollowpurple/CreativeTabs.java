package com.gkugfk3.createhollowpurple;

import com.gkugfk3.createhollowpurple.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CreativeTabs {
    public static CreativeModeTab TAB_HOLLOW_PURPLE;

    public static void Init() {
        TAB_HOLLOW_PURPLE = new CreativeModeTab("tab_purple") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.PURNITE_INGOT.get());
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        };
    }
}
