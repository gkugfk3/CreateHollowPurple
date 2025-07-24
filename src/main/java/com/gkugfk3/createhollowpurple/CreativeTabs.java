package com.gkugfk3.createhollowpurple;

import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import com.gkugfk3.createhollowpurple.item.*;
import net.minecraftforge.api.distmarker.*;

public class CreativeTabs
{
    public static CreativeModeTab TAB_HOLLOW_PURPLE;
    
    public static void Init() {
        CreativeTabs.TAB_HOLLOW_PURPLE = new CreativeModeTab("tab_purple") {
            public ItemStack makeIcon() {
                return new ItemStack((ItemLike)ModItems.PURNITE_INGOT.get());
            }
            
            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        };
    }
}
