package com.test.testingmod.Init;

import com.test.testingmod.main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundInit {
        public static SoundEvent chant;

    public static void registerSounds()
    {
        chant = registerSound("chants.chant");
    }
    private static SoundEvent registerSound(String soundName)
    {
        ResourceLocation location = new ResourceLocation(main.MODID, soundName);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(location);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}

