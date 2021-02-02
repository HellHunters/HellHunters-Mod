package com.hellhunters.testmod.items;

import net.minecraft.item.Item;

public class ItemExample extends Item {
    public ItemExample(String name){
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
