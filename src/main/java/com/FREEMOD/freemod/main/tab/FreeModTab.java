package com.FREEMOD.freemod.main.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class FreeModTab extends CreativeModeTab {

    public FreeModTab() {
        super("freemod_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.DIAMOND_PICKAXE);
    }
}
