package net.minecraftforge.eventbus.api.listener;

public @interface SubscribeEvent {
    byte priority() default Priority.NORMAL;
    boolean alwaysCancelling() default false;
}
