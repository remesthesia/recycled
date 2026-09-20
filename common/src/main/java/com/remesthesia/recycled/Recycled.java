package com.remesthesia.recycled;

import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Recycled {
    public static final String MOD_ID = "recycled";
    public static final Logger LOGGER = LoggerFactory.getLogger("Recycled");

    public static void init() {}

    public static Identifier getIdentifier(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}