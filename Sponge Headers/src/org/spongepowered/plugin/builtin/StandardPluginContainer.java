package org.spongepowered.plugin.builtin;

import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.discovery.PluginResource;
import org.spongepowered.plugin.metadata.PluginMetadata;

import java.net.URI;
import java.util.Optional;

public class StandardPluginContainer implements PluginContainer {
    public StandardPluginContainer(final PluginResource resource, final PluginMetadata metadata) {
    }

    @Override
    public PluginMetadata metadata() {
        return null;
    }

    @Override
    public Optional<URI> locateResource(final String path) {
        return null;
    }
}
