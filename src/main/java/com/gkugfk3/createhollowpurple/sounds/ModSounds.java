package com.gkugfk3.createhollowpurple.sounds;

import net.minecraft.sounds.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraft.resources.*;
import org.apache.logging.log4j.*;
import net.minecraftforge.registries.*;

public class ModSounds
{
    private static final Logger LOGGER;
    public static final DeferredRegister<SoundEvent> SOUNDS;
    public static final RegistryObject<SoundEvent> LARGEDOORMOVE;
    public static final RegistryObject<SoundEvent> DOORSLIDE;
    public static final RegistryObject<SoundEvent> ABSOLUTE_DISK;
    public static final RegistryObject<SoundEvent> LOCKDOWN;
    public static final RegistryObject<SoundEvent> RAID;
    public static final RegistryObject<SoundEvent> BREACH;
    public static final RegistryObject<SoundEvent> AFTERTHELIGHT;
    public static final RegistryObject<SoundEvent> BREACHBOREALIS;
    public static final RegistryObject<SoundEvent> RECONSTRUCTING;
    public static final RegistryObject<SoundEvent> REFLECTIONAMBIENT;
    
    public static void register(final IEventBus eventBus) {
        ModSounds.SOUNDS.register(eventBus);
        ModSounds.LOGGER.info("why did i even think of this");
    }
    
    static {
        LOGGER = LogManager.getLogger();
        SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "createhollowpurple");
        final SoundEvent soundEvent;
        LARGEDOORMOVE = ModSounds.SOUNDS.register("largedoormove", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "largedoormove"));
            return soundEvent;
        });
        final SoundEvent soundEvent2;
        DOORSLIDE = ModSounds.SOUNDS.register("doorslide", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "doorslide"));
            return soundEvent2;
        });
        final SoundEvent soundEvent3;
        ABSOLUTE_DISK = ModSounds.SOUNDS.register("absolute_disk", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "absolute_disk"));
            return soundEvent3;
        });
        final SoundEvent soundEvent4;
        LOCKDOWN = ModSounds.SOUNDS.register("lockdown", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "lockdown"));
            return soundEvent4;
        });
        final SoundEvent soundEvent5;
        RAID = ModSounds.SOUNDS.register("raid", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "raid"));
            return soundEvent5;
        });
        final SoundEvent soundEvent6;
        BREACH = ModSounds.SOUNDS.register("breach", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "breach"));
            return soundEvent6;
        });
        final SoundEvent soundEvent7;
        AFTERTHELIGHT = ModSounds.SOUNDS.register("afterthelight", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "afterthelight"));
            return soundEvent7;
        });
        final SoundEvent soundEvent8;
        BREACHBOREALIS = ModSounds.SOUNDS.register("breachborealis", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "breachborealis"));
            return soundEvent8;
        });
        final SoundEvent soundEvent9;
        RECONSTRUCTING = ModSounds.SOUNDS.register("reconstructing", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "reconstructing"));
            return soundEvent9;
        });
        final SoundEvent soundEvent10;
        REFLECTIONAMBIENT = ModSounds.SOUNDS.register("reflectionambient", () -> {
            new SoundEvent(new ResourceLocation("createhollowpurple", "reflectionambient"));
            return soundEvent10;
        });
    }
}
