package com.COLLABORATIONMOD.collaborationMod.main.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class CollaborationModBlockTab extends CreativeModeTab {
    public CollaborationModBlockTab() {
        super("collaboration_mod_block_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Blocks.BEDROCK);
    }
}
