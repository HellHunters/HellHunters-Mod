package com.hellhunters.testmod;

import com.hellhunters.testmod.items.*;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@GameRegistry.ObjectHolder("testmod")
@Mod.EventBusSubscriber
public class ItemsRegistry
{
    @GameRegistry.ObjectHolder("test")
    public static final Item TEST = null;

    @SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> e)
    {
      e.getRegistry().registerAll(new ItemTest());
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e)
    {
        registryModel(TEST);
    }

    @SideOnly(Side.CLIENT)
    public static void registryModel(Item item)
    {
        final ResourceLocation regName = item.getRegistryName();
        final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
        ModelBakery.registerItemVariants(item,mrl);
        ModelLoader.setCustomModelResourceLocation(item,0,mrl);

    }
}
