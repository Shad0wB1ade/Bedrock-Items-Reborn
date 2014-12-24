package net.shad0wb1ade.bedrockitemsreborn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.ItemStack;
import net.shad0wb1ade.bedrockitemsreborn.init.BIRGameObjects;
import net.shad0wb1ade.bedrockitemsreborn.proxies.CommonProxy;
import net.shad0wb1ade.bedrockitemsreborn.references.Refs;

@Mod(modid = Refs.MOD_ID, name = Refs.MOD_NAME, version = Refs.MOD_VERSION)
public class BedrockItemsReborn
{
    @Mod.Instance(Refs.MOD_ID)
    public static BedrockItemsReborn instance;

    @SidedProxy(clientSide = Refs.CLIENT_PROXY, serverSide = Refs.COMMON_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        BIRGameObjects.initItems();
        BIRGameObjects.initBlocks();
        BIRGameObjects.initOreDict();
        BIRGameObjects.initMisc();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
