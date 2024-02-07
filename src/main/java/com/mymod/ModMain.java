package com.mymod;

import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class ModMain implements ModInitializer
{
    public static final String MOD_ID = "mymod";
    public static final String MOD_NAME = "My Mod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onInitialize()
    {
        // Add code here...
    }
}
