package net.minecraftforge.event.entity.living;

import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.EntityEvent;

public interface LivingEvent extends EntityEvent {
    @Override
    LivingEntity getEntity();
}
