package com.sannel.yoke;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidsHelper {
	public static Fluid creosote;
	
	public static Fluid getCreosote()
	{
		if(creosote == null)
		{
			creosote = FluidRegistry.getFluid("creosote");
		}
		
		return creosote;
	}
}
