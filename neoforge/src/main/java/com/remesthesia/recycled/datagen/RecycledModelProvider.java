package com.remesthesia.recycled.datagen;

import com.remesthesia.recycled.Recycled;
import com.remesthesia.recycled.world.item.RecycledItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import org.jspecify.annotations.NonNull;

public class RecycledModelProvider extends ModelProvider {
    public RecycledModelProvider(PackOutput output) {
        super(output, Recycled.MOD_ID);
    }

    @Override
    protected void registerModels(@NonNull BlockModelGenerators blockModelGenerators, @NonNull ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(RecycledItems.MUSIC_DISC_CALM.value(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(RecycledItems.MUSIC_DISC_DOG.value(), ModelTemplates.FLAT_ITEM);
    }
}
