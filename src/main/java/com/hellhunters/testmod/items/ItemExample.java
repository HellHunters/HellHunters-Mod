package com.hellhunters.testmod.items;

import com.hellhunters.testmod.TestMod;
import net.minecraft.item.Item;

public class ItemExample extends Item {
    public ItemExample(String name){
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(TestMod.ModCreativeTab);
    }
}
