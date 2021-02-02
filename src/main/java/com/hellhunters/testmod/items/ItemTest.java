package com.hellhunters.testmod.items;

import net.minecraft.item.Item;

public class ItemTest extends Item {
    public ItemTest(String name){
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
