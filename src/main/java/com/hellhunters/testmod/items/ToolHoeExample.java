package com.hellhunters.testmod.items;

import net.minecraft.item.ItemHoe;

public class ToolHoeExample extends ItemHoe {
    public ToolHoeExample(String name, ToolMaterial material)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
