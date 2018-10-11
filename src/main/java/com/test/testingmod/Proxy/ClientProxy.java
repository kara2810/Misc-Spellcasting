package com.test.testingmod.Proxy;

import com.test.testingmod.Packet.InputHandler;
import com.test.testingmod.Packet.KeyBindings;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by KARLX on 07/10/2018.
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);



        // Typically initialization of models and such goes here:

    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

        // Initialize our input handler so we can listen to keys

    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);

    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
       ;
    }

}