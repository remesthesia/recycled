package com.remesthesia.recycled.client.data;

import com.remesthesia.recycled.Recycled;
import com.remesthesia.recycled.world.item.RecycledItems;
import com.remesthesia.recycled.world.item.RecycledJukeboxSongs;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static org.jetbrains.annotations.ApiStatus.*;

public final class RecycledEnglishLanguageProvider extends LanguageProvider {
    private static final String LOCALE = "en_us";

    public RecycledEnglishLanguageProvider(PackOutput output) {
        super(output, Recycled.MOD_ID, LOCALE);
    }

    @Override
    protected void addTranslations() {
        add(RecycledItems.MUSIC_DISC_CALM.value(), "Music Disc");
        add(RecycledItems.MUSIC_DISC_DOG.value(), "Music Disc");

        addJukeboxSong(RecycledJukeboxSongs.CALM, "Notch - Calm");
        addJukeboxSong(RecycledJukeboxSongs.DOG, "C418 - dog");
    }

    @Obsolete
    private void addJukeboxSong(ResourceKey<JukeboxSong> jukeboxSong, String value) {
        add(jukeboxSong.identifier().toLanguageKey("jukebox_song"), value);
    }
}
