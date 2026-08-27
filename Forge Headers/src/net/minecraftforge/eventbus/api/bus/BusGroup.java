package net.minecraftforge.eventbus.api.bus;

public interface BusGroup {
    BusGroup DEFAULT = create("default");

    static BusGroup create(String name) {
        throw new RuntimeException("Implemented");
    }
}
