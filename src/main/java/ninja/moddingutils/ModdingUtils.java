package ninja.moddingutils;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ninja.moddingutils.proxy.IProxy;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
@Mod(modid = ModdingUtils.MOD_ID, name = ModdingUtils.MOD_NAME, version = ModdingUtils.MOD_VERSION)
public class ModdingUtils 
{
    public static final String MOD_ID = "ModdingUtils";
    public static final String MOD_NAME = "Modding Utils";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String CLIENT_PROXY_CLASS = "ninja.moddingutils.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "ninja.moddingutils.proxy.ServerProxy";

    @Mod.Instance
    public static ModdingUtils instance;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
