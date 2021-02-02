package com.hellhunters.testmod.items;

import com.hellhunters.testmod.TestMod;
import net.minecraft.item.ItemFood;

public class FoodExample extends ItemFood {
    public FoodExample(String name,int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(TestMod.ModCreativeTab);
    }
}
