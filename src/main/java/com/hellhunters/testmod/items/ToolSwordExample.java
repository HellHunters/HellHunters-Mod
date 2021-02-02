package com.hellhunters.testmod.items;

import com.hellhunters.testmod.TestMod;
import net.minecraft.item.ItemSword;

public class ToolSwordExample extends ItemSword {
    public ToolSwordExample(String name, ToolMaterial material)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(TestMod.ModCreativeTab);
    }
}
