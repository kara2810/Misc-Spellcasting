package com.test.testingmod.Packet;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

/**
 * Created by KARLX on 08/10/2018.
 */
@SideOnly(Side.CLIENT)
public class KeyBindings {

    public static KeyBinding tutorialKey;

    public static void init() {
        tutorialKey = new KeyBinding("key.tutorial", Keyboard.KEY_P, "key.categories.modtut");
        ClientRegistry.registerKeyBinding(tutorialKey);
    }
}