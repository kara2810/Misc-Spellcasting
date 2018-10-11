package com.test.testingmod;

import com.test.testingmod.Events.ChatEvent;
import com.test.testingmod.Init.SoundInit;
import com.test.testingmod.Network.PacketHandler;
import com.test.testingmod.Packet.InputHandler;
import com.test.testingmod.Packet.KeyBindings;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = main.MODID, name = main.NAME, version = main.VERSION)
public class main
{
    public static final String MODID = "main";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";





    @Mod.Instance
    public static main instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        PacketHandler.registerMessages("modtut");
        KeyBindings.init();
        SoundInit.registerSounds();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

        MinecraftForge.EVENT_BUS.register(new InputHandler());
        MinecraftForge.EVENT_BUS.register(new ChatEvent());


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {


    }
}

