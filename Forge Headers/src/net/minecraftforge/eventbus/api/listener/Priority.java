package net.minecraftforge.eventbus.api.listener;

public final class Priority {
    private Priority() {}

    public static final byte HIGHEST = Byte.MAX_VALUE;
    public static final byte HIGH = 64;
    public static final byte NORMAL = 0;
    public static final byte LOW = -64;
    public static final byte LOWEST = Byte.MIN_VALUE + 1;
    public static final byte MONITOR = Byte.MIN_VALUE;
}
