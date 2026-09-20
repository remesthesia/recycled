package com.remesthesia.recycled.client;

import net.fabricmc.api.ClientModInitializer;

public final class RecycledFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        RecycledClient.init();
    }
}
