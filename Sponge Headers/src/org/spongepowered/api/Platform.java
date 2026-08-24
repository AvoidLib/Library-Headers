package org.spongepowered.api;

public interface Platform {
    Type type();

    enum Type {
        CLIENT,
        SERVER,
        UNKNOWN;

        public boolean isServer() {
            throw new RuntimeException();
        }

        public boolean isClient() {
            throw new RuntimeException();
        }

        public boolean isKnown() {
            throw new RuntimeException();
        }
    }
}
