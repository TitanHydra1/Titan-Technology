package com.titanhydra.titantechnology.init;

import com.titanhydra.titantechnology.item.ItemWrench;
import com.titanhydra.titantechnology.item.Item_TT;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final Item_TT Wrench = new ItemWrench();

    public static void init()
    {
        GameRegistry.registerItem(Wrench, "Wrench");
    }
}
