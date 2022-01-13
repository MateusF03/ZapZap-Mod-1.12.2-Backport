package me.mateus.zapzapmod.handler;

import me.mateus.zapzapmod.ZapZapMod;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

    private final Minecraft MINECRAFT = Minecraft.getMinecraft();

    @SubscribeEvent
    public void onChatReceived(ClientChatReceivedEvent event) {
        MINECRAFT.player.playSound(ZapZapMod.ZAP_WHISTLE, 100.0f, 1.0f);
    }
}
