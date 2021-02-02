package com.hellhunters.hellhunters.items;

import com.hellhunters.hellhunters.HellHunters;
import net.minecraft.item.ItemSword;

public class ToolSwordExample extends ItemSword {
    public ToolSwordExample(String name, ToolMaterial material)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellHunters.ModCreativeTab);
    }
}
