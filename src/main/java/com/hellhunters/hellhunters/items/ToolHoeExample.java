package com.hellhunters.hellhunters.items;

import com.hellhunters.hellhunters.HellHunters;
import net.minecraft.item.ItemHoe;

public class ToolHoeExample extends ItemHoe {
    public ToolHoeExample(String name, ToolMaterial material)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellHunters.ModCreativeTab);
    }
}
