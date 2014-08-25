package com.shad0wb1ade.bedrockitemsreborn;

import com.shad0wb1ade.bedrockitemsreborn.init.*;
import com.shad0wb1ade.bedrockitemsreborn.utilities.LogHelper;
import com.shad0wb1ade.bedrockitemsreborn.utilities.WorldGenHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Refs.MODID, name = Refs.MODNAME, version = Refs.VERSION)
public class BedrockItemsReborn {

    @Mod.Instance(Refs.MODID)
    public static BedrockItemsReborn instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        BIRItems.init();
        BIRBlocks.init();
        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        BIRRecipes.init();
        GameRegistry.registerWorldGenerator(new WorldGenHandler(), 0);
        LogHelper.info("Initialization Complete");
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //TODO Make Something Happen Here! :)
        LogHelper.info("Post Initialization Complete");
    }
}
