package com.test.testingmod.Packet;

import com.test.testingmod.Network.PacketHandler;
import com.test.testingmod.Network.PacketSendKey;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

/**
 * Created by KARLX on 08/10/2018.
 */
public class InputHandler {
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (KeyBindings.tutorialKey.isPressed()) {
            // Someone pressed our tutorialKey. We send a message
            PacketHandler.INSTANCE.sendToServer(new PacketSendKey());
        }
    }
}
