package com.remesthesia.recycled.datagen;

import com.remesthesia.recycled.world.item.RecycledJukeboxSongs;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber
public final class RecycledDatagen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createDatapackRegistryObjects(new RegistrySetBuilder().add(Registries.JUKEBOX_SONG, RecycledJukeboxSongs::bootstrap));
    }
}
