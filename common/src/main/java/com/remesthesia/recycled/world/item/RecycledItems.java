package com.remesthesia.recycled.world.item;

import com.remesthesia.recycled.Recycled;
import com.remesthesia.untitled.api.RegistryHelper;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.Rarity;

import java.util.function.Function;
import java.util.function.Supplier;

public final class RecycledItems {
    public static Holder<Item> MUSIC_DISC_CALM = registerMusicDisc("music_disc_calm", RecycledJukeboxSongs.CALM);
    public static Holder<Item> MUSIC_DISC_DOG = registerMusicDisc("music_disc_dog", RecycledJukeboxSongs.DOG);

    public static void init() {}

    private static Holder<Item> registerMusicDisc(String id, ResourceKey<JukeboxSong> jukeboxSong) {
        return register(id, Item::new,
                () -> (new Item.Properties()).stacksTo(1)
                        .rarity(Rarity.UNCOMMON)
                        .jukeboxPlayable(jukeboxSong)
        );
    }

    private static Holder<Item> register(String id, Function<Item.Properties, Item> item, Supplier<Item.Properties> properties) {
        return RegistryHelper.getInstance().registerItem(Recycled.getIdentifier(id), item, properties);
    }
}
