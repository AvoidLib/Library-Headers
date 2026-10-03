package net.neoforged.api.distmarker;

public enum Dist {
    CLIENT,
    DEDICATED_SERVER;

    public boolean isClient() {
        return this == Dist.CLIENT;
    }

    public boolean isServer() {
        return this == Dist.DEDICATED_SERVER;
    }
}
