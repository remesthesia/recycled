package com.remesthesia.recycled;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Recycled.MOD_ID)
public final class RecycledNeoForge {

    public RecycledNeoForge(IEventBus eventBus) {
        Recycled.init();
    }
}