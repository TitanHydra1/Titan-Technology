package com.titanhydra.titantechnology.CreativeTab;


import com.titanhydra.titantechnology.init.ModItems;
import com.titanhydra.titantechnology.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTT
{
public static final CreativeTabs Titan_Technology_Tab = new CreativeTabs(Reference.MOD_ID)
  {


    @Override
    public Item getTabIconItem()
    {
        return ModItems.Wrench;
    }

    @Override
    public String getTranslatedTabLabel()
    {
      return "Titan Technology";
    }
  };
}
