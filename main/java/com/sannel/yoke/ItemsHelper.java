package com.sannel.yoke;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemsHelper {
	private static Item coal;
	
	public static Item getCoal()
	{
		if(coal == null)
		{
			coal = GameRegistry.findItem("minecraft", "coal");
		}
		
		return coal;
	}
	public static ItemStack getCoalStack()
	{
		return getCoalStack(1);
	}
	
	public static ItemStack getCoalStack(int count)
	{
		return new ItemStack(getCoal(), 1, 0);
	}
	
	public static ItemStack getCharcoalStack()
	{
		return getCharcoalStack(1);
	}
	
	public static ItemStack getCharcoalStack(int count)
	{
		return new ItemStack(getCoal(), 1, 1);
	}
	
	private static Item coke;
	
	public static Item getCoke()
	{
		if(coke == null)
		{
			coke = GameRegistry.findItem("Railcraft", "fuel.coke");
		}
		
		return coke;
	}
	
	public static ItemStack getCokeStack()
	{
		return getCokeStack(1);
	}
	
	public static ItemStack getCokeStack(int count)
	{
		return new ItemStack(getCoke(), count);
	}
}
