package ninja.moddingutils;

import com.pahimar.ee3.util.LogHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ic2.api.item.IC2Items;
import ninja.moddingutils.proxy.IProxy;
import ninja.moddingutils.util.NinjaLogger;
import sun.rmi.log.LogHandler;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

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
        NinjaLogger.info("As Dense Ores tells you, we can't tell you the unlocalized name for dirt; but I can for Uranium: " + IC2Items.getItem("uranium").getUnlocalizedName());
    }
}
