package ninja.moddingutils.api;

import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.IC2Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class IC2RecipeHelper 
{
    public static void addRecipeIC2(String ic2ItemName, Object... objectInput)
    {
        GameRegistry.addRecipe(IC2Items.getItem(ic2ItemName), objectInput);
    }
}
