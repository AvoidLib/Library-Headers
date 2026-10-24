package net.minecraftforge.eventbus.api.bus;

import net.minecraftforge.eventbus.internal.Event;
import net.minecraftforge.eventbus.api.listener.EventListener;

import java.util.function.Consumer;

public interface EventBus<T extends Event> {
    EventListener addListener(Consumer<T> callback);
}
