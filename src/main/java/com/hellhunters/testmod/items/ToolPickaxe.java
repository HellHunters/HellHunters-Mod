package com.hellhunters.testmod.items;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe {
    public ToolPickaxe(String name, ToolMaterial material)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}