package com.hellhunters.hellhunters.items;

import com.hellhunters.hellhunters.HellHunters;
import net.minecraft.item.ItemSpade;

public class ToolShovelExample extends ItemSpade {
    public ToolShovelExample(String name, ToolMaterial material)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellHunters.ModCreativeTab);
    }
}
