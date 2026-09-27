package com.remesthesia.recycled.world.item;

import com.remesthesia.recycled.Recycled;
import com.remesthesia.recycled.sounds.RecycledSoundEvents;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.JukeboxSongs;

public interface RecycledJukeboxSongs {
    ResourceKey<JukeboxSong> CALM = create("calm");
    ResourceKey<JukeboxSong> DOG = create("dog");

    static void bootstrap(BootstrapContext<JukeboxSong> context) {
        register(context, CALM, RecycledSoundEvents.MUSIC_DISC_CALM, 193, 2);
        register(context, DOG, RecycledSoundEvents.MUSIC_DISC_DOG, 146, 2);
    }

    static void init() {}

    private static ResourceKey<JukeboxSong> create(String id) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, Recycled.getIdentifier(id));
    }

    private static void register(BootstrapContext<JukeboxSong> context, ResourceKey<JukeboxSong> registryKey, Holder<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput) {
        context.register(registryKey, new JukeboxSong(soundEvent, Component.translatable(Util.makeDescriptionId("jukebox_song", registryKey.identifier())), lengthInSeconds, comparatorOutput));
    }
}
