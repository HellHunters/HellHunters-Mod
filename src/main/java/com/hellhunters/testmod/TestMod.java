package com.hellhunters.testmod;

import com.hellhunters.testmod.proxy.CommonProxy;
//import com.hellhunters.testmod.blocks.*;
import com.hellhunters.testmod.items.*;

import com.hellhunters.testmod.registers.ItemsRegistry;
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



    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting Test Mod PRE-INITIALIZATION]" + "\u001B[0m");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting Test Mod INITIALIZATION]" + "\u001B[0m");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting Test Mod POST-INITIALIZATION]" + "\u001B[0m");
        proxy.postInit(event);
    }


    @SidedProxy(clientSide = "com.hellhunters.testmod.proxy.ClientProxy", serverSide = "com.hellhunters.testmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs ModCreativeTab = new CreativeTabs("HellHunters")
    {
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ItemsRegistry.UNHOLY_HORN);
        }
    };
}
