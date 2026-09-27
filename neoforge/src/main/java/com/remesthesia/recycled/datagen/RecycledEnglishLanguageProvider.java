package com.remesthesia.recycled.datagen;

import com.remesthesia.recycled.Recycled;
import com.remesthesia.recycled.world.item.RecycledItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class RecycledEnglishLanguageProvider extends LanguageProvider {
    public RecycledEnglishLanguageProvider(PackOutput output) {
        super(output, Recycled.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(RecycledItems.MUSIC_DISC_CALM.value(), "Music Disc");
        add(RecycledItems.MUSIC_DISC_DOG.value(), "Music Disc");

        add("jukebox_song.recycled.calm", "Notch - Calm");
        add("jukebox_song.recycled.dog", "C418 - dog");
    }
}
