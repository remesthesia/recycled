package com.remesthesia.recycled.sounds;

import com.remesthesia.recycled.Recycled;
import com.remesthesia.untitled.api.RegistryHelper;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;

public final class RecycledSoundEvents {
    public static final Holder<SoundEvent> MUSIC_DISC_DOG = register("music_disc.dog");

    public static void init() {}

    private static Holder<SoundEvent> register(String id) {
        return RegistryHelper.getInstance().register(BuiltInRegistries.SOUND_EVENT, Recycled.getIdentifier(id), SoundEvent::createVariableRangeEvent);
    }
}
