package com.sannel.yoke;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = YokeMod.MODID, version = YokeMod.VERSION)
public class YokeMod {
    public static final String MODID = "Yoke";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	// As far as I'm concerned you should be able to use charcoal in the same place you can use coal so
    	// lets add the ability to convert charcoal into normal coal.
    	
    	GameRegistry.addShapelessRecipe(
    			ItemsHelper.getCoalStack(), 
    			ItemsHelper.getCharcoalStack());
  
    	RailcraftAdditions ra = new RailcraftAdditions();
    	ra.init();
    }
}
