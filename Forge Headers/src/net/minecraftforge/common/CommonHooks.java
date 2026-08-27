package net.minecraftforge.common;

import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;

public class CommonHooks {
    public static FluidType getVanillaFluidType(Fluid fluid) {
        throw new RuntimeException("Mod fluids must override getFluidType.");
    }
}
