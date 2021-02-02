package com.hellhunters.testmod.items;

import net.minecraft.item.ItemSpade;

public class ToolShovelExample extends ItemSpade {
    public ToolShovelExample(String name, ToolMaterial material)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
