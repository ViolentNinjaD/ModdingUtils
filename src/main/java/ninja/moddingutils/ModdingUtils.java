package ninja.moddingutils;

import cpw.mods.fml.common.Mod;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
@Mod(modid = ModdingUtils.MOD_ID, name = ModdingUtils.MOD_NAME, version = ModdingUtils.MOD_VERSION)
public class ModdingUtils 
{
    public static final String MOD_ID = "ModdingUtils";
    public static final String MOD_NAME = "Modding Utils";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance
    public static ModdingUtils instance;
}
