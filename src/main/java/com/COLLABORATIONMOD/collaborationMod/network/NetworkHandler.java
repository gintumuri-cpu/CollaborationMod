package com.COLLABORATIONMOD.collaborationMod.network;
import com.COLLABORATIONMOD.collaborationMod.main.CollaborationMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class NetworkHandler {
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(CollaborationMod.MOD_ID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    public static void register() {
        int id = 0;
        INSTANCE.registerMessage(id++, PacketSyncMagicStats.class, PacketSyncMagicStats::encode, PacketSyncMagicStats::new, PacketSyncMagicStats::handle);
    }
}
