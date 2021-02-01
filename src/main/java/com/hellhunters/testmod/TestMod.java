package com.hellhunters.testmod;

import com.hellhunters.testmod.proxy.CommonProxy;
import com.hellhunters.testmod.blocks.*;
import com.hellhunters.testmod.items.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid=TestMod.MODID,version = TestMod.VERSION,name = TestMod.NAME)
public class TestMod {

    public static final String MODID = "testmod";
    public static final String VERSION = "0.0.0.1";
    public static final String NAME = "Test Mod";

    public static final CreativeTabs tabTestMod = new CreativeTabs("Test Mod")
    {
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ItemsRegistry.TEST);
        }
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Преинициализация
        System.out.println("\u001B[32m" + "[Starting Test Mod PRE-INITIALIZATION]" + "\u001B[0m");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Инициализация
        System.out.println("\u001B[32m" + "[Starting Test Mod INITIALIZATION]" + "\u001B[0m");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Инициализация
        System.out.println("\u001B[32m" + "[Starting Test Mod POST-INITIALIZATION]" + "\u001B[0m");
    }

    @SidedProxy(clientSide = "com.hellhunters.testmod.proxy.ClientProxy", serverSide = "com.hellhunters.testmod.proxy.CommonProxy")
    public static CommonProxy proxy;

}
