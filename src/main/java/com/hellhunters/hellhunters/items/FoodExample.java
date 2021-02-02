package com.hellhunters.hellhunters.items;

import com.hellhunters.hellhunters.HellHunters;
import net.minecraft.item.ItemFood;

public class FoodExample extends ItemFood {
    public FoodExample(String name,int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(HellHunters.ModCreativeTab);
    }
}
