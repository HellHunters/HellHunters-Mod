package com.hellhunters.testmod.items;

import com.hellhunters.testmod.TestMod;
import net.minecraft.item.ItemAxe;

public class ToolAxeExample extends ItemAxe {
    public ToolAxeExample(String name, ToolMaterial material,int damage,int speed)
    {
        super(material,2,2);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(TestMod.ModCreativeTab);
    }
}