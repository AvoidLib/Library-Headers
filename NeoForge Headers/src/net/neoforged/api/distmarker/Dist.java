package net.neoforged.api.distmarker;

public enum Dist {
    CLIENT,
    SERVER;

    public boolean isClient() {
        return this == Dist.CLIENT;
    }

    public boolean isServer() {
        return this == Dist.SERVER;
    }
}
