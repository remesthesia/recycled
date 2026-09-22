package com.remesthesia.recycled;

import com.remesthesia.recycled.sounds.RecycledSoundEvents;
import com.remesthesia.recycled.world.item.RecycledItems;
import com.remesthesia.recycled.world.item.RecycledJukeboxSongs;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Recycled {
    public static final String MOD_ID = "recycled";
    public static final Logger LOGGER = LoggerFactory.getLogger("Recycled");

    public static void init() {
        RecycledItems.init();
        RecycledSoundEvents.init();
        RecycledJukeboxSongs.init();
    }

    public static Identifier getIdentifier(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}