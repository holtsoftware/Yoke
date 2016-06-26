package com.sannel.yoke;
import java.util.Map;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.railcraft.api.crafting.RailcraftCraftingManager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class RailcraftAdditions {
    public static final int CHARCOAL_COKE_COOK_TIME = 1000;
    public static final int CHARCOAL_COKE_COOK_CREOSOTE = 250;
    
	public void init()
	{
		Item coke = ItemsHelper.getCoke();
		if(coke != null)
		{
			Fluid creosote = FluidsHelper.getCreosote();
			if(creosote != null)
			{
				RailcraftCraftingManager.cokeOven.addRecipe(ItemsHelper.getCharcoalStack(), 
						true, 
						false, 
						ItemsHelper.getCokeStack(), 
						new FluidStack(creosote, CHARCOAL_COKE_COOK_CREOSOTE), 
						CHARCOAL_COKE_COOK_TIME);
			}

		}
	}
}
