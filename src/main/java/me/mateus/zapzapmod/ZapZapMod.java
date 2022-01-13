package me.mateus.zapzapmod;

import me.mateus.zapzapmod.handler.EventHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ZapZapMod.MOD_ID,name = "ZapZap Mod",version = "1.0", clientSideOnly = true)
public class ZapZapMod {

    public static final String MOD_ID = "zapzapmod";

    private static final ResourceLocation location = new ResourceLocation(MOD_ID, "zap_whistle");
    public static final SoundEvent ZAP_WHISTLE = new SoundEvent(location);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        event.getModLog().info("Fiu Fiu");
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}
