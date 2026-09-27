package com.remesthesia.recycled.datagen;

import com.remesthesia.recycled.Recycled;
import com.remesthesia.recycled.world.item.RecycledItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class RecycledItemTagsProvider extends ItemTagsProvider {
    public RecycledItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Recycled.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(
                RecycledItems.MUSIC_DISC_CALM.getKey(),
                RecycledItems.MUSIC_DISC_DOG.getKey())
                .replace(false);
    }
}
