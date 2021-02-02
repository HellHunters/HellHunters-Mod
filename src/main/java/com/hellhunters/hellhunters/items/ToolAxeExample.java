package com.hellhunters.hellhunters.items;

import com.hellhunters.hellhunters.HellHunters;
import net.minecraft.item.ItemAxe;

public class ToolAxeExample extends ItemAxe {
    public ToolAxeExample(String name, ToolMaterial material,int damage,int speed)
    {
        super(material,2,2);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellHunters.ModCreativeTab);
    }
}