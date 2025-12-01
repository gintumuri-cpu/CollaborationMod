package com.COLLABORATIONMOD.collaborationMod.main;

import com.COLLABORATIONMOD.collaborationMod.main.tab.CollaborationModBlockTab;
import com.COLLABORATIONMOD.collaborationMod.main.tab.CollaborationModTab;
import com.COLLABORATIONMOD.collaborationMod.register.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("collaboration_mod")
public class CollaborationMod {
    //MOD_ID
    public static final String MOD_ID = "collaboration_mod";
    //クリエイトタブの登録
    public static final CreativeModeTab COLLABORATION_TAB = new CollaborationModTab();
    public static final CreativeModeTab COLLABORATION_BLOCK_TAB = new CollaborationModBlockTab();

    public CollaborationMod(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::commonSetup);
        //この下に追加していく

        //ブロックの登録
        BlockRegister.register(eventBus);
        //アイテムの登録
        ItemRegister.register(eventBus);

    }
    private void commonSetup(final FMLCommonSetupEvent event) {

    }

}

package com.COLLABORATIONMOD.collaborationMod.main;

import com.COLLABORATIONMOD.collaborationMod.main.tab.CollaborationModBlockTab;
import com.COLLABORATIONMOD.collaborationMod.main.tab.CollaborationModTab;
import com.COLLABORATIONMOD.collaborationMod.network.NetworkHandler;
import com.COLLABORATIONMOD.collaborationMod.register.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("collaboration_mod")
public class CollaborationMod {
    //MOD_ID
    public static final String MOD_ID = "collaboration_mod";
    //クリエイトタブの登録
    public static final CreativeModeTab COLLABORATION_TAB = new CollaborationModTab();
    public static final CreativeModeTab COLLABORATION_BLOCK_TAB = new CollaborationModBlockTab();

    public CollaborationMod(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::commonSetup);
        //この下に追加していく

        //ブロックの登録
        BlockRegister.register(eventBus);
        //アイテムの登録
        ItemRegister.register(eventBus);
        NetworkHandler.register();

    }
    private void commonSetup(final FMLCommonSetupEvent event) {

    }
}
