package com.test.testingmod.Proxy;

import com.test.testingmod.Entity.EntityRegister;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by KARLX on 07/10/2018.
 */

public class CommonProxy {

    // Config instance


    public void preInit(FMLPreInitializationEvent e) {

        // Initialize our packet handler. Make sure the name is
        // 20 characters or less!


        // Initialization of blocks and items typically goes here:

    }

    public void init(FMLInitializationEvent e) {
        EntityRegister.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

        }


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

    }

}