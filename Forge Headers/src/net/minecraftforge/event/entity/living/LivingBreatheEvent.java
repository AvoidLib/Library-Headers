package net.minecraftforge.event.entity.living;

import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.eventbus.api.event.MutableEvent;

public final class LivingBreatheEvent extends MutableEvent implements LivingEvent {
    public LivingBreatheEvent(LivingEntity entity, boolean canBreathe, int consumeAirAmount, int refillAirAmount, boolean canRefillAir) {
        throw new RuntimeException("Implemented");
    }

    @Override
    public LivingEntity getEntity() {
        throw new RuntimeException("Implemented");
    }

    public boolean canBreathe() {
        throw new RuntimeException("Implemented");
    }

    public boolean canRefillAir() {
        throw new RuntimeException("Implemented");
    }

    public void setCanBreathe(boolean canBreathe) {
        throw new RuntimeException("Implemented");
    }

    public void setCanRefillAir(boolean canRefillAir) {
        throw new RuntimeException("Implemented");
    }
}
