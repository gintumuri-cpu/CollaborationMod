package com.FREEMOD.freemod.main;

import com.FREEMOD.freemod.main.tab.FreeModBlockTab;
import com.FREEMOD.freemod.main.tab.FreeModTab;
import com.FREEMOD.freemod.register.BlockRegister;
import com.FREEMOD.freemod.register.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("freemod")
public class FreeMod {
    //MOD_ID
    public static final String MOD_ID = "freemod";
    //クリエイトタブの登録
    public static final CreativeModeTab FREEMOD_TAB = new FreeModTab();
    public static final CreativeModeTab FREEMOD_BLOCK_TAB = new FreeModBlockTab();

    public FreeMod(){
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
