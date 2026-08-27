package net.minecraftforge.common;

import net.minecraftforge.eventbus.api.bus.BusGroup;

import java.util.Collection;
import java.util.EventListener;

public final class EventBusMigrationHelper {
    public static final EventBusMigrationHelper INSTANCE = new EventBusMigrationHelper(BusGroup.DEFAULT);

    private final BusGroup group;

    public EventBusMigrationHelper(BusGroup group) {
        this.group = group;
    }

    public Collection<EventListener> register(Class<?> clazz) {
        throw new RuntimeException("Implemented");
    }

    public Collection<EventListener> register(Object instance) {
        throw new RuntimeException("Implemented");
    }
}
