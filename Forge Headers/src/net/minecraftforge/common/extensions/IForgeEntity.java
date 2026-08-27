package net.minecraftforge.common.extensions;

import net.minecraftforge.fluids.FluidType;

import java.util.function.BiPredicate;

public interface IForgeEntity {
    boolean isInFluidType(BiPredicate<FluidType, Double> predicate, boolean forAllTypes);
}
