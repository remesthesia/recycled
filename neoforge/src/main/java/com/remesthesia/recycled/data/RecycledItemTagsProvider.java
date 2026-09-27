package com.remesthesia.recycled.data;

import com.remesthesia.recycled.Recycled;
import com.remesthesia.recycled.world.item.RecycledItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public final class RecycledItemTagsProvider extends ItemTagsProvider {
    public RecycledItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Recycled.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        var musicDiscCalm = RecycledItems.MUSIC_DISC_CALM.unwrapKey();
        musicDiscCalm.ifPresent(resourceKey -> tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(resourceKey));

        var musicDiscDog = RecycledItems.MUSIC_DISC_DOG.unwrapKey();
        musicDiscDog.ifPresent(resourceKey -> tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(resourceKey));
    }
}
