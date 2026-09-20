package com.remesthesia.recycled.client;

import com.remesthesia.recycled.Recycled;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(value = Recycled.MOD_ID, dist = Dist.CLIENT)
public final class RecycledNeoForgeClient {

    public RecycledNeoForgeClient(IEventBus eventBus) {
        RecycledClient.init();
    }
}