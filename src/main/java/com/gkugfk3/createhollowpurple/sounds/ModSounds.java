package com.gkugfk3.createhollowpurple.sounds;

import net.minecraft.sounds.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraft.resources.*;
import org.apache.logging.log4j.*;
import net.minecraftforge.registries.*;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "createhollowpurple");

    public static final RegistryObject<SoundEvent> LARGEDOORMOVE = registerSound("largedoormove");
    public static final RegistryObject<SoundEvent> DOORSLIDE = registerSound("doorslide");
    public static final RegistryObject<SoundEvent> ABSOLUTE_DISK = registerSound("absolute_disk");
    public static final RegistryObject<SoundEvent> LOCKDOWN = registerSound("lockdown");
    public static final RegistryObject<SoundEvent> RAID = registerSound("raid");
    public static final RegistryObject<SoundEvent> BREACH = registerSound("breach");
    public static final RegistryObject<SoundEvent> AFTERTHELIGHT = registerSound("afterthelight");
    public static final RegistryObject<SoundEvent> BREACHBOREALIS = registerSound("breachborealis");
    public static final RegistryObject<SoundEvent> RECONSTRUCTING = registerSound("reconstructing");
    public static final RegistryObject<SoundEvent> REFLECTIONAMBIENT = registerSound("reflectionambient");

    private static RegistryObject<SoundEvent> registerSound(String name) {
        ResourceLocation location = new ResourceLocation("createhollowpurple", name);
        return SOUNDS.register(name, () -> new SoundEvent(location));
    }
}
