package com.hellhunters.hellhunters.proxy;

import com.hellhunters.hellhunters.registers.BlocksRegister;
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
