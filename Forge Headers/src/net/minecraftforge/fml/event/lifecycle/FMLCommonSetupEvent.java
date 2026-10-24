package net.minecraftforge.fml.event.lifecycle;

import net.minecraftforge.eventbus.api.bus.EventBus;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.internal.Event;

public final class FMLCommonSetupEvent implements Event {
    public static EventBus<FMLCommonSetupEvent> getBus(BusGroup modBusGroup) {
        throw new RuntimeException("Implemented");
    }
}
