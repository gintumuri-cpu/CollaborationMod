package com.FREEMOD.freemod.main.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class FreeModBlockTab extends CreativeModeTab {
    public FreeModBlockTab() {
        super("freemod_block_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Blocks.BEDROCK);
    }
}
