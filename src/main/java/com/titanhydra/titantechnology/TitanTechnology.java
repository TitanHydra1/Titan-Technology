package com.titanhydra.titantechnology;

import com.titanhydra.titantechnology.handler.ConfigurationHandler;
import com.titanhydra.titantechnology.init.ModItems;
import com.titanhydra.titantechnology.proxy.IProxy;
import com.titanhydra.titantechnology.reference.Reference;
import com.titanhydra.titantechnology.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class TitanTechnology {

    @Mod.Instance("Reference.MOD_ID")
    public static TitanTechnology Instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
          ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
           LogHelper.info("Pre Initialisation complete");

        ModItems.init();

    }

    @Mod.EventHandler
    public void Init (FMLInitializationEvent event)
    {
        LogHelper.info("Initialisation complete");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialisation complete");
    }
}
