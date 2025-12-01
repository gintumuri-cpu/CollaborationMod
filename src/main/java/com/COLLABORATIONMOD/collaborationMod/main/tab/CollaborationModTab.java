package com.COLLABORATIONMOD.collaborationMod.main.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class CollaborationModTab extends CreativeModeTab {

    public CollaborationModTab() {
        super("collaboration_mod_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.DIAMOND_PICKAXE);
    }
}
