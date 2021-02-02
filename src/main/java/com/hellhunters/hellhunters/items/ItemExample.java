package com.hellhunters.hellhunters.items;

import com.hellhunters.hellhunters.HellHunters;
import net.minecraft.item.Item;

public class ItemExample extends Item {
    public ItemExample(String name){
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellHunters.ModCreativeTab);
    }
}
