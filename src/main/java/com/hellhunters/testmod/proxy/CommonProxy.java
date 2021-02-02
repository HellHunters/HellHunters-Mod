package com.hellhunters.testmod.proxy;

import com.hellhunters.testmod.blocks.BlocksRegister;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        BlocksRegister.register();
    }

    public void init(FMLInitializationEvent event)
    {
        BlocksRegister.registerRender();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
